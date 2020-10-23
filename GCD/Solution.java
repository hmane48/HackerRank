package GCD;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the GCD is: " + gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int rem = a % b;
        return gcd(b, rem);
    }
}
