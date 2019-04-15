package codeJam;

import java.util.Scanner;

public class EvenDigits {

    public static Scanner scanner;

    public static long BeautifulNum(long num) {

        String numString = String.valueOf(num);
        int index = 0;
        String newMax = "0";
        String newMin = "0";

        for (int i = 0; i < numString.length(); i++) {

            if (Integer.valueOf(numString.charAt(i)) % 2 != 0) {
                index = i;
                int numin = Character.getNumericValue(numString.charAt(i)) - 1;
                int numax = Character.getNumericValue(numString.charAt(i)) + 1;

                newMin += String.valueOf(numin);
                newMax += String.valueOf(numax);
                for (int j = index+1; j < numString.length(); j++) {
                    newMin += '8';
                    newMax += '0';
                }
                break;
            }else{
                newMin += numString.charAt(i);
                newMax += numString.charAt(i);
            }
        }

        long a = Long.valueOf(newMin);
        long b = Long.valueOf(newMax);

        long adiff = Math.abs(num - a);
        long bdiff = Math.abs(num - b);

        if(a == 0 && b == 0){
            return 0;
        }else if(adiff<bdiff) {
            return adiff;
        }else {
            return bdiff;
        }


    }

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        int count;
        count = scanner.nextInt();

        for (int i = 1; i < count + 1; i++) {
            long num = scanner.nextLong();
            System.out.println("Case #" + (i) + ":" + BeautifulNum(num));
        }

        scanner.close();

    }
}
