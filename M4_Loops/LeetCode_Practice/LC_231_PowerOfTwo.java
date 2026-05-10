package LeetCode_Practice;

public class LC_231_PowerOfTwo {
    /*
     * ---------------------------------------------------------
     * LeetCode 231: Power of Two (Easy)
     * ---------------------------------------------------------
     * Given an integer n, return true if it is a power of two. Otherwise, return false.
     * 
     * Approach: Division Loop
     * Keep dividing the number by 2 as long as it's divisible by 2.
     * If at the end the number is 1, it was a power of 2.
     */

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        
        while (n % 2 == 0) {
            n /= 2;
        }
        
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println("Is 1 a power of 2? " + isPowerOfTwo(1));   // true (2^0)
        System.out.println("Is 16 a power of 2? " + isPowerOfTwo(16)); // true
        System.out.println("Is 3 a power of 2? " + isPowerOfTwo(3));   // false
    }
}
