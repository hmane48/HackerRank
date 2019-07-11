package CTCI.ArraysAndStrings;

import java.util.Arrays;

public class ZeroMatrix {

    /* If an element of the matrix is the zero then entire row and column of that element is set to zero*/

    private static int[][] zeroMatrix(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    return setZeros(matrix, i, j, rows, columns);
                }
            }
        }

        return matrix;

    }

    static int[][] setZeros(int[][] matrix, int i, int j, int rows, int columns) {
        int r = 0, c = 0;

        while(r < rows || c < columns){

            if (r < rows){
                matrix[r][j] = 0;
                r++;
            }

            if (c < columns){
                matrix[i][c] = 0;
                c++;
            }

        }

        return matrix;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,4},{2,4,1},{4,8,0}};

        for (int [] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(">>>>>>>>>>>>");

        matrix = zeroMatrix(matrix);

        for (int [] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }

    }
}
