/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staircase;

import java.util.Scanner;


public class Solution {

    static void staircase(int n) {
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(j<=i){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
