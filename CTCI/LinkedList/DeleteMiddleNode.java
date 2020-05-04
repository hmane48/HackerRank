package CTCI.LinkedList;

import java.util.LinkedList;

public class DeleteMiddleNode {

    public LinkedList<Node> list;

    public void deleteNode(Node n){
        Node next;
        if (n.next != null && n != null){

            next = n.next;
            n.value = next.value;
            n.next = next.next;
        }
    }
}
