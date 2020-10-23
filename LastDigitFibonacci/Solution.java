package LastDigitFibonacci;

// Compute the Last Digit of a Large Fibonacci Number

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Fibonacci series :");
        int num = sc.nextInt();
        long x = fibonacciNum(num);
        System.out.println(x);
        System.out.println("The last digit of the large Fibonacci number :"+(x % 10));

    }

    private static long fibonacciNum(int num) {
        // to calculate fibonacci num
        long [] arr = new long[num+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i=2; i <= num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[num];
    }
}
