package CTCI.ArraysAndStrings;

import java.util.Arrays;

public class OneAwayClass {

    /*public static boolean oneAway(String a, String b) {

        int count = 0;

        if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }

        int[] array = new int[26];

        for (char c : a.toCharArray()) {
            int index = c % 26;
            array[index]++;
        }

        for (char c : b.toCharArray()) {
            int index = c % 26;
            array[index]++;
        }

        for (int ct:array){
            if (ct%2==1){
                count++;
            }
        }
        System.out.println(Arrays.toString(array));

        System.out.println(count);

        return count <= 1;

    }*/

    //Brute-force (insert, remove, replace)

    public static boolean oneAway(String a, String b) {

        int count = 0;

        if (a.length() == b.length()) {
            // it is a replace operation for sure
            if (a.equals(b)) {
                return true;
            } else {
                for (int i = 0; i < a.length(); i++) {
                    if (count > 1) {
                        return false;
                    }
                    if (a.charAt(i) != b.charAt(i)) {
                        count++;
                    }
                }
            }
        } else if (Math.abs(a.length() - b.length()) > 1 ) {
            // remove/insert operation
            for (int i = 0; i < a.length(); i++) {
                if (count > 2) {
                    return false;
                }
                if (a.charAt(i) != b.charAt(i)) {
                    count++;
                }
            }
        } else {
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(oneAway("cool", "cooo"));
    }
}
