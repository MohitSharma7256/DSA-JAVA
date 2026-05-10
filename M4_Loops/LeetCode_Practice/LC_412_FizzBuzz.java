package LeetCode_Practice;

import java.util.ArrayList;
import java.util.List;

public class LC_412_FizzBuzz {
    /*
     * ---------------------------------------------------------
     * LeetCode 412: Fizz Buzz (Easy)
     * ---------------------------------------------------------
     * Given an integer n, return a string array answer (1-indexed) where:
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     * 
     * Approach: Single For Loop with Conditionals
     */

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("FizzBuzz for n = 15:");
        List<String> result = fizzBuzz(15);
        for (String s : result) {
            System.out.print(s + " ");
        }
        // Output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
    }
}
