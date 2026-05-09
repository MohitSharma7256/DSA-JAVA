/**
 * LEETCODE ID: 1837
 * TITLE: Sum of Digits in Base K
 */
public class LC_1837_SumOfDigitsBaseK {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            // Extract digit in base k
            sum += n % k;
            n /= k;
        }
        return sum;
    }
}
