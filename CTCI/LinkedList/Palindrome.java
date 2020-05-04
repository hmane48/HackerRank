package CTCI.LinkedList;


/*
 * Find out the given Linked-List is a Palindrome or not
 * */

import java.util.Stack;

public class Palindrome {

    // if i know the size then it just require one loop giving O(n) time and space complexity.
    private boolean isPalindrome(Node n, int size) {

        if (size == 1 ){
            return true;
        }else if (size == 0){
            return false;
        }
        Node node = n;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while (index != size/2) {
            stack.push(node.value);
            node = node.next;
            index++;
        }
        if (size % 2 == 1){
            node = node.next;
        }
        while (node != null) {
            if (stack.pop() != node.value) {
                return false;
            }
            node = node.next;
        }
        return true;
    }

    // reverse and compare
    // this has 3 methods
    private boolean isPalindrome2(Node head) {
        Node reversed = reversedListNode(head);
        return isEqual(reversed, head);
    }

    private boolean isEqual(Node one, Node two) {
        while (one != null && two != null) {
            if (one.value != two.value) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }

    private Node reversedListNode(Node node) {
        Node head = null;
        while (node != null) {
            Node n = new Node(node.value);
            n.next = head;
            head = n;
            node = node.next;
        }

        return head;
    }


}
