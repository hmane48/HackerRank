package CTCI.StacksAndQueues;

/*
 * Problem: Implement a Queue using 2 stacks
 * */

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public void push(int value) {
        stack1.push(value);
        size++;
    }

    public Integer remove() {
        if (size == 0){
            System.out.println("EmptyQueueException..");
            return 0;
        }else if (size == 1){
            return stack1.pop();
        }
        while (size > 1){
            stack2.push(stack1.pop());
        }
        int value = stack1.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return value;
    }
}
