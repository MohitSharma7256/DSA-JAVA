/**
 * LEETCODE ID: 191
 * TITLE: Number of 1 Bits
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Write a function that takes the binary representation of a positive integer 
 * and returns the number of set bits it has (also known as the Hamming weight).
 * 
 * CONSTRAINTS:
 * 1 <= n <= 2^31 - 1
 */

public class LC_191_NumberOf1Bits {
    
    public int hammingWeight(int n) {
        int count = 0;
        
        while (n != 0) {
            // Trick: n & (n - 1) removes the rightmost set bit
            n = n & (n - 1);
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        LC_191_NumberOf1Bits solution = new LC_191_NumberOf1Bits();
        
        int n = 11; // Binary: 1011 (3 set bits)
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + solution.hammingWeight(n));
    }
}

/**
 * EXPLANATION:
 * The expression (n & (n-1)) is a famous bit manipulation trick. 
 * Every time you perform this, one '1' bit becomes '0'.
 * 
 * WHY IN THIS MODULE?
 * It uses Bitwise AND (&) and subtraction to solve a binary problem efficiently.
 */
