package SparceArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ssize = scanner.nextInt();

        String[] strings = new String[ssize];
        for (int i = 0; i < ssize; i++) {
            strings[i] = scanner.next();
        }
        int qsize = scanner.nextInt();

        String[] queries = new String[qsize];
        for (int i = 0; i < ssize; i++) {
            queries[i] = scanner.next();
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < qsize; i++) {
            System.out.println(res[i]);
        }
    }

    private static int[] matchingStrings(String[] strings, String[] queries) {

        Map<String, Integer> map = new HashMap<>();
        int[] res = new int[queries.length];

        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.replace(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            if (map.containsKey(queries[i])) {
                res[i] = map.get(queries[i]);
            }
        }

        return res;
    }
}

