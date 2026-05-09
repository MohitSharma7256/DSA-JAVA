/**
 * LEETCODE ID: 258
 * TITLE: Add Digits
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

public class LC_258_AddDigits {
    public int addDigits(int num) {
        // Normal way: Loop until num < 10
        // DSA Math Trick: Digital Root formula
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }

    public static void main(String[] args) {
        LC_258_AddDigits solution = new LC_258_AddDigits();
        System.out.println("Output for 38: " + solution.addDigits(38)); // 3+8=11, 1+1=2
    }
}
/**
 * EXPLANATION:
 * Isme hum digit extraction seekhte hain. Digital root concept interview mein pucha jata hai.
 */
