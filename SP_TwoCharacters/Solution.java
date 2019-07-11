package SP_TwoCharacters;

import java.util.Arrays;

public class Solution {

    private static int alternate(String s) {

        StringBuilder str = new StringBuilder();
        char ch = '.';
        boolean repeat = false;
        int minCount = Integer.MAX_VALUE;
        int[] arr = new int[26];

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                ch = s.charAt(i);
                repeat = true;
                break;
            }
        }

        if (repeat) {

            str = removeChar(str, ch, s);
        }

        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {

            arr[s.charAt(i) - 'a']++;
            if (minCount > arr[s.charAt(i) - 'a']) {
                minCount = arr[s.charAt(i) - 'a'];
            }

        }

        System.out.println(Arrays.toString(arr));

        return s.length() - minCount;

    }

    private static StringBuilder removeChar(StringBuilder str, char ch, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (ch != s.charAt(i)) {
                str.append(s.charAt(i));
            }
        }

        return str;
    }


    /*private static int factorial(int count) {

        if (count - 1 == 0) {
            return 1;
        } else {
            return (count - 1) * count;
        }
    }*/


    public static void main(String[] args) {

        System.out.println(alternate("asdcbsdcagfsdbgdfanfghbsfdab"));
    }
}
