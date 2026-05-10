package LeetCode_Practice;

public class LC_258_AddDigits {
    /*
     * ---------------------------------------------------------
     * LeetCode 258: Add Digits (Easy)
     * ---------------------------------------------------------
     * Given an integer num, repeatedly add all its digits until the 
     * result has only one digit, and return it.
     * 
     * Method Extraction Approach (Non-Math trick):
     * We create a helper method to sum the digits of a number.
     * We keep calling this helper method inside a while loop until the number < 10.
     */

    // Helper Method to sum digits
    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int addDigits(int num) {
        // While the number has more than 1 digit (is >= 10)
        while (num >= 10) {
            // Reassign num to the sum of its digits
            num = sumOfDigits(num);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Add digits of 38: " + addDigits(38)); 
        // 3 + 8 = 11 -> 1 + 1 = 2. Expected: 2
    }
}
