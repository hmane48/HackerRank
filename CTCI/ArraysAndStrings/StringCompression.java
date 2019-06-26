package CTCI.ArraysAndStrings;

public class StringCompression {

    /*
        Here we have to compress the string ("aabcaa") to a2b1c1a2 and check the length
        if the length is greater than string's length then have to return the original string
    */

    public static String compression(String s){

        int count = 1;
        char ch = s.charAt(0);
        StringBuilder builder = new StringBuilder();
        builder.append(ch);
        for (int i = 1; i < s.length(); i++){
            if(ch == s.charAt(i)){
                count++;
            }else {
                builder.append(count);
                count = 1;
                ch = s.charAt(i);
                builder.append(ch);
            }
        }
        builder.append(count);

        if(builder.toString().length() < s.length()){
            return builder.toString();
        }

        return s;
    }

    public static void main(String[] args) {

        System.out.println(compression("aabcaa"));


    }



}
