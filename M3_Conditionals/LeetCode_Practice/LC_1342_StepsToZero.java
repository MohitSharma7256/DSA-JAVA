/**
 * LEETCODE ID: 1342
 * TITLE: Number of Steps to Reduce a Number to Zero
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Given an integer num, return the number of steps to reduce it to zero.
 * In one step, if the current number is even, you must divide it by 2, 
 * otherwise, you must subtract 1 from it.
 * 
 * EXAMPLE:
 * Input: num = 14
 * Step 1) 14 is even; divide by 2 and obtain 7. 
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * ...
 */

public class LC_1342_StepsToZero {
    
    public int numberOfSteps(int num) {
        int steps = 0;
        
        while (num > 0) {
            // Condition to check Even/Odd
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        
        return steps;
    }

    public static void main(String[] args) {
        LC_1342_StepsToZero solution = new LC_1342_StepsToZero();
        
        int num = 14;
        System.out.println("Input: num = " + num);
        System.out.println("Output: " + solution.numberOfSteps(num));
    }
}

/**
 * EXPLANATION:
 * We use an If-Else block inside a loop to repeatedly apply the rules 
 * until the number reaches zero.
 * 
 * WHY IN THIS MODULE?
 * Teaches how to translate simple rules into If-Else logic.
 */
