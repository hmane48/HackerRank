package KickStart;

import java.util.Scanner;

/*
* Li has planned a bike tour through the mountains of Switzerland. His tour consists of N checkpoints, numbered from 1 to N in the order he will visit them. The i-th checkpoint has a height of Hi.

A checkpoint is a peak if:
It is not the 1st checkpoint or the N-th checkpoint, and
The height of the checkpoint is strictly greater than the checkpoint immediately before it and the checkpoint immediately after it.

Please help Li find out the number of peaks.
* Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case begins with a line containing the integer N. The second line contains N integers. The i-th integer is Hi.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the number of peaks in Li's bike tour.
* */

public class BikeTourSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int testLength = sc.nextInt();
            int[] arr = new int[testLength];
            for (int j = 0; j < testLength; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println("Case #" + i + ": " + numberOfPeaks(arr));

        }
    }

    private static int numberOfPeaks(int[] arr) {

        int a, b, c;
        int peak = 0;

        for (int k = 0; k < arr.length - 2; k++) {
            a = arr[k];
            b = arr[k + 1];
            c = arr[k + 2];

            if (a < b && c < b) {
                peak++;
            }
        }

        return peak;

    }
}
