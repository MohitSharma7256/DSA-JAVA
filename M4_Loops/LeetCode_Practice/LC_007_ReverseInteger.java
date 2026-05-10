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
     * Approach:
     * We use a while loop to extract digits from the back (x % 10) and add them 
     * to a reversed number (rev * 10 + digit). The key is to check for overflow 
     * BEFORE multiplying by 10.
     */

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            
            // Integer.MAX_VALUE = 2147483647
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            // Integer.MIN_VALUE = -2147483648
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Reverse of 123: " + reverse(123));     // Output: 321
        System.out.println("Reverse of -123: " + reverse(-123));   // Output: -321
        System.out.println("Reverse of 120: " + reverse(120));     // Output: 21
        System.out.println("Reverse of overflow: " + reverse(1534236469)); // Output: 0
    }
}
