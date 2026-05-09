/**
 * LEETCODE ID: 1009
 * TITLE: Complement of Base 10 Integer
 */
public class LC_1009_ComplementBase10 {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int m = n;
        int mask = 0;
        while (m != 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }
        return (~n) & mask;
    }
}
