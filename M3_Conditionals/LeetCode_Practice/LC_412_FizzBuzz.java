import java.util.*;

/**
 * LEETCODE ID: 412
 * TITLE: Fizz Buzz
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * Given an integer n, return a string array answer (1-indexed) where:
 * - answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * - answer[i] == "Fizz" if i is divisible by 3.
 * - answer[i] == "Buzz" if i is divisible by 5.
 * - answer[i] == i if none of the above conditions are true.
 */

public class LC_412_FizzBuzz {
    
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            // Priority: Divisible by both
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                result.add("Fizz");
            } 
            else if (i % 5 == 0) {
                result.add("Buzz");
            } 
            else {
                result.add(String.valueOf(i));
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        LC_412_FizzBuzz solution = new LC_412_FizzBuzz();
        
        int n = 15;
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + solution.fizzBuzz(n));
    }
}

/**
 * EXPLANATION:
 * This is the ultimate "Else-If Ladder" problem. The order of conditions 
 * matters: the most specific condition (divisible by 15) must come first.
 * 
 * WHY IN THIS MODULE?
 * Direct application of If-Else-If ladder logic.
 */
