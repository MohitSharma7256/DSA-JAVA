/**
 * LEETCODE ID: 1523
 * TITLE: Count Odd Numbers in an Interval Range
 */
public class LC_1523_CountOddNumbers {
    public int countOdds(int low, int high) {
        // If high or low is odd, the number of odds is (high - low) / 2 + 1
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        }
        return (high - low) / 2 + 1;
    }
}
/**
 * EXPLANATION:
 * Perfect use of 'If-Else' for mathematical counting.
 */
