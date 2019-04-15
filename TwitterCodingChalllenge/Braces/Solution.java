package TwitterCodingChalllenge.Braces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    private static String[] braces(String[] values) {

        String[] res = new String[values.length];

        for (int i = 0; i < values.length; i++) {

            //char checklist = {'(','{','['};
            String str = values[i];
            Stack<Character> stack = new Stack<>();
            char[] ch = str.toCharArray();
            String boolValue = "YES";
            //System.out.println(Arrays.toString(ch));
            //System.out.println(Arrays.toString(stack.toArray()));

            for (char a : ch) {
                if (a == '(' || a == '[' || a == '{') {
                    stack.push(a);
                } else if (!stack.empty() && ((a == ')' && stack.peek() == '(') || (a == '}' && stack.peek() == '{') ||
                        (a == ']' && stack.peek() == '['))) {
                    stack.pop();
                } else {
                    boolValue = "NO";
                    break;
                }
                //System.out.println(Arrays.toString(stack.toArray()));
            }

            res[i] = boolValue;
            if(!stack.empty()){
                res[i]= "NO";
            }

        }

        return res;

    }

    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String[] string = new String[a];

        for (int i = 0; i < a; i++) {
            string[i] = scanner.next();
        }

        scanner.close();

        String [] res = braces(string);

        for (int i = 0; i < a; i++) {
            System.out.println(res[i]);
        }



    }
}
