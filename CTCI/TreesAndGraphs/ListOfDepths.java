package CTCI.TreesAndGraphs;


/*
 * Problem: Generate the LinkedList of nodes per level/depth
 * */

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {

    // BY DFS variation
    public ArrayList<LinkedList<TreeNode>> getLinkedListOfLevels(TreeNode root) {

        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        getLinkedListOfLevels(root, 0, result);
        return result;
    }

    private void getLinkedListOfLevels(TreeNode root, int level, ArrayList<LinkedList<TreeNode>> result) {

        //base case
        if (root == null) {
            return;
        }

        LinkedList<TreeNode> list = null;

        if (result.size() == level) {
            // if the list is being created the first time then add the list at the end.
            list = new LinkedList<>();
            result.add(list);

        } else {
            //else the list already exists get that list and the node
            list = result.get(level);
        }

        list.add(root);
        getLinkedListOfLevels(root.left, level + 1, result);
        getLinkedListOfLevels(root.right, level + 1, result);
    }

    // BY BFS variation
    private ArrayList<LinkedList<TreeNode>> getLinkedListByLevels(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        LinkedList<TreeNode> current = new LinkedList<>();
        current.add(root);

        while (!current.isEmpty()){
            // add previous levels list to result
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<>();

            for (TreeNode parent : parents) {
                if (parent.left != null) {
                    current.add(parent.left);
                }
                if (parent.right != null) {
                    current.add(parent.right);
                }
            }
        }

        return result;
    }
}
