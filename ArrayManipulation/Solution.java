package ArrayManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static Scanner scanner;

    public static long arrayManipulation(int n, int[][] queries) {

        long[] lArray = new long[n];

        for (int i = 0; i < queries.length; i++) {
            add(n, queries[i][0] - 1, queries[i][1] - 1, queries[i][2], lArray);
        }
        System.out.println(Arrays.toString(lArray));
        updateList(n, lArray);

        long max = lArray[0];

        for (long a : lArray) {

            if (max < a) {
                max = a;
            }
        }
        System.out.println("Returning...");
        return max;
    }

    private static void updateList(int n, long[] lArray) {

        for (int i = 1; i < n; i++) {
            lArray[i] += lArray[i - 1];
        }
        System.out.println(Arrays.toString(lArray));
    }

    static void add(int n, int low, int high, long value, long[] lArray) {
        System.out.println(low + " " + high+" "+ value);
        lArray[low] += value;
        if (high < n - 1) {
            lArray[high+1] -= value;
        }

        System.out.println(Arrays.toString(lArray));
    }

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        scanner.close();

    }
}
