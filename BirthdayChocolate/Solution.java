package BirthdayChocolate;

import java.util.Scanner;

public class Solution {
    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        //List<Integer> list = new ArrayList<>();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            //list.add(scanner.nextInt());
            arr[i] = scanner.nextInt();

        }

        int d = scanner.nextInt();

        int m = scanner.nextInt();

        System.out.println(birthday(arr, d, m));

    }

    private static int birthday(int[] arr, int d, int m) {

        int count = 0;
        int sum = 0;
        int key =0;
        for (int i = 0; i < m;i++){
            sum += arr[i];
        }
        if (sum == d){
            count++;
        }

        for (int i = m; i < arr.length;i++){
            sum -= arr[key];
            sum += arr[i];
            if (sum == d){
                count++;
            }

            key++;
        }

        return count;
    }
}
