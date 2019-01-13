package RepeatedString;

import java.util.Scanner;

public class Solution {

    private static long repeatedString(String s, long n) {
        long result = 0;
        int i = 0;
        long count = 0;

        while (i != s.length()) {
            if (s.charAt(i) == 'a') {
                count++;
            }
            i++;
        }

        result = (n / s.length()) * count;
        long remainder = n % s.length();

        for (int c = 0; c < remainder; c++) {
            if (s.charAt(c) == 'a') {
                result++;
            }
        }
        return result;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        long n = scanner.nextLong();

        long result = repeatedString(s, n);

        System.out.println(result);
    }


}
