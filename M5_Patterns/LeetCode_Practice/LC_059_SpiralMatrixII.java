package LeetCode_Practice;

public class LC_059_SpiralMatrixII {
    /*
     * ---------------------------------------------------------
     * LeetCode 59: Spiral Matrix II (Medium)
     * ---------------------------------------------------------
     * Given a positive integer n, generate an n x n matrix filled with 
     * elements from 1 to n^2 in spiral order.
     * 
     * Approach: Exactly the reverse logic of Spiral Matrix I.
     * We initialize an empty matrix and use 4 pointers to fill it.
     */

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n]; // Create 2D Array
        
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;
        
        while (top <= bottom && left <= right) {
            // Fill Right
            for (int j = left; j <= right; j++) {
                matrix[top][j] = num++;
            }
            top++;
            
            // Fill Down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            
            if (top <= bottom) {
                // Fill Left
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = num++;
                }
                bottom--;
            }
            
            if (left <= right) {
                // Fill Up
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println("Generated Spiral Matrix (n=3):");
        int[][] result = generateMatrix(3);
        
        // Loop to print the matrix nicely
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        /*
         * Expected:
         * 1  2  3
         * 8  9  4
         * 7  6  5
         */
    }
}
