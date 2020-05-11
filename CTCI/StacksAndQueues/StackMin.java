package CTCI.StacksAndQueues;

/*
* P: Implement stack in such a way that push, pop and min -> which returns min value should have O(1)
*
* Solution:
*
* => 1. keeping min info at each Node.
*
* 2. keeping an extra array for min value record.
*
* */

import java.util.Stack;

public class StackMin extends Stack<NodeWithMin> {

    public Stack<NodeWithMin> stack;

    public void push(int value){
        if (value <= min()){
            super.push(new NodeWithMin(value,value));
        }else {
            super.push(new NodeWithMin(value,min()));
        }
    }

    private int min() {
        if (stack.isEmpty()){
            return Integer.MAX_VALUE;
        }else {
            return peek().min;
        }
    }
}


class NodeWithMin {
    int value;
    int min;

    public NodeWithMin(int value, int min) {
        this.value = value;
        this.min = min;
    }
}