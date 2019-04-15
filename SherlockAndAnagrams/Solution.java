package SherlockAndAnagrams;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {


    private static int sherlockAndAnagrams(String s) {

        int count = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String currentSubString = s.substring(i, j);

                char ch[] = currentSubString.toCharArray();

                //System.out.println(Arrays.toString(ch));

                Arrays.sort(ch);
                currentSubString = String.valueOf(ch);

                int value = map.getOrDefault(currentSubString, 0);

                count += value;

                map.put(currentSubString, ++value);
            }
        }

        return count;


    }


    static Scanner scanner;


    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {

            String s = scanner.next();
            int result = sherlockAndAnagrams(s);

            System.out.println(result);
        }

        scanner.close();

    }


}
