/**
 * LEETCODE ID: 231
 * TITLE: Power of Two
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * An integer n is a power of two, if there exists an integer x such that n == 2^x.
 * 
 * CONSTRAINTS:
 * -2^31 <= n <= 2^31 - 1
 */

public class LC_231_PowerOfTwo {
    
    public boolean isPowerOfTwo(int n) {
        // A power of 2 in binary looks like: 10, 100, 1000 (only one '1')
        // So (n & (n - 1)) should be 0.
        return (n > 0) && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        LC_231_PowerOfTwo solution = new LC_231_PowerOfTwo();
        
        int n = 16;
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + solution.isPowerOfTwo(n));
    }
}

/**
 * EXPLANATION:
 * If n = 16 (10000), then n-1 = 15 (01111). 
 * 10000 & 01111 = 00000. 
 * This only works if n has exactly one '1' bit.
 * 
 * WHY IN THIS MODULE?
 * Perfect application of Bitwise AND (&) and Relational Operators (>).
 */
