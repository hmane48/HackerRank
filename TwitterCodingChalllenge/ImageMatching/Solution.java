package TwitterCodingChalllenge.ImageMatching;

import java.util.*;

public class Solution {
    static Scanner scanner;


    private static int countMatches1(List<String> grid1, List<String> grid2){

        int count = 0;
        int x = grid1.size();
        int y = grid2.size();

        List<Map<Integer, Integer>> lst = new ArrayList<Map<Integer, Integer>>();

        int[][] grid1Array = new int[x][x];
        grid1Array = Listto2Darray(grid1, x, grid1Array, lst);


        return count;

    }

    private static int[][] Listto2Darray(List<String> grid, int x, int[][] gridArray, List<Map<Integer, Integer>> lst) {
        for (int i = 0; i < x; i++) {

            String a = grid.get(i);
            char[] achar = a.toCharArray();

            for (int j = 0; j < x; j++) {
                int num = Integer.parseInt(a.substring(j,j+1));
                gridArray[i][j] = num;

            }
        }
        System.out.println(gridArray[2][2]);
        return gridArray;
    }

    /*private static int countMatches(List<String> grid1, List<String> grid2) {
        int count = 0;
        int x = grid1.size();
        int y = grid2.size();

        List<Map<Integer, Integer>> lst = new ArrayList<Map<Integer, Integer>>();
        List<Map<Integer, Integer>> lst2 = new ArrayList<Map<Integer, Integer>>();

        int[][] grid1Array = new int[x][x];
        int[][] grid2Array = new int[y][y];

        grid1Array = Listto2Darray(grid1, x, grid1Array);

        grid2Array = Listto2Darray(grid2, y, grid2Array);

        System.out.println(Arrays.toString(grid1Array));

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                recFun(i, j, grid1Array, lst, x);
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                recFun(i, j, grid1Array, lst2, y);
            }
        }
        System.out.println(lst);
        System.out.println(lst2);

        return count;
    }*/

    /*private static void recFun(int i, int j, int[][] grid1Array, List<Map<Integer, Integer>> lst, int x) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(i, j);

        if (grid1Array[i][j] == 1) {

            if (!lst.contains(map)) {

                if ((i == x - 1)) {
                    recFun(i - 1, j, grid1Array, lst, x);

                } else if (j == x - 1) {
                    recFun(i, j - 1, grid1Array, lst, x);

                } else {
                    recFun(i + 1, j, grid1Array, lst, x);
                    recFun(i, j + 1, grid1Array, lst, x);
                }
            } else return;

        } else return;

        lst.add(map);
    }*/



    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        List<String> grid1 = new ArrayList<>();
        int grid1count = scanner.nextInt();

        for (int i = 0; i < grid1count; i++) {
            String a = scanner.next();
            grid1.add(i, a);
        }

        List<String> grid2 = new ArrayList<>();
        int grid2count = scanner.nextInt();

        for (int i = 0; i < grid2count; i++) {
            String b = scanner.next();
            grid2.add(i, b);
        }

        int results = countMatches1(grid1, grid2);

        scanner.close();
    }

}
