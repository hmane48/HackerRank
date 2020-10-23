package LCM;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The LCM is: "+lcm(a,b));
    }

    private static int lcm(int a, int b) {
        // a * b / gcd(a,b) = lcm(a,b)
        return a * b / gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
