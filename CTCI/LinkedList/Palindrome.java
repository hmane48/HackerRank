package CTCI.LinkedList;


/*
 * Find out the given Linked-List is a Palindrome or not
 * */

import java.util.Stack;

public class Palindrome {

    // if i know the size then it just require one loop giving O(n) time and space complexity.
    private boolean isPalindrome(LinkedListNode n, int size) {

        if (size == 1 ){
            return true;
        }else if (size == 0){
            return false;
        }
        LinkedListNode linkedListNode = n;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while (index != size/2) {
            stack.push(linkedListNode.value);
            linkedListNode = linkedListNode.next;
            index++;
        }
        if (size % 2 == 1){
            linkedListNode = linkedListNode.next;
        }
        while (linkedListNode != null) {
            if (stack.pop() != linkedListNode.value) {
                return false;
            }
            linkedListNode = linkedListNode.next;
        }
        return true;
    }

    // reverse and compare
    // this has 3 methods
    private boolean isPalindrome2(LinkedListNode head) {
        LinkedListNode reversed = reversedListNode(head);
        return isEqual(reversed, head);
    }

    private boolean isEqual(LinkedListNode one, LinkedListNode two) {
        while (one != null && two != null) {
            if (one.value != two.value) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }

    private LinkedListNode reversedListNode(LinkedListNode linkedListNode) {
        LinkedListNode head = null;
        while (linkedListNode != null) {
            LinkedListNode n = new LinkedListNode(linkedListNode.value);
            n.next = head;
            head = n;
            linkedListNode = linkedListNode.next;
        }

        return head;
    }


}
