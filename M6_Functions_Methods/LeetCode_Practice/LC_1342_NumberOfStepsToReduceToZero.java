package LeetCode_Practice;

public class LC_1342_NumberOfStepsToReduceToZero {
    /*
     * ---------------------------------------------------------
     * LeetCode 1342: Number of Steps to Reduce a Number to Zero (Easy)
     * ---------------------------------------------------------
     * Given an integer num, return the number of steps to reduce it to zero.
     * In one step, if the current number is even, you have to divide it by 2, 
     * otherwise, you have to subtract 1 from it.
     * 
     * Recursive Approach:
     * We pass the number and a 'steps' counter into a helper recursive function.
     */

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }
    
    private static int helper(int num, int steps) {
        // Base Case: Reached 0, return the accumulated steps
        if (num == 0) return steps;
        
        // Recursive Calls
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        } else {
            return helper(num - 1, steps + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Steps for 14: " + numberOfSteps(14)); // Expected: 6
        // 14 -> 7 -> 6 -> 3 -> 2 -> 1 -> 0
    }
}
