import java.util.*;

/**
 * LEETCODE ID: 2160
 * TITLE: Minimum Sum of Four Digit Number After Splitting Digits
 */
public class LC_2160_MinSumAfterSplit {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i = 0;
        while (num > 0) {
            digits[i++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);
        // Form two minimum numbers: (digits[0], digits[2]) and (digits[1], digits[3])
        int num1 = digits[0] * 10 + digits[2];
        int num2 = digits[1] * 10 + digits[3];
        return num1 + num2;
    }
}
