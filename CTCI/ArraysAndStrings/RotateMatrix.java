package CTCI.ArraysAndStrings;

import java.util.Arrays;

/*
*  Rotate the N X N Matrix by 90 degrees clockwise
* */

public class RotateMatrix {

    // this takes 'O(N)' Space

    public static int[][] rotateMatrix(int[][] arr) {

        int[][] arr1 = new int[arr.length][arr.length];

        int c = 0;

        for (int i = 0; i < arr.length; i++) {

            int r = arr.length - 1;
            for (int j = 0; j < arr.length; j++) {

                arr1[i][j] = arr[r][c];
                //System.out.println(r + "   "+ c);
                r--;

            }
            c++;
        }

        return arr1;
    }


    public static void main(String[] args) {

        int[][] arr = {{1, 0, 1, 1}, {1, 0, 0, 1}, {0, 0, 1, 1}, {0, 0, 1, 1}};

        for (int i = 0; i < arr.length; i++) {

            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("....");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(Arrays.toString((rotateMatrix(arr))[i]));
        }


    }
}
