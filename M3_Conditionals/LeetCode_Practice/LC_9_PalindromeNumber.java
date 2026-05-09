/**
 * LEETCODE ID: 9
 * TITLE: Palindrome Number
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * An integer is a palindrome when it reads the same backward as forward.
 * 
 * CONSTRAINTS:
 * -2^31 <= x <= 2^31 - 1
 */

public class LC_9_PalindromeNumber {
    
    public boolean isPalindrome(int x) {
        // 1. Negative numbers are not palindromes (-121 vs 121-)
        // 2. Numbers ending in 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNum = 0;
        int original = x;
        
        while (x > 0) {
            int lastDigit = x % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            x = x / 10;
        }
        
        return original == reversedNum;
    }

    public static void main(String[] args) {
        LC_9_PalindromeNumber solution = new LC_9_PalindromeNumber();
        
        int x = 121;
        System.out.println("Input: x = " + x);
        System.out.println("Output: " + solution.isPalindrome(x));
    }
}

/**
 * EXPLANATION:
 * We reverse the integer by extracting digits and building the reverse.
 * If the reversed number equals the original, it's a palindrome.
 * 
 * WHY IN THIS MODULE?
 * Uses "If-Else" to handle edge cases (negative numbers) and equality comparison (==).
 */
