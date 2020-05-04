package CTCI.LinkedList;

import CTCI.LinkedList.Node;

import java.util.LinkedList;

// need to partition the LinkedList according to x order isn't important.
// Given: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
// Expected: 3 -> 2 -> 1 ---> 5 -> 8 -> 5 -> 10
public class Partition {

    public void partitionX(LinkedList<Node> list, int x) {

        Node head = list.getFirst();
        if (head == null || head.next == null) {
            return;
        }
        Node node;
        Node pivot = null;
        if (head.value < x) {
            pivot = head;
        }
        node = head.next;

        while (node != null) {
            if (node.value < x) {
                Node temp, pointer;
                pointer = node.next;
                if (pivot == null) {
                    temp = head;
                    head = node;
                    head.next = temp;
                    pivot = head;
                } else {
                    temp = pivot.next;
                    pivot.next = node;
                    node.next = temp;
                    pivot = node;
                }
                node = pointer;
                continue;

            } else {
                Node temp, pointer;
                pointer = node.next;
                if (pivot != null) {
                    temp = pivot.next;
                    pivot.next = node;
                    node.next = temp;
                }
                node = pointer;
            }
        }
    }

    // Easy Approach to add to tail and head

    public void partitionY(Node node, int x) {
        LinkedList<Node> list = new LinkedList<>();
        Node head = list.getFirst();
        Node tail = list.getLast();

        while (node != null) {
            if (node.value < x) {
                Node temp = head;
                head = node;
                head.next = temp;
            }else {
                Node temp = tail;
                tail.next = node;

            }
        }

    }
}
