package CTCI.StacksAndQueues;

import java.util.Stack;

/*
 * Problem: to sort the stack with only one additional stack and no other data structure
 * */

public class StackSorting {

    public Stack<Integer> sort(Stack<Integer> s1) {
        Stack<Integer> result = new Stack<>();

        int tmp;

        result.push(s1.pop());
        tmp = s1.pop();
        while (!s1.isEmpty()){
            if (tmp < result.peek()){
                s1.push(result.pop());
            }else {
                result.push(tmp);
                if (!s1.isEmpty()) tmp = s1.pop();
            }
        }

        return result;
    }

}