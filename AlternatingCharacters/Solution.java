package AlternatingCharacters;

import java.util.Scanner;

/*You are given a string containing characters  and  only. Your task is to change it into a string such that there are
no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.

For example, given the string s = AABAAB, remove an A at positions 0 and 3 to make s=ABAB in 2 deletions.*/
public class Solution {

    static Scanner s;

    public static void main(String[] args) {

        s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            String str = s.nextLine();

            System.out.println(alternatingCharacters(str));
        }

    }

    private static int alternatingCharacters(String str) {

        //char[] arr = str.toCharArray();
        //boolean res = false;
        char ch = str.charAt(0);
        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
            ch = str.charAt(i);
        }

        return count;
    }
}
