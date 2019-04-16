package FrequencyQueries;


import java.util.*;

public class Solution {
    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        List<int[]> queries = new ArrayList<>();

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int[] sub = new int[2];
            for (int j = 0; j < 2; j++) {
                sub[j] = scanner.nextInt();
            }
            queries.add(sub);
        }


        List<Integer> ans = freqQuery(queries);
        System.out.println(ans);

    }

    private static List<Integer> freqQuery(List<int[]> queries) {

        List<Integer> ans = new ArrayList<>();
        int[] tmp;
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < queries.size(); i++) {
            tmp = queries.get(i);

            //System.out.println(Arrays.toString(tmp));

            switch (tmp[0]) {

                case 1:
                    ans.add(tmp[1]);
                    if (map.containsKey(tmp[1])) {
                        map.replace(tmp[1], map.get(tmp[1]) + 1);
                    } else {
                        map.put(tmp[1], 1);
                    }
                    break;
                case 2:
                    if (ans.contains(tmp[1])) {
                        //ans.remove(tmp[1]);
                        map.replace(tmp[1], map.get(tmp[1]) - 1);
                    }
                    break;
                case 3:
                    int a = case3(map, tmp[1]);
                    System.out.println(a);

            }
        }

        return ans;
    }

    private static int case3(Map<Integer, Integer> map, int a) {

        if (map.containsValue(a)) {
            return 1;
        } else {
            return 0;
        }


    }
}
