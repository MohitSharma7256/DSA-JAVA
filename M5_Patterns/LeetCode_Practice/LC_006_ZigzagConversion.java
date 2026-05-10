package LeetCode_Practice;

public class LC_006_ZigzagConversion {
    /*
     * ---------------------------------------------------------
     * LeetCode 6: Zigzag Conversion (Medium)
     * ---------------------------------------------------------
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number 
     * of rows like this:
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     * 
     * Approach: Array of StringBuilders
     * We create an array of StringBuilders, one for each row.
     * We iterate through the string, moving 'down' the rows until we hit the bottom, 
     * then moving 'up' diagonally until we hit the top.
     */

    public static String convert(String s, int numRows) {
        // Base case: If only 1 row or string is shorter than rows
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);
            
            // Change direction if we hit top or bottom row
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }
            
            currRow += goingDown ? 1 : -1;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println("Input: " + s + " with 3 rows");
        System.out.println("Output: " + convert(s, 3)); 
        // Expected: PAHNAPLSIIGYIR
    }
}
