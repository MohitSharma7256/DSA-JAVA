/**
 * LEETCODE ID: 693
 * TITLE: Binary Number with Alternating Bits
 */
public class LC_693_AlternatingBits {
    public boolean hasAlternatingBits(int n) {
        // Trick: n ^ (n >> 1) will be all 1s if n is alternating
        long val = n ^ (n >> 1);
        return (val & (val + 1)) == 0;
    }
}
