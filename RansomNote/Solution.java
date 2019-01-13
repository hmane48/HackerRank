package RansomNote;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {

    private static void checkMagazine(String[] magazine, String[] note) {

        Hashtable<Integer, String> ht = new Hashtable<>(magazine.length);
        String result = "Yes";
        int i = 0, j = 0;

        for (String a : magazine) {
            ht.put(i, a);
            i++;
        }
        for (String b : note) {
            if (!ht.containsValue(b)) {
                result = "No";
                break;
            } else {

                continue;
            }
        }
        System.out.println(result);
        System.out.println(ht.toString());
    }


    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        String[] magazine = new String[m];
        String[] note = new String[n];

        for (int i = 0; i < m; i++) {
            magazine[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) {
            note[i] = scanner.next();
        }

        checkMagazine(magazine, note);


    }


}
