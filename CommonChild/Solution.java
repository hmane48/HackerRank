package CommonChild;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static Scanner scanner;

    private static int commonChild(String s1, String s2) {

        int count = 0;

        char[] arrs1 = s1.toCharArray();
        char[] arrs2 = s2.toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arrs1.length; i++) {
            if (map1.containsKey(arrs1[i])) {
                map1.replace(arrs1[i], map1.get(arrs1[i]) + 1);
            } else {
                map1.put(arrs1[i], 1);
            }

            if (map2.containsKey(arrs2[i])) {
                map2.replace(arrs2[i], map2.get(arrs2[i]) + 1);
            } else {
                map2.put(arrs2[i], 1);
            }

        }

        System.out.println(map1);
        System.out.println(map2);

        for (int i=0; i < arrs1.length; i++){
            if(map1.containsKey(arrs2[i])){
                if (map1.get(arrs2[i]) < map2.get(arrs2[i])){
                    count += map1.get(arrs2[i]);
                    map1.remove(arrs2[i]);
                }else{
                    count += map2.get(arrs2[i]);
                    map2.remove(arrs2[i]);
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();

        int result = commonChild(s1, s2);

        System.out.println(result);

        scanner.close();

    }
}
