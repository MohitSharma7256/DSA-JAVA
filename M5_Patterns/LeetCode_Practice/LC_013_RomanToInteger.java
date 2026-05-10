package LeetCode_Practice;

import java.util.HashMap;
import java.util.Map;

public class LC_013_RomanToInteger {
    /*
     * ---------------------------------------------------------
     * LeetCode 13: Roman to Integer (Easy)
     * ---------------------------------------------------------
     * Given a roman numeral, convert it to an integer.
     * 
     * Approach: Reverse String Loop Pattern
     * Roman numerals are usually written largest to smallest from left to right.
     * BUT, if a smaller numeral appears BEFORE a larger one (like IV), we SUBTRACT it.
     * The easiest logic is to loop from right to left.
     */

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        // Traverse right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));
            
            // If current is less than previous, it's a subtraction case (e.g., IV)
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            
            prevValue = currValue;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println("III to Integer: " + romanToInt("III"));       // 3
        System.out.println("LVIII to Integer: " + romanToInt("LVIII"));   // 58
        System.out.println("MCMXCIV to Integer: " + romanToInt("MCMXCIV")); // 1994
    }
}
