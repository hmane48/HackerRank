package SockMerchant;

import java.util.*;

public class Solution {


    private static int sockMerchant(int n, int[] ar) {

        // this is the main logic -> BRUTFORCE Approach
        int main_count = 0;
        /*List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {

            if (!list.contains(ar[i])) {
                list.add(ar[i]);
                int count = 0;
                for (int j = 0; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        count++;
                    }
                }
                main_count = main_count + (count / 2);
            }
        }*/

        /*Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }*/

        //Alternate approach

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if (!set.contains(ar[i])){
                set.add(ar[i]);
            }else {
                main_count++;
                set.remove(ar[i]);
            }
        }
        return main_count;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);


    }


}
