package CTCI.ZeroMatrix;

// Write an algorithm such that if an element/cell in M X N matrix is zero; the entire row and column
// of that cell is set to zero

public class Solution {

    private static void setToZero(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int r = 0,c = 0;
        boolean foundZero = false;

        // first get the location of the zero
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    r = i;
                    c = j;
                    foundZero = true;
                    break;
                }
            }
            if(foundZero){
                break;
            }
        }

        // if found the location then make row and column zero
        if(foundZero){
            setToZero(matrix,r,c);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }

    // helper function to get it done
    private static void setToZero(int[][] matrix,int r, int c) {
        for (int i = 0; i < matrix[0].length;i++){
            matrix[r][i] = 0;
            if (i < matrix.length){
                matrix[i][c] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,4},{2,6,5},{9,3,0}};

        setToZero(matrix);
    }
}
