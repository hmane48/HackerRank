package CTCI.LinkedList;

public class Node {

    Node next;
    int value;

    public Node(int value) {
        this.value = value;
    }

    public Node() {
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }


    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }
}