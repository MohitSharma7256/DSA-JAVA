package LeetCode_Practice;

public class LC_509_FibonacciNumber {
    /*
     * ---------------------------------------------------------
     * LeetCode 509: Fibonacci Number (Easy)
     * ---------------------------------------------------------
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the 
     * Fibonacci sequence, such that each number is the sum of the two preceding ones.
     * F(0) = 0, F(1) = 1. Return F(n).
     * 
     * Approach: Loop State Tracking
     * Keep track of the last two numbers.
     */

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int a = 0;
        int b = 1;
        
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci of 2: " + fib(2)); // 1
        System.out.println("Fibonacci of 3: " + fib(3)); // 2
        System.out.println("Fibonacci of 4: " + fib(4)); // 3
    }
}
