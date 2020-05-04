package CTCI.LinkedList;

/*
 * To find out whether two LinkedLists are intersecting.
 * if yes then get the intersecting node
 * else return null
 *
 * SOLUTION:
 * - finding out the last node (if intersecting => their last node has to be the same) and length (for further calculations)
 * - take the difference between their lengths and fwd longer LinkedList by that amount
 * - iterating over the lists to find out the common node!
 * */

public class Intersection {

    private LinkedListNode intersectingNode(LinkedListNode list1, LinkedListNode list2) {

        ResultClass r1 = getLastNodeAndLength(list1);
        ResultClass r2 = getLastNodeAndLength(list2);

        if (r1.lastNode != r2.lastNode){
            return null;
        }

        LinkedListNode longer = (r1.length > r2.length) ? list1 : list2;
        LinkedListNode shorter = (r1.length < r2.length) ? list1 : list2;

        longer = getFwdLongerNode(Math.abs(r1.length - r2.length),longer);

        return getIntersectingNode(longer,shorter);
    }

    private LinkedListNode getIntersectingNode(LinkedListNode longer, LinkedListNode shorter) {

        while(longer != shorter){
            longer = longer.next;
            shorter = shorter.next;
        }

        return longer;
    }

    private LinkedListNode getFwdLongerNode(int difference, LinkedListNode longer) {

        int x = 0;
        while (x < difference){
            longer = longer.next;
            x++;
        }

        return longer;
    }

    private ResultClass getLastNodeAndLength(LinkedListNode list) {
        if (list == null) {
            return null;
        }

        int length = 1;
        while (list.next != null) {
            length++;
            list = list.next;
        }

        return new ResultClass(list, length);
    }


    private class ResultClass {
        LinkedListNode lastNode;
        int length;

        public ResultClass(LinkedListNode lastNode, int length) {
            this.lastNode = lastNode;
            this.length = length;
        }
    }
}
