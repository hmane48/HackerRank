/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlusMinus;

import java.util.Scanner;

public class Solution {

    static void plusMinus(int[] arr) {
        double _pos,_neg,_zero;
        double pos = 0, neg = 0, zero = 0;
        int length = arr.length;
        
        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        
        _pos = pos / length;
        _neg = neg / length;
        _zero = zero / length;
        System.out.println(_pos + "\n" + _neg + "\n" + _zero);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
