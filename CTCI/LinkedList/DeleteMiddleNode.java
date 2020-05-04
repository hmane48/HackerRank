package CTCI.LinkedList;

import java.util.LinkedList;

public class DeleteMiddleNode {

    public LinkedList<LinkedListNode> list;

    public void deleteNode(LinkedListNode n){
        LinkedListNode next;
        if (n.next != null && n != null){

            next = n.next;
            n.value = next.value;
            n.next = next.next;
        }
    }
}
