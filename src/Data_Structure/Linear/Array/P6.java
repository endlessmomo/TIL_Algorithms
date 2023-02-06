package Data_Structure.Linear.Array;

import java.util.Arrays;

public class P6 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int[][] rotateMatrix = new int[matrix[0].length][matrix.length];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                rotateMatrix[col][matrix.length - 1 - row] = matrix[row][col];
            }
        }

        printMatrix(rotateMatrix);
    }

    public static void printMatrix(int[][] arr){
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
