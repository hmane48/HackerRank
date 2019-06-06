package CTCI.ArraysAndStrings;

import java.util.Arrays;

public class URLifyClass {


    // This method replaces all the spaces to '%20' and makes sure the string is sufficient to fit all the chars
    // Ex. Input: "Mr. John Smith    ", 13
    //     Output: "Mr.%20John%20Smith"
    public static String URLify(String s, int trueLength) {

        char[] char_array = s.toCharArray();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < char_array.length; i++) {
            if (i > trueLength) {
                break;
            }
            if (char_array[i] == ' ') {
                string.append("%20");
            } else {
                string.append(char_array[i]);
            }
        }


        return string.toString();
    }

    public static String URLify1(String s, int trueLength) {

        char[] str = s.toCharArray();

        int numberOfSpaces = CountOfSpaces(str, 0, trueLength, ' ');

        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        if (newIndex + 1 < str.length) {
            str[newIndex + 1] = '\0';
        }

        for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
            if (str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                str[newIndex] = str[oldIndex];
                newIndex--;
            }
        }

        return Arrays.toString(str);
    }

    private static int CountOfSpaces(char[] str, int i, int trueLength, int c) {

        int count = 0;
        for (char ch : str) {
            if (ch == c) {
                count++;
            }
        }
        System.out.println(count);

        return count;
    }

    public static void main(String[] args) {
    }
}
