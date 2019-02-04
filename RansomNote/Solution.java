package RansomNote;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {

    private static void checkMagazine(String[] magazine, String[] note) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        for (String mag: magazine) {

            if(hashtable.containsKey(mag)){
                hashtable.put(mag, hashtable.get(mag)+1);
            }else {
                hashtable.put(mag, 1);

            }
        }

        //System.out.println(hashtable);

        for (String nt: note) {
            if(hashtable.get(nt) == null){
                System.out.println("No");
                return;
            }else{
                if(hashtable.get(nt) > 1){
                    hashtable.replace(nt,hashtable.get(nt)-1);
                }else {
                    hashtable.remove(nt);
                }
            }
        }

        System.out.println("Yes");

        return;


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
