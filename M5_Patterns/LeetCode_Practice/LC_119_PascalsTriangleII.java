package LeetCode_Practice;

import java.util.ArrayList;
import java.util.List;

public class LC_119_PascalsTriangleII {
    /*
     * ---------------------------------------------------------
     * LeetCode 119: Pascal's Triangle II (Easy)
     * ---------------------------------------------------------
     * Given an integer rowIndex, return the rowIndex-th (0-indexed) row of the Pascal's triangle.
     * 
     * Could you optimize your algorithm to use only O(rowIndex) extra space?
     * 
     * Approach: Single List Math Pattern
     * We don't need to generate the entire triangle. 
     * The value at rowIndex and colIndex is (rowIndex C colIndex).
     * To avoid overflow, we use the formula: val = val * (rowIndex - i + 1) / i;
     */

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1; // Use long to prevent overflow during multiplication
        
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) val);
            val = val * (rowIndex - i) / (i + 1);
        }
        
        return row;
    }

    public static void main(String[] args) {
        System.out.println("Row 3 of Pascal's Triangle: " + getRow(3)); 
        // Expected: [1, 3, 3, 1]
    }
}
