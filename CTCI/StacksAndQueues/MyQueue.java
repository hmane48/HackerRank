package CTCI.StacksAndQueues;

/*
 * Problem: Implement a Queue using 2 stacks
 * */

import java.util.Stack;

public class MyQueue<T> {

    Stack<T> stack1;
    Stack<T> stack2;
    int size;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public void push(T value) {
        stack1.push(value);
        size++;
    }

    public T remove() {
        if (size == 0){
            System.out.println("EmptyQueueException..");
            return null;
        }else if (size == 1){
            return stack1.pop();
        }
        while (size > 1){
            stack2.push(stack1.pop());
        }
        T value = stack1.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return value;
    }
}
