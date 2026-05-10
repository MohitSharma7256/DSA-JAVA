package LeetCode_Practice;

public class LC_258_AddDigits {
    /*
     * ---------------------------------------------------------
     * LeetCode 258: Add Digits (Easy)
     * ---------------------------------------------------------
     * Given an integer num, repeatedly add all its digits until the result 
     * has only one digit, and return it.
     * 
     * Approach: Nested Loops
     * Outer while loop ensures we continue until single digit.
     * Inner while loop sums the digits of the current number.
     */

    public static int addDigits(int num) {
        int sum = 0;
        // Run as long as the number has more than 1 digit
        while (num > 9) {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            sum = 0; // Reset sum for next outer loop iteration
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Add digits of 38: " + addDigits(38)); // 2 (3+8=11 -> 1+1=2)
        System.out.println("Add digits of 0: " + addDigits(0));   // 0
    }
}
