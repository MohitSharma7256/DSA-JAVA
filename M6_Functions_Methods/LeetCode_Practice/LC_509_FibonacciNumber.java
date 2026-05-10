package LeetCode_Practice;

public class LC_509_FibonacciNumber {
    /*
     * ---------------------------------------------------------
     * LeetCode 509: Fibonacci Number (Easy)
     * ---------------------------------------------------------
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the 
     * Fibonacci sequence, such that each number is the sum of the two preceding ones.
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     * 
     * Recursive Approach:
     * Time Complexity: O(2^n) - Exponential (Because of redundant calculations)
     * Space Complexity: O(n) - Maximum depth of recursion stack
     * 
     * Note: While this recursive approach is terrible for performance on large N, 
     * it is the absolute foundation for Dynamic Programming!
     */

    public static int fib(int n) {
        // Base Cases
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // Recursive Call
        // The function calls itself TWO times! This creates a "Recursion Tree"
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci(2): " + fib(2)); // 1
        System.out.println("Fibonacci(3): " + fib(3)); // 2
        System.out.println("Fibonacci(4): " + fib(4)); // 3
        System.out.println("Fibonacci(10): " + fib(10)); // 55
    }
}
