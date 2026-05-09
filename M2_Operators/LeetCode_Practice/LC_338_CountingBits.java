/**
 * LEETCODE ID: 338
 * TITLE: Counting Bits
 */
public class LC_338_CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // DP + Bit Manipulation: 
            // Number of 1s in i is (1s in i/2) + (1 if i is odd)
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
