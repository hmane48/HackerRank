package CountingValleys;

import java.util.Scanner;

public class Solution {


    private static int countingValleys(int n, String s) {

        char[] str = s.toCharArray();
        int level = 0;
        int valleyCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'D') {
                level = level - 1;
            } else {
                level = level + 1;
                if (level == 0) {
                    valleyCount++;
                }
            }
        }
        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        scanner.close();

        int result = countingValleys(n, s);

        System.out.println(result);

    }


}
