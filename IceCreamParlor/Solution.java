package IceCreamParlor;

import java.util.Hashtable;

// problem URL: https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=search&isFullScreen=true

public class Solution {

    static void whatFlavors(int[] cost, int money) {

        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int index = 1;
        for (int a : cost) {
            ht.put(a, index);
            index++;
        }
        System.out.println(ht);
        int id1 = 0, id2 = 0;
        for (int i = 0; i < cost.length; i++) {
            int a = cost[i];
            int b = money - a;
            System.out.println("b is "+b);
            if (b <= 0) {
                System.out.println(!ht.containsKey(b));
                continue;
            } else if(ht.containsKey(b)){
                System.out.println(!ht.containsKey(b));
                id1 = i + 1;
                id2 = ht.get(b);
                if(id1 == id2){
                    continue;
                }
                break;
            }
        }
        System.out.println(id1 + " " + id2);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};

        whatFlavors(arr,5);
    }
}
