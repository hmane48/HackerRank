package CTCI.StacksAndQueues;

/*
 * Problem: Implement a SetOfStacks where each stack has some limit, which if gets full the next one is created.
 * But while pop operation works all the same way as if it is just one stack.
 * */

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {

    int capacity;

    ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public void push(int value) {
        // have to push it on last stack in stacks
        // have to make sure that last stack is not full
        // if it is full => need to create new stack and push()
        Stack<Integer> last = getLastStack();
        if (last != null && !isFull(last)) {
            last.push(value);
        } else {
            Stack<Integer> newLast = new Stack<>();
            newLast.setSize(capacity);
            newLast.push(value);
            stacks.add(newLast);
        }
    }

    public int pop() {
        // go to last stack
        // if stack gets empty after pop() then remove the stack
        Stack<Integer> last = getLastStack();
        int value = last.pop();
        if (last.isEmpty()) stacks.remove(last);
        return value;
    }

    private boolean isFull(Stack<Integer> last) {

        // returns if the stack is full or not
        return last.size() == last.capacity() - 1;
    }

    private Stack<Integer> getLastStack() {

        if (stacks.size() == 0){
            return null;
        }else {
            return stacks.get(stacks.size()-1);
        }
    }


}
