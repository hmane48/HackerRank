package SherlockSquareroot;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int squares(int a, int b) {
        // Complete this function
        int count=0;
        int ab=(int)(Math.floor(Math.sqrt(Math.max(a, b)))-Math.ceil(Math.sqrt(Math.min(a, b))))+1;
        
        return ab;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int result = squares(a, b);
            System.out.println(result);
        }
        in.close();
    }
}
