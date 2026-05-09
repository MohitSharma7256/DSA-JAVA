/**
 * LEETCODE ID: 1486
 * TITLE: XOR Operation in an Array
 */
public class LC_1486_XOROperation {
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= (start + 2 * i);
        }
        return result;
    }
}
