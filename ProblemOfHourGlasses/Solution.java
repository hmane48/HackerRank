package ProblemOfHourGlasses;

import java.util.Scanner;

/**
 *
 * @author hrishimane
 */
public class Solution {

    public int hourGlassesMaxSum(int[][] arr) {
        int sum = -63;
        int a, b, c, d, e, f, g;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a = arr[0 + i][0 + j];
                b = arr[0 + i][1 + j];
                c = arr[0 + i][2 + j];
                d = arr[1 + i][1 + j];
                e = arr[2 + i][0 + j];
                f = arr[2 + i][1 + j];
                g = arr[2 + i][2 + j];
                if (sum < (a + b + c + d + e + f + g)) {
                    sum = a + b + c + d + e + f + g;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(sol.hourGlassesMaxSum(arr));

    }
}
