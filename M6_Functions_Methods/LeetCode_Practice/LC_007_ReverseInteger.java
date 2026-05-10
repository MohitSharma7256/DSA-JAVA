package LeetCode_Practice;

public class LC_007_ReverseInteger {
    /*
     * ---------------------------------------------------------
     * LeetCode 7: Reverse Integer (Medium)
     * ---------------------------------------------------------
     * Given a signed 32-bit integer x, return x with its digits reversed. 
     * If reversing x causes the value to go outside the signed 32-bit integer 
     * range [-2^31, 2^31 - 1], then return 0.
     * 
     * Approach: Method Extraction
     * We pull the reversing logic into a separate utility method.
     */

    public static int reverse(int x) {
        long reversed = reverseLong(x);
        
        // Check for 32-bit integer overflow
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
    
    // Helper Method to do the actual reversing logic using Long to prevent crash
    private static long reverseLong(int x) {
        long rev = 0;
        while (x != 0) { // works for negatives too in Java
            int pop = x % 10;
            rev = rev * 10 + pop;
            x /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Reverse 123: " + reverse(123)); // 321
        System.out.println("Reverse -123: " + reverse(-123)); // -321
        System.out.println("Reverse overflow 1534236469: " + reverse(1534236469)); // 0
    }
}
