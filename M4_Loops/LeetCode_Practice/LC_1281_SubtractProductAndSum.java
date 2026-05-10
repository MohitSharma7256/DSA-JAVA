package LeetCode_Practice;

public class LC_1281_SubtractProductAndSum {
    /*
     * ---------------------------------------------------------
     * LeetCode 1281: Subtract the Product and Sum of Digits of an Integer (Easy)
     * ---------------------------------------------------------
     * Given an integer number n, return the difference between the product 
     * of its digits and the sum of its digits.
     * 
     * Approach: Standard Digit Extraction Loop
     */

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println("Result for 234: " + subtractProductAndSum(234)); // Product=24, Sum=9 -> 15
        System.out.println("Result for 4421: " + subtractProductAndSum(4421)); // Product=32, Sum=11 -> 21
    }
}
