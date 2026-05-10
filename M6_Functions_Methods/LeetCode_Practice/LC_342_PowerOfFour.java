package LeetCode_Practice;

public class LC_342_PowerOfFour {
    /*
     * ---------------------------------------------------------
     * LeetCode 342: Power of Four (Easy)
     * ---------------------------------------------------------
     * Given an integer n, return true if it is a power of four.
     * 
     * Recursive Approach:
     * Keep dividing by 4 until you hit 1.
     */

    public static boolean isPowerOfFour(int n) {
        // Base Cases
        if (n <= 0) return false; 
        if (n == 1) return true;  // 4^0 = 1
        
        // Check divisibility
        if (n % 4 != 0) return false;
        
        // Recursive Call
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        System.out.println("Is 16 a power of 4? " + isPowerOfFour(16)); // true
        System.out.println("Is  5 a power of 4? " + isPowerOfFour(5));  // false
    }
}
