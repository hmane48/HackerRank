package NoOfEmployees;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        List<List<Integer>> listofLists = new ArrayList<>();

        int n = s.nextInt();
        int m = s.nextInt();


        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                list.add(s.nextInt());
            }
            listofLists.add(list);
        }

        System.out.println(NoOfEmployees(n, listofLists));
    }

    private static int NoOfEmployees(int n, List<List<Integer>> listofLists) {

        //int count = 0;
        List<Integer> temp = new ArrayList<>();

        for (List<Integer> list : listofLists) {

            if (temp.isEmpty()) {
                temp.add(list.get(1));
            } else {
                boolean flag = false;
                for (int a = 0; a < temp.size(); a++) {
                    if (temp.get(a) > list.get(1)) {
                        temp.add(a,list.get(1));
                        flag = true;
                        break;
                    }

                }
                if (flag == false){
                    temp.add(list.get(1));
                }
            }
        }

        return temp.size() - n;

    }
}
