package CTCI.LinkedList;

import java.util.LinkedList;

// need to partition the LinkedList according to x order isn't important.
// Given: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
// Expected: 3 -> 2 -> 1 ---> 5 -> 8 -> 5 -> 10
public class Partition {

    public void partitionX(LinkedList<LinkedListNode> list, int x) {

        LinkedListNode head = list.getFirst();
        if (head == null || head.next == null) {
            return;
        }
        LinkedListNode linkedListNode;
        LinkedListNode pivot = null;
        if (head.value < x) {
            pivot = head;
        }
        linkedListNode = head.next;

        while (linkedListNode != null) {
            if (linkedListNode.value < x) {
                LinkedListNode temp, pointer;
                pointer = linkedListNode.next;
                if (pivot == null) {
                    temp = head;
                    head = linkedListNode;
                    head.next = temp;
                    pivot = head;
                } else {
                    temp = pivot.next;
                    pivot.next = linkedListNode;
                    linkedListNode.next = temp;
                    pivot = linkedListNode;
                }
                linkedListNode = pointer;
                continue;

            } else {
                LinkedListNode temp, pointer;
                pointer = linkedListNode.next;
                if (pivot != null) {
                    temp = pivot.next;
                    pivot.next = linkedListNode;
                    linkedListNode.next = temp;
                }
                linkedListNode = pointer;
            }
        }
    }

    // Easy Approach to add to tail and head

    public void partitionY(LinkedListNode linkedListNode, int x) {
        LinkedList<LinkedListNode> list = new LinkedList<>();
        LinkedListNode head = list.getFirst();
        LinkedListNode tail = list.getLast();

        while (linkedListNode != null) {
            if (linkedListNode.value < x) {
                LinkedListNode temp = head;
                head = linkedListNode;
                head.next = temp;
            }else {
                LinkedListNode temp = tail;
                tail.next = linkedListNode;

            }
        }

    }
}
