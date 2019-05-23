package ViagoChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);

        int [] eventArray = new int[0];
        int [] buyerArray = new int[0];

        int sizeOfWorld = Integer.parseInt(scan.nextLine());
        int numberOfEvents = Integer.parseInt(scan.nextLine());
        while(numberOfEvents > 0){
            String eventLine = scan.nextLine();
            // TODO: you will need to parse and store the events
            //ArrayList<Integer> list = new ArrayList<>();

            String [] eventString = eventLine.split(" ");
            eventArray = new int [eventString.length];
            for(int i = 0; i < eventString.length; i++){
                //list.add(Integer.parseInt(eventString[i]));
                eventArray[i] = Integer.parseInt(eventString[i]);
            }
            numberOfEvents--;
        }

        int numberOfBuyers = Integer.parseInt(scan.nextLine());
        while(numberOfBuyers > 0){
            String buyerLine = scan.nextLine();
            // TODO: you will need to parse and store the buyers
            String [] buyerString = buyerLine.split(" ");
            buyerArray = new int [buyerString.length];
            for(int i = 0; i < buyerString.length; i++){
                //list.add(Integer.parseInt(eventString[i]));
                buyerArray[i] = Integer.parseInt(buyerString[i]);
            }
            numberOfBuyers--;
        }

        findEvent(eventArray,buyerArray);

        // The solution to the first sample above would be to output the following to console:
        // (Obviously, your solution will need to figure out the output and not just hard code it)
        System.out.println("2 50");
    }

    public static void findEvent(int [] events,int [] buyers){

        System.out.println(Arrays.toString(events));
    }

    // The following method get the manhatten distance betwen two points (x1,y1) and (x2,y2)
    public static int calculateManhattanDistance(int x1, int y1, int x2, int y2)    {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}