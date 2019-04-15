package EPIJ;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(2);
            list.add(4);
        }
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}