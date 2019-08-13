package StringReduction;

public class Solution {

    /*
    *   Given a string consisting of the letters ,  and , we can perform the following operation:
        Take any two adjacent distinct characters and replace them with the third character.
        Find the shortest string obtainable through applying this operation repeatedly.
        For example, given the string "aba"  we can reduce it to a 1  character string by replacing "ab" with "c"
        and "ca" with "b" : aba -> ca -> b.
    * */
    static int stringReduction(String s) {

        String abc = stringReductions(s);

        return s.length();

    }

    private static String stringReductions(String s) {

        if (s.length() == 1) {
            return s;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(0) != s.charAt(1)) {
                builder.append(replacement(s.charAt(i), s.charAt(i + 1)));
                builder.append(s.substring(i + 2));
                break;
            } else {
                builder.append(s.charAt(i));
            }
        }

        System.out.println(builder);

        return stringReductions(builder.toString());
    }


    static char replacement(char x, char y) {
        return (char) ('a' + 'b' + 'c' - (x + y));
    }


    public static void main(String[] args) {

        String s = "abcbcba";


        System.out.println(stringReductions(s));

    }
}
