/**
 * LEETCODE ID: 136
 * TITLE: Single Number
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Given a non-empty array of integers nums, every element appears twice 
 * except for one. Find that single one.
 * 
 * CONSTRAINTS:
 * 1 <= nums.length <= 3 * 10^4
 * -3 * 10^4 <= nums[i] <= 3 * 10^4
 * You must implement a solution with a linear runtime complexity and 
 * use only constant extra space.
 */

public class LC_136_SingleNumber {
    
    public int singleNumber(int[] nums) {
        int result = 0;
        
        // Trick: XORing a number with itself results in 0 (A ^ A = 0)
        // XORing a number with 0 results in the number (A ^ 0 = A)
        for (int num : nums) {
            result ^= num; // Bitwise XOR
        }
        
        return result;
    }

    public static void main(String[] args) {
        LC_136_SingleNumber solution = new LC_136_SingleNumber();
        
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Input: nums = [4, 1, 2, 1, 2]");
        System.out.println("Output: " + solution.singleNumber(nums));
    }
}

/**
 * EXPLANATION:
 * 4 ^ 1 ^ 2 ^ 1 ^ 2 
 * = 4 ^ (1 ^ 1) ^ (2 ^ 2)
 * = 4 ^ 0 ^ 0
 * = 4
 * 
 * WHY IN THIS MODULE?
 * Shows the power of the Bitwise XOR (^) operator in real DSA problems.
 */
