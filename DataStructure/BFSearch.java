package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSearch {

    public static int[][] goal = {{0, 1, 2}, {3, 4, 5,}, {6, 7, 8}};

    private static void puzzleSolutionBFS(int[][] grid, int[] position) {

        Queue<int[][]> queue = new LinkedList<>();

        ((LinkedList<int[][]>) queue).addFirst(grid);

        BFS(queue,position);


    }

    private static void BFS(Queue<int[][]> queue, int[] position) {

        upChild(queue,position);

    }

    private static void upChild(Queue<int[][]> queue, int[] position) {




    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = 3;
        int[][] grid = new int[m][m];
        int[] position = new int[2];
        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 0 || flag == true) {
                    position[0] = i;
                    position[1] = j;
                    flag = false;
                }
            }
        }

        puzzleSolutionBFS(grid,position);


    }


}
