package LeetCode_Practice;

public class LC_1523_CountOddNumbers {
    /*
     * ---------------------------------------------------------
     * LeetCode 1523: Count Odd Numbers in an Interval Range (Easy)
     * ---------------------------------------------------------
     * Given two non-negative integers low and high. Return the count of odd 
     * numbers between low and high (inclusive).
     * 
     * Approach: Math over Loop!
     * We could use a for loop from low to high, but it would get Time Limit Exceeded (TLE)
     * for large ranges. Math is O(1).
     * Number of odds between 1 and N is N/2. If N is odd, (N/2) + 1.
     */

    public static int countOdds(int low, int high) {
        int totalNums = high - low + 1;
        
        // If the range has an odd number of elements AND it starts with an odd number
        if (totalNums % 2 != 0 && low % 2 != 0) {
            return (totalNums / 2) + 1;
        } else {
            return totalNums / 2;
        }
    }

    public static void main(String[] args) {
        System.out.println("Odd numbers between 3 and 7: " + countOdds(3, 7)); // 3
        System.out.println("Odd numbers between 8 and 10: " + countOdds(8, 10)); // 1
    }
}
