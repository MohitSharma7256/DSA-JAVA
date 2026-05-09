/**
 * LEETCODE ID: 2119
 * TITLE: A Number After a Double Reversal
 */
public class LC_2119_DoubleReversal {
    public boolean isSameAfterReversals(int num) {
        // If number ends in 0, reversing it loses digits, except for 0 itself.
        if (num == 0) return true;
        return num % 10 != 0;
    }
}
