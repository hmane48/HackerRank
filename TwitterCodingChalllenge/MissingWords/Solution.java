package TwitterCodingChalllenge.MissingWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static List<String> missingWords(String s, String t) {

        List<String> res = new ArrayList<>();

        String[] sstring = s.split(" ");
        String[] tstring = t.split(" ");

        //List<String> stringList = Arrays.asList(tstr);

        int i = 0, j = 0;

        while (i < sstring.length){

            if (j<tstring.length){
                if (!sstring[i].equals(tstring[j])){
                    res.add(sstring[i]);
                }else {
                    j++;
                }
            }else{
                res.add(sstring[i]);
            }

            i++;
        }

        return res;
    }

    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        List<String> result = missingWords(s, t);

        System.out.println(result);

        scanner.close();
    }
}
