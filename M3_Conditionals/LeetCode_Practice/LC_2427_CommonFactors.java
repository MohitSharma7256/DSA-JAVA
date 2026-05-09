/**
 * LEETCODE ID: 2427
 * TITLE: Number of Common Factors
 */
public class LC_2427_CommonFactors {
    public int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            // Condition for common factor
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}
