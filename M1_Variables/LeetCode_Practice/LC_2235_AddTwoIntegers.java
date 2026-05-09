/**
 * LEETCODE ID: 2235
 * TITLE: Add Two Integers
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Given two integers num1 and num2, return the sum of the two integers.
 * 
 * CONSTRAINTS:
 * -100 <= num1, num2 <= 100
 */

public class LC_2235_AddTwoIntegers {
    
    public int sum(int num1, int num2) {
        // Simple variable addition logic
        return num1 + num2;
    }

    public static void main(String[] args) {
        LC_2235_AddTwoIntegers solution = new LC_2235_AddTwoIntegers();
        
        // Example test
        int n1 = 12, n2 = 5;
        System.out.println("Input: num1 = " + n1 + ", num2 = " + n2);
        System.out.println("Output: " + solution.sum(n1, n2));
    }
}

/**
 * EXPLANATION:
 * This is the most basic problem on LeetCode. It tests your ability to 
 * take two input variables and return their arithmetic sum.
 * 
 * WHY IN THIS MODULE?
 * It reinforces the concept of "int" data type and basic addition operator (+).
 */
