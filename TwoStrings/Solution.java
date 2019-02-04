package TwoStrings;

import com.sun.tools.hat.internal.model.HackJavaValue;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {


    private static String twoStrings(String s1, String s2) {

        String result = "NO";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        System.out.println(Arrays.toString(ch2));

        Hashtable<Character, Integer> ht = new Hashtable<>();

        for (char ch : ch1) {
            ht.put(ch, 1);
        }

        System.out.println(ht);

        for (char ch : ch2) {
            if(ht.containsKey(ch)){
                result = "YES";
                break;
            }else{
                continue;
            }

        }
        System.out.println(ht);

        return result;
    }

    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {

            String s1 = scanner.next();
            String s2 = scanner.next();

            String result = twoStrings(s1, s2);
            System.out.println(result);

        }

        scanner.close();


    }


}