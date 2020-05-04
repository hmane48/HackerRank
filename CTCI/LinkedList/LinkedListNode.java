package CTCI.LinkedList;

public class LinkedListNode {

    LinkedListNode next;
    int value;

    public LinkedListNode(int value) {
        this.value = value;
    }

    public LinkedListNode() {
    }

    public LinkedListNode getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }


    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
