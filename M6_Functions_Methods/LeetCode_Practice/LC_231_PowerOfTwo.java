package LeetCode_Practice;

public class LC_231_PowerOfTwo {
    /*
     * ---------------------------------------------------------
     * LeetCode 231: Power of Two (Easy)
     * ---------------------------------------------------------
     * Given an integer n, return true if it is a power of two. Otherwise, return false.
     * 
     * Recursive Approach:
     * A number is a power of two if we keep dividing it by 2 and eventually reach 1.
     * If at any point it is NOT divisible by 2 (and not 1), it is false.
     */

    public static boolean isPowerOfTwo(int n) {
        // Base Cases
        if (n <= 0) return false; // 0 or negatives cannot be powers of 2
        if (n == 1) return true;  // 2^0 = 1
        
        // If it's not evenly divisible by 2, it's not a power of 2
        if (n % 2 != 0) return false;
        
        // Recursive Call: Check the next division
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        System.out.println("Is 16 a power of 2? " + isPowerOfTwo(16)); // true
        System.out.println("Is  3 a power of 2? " + isPowerOfTwo(3));  // false
    }
}
