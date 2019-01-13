package MinSwaps;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {


    private static int minimumSwaps(int[] arr) {


        int n = arr.length;

        ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Pair<>(arr[i], i));
        }

        System.out.println(list);

        /*Sort the array by array element values to
        get right position of every element as the
        elements of second array. */

        list.sort(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {


                if (o1.getKey() < o2.getKey()) {
                    return -1;
                } else if (o1.getKey() == o2.getKey()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        System.out.println(list);

        System.out.println(list.get(0));

        // To keep track of visited elements. Initialize
        // all elements as not visited or false.

        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);

        // Initialize result
        int ans = 0;

        // traverse array elements
        for (int i = 0; i < n; i++) {
            // already swapped and corrected or
            // already present at correct pos
            if (vis[i] || list.get(i).getValue() == i) {
                continue;
            }

            // find out the number of  node in
            // this cycle and add in ans

            int cycle_size = 0;
            int j = i;
            while (!vis[j]) {
                vis[j] = true;

                // move to next node
                j = list.get(j).getValue();
                cycle_size++;
            }

            // Update answer by adding current cycle.
            if (cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }

        return ans;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[s];

        String[] arrItems = scanner.nextLine().split(" ");


        for (int i = 0; i < s; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);


        System.out.println(res);


    }


}
