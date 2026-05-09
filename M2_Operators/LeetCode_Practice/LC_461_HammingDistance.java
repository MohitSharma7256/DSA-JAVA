/**
 * LEETCODE ID: 461
 * TITLE: Hamming Distance
 */
public class LC_461_HammingDistance {
    public int hammingDistance(int x, int y) {
        // XOR gives 1 only where bits are different.
        int xor = x ^ y;
        int distance = 0;
        // Count set bits in xor
        while (xor != 0) {
            xor &= (xor - 1);
            distance++;
        }
        return distance;
    }
}
