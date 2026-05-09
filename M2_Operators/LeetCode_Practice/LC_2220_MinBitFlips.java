/**
 * LEETCODE ID: 2220
 * TITLE: Minimum Bit Flips to Convert Number
 */
public class LC_2220_MinBitFlips {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;
        while (xor != 0) {
            xor &= (xor - 1);
            count++;
        }
        return count;
    }
}
