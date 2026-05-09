/**
 * LEETCODE ID: 1295
 * TITLE: Find Numbers with Even Number of Digits
 */
public class LC_1295_EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            // Check number of digits
            if (String.valueOf(num).length() % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
