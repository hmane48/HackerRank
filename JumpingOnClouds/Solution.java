package JumpingOnClouds;

import java.util.Scanner;

public class Solution {

    private static int jumpingOnClouds(int[] c) {

        // 0 1 2 3 4  length = 5

        int i = 0;
        int jumps = 0;

        /*for (int j = 0; j < c.length; j++) {

            System.out.print(c[j] + " ");
        }*/

        //System.out.println();


        while (i < c.length-1) {

            if (((i + 2) <= (c.length - 1)) && (c[i + 2] == 0)) {
                i = i + 2;
                jumps++;

            } else {
                i = i + 1;
                jumps++;
            }

            //System.out.println("i ="+ i+" jumps="+jumps);
        }

        return jumps;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);

    }


}
