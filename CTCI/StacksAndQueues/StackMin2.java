package CTCI.StacksAndQueues;

/*
 * P: Implement stack in such a way that push, pop and min -> which returns min value should have O(1)
 *
 * Solution:
 *
 * 1. keeping min info at each Node.
 *
 * => 2. keeping an extra array for min value record.
 *
 * */

import java.util.Stack;

public class StackMin2 extends Stack<Integer> {
    public Stack<Integer> s2;
    public StackMin2(){
        s2 = new Stack<>();
    }

    public void push(int value){
        if (value <= min()){
            s2.push(value);
        }

        super.push(value);
    }

    public Integer pop(){
        int x = super.pop();
        if (x == min()){
            s2.pop();
        }
        return x;
    }

    private int min() {
        if (super.isEmpty()){
            return Integer.MAX_VALUE;
        }else {
            return s2.peek();
        }
    }

}
