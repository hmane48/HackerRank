package MarkAndToys;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static Scanner scanner;

    private static int maximumToys(int[] arr, int k) {

        int total = 0;
        int num = 0;

        Arrays.sort(arr);

        for (int a : arr) {

            if ((total + a) < k) {
                total += a;
                num++;
            } else {
                break;
            }
        }

        return num;
    }

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = maximumToys(arr, k);

        System.out.println(result);

    }


}
