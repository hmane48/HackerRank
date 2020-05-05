package CTCI.LinkedList;

// CLASSIC PROBLEM: Floyd's Cycle Detection Algorithm

/*
 * To Find the loop in the a LinkedList and returning the starting node of that loop
 *
 * Solution:
 * - find the collision with pointers/runners p and q (p being the fast runner)
 * - if found the collision point => means the loop exists
 * - reset slow runner and finding collision point => which is desired result
 * */

public class LoopDetection {

    // find the collision point if the loop exists
    private LinkedListNode getLooStartNode(LinkedListNode node) {

        LinkedListNode fast = node;
        LinkedListNode slow = node;

        // to find whether loop exists
        while (fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        } else {
            return getCollisionNode(node, fast);
        }

    }

    // to find the starting node of the loop
    private LinkedListNode getCollisionNode(LinkedListNode slow, LinkedListNode fast) {

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

}
