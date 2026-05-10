package LeetCode_Practice;

public class LC_048_RotateImage {
    /*
     * ---------------------------------------------------------
     * LeetCode 48: Rotate Image (Medium)
     * ---------------------------------------------------------
     * You are given an n x n 2D matrix representing an image, rotate the image 
     * by 90 degrees (clockwise).
     * You have to rotate the image in-place, which means you have to modify 
     * the input 2D matrix directly. DO NOT allocate another 2D matrix.
     * 
     * Approach: Matrix Pattern Math (Transpose + Reverse)
     * To rotate a matrix 90 degrees clockwise:
     * 1. Transpose the matrix (swap matrix[i][j] with matrix[j][i]).
     *    This turns rows into columns.
     * 2. Reverse every row.
     */

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Step 1: Transpose Matrix
        for (int i = 0; i < n; i++) {
            // j starts from i to avoid swapping back elements we already swapped
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original matrix rotated 90 degrees:");
        rotate(matrix);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        /*
         * Expected:
         * 7 4 1
         * 8 5 2
         * 9 6 3
         */
    }
}
