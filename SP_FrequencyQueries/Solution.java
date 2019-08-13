package SP_FrequencyQueries;


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

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int []> queries) {
        List<Integer> output = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int [] l: queries){
            int a = l[0];
            int b = l[1];
            switch(a){
                case 1: doFor1(b,map);
                    break;
                case 2: doFor2(b,map);
                    break;
                case 3: if(doFor3(b,map)){
                    output.add(1);
                    System.out.println(1);
                }else{
                    output.add(0);
                    System.out.println(0);
                }
                    break;
            }
        }

        return output;
    }

    public static void doFor1(int b,Map<Integer,Integer> map){
        //Insert x in your data structure.
        if(map.containsKey(b)){
            map.replace(b,map.get(b)+1);
        }else{
            map.put(b,1);
        }
    }

    public static void doFor2(int b,Map<Integer,Integer> map){
        //Delete one occurrence of y from your data structure, if present
        if(map.containsKey(b)){
            map.replace(b,map.get(b)-1);
        }
    }

    public static boolean doFor3(int b,Map<Integer,Integer> map){

        for(int v : map.values()){
            if(v==b){
                return true;
            }
        }

        return false;
    }
}
