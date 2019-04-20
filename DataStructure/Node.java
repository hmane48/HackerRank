package DataStructure;

import java.util.LinkedList;
import java.util.List;

public class Node {

    public int id;
    public List<Node> adjacent = new LinkedList<>();
    protected Node(int id){
        this.id = id;
    }
}
