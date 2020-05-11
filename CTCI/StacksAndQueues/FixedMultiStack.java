package CTCI.StacksAndQueues;


/*
 * This is the implementation of 3 stacks from a single array with fixed number of elements
 * */


import java.util.EmptyStackException;

public class FixedMultiStack {

    private int numOfStacks = 3;
    private int stackCapacity;
    public int[] values;
    public int[] sizes;

    public FixedMultiStack(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        values = new int[stackCapacity * numOfStacks];
        sizes = new int[numOfStacks];
    }

    //push the values on to the given stack
    public void push(int stackNum, int value) throws FullStackException {
        // check if the stack is not full
        if (isFull(stackNum)) throw new FullStackException();

        values[topIndexOf(stackNum) + 1] = value;
        sizes[stackNum]++;
    }

    //remove the top value from the given stack
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }

        sizes[stackNum]--;
        int num = values[topIndexOf(stackNum) + 1];
        values[topIndexOf(stackNum) + 1] = 0;
        return num;

    }

    //return the top value of the given stack
    public int topOf(int stackNum) {
        return values[topIndexOf(stackNum)];
    }

    //check if the stack is empty
    private boolean isEmpty(int stackNum) {

        return sizes[stackNum] == 0;
    }

    //get the top index
    private int topIndexOf(int stackNum) {

        return ((stackNum - 1) * stackCapacity) + sizes[stackNum];

    }

    //check whether stack is full
    private boolean isFull(int stackNum) {

        return sizes[stackNum] == stackCapacity;
    }
}
