package BFSShortestReach;


import java.util.*;

class Node {

    public int id;
    public List<Node> adjacent = new LinkedList<>();
    protected Node(int id){
        this.id = id;
    }
}

public class Solution {

    private Map<Integer, Node> nodeLookup = new HashMap<>();

    private Solution(int size){



    }

    private static void addEdge(int source, int destination) {
        Node s = new Node(source);
        Node d = new Node(source);
        s.adjacent.add(d);
    }

    private static void startNode(int start) {

        getDistances();
    }

    private static void getDistances() {



    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int nodeSize = sc.nextInt();
            int edges = sc.nextInt();

            for(int j = 0; j < edges; j++){
                int source = sc.nextInt();
                int destination = sc.nextInt();
                addEdge(source,destination);
            }
            int start = sc.nextInt();
            startNode(start);


        }
    }
}

