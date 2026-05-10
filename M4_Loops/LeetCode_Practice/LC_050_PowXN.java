package LeetCode_Practice;

public class LC_050_PowXN {
    /*
     * ---------------------------------------------------------
     * LeetCode 50: Pow(x, n) (Medium)
     * ---------------------------------------------------------
     * Implement pow(x, n), which calculates x raised to the power n.
     * 
     * Approach: Binary Exponentiation (Optimized Loop)
     * Time Complexity: O(log n)
     * Instead of multiplying x by itself n times (which gives TLE), 
     * we use the property: x^n = (x^2)^(n/2) if n is even, 
     * and x * x^(n-1) if n is odd.
     */

    public static double myPow(double x, int n) {
        long nn = n; // Use long to avoid overflow when n = -2147483648
        if (nn < 0) {
            nn = -nn;
            x = 1 / x;
        }
        
        double ans = 1.0;
        while (nn > 0) {
            if (nn % 2 == 1) { // If power is odd
                ans = ans * x;
                nn = nn - 1;
            } else { // If power is even
                x = x * x;
                nn = nn / 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("2.0 ^ 10 = " + myPow(2.0, 10)); // 1024.0
        System.out.println("2.1 ^ 3 = " + myPow(2.1, 3));   // 9.261
        System.out.println("2.0 ^ -2 = " + myPow(2.0, -2)); // 0.25
    }
}
