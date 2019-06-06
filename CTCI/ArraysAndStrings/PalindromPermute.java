package CTCI.ArraysAndStrings;

import java.util.*;

public class PalindromPermute {

    /* Problem: Checking whether a String OR its Permutation can form a palindrome or not */

    /* Here we assume a string which is in lower case and does not have any spaces in between */

    public static boolean palindromePermutation(String s) {

        int[] table = new int[26];
        int oddCount = 0;

        for (char c : s.toCharArray()) {

            int index = c % 26;
            table[index]++;

            if (table[index] % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {

        System.out.println(palindromePermutation("tactcoa"));

    }
}
