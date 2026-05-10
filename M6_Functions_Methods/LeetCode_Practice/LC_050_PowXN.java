package LeetCode_Practice;

public class LC_050_PowXN {
    /*
     * ---------------------------------------------------------
     * LeetCode 50: Pow(x, n) (Medium)
     * ---------------------------------------------------------
     * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
     * 
     * Recursive Approach: Divide and Conquer (Binary Exponentiation)
     * Time Complexity: O(log n) | Space Complexity: O(log n) due to recursive stack
     * 
     * Logic:
     * If n is even: x^n = (x * x)^(n/2)
     * If n is odd:  x^n = x * x^(n-1)
     */

    public static double myPow(double x, int n) {
        // Base Cases
        if (n == 0) return 1.0;
        
        // Handling negative powers (careful with Integer.MIN_VALUE overflow)
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        return fastPow(x, N);
    }
    
    // Recursive Helper Function
    private static double fastPow(double x, long n) {
        if (n == 0) return 1.0;
        
        // Compute half once to save O(n) calls!
        double half = fastPow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half; // Even
        } else {
            return half * half * x; // Odd
        }
    }

    public static void main(String[] args) {
        System.out.println("2.0 ^ 10 = " + myPow(2.0, 10)); // 1024.0
        System.out.println("2.0 ^ -2 = " + myPow(2.0, -2)); // 0.25
    }
}
