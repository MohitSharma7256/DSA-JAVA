package LeetCode_Practice;

import java.util.ArrayList;
import java.util.List;

public class LC_118_PascalsTriangle {
    /*
     * ---------------------------------------------------------
     * LeetCode 118: Pascal's Triangle (Easy)
     * ---------------------------------------------------------
     * Given an integer numRows, return the first numRows of Pascal's triangle.
     * 
     * In Pascal's triangle, each number is the sum of the two numbers directly above it.
     * 
     * Approach: List Array Logic
     * Instead of nCr Math (which overflows for large numbers), we construct it iteratively.
     * The first and last element of each row are 1.
     * Every intermediate element is the sum of (row-1)[j-1] + (row-1)[j].
     */

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        // Base case: first row is always [1]
        if (numRows == 0) return triangle;
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            
            // First element is 1
            row.add(1);
            
            // Middle elements: sum of two elements from previous row
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Last element is 1
            row.add(1);
            
            triangle.add(row);
        }
        
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println("Pascal's Triangle for 5 rows:");
        List<List<Integer>> result = generate(5);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
