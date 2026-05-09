/**
 * LEETCODE ID: 2520
 * TITLE: Count the Digits That Divide a Number
 */
public class LC_2520_CountDigitsDivideNumber {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (num % digit == 0) count++;
            temp /= 10;
        }
        return count;
    }
}
