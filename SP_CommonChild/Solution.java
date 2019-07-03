package SP_CommonChild;

import java.util.Scanner;

/*Link for Solution: https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/*/

public class Solution {

    private static Scanner scanner;

    private static int commonChild(String s1, String s2) {

        int l1 = s1.length();
        int l2 = s2.length();

        return commonChild(s1, s2, l1, l2);

    }

    /* This Optimal Solution with O(n^2)*/

    private static int commonChild(String s1, String s2, int l1, int l2) {

        int L[][] = new int[l1 + 1][l2 + 1];

        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {

                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    L[i][j] = 1 + L[i - 1][j - 1];

                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        return L[l1][l2];

    }

    /* This is expensive with O(2^n) */

    /*private static int commonChild(String s1, String s2, int l1, int l2) {

        if (l1 == 0 || l2 == 0) {
            return 0;
        }

        if (s1.charAt(l1 - 1) == s2.charAt(l2 - 1)) {

            return 1 + commonChild(s1, s2, l1-1, l2-1);

        } else {

            return Math.max(commonChild(s1, s2, l1, l2-1),
                    commonChild(s1, s2, l1-1, l2));
        }

    }*/

    public static void main(String[] args) {

        int result = commonChild("SHINCHAN", "NOHARAAA");

        System.out.println(result);

    }
}
