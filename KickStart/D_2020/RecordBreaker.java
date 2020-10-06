package KickStart.D_2020;

import java.util.Scanner;

public class RecordBreaker {

    // 3 1 4 1 5 9 2 6 5

    static int recordBreakingDays(int[] arr) {
        int count = 0;

        int next, curr;
        int record = 0;

        for (int i = 0; i < arr.length; i++) {

            //check if last day
            if (i == arr.length - 1) {
                if (arr[i] > record) {
                    count++;
                }

            } else {

                curr = arr[i];
                next = arr[i + 1];

                if (curr > next && curr > record) {
                    count++;
                    record = curr;
                }

            }

        }

        return count;
    }

    public static void main(String[] args) {
        /*int [] arr = {3,1,4,1,5,9,2,6,5};

        System.out.println(recordBreakingDays(arr));*/

        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();
        int days;
        for (int i = 0; i < tests; i++) {
            days = sc.nextInt();
            int[] arr = new int[days];
            for (int j = 0; j < days; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println("Case #" + (i + 1) + ": " + recordBreakingDays(arr));
        }
    }
}
