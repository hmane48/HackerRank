package PurchaseOrders;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        // make thread-safe list
        List<String> list = Collections.synchronizedList(new ArrayList());

        //make thread-safe map
        Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

        //Initialize the map
        for (int k = 1; k <= 12; k++) {
            map.put(k++, 0);
        }

        System.out.println("Enter the number of orders :");
        Scanner sc = new Scanner(System.in);

        int numOrders = sc.nextInt();
        System.out.println("Enter all the orders :");

        for (int i = 0; i < numOrders; i++) {
            String orders = sc.next();
            list.add(orders);
        }

        System.out.println("Enter number of threads to process the data :");
        int numThreads = sc.nextInt();

        sc.close();

        for (int j = 0; j < numThreads; j++) {
            Thread t = new Thread(new TotalOrderThread(list, map), "thread" + j);
            t.start();
        }

        System.out.println(map);

    }
}
