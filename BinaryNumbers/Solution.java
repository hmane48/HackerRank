
package BinaryNumbers;
import java.util.*;
/**
 *
 * @author hrishimane
 */
public class Solution {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int a,i,count=0,count1=0;
        int [] binary= new int[20];
        a=sc.nextInt();
        sc.close();
        for(i=binary.length-1;i>=0;i--){
            binary[i]=a%2;
            a=a/2;            
        }
       
        for(i=0;i<=binary.length-1;i++){
            if(binary[i]==1){
                count++;
                if(count>count1){ count1=count;}
            }else{
                count=0;
            }
        }
        System.out.println(count1);
        
        
    }
    
}
