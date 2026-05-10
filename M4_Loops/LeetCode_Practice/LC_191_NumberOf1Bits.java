package LeetCode_Practice;

public class LC_191_NumberOf1Bits {
    /*
     * ---------------------------------------------------------
     * LeetCode 191: Number of 1 Bits (Easy)
     * ---------------------------------------------------------
     * Write a function that takes the binary representation of an unsigned integer 
     * and returns the number of '1' bits it has (also known as the Hamming weight).
     * 
     * Approach: Bitwise Loop
     * We use a while loop and bitwise AND operation (n & (n - 1)).
     * This operation removes the rightmost '1' bit in every iteration.
     */

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // Drops the lowest set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // 11 in binary is 0000...1011 (three 1s)
        System.out.println("Number of 1 bits in 11: " + hammingWeight(11)); // 3
        // 128 in binary is 10000000 (one 1)
        System.out.println("Number of 1 bits in 128: " + hammingWeight(128)); // 1
    }
}
