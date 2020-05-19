package CTCI.TreesAndGraphs;

/*
 * Problem: Create a Minimal BST from an ascending sorted array.
 * */

public class MinimalTree {

    public BSTNode minimalTree(int[] arr) {
        return minimalTree(0, arr.length - 1, arr);
    }

    private BSTNode minimalTree(int start, int end, int[] arr) {

        if (end < start) {
            return null;
        }

        int middleIndex = start + end / 2;
        BSTNode root = new BSTNode(arr[middleIndex]);

        root.left = minimalTree(0, middleIndex, arr);
        root.right = minimalTree(middleIndex + 1, end, arr);

        return root;

    }
}
