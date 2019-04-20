package DataStructure;

import java.util.*;

public class Graph {

    private Map<Integer, Node> nodeLookup = new HashMap<>();

    private Node getNode(int id) {
        Node node = new Node(id);
        return node;
    }

    private void addEdge(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    // DEPTH FIRST SEARCH

    public boolean hasPathDFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        Set<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);

    }

    private boolean hasPathDFS(Node source, Node destination, Set<Integer> visited) {

        if (visited.contains(source.id)) {
            return false;
        }
        visited.add(source.id);
        if (source == destination) {
            return true;
        }
        for (Node child : source.adjacent) {
            if (hasPathDFS(child, destination, visited)) {
                return true;
            }
        }

        return false;
    }

    // BREADTH FIRST SEARCH

    public boolean hasPathBFS(int source, int destination){
        return hasPathBFS(getNode(source), getNode(destination));
    }

    private boolean hasPathBFS(Node source, Node destination){
        LinkedList<Node> nextToVisit = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        nextToVisit.add(source);
        while (!nextToVisit.isEmpty()){
            Node node =  nextToVisit.remove();
            if(node == destination){
                return true;
            }

            if(visited.contains(node.id)){
                continue;
            }

            visited.add(node.id);

            for (Node child: node.adjacent) {
                nextToVisit.add(child);
            }
        }

        return false;
    }


}
