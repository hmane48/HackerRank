package KickStart;

import java.util.Scanner;

/*
*  Problem
Bucket is planning to make a very long journey across the countryside by bus. Her journey consists of N bus routes, numbered from 1 to N in the order she must take them. The buses themselves are very fast, but do not run often. The i-th bus route only runs every Xi days.

More specifically, she can only take the i-th bus on day Xi, 2Xi, 3Xi and so on. Since the buses are very fast, she can take multiple buses on the same day.

Bucket must finish her journey by day D, but she would like to start the journey as late as possible. What is the latest day she could take the first bus, and still finish her journey by day D?

It is guaranteed that it is possible for Bucket to finish her journey by day D.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case begins with a line containing the two integers N and D. Then, another line follows containing N integers, the i-th one is Xi.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the latest day she could take the first bus, and still finish her journey by day D.
* */

public class BusRoutesSolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int routes = sc.nextInt();
            int days = sc.nextInt();
            int[] arr = new int[routes];
            for (int j = 0; j < routes; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println("Case #" + i + ": " + firstBusDays(arr, days));
        }
    }

    private static int firstBusDays(int[] arr, int days) {
        int div;
        for (int a = arr.length - 1; a >= 0; a--) {
            if (days % arr[a] == 0){
                continue;
            }else {
                div = days / arr[a];
                days = div * arr[a];
            }
        }

        return days;
    }


}
