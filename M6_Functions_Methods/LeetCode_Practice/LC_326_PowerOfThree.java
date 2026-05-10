package LeetCode_Practice;

public class LC_326_PowerOfThree {
    /*
     * ---------------------------------------------------------
     * LeetCode 326: Power of Three (Easy)
     * ---------------------------------------------------------
     * Given an integer n, return true if it is a power of three.
     * 
     * Recursive Approach:
     * Exact same logic as Power of Two, just dividing by 3!
     */

    public static boolean isPowerOfThree(int n) {
        // Base Cases
        if (n <= 0) return false; 
        if (n == 1) return true;  // 3^0 = 1
        
        // If it leaves a remainder when divided by 3, false.
        if (n % 3 != 0) return false;
        
        // Recursive Call
        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        System.out.println("Is 27 a power of 3? " + isPowerOfThree(27)); // true
        System.out.println("Is  0 a power of 3? " + isPowerOfThree(0));  // false
    }
}
