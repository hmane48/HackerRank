package TimeConversion;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        String hh,mm,ss,tt;
        int HH,MM,SS;
        String pattern1="(\\d+):(\\d+):(\\d+)([AP]{1}M)";
        Pattern p=Pattern.compile(pattern1);
        Matcher m=p.matcher(s);
        if(m.find()){
             hh=m.group(1);
             mm=m.group(2);
             ss=m.group(3);
             tt=m.group(4);
        }else{
            return null;
        }
        if(tt.equalsIgnoreCase("PM") && !hh.equals("12")){
            HH=Integer.parseInt(hh);
            HH=HH+12;
            s=HH+":"+mm+":"+ss;            
        }else if(tt.equalsIgnoreCase("AM") && hh.equals("12")){
            hh="00";
            s=hh+":"+mm+":"+ss;
        }
        else{
            s=hh+":"+mm+":"+ss;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
