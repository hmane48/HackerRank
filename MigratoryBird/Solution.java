package MigratoryBird;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static int migratoryBirds(List<Integer> list){

        int [] arr = new int[6];
        int max = 0;
        int index = 0;

        for (int x: list) {

            arr[x] += 1;

            if(arr[x] > max){
                max = arr[x];
                index = x;
            }else if(arr[x] == max){
                index = Math.min(index,x);
            }
        }

        return index;


    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int [] arr = new int[n];

        for (int i =0; i < n; i++){
            list.add(s.nextInt());
        }

        System.out.println(migratoryBirds(list));


    }
}
