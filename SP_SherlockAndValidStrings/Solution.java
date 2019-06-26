package SP_SherlockAndValidStrings;

import java.util.Arrays;
/*
Three cases exist that are valid strings:

        1. If all have the same frequency
        2. If only 1 character has a frequency that is 1 greater than all others
        3. If all have the same frequency except 1 element which has a frequency of 1

* */


public class Solution {

    private static String isValid(String s) {

        if (s.length() <= 3) {
            return "YES";
        }
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        Arrays.sort(letters);
        int i = 0;
        while (letters[i] == 0) {
            i++;
        }
        int min = letters[i];
        int max = letters[25];
        System.out.println(min+" "+max+" >>> "+Arrays.toString(letters));

        if (min == max) {
            return "YES";
        } else {
            if (((max - min == 1) && (max > letters[24])) || ((min == 1) && (letters[i + 1] == max))) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {

        System.out.println(isValid("aabbcd"));

    }
}
