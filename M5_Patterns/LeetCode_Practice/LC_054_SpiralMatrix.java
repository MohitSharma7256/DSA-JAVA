package LeetCode_Practice;

import java.util.ArrayList;
import java.util.List;

public class LC_054_SpiralMatrix {
    /*
     * ---------------------------------------------------------
     * LeetCode 54: Spiral Matrix (Medium)
     * ---------------------------------------------------------
     * Given an m x n matrix, return all elements of the matrix in spiral order.
     * 
     * DEEP MATHEMATICAL EXPLANATION:
     * Think of a matrix as having 4 'Walls' or 'Boundaries':
     * - topWall (starts at row 0)
     * - bottomWall (starts at row m-1)
     * - leftWall (starts at col 0)
     * - rightWall (starts at col n-1)
     * 
     * To move in a spiral, we must do 4 actions continuously:
     * 1. Walk from leftWall to rightWall along the topWall. 
     *    -> Once done, the topWall is "used up", so we move it down (`top++`).
     * 2. Walk from topWall to bottomWall along the rightWall.
     *    -> Once done, the rightWall is "used up", so we move it left (`right--`).
     * 3. Walk from rightWall to leftWall along the bottomWall.
     *    -> Once done, the bottomWall is "used up", so we move it up (`bottom--`).
     * 4. Walk from bottomWall to topWall along the leftWall.
     *    -> Once done, the leftWall is "used up", so we move it right (`left++`).
     * 
     * EDGE CASE CHECK:
     * Because matrices can be non-square (e.g., 3x4), we might run out of rows 
     * before we run out of columns. We MUST check if `top <= bottom` before doing 
     * Step 3, and check if `left <= right` before doing Step 4.
     */

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;
        
        // Setup Boundaries
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        // Loop as long as the walls haven't crossed each other
        while (top <= bottom && left <= right) {
            
            // Step 1: Traverse Right (along the top wall)
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // Shrink top wall
            
            // Step 2: Traverse Down (along the right wall)
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Shrink right wall
            
            // Important Boundary Verification!
            if (top <= bottom) {
                // Step 3: Traverse Left (along the bottom wall)
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // Shrink bottom wall
            }
            
            if (left <= right) {
                // Step 4: Traverse Up (along the left wall)
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Shrink left wall
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Spiral Order: " + spiralOrder(matrix));
        // Expected: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
