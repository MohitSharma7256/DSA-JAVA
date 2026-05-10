package LeetCode_Practice;

public class LC_070_ClimbingStairs {
    /*
     * ---------------------------------------------------------
     * LeetCode 70: Climbing Stairs (Easy)
     * ---------------------------------------------------------
     * You are climbing a staircase. It takes n steps to reach the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways 
     * can you climb to the top?
     * 
     * Approach: Loop (Fibonacci Sequence)
     * Time Complexity: O(n) | Space Complexity: O(1)
     * This is fundamentally a Fibonacci series problem. 
     * ways(n) = ways(n-1) + ways(n-2)
     */

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        int prev2 = 1; // ways to reach step 1
        int prev1 = 2; // ways to reach step 2
        
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }

    public static void main(String[] args) {
        System.out.println("Ways to climb 2 stairs: " + climbStairs(2)); // 2
        System.out.println("Ways to climb 3 stairs: " + climbStairs(3)); // 3
        System.out.println("Ways to climb 5 stairs: " + climbStairs(5)); // 8
    }
}
