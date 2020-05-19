package CTCI.TreesAndGraphs;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class RouteBetweenNodes {

    //my node class
    class Node {
        int id;
        ArrayList<Node> adjacent;
        boolean visited;

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public Node(int id) {
            this.id = id;
            adjacent = new ArrayList<>();

        }

        public ArrayList<Node> getAdjacent() {
            return adjacent;
        }

        public void addToAdjacent(Node n) {
            adjacent.add(n);
        }
    }

    // std BFS Queue
    private Queue<Node> queue;

    // method to detect the path
    public boolean routeAvailable(Node source, Node destination) {
        if (source == destination)
            return false;

        queue = new PriorityQueue<>();
        queue.addAll(source.adjacent);
        source.setVisited(true);

        for (Node n : queue) {
            // have we come to destination
            if (n == destination) return true;
            // to avoid infinite loop
            if (n.isVisited()) continue;
            if (!n.isVisited()) {
                queue.addAll(n.adjacent);
                n.setVisited(true);
            }
        }
        return false;

    }


}
