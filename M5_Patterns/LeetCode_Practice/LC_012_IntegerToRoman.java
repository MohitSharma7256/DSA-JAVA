package LeetCode_Practice;

public class LC_012_IntegerToRoman {
    /*
     * ---------------------------------------------------------
     * LeetCode 12: Integer to Roman (Medium)
     * ---------------------------------------------------------
     * Roman numerals are represented by seven different symbols: 
     * I, V, X, L, C, D and M.
     * Given an integer, convert it to a roman numeral.
     * 
     * Approach: Parallel Arrays Pattern Matching
     * We map out the base symbols AND the 6 special subtraction cases 
     * (IV, IX, XL, XC, CD, CM) in descending order.
     * Then we loop and greedily subtract the largest possible value.
     */

    public static String intToRoman(int num) {
        // Values and Symbols must be parallel and sorted descending
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        StringBuilder sb = new StringBuilder();
        
        // Loop through the values
        for (int i = 0; i < values.length; i++) {
            // While the number is large enough, append the symbol and reduce the number
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("3 in Roman: " + intToRoman(3));       // III
        System.out.println("58 in Roman: " + intToRoman(58));     // LVIII
        System.out.println("1994 in Roman: " + intToRoman(1994)); // MCMXCIV
    }
}
