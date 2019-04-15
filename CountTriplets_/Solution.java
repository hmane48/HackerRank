package CountTriplets_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static Scanner scanner;

    // Brute-force solution
    /*private static long countTriplets(List<Long> arr, long r) {

        long count = 0;
        //List<Long> triplet = new ArrayList<>();
        //Map<Integer,List<Long>> map = new HashMap<>();

        for (int i = 0; i < arr.size()-2; i++) {
            for (int j = i+1; j < arr.size()-1;j++){
                for (int k = j+1; k < arr.size(); k++){

                    long a = arr.get(i) * r;
                    long b = arr.get(j);
                    long c = arr.get(k)/r;

                    if(a == b && b == c){
                        count++;
                    }
                }

            }
        }

        return count;

    }*/

    /*private static long countTriplets(List<Long> arr, long r){

        long count = 0;

        int maxLength = arr.size();

        Map<Integer, Long> map = new HashMap<>();

        *//*for (Long s: arr) { /// Has Errors : DISCOVERY OF A PROBLEM!

            map.put(arr.indexOf(s), s);

        }*//*

        for (int i = 0; i < maxLength; i++){

            map.put(i, arr.get(i));
        }

//        System.out.println(map);

        for (int i = 0; i < maxLength-2; i++) {

            long a = map.get(i) * r;

            for (int j = i+1; j < maxLength-1;j++){

                long b = map.get(j);

                for (int k = j+1; k < maxLength; k++){

//                    System.out.println(map.get(i)+" "+map.get(j)+" "+map.get(k)+" k is: "+k);

                    long c = map.get(k)/r;

                    if(a == b && b == c){
                        count++;
                    }
                }

            }
        }



        return count;
    }*/


    /*private static long countTriplets(int [] arr, int r) {

        long count = 0;

        Map<Long, Integer> map = new HashMap<>();

        long [] arrArray = new long [arr.length];

        for (int i = 0; i < arr.length; i++) {

            long key = arr[i];


            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
                arrArray[i] = key;
            }
        }

        //System.out.println(map);

        for (int i = 0; i < arrArray.length-2; i++){

            long a = arrArray[i];
            long b = a * r;
            long c = b * r;

            //System.out.println("a="+a+" b="+b+" c="+c);

            if(map.containsKey(a) && map.containsKey(b) && map.containsKey(c)) {

                count += Math.max( Math.max(map.get(a), map.get(b)), map.get(c));
            }


        }
            return count;
    }*/


    static long countTriplets(long[] arr, long r) {
        HashMap<Long, Long> map1 = new HashMap();
        HashMap<Long, Long> map2 = new HashMap();
        long count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            long a = arr[i];

            if (map2.containsKey(a * r))
                count += map2.get(a * r);

            if (map1.containsKey(a * r)) {
                long c = map1.get(a * r);
                map2.put(a, map2.getOrDefault(a, 0L) + c);
            }

            map1.put(a, map1.getOrDefault(a, 0L) + 1);
        }
        System.out.println(map1 + "\n" + map2);
        return count;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Long> list = new ArrayList<>();

        scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int r = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLong());
        }
        long[] result = list.stream().mapToLong(l -> l).toArray();


        long ans = countTriplets(result, r);

        System.out.println(ans);
    }

}
