package EPIJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(isUniqueChars(str));
    }

    private static boolean isUniqueChars(String str) {

        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println(val+"   "+checker+"  "+(1<<val));
            if ((checker & (1<<val))>0){
                return false;
            }
            checker = checker | (1<<val);
            System.out.println(checker);
        }

        return true;
    }
}