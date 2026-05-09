/**
 * LEETCODE ID: 1281
 * TITLE: Subtract the Product and Sum of Digits of an Integer
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Given an integer number n, return the difference between the product 
 * of its digits and the sum of its digits.
 * 
 * EXAMPLE:
 * Input: n = 234
 * Product: 2 * 3 * 4 = 24
 * Sum: 2 + 3 + 4 = 9
 * Result: 24 - 9 = 15
 */

public class LC_1281_SubtractProductAndSum {
    
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        
        // We use a loop to extract each digit
        while (n > 0) {
            int digit = n % 10; // Extract last digit using MODULO
            sum += digit;
            product *= digit;
            n = n / 10;         // Remove last digit using DIVISION
        }
        
        return product - sum;
    }

    public static void main(String[] args) {
        LC_1281_SubtractProductAndSum solution = new LC_1281_SubtractProductAndSum();
        
        int n = 234;
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + solution.subtractProductAndSum(n));
    }
}

/**
 * EXPLANATION:
 * This is a classic DSA math problem. 
 * 1. n % 10 gives the last digit.
 * 2. n / 10 removes the last digit.
 * 
 * WHY IN THIS MODULE?
 * It uses Arithmetic Operators (%, /, *, +) to manipulate numbers at the digit level.
 */
