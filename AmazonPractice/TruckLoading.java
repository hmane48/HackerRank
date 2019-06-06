package AmazonPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TruckLoading {

    static ArrayList<Integer> IDsOfPackages(int truckSpace,
                                     ArrayList<Integer> packagesSpace)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        truckSpace -= 30;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < packagesSpace.size();i++) {
            int val = packagesSpace.get(i);
            if(map.containsKey(truckSpace-val)) {
                int cMax = val > truckSpace-val ? val : truckSpace-val;
                if(cMax > max) {
                    max = cMax;
                    //list = new ArrayList<>();
                    list.add(map.get(truckSpace-val));
                    list.add(i);
                }
            }
            map.putIfAbsent(val,i);
        }
        return list;
    }



    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(20);
        a.add(70);
        a.add(90);
        a.add(30);
        a.add(60);
        a.add(110);


        System.out.println(IDsOfPackages(110,a));

    }
}
