package LeetCode_Practice;

public class LC_326_PowerOfThree {
    /*
     * ---------------------------------------------------------
     * LeetCode 326: Power of Three (Easy)
     * ---------------------------------------------------------
     * Given an integer n, return true if it is a power of three. Otherwise, return false.
     * 
     * Approach: Loop Division
     * Similar to Power of Two, keep dividing by 3 as long as it's perfectly divisible.
     */

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        
        while (n % 3 == 0) {
            n /= 3;
        }
        
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println("Is 27 power of 3? " + isPowerOfThree(27)); // true
        System.out.println("Is 0 power of 3? " + isPowerOfThree(0));   // false
        System.out.println("Is -1 power of 3? " + isPowerOfThree(-1)); // false
    }
}
