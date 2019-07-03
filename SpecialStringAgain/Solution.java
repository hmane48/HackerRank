package SpecialStringAgain;

/*
 * A special substring is any substring of a string which meets one of those criteria.
 * Given a string, determine how many special substrings can be formed from it.For example,
 * given the string s = "mnonopoo" , we have the following special substrings: .
 * {'m','n','o','n','o','p','o','o','non','ono','opo','oo'}
 * */

public class Solution {

    // "aaabaaa"

    static long substrCount(int length, String s) {

        long count = length;
        for (int i = 0; i < length; i++) {
            // 1. check if the s[i] is surrounded by similar letters from around e.g. AFA

            int offset = 1;
            //System.out.println(i);

            while ((i - offset >= 0) && (i + offset < length) && s.charAt(i - offset) == s.charAt(i - 1)
                    && s.charAt(i + offset) == s.charAt(i - 1)) {
                count++;
                offset++;
            }
            int repeat = 0;
            while ((i + 1 < length) && (s.charAt(i) == s.charAt(i + 1))) {
                repeat++;
                i++;
            }

            count += repeat * (repeat + 1) / 2;

        }


        return count;

    }

    public static void main(String[] args) {

        String s = "mnonopoo";
        String str = "abcbaba";

        System.out.println(substrCount(str.length(), str));


    }
}
