package LeetCode_Practice;

public class LC_1922_CountGoodNumbers {
    /*
     * ---------------------------------------------------------
     * LeetCode 1922: Count Good Numbers (Medium)
     * ---------------------------------------------------------
     * A digit string is good if the digits (0-indexed) at even indices are even 
     * and the digits at odd indices are prime (2, 3, 5, or 7).
     * 
     * Since the answer may be large, return it modulo 10^9 + 7.
     * 
     * Approach: Fast Exponentiation (Recursion)
     * Even indices can have 5 options (0,2,4,6,8).
     * Odd indices can have 4 options (2,3,5,7).
     * The formula is: (5 ^ evenPositions) * (4 ^ oddPositions) % MOD
     * We must use modular exponentiation via recursion.
     */

    private static final int MOD = 1000000007;

    public static int countGoodNumbers(long n) {
        long oddPos = n / 2;
        long evenPos = (n + 1) / 2;
        
        long ans1 = fastPow(5, evenPos);
        long ans2 = fastPow(4, oddPos);
        
        return (int) ((ans1 * ans2) % MOD);
    }
    
    // Recursive Modular Exponentiation (Similar to Pow(x,n))
    private static long fastPow(long base, long exp) {
        if (exp == 0) return 1;
        
        long half = fastPow(base, exp / 2);
        
        if (exp % 2 == 0) {
            return (half * half) % MOD;
        } else {
            return ((half * half) % MOD * base) % MOD;
        }
    }

    public static void main(String[] args) {
        System.out.println("Good numbers of length 1: " + countGoodNumbers(1)); // 5
        System.out.println("Good numbers of length 4: " + countGoodNumbers(4)); // 400
    }
}
