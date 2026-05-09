/**
 * LEETCODE ID: 2169
 * TITLE: Count Operations to Obtain Zero
 */
public class LC_2169_OperationsToZero {
    public int countOperations(int num1, int num2) {
        int ops = 0;
        while (num1 > 0 && num2 > 0) {
            if (num1 >= num2) num1 -= num2;
            else num2 -= num1;
            ops++;
        }
        return ops;
    }
}
