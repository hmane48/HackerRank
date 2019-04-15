package DivisibleSumPairs;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        int num = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int result = divisibleSumPairs(size, num, array);

        System.out.println(result);


    }

    private static int divisibleSumPairs(int size, int num, int[] array) {

        int count = 0;

        for (int j = 1; j < size; j++) {
            for (int i = 0; i < j; i++) {

                if ((array[i] + array[j]) % num == 0) {
                    count++;
                }
            }
        }

        return count;

    }
}
