package LeetCode_Practice;

public class LC_009_PalindromeNumber {
    /*
     * ---------------------------------------------------------
     * LeetCode 9: Palindrome Number (Easy)
     * ---------------------------------------------------------
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     * 
     * Approach:
     * O(log10(n)) Time | O(1) Space
     * Instead of converting to a string or reversing the entire number (which might overflow),
     * we reverse only the SECOND HALF of the number. When the reversed half is greater 
     * than or equal to the remaining first half, we know we've reached the middle.
     */

    public static boolean isPalindrome(int x) {
        // Edge Cases: Negative numbers, or numbers ending with 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        // Run loop until we reach the middle
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is odd, we can get rid of the middle digit by revertedNumber/10
        // e.g., 12321 -> at the end x = 12, revertedNumber = 123.
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        System.out.println("Is 121 palindrome? " + isPalindrome(121));   // true
        System.out.println("Is -121 palindrome? " + isPalindrome(-121)); // false
        System.out.println("Is 10 palindrome? " + isPalindrome(10));     // false
        System.out.println("Is 12321 palindrome? " + isPalindrome(12321)); // true
    }
}
