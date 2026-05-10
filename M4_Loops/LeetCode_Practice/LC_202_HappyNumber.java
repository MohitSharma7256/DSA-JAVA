package LeetCode_Practice;

public class LC_202_HappyNumber {
    /*
     * ---------------------------------------------------------
     * LeetCode 202: Happy Number (Easy)
     * ---------------------------------------------------------
     * A happy number is a number defined by the following process:
     * - Replace the number by the sum of the squares of its digits.
     * - Repeat the process until the number equals 1 (where it will stay), 
     *   or it loops endlessly in a cycle which does not include 1.
     * 
     * Approach: Loop + Helper Method
     * We can use a slow and fast runner approach (Floyd's Cycle-Finding Algorithm) 
     * inside a loop to detect if it's stuck in a cycle.
     */

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        
        return fast == 1;
    }

    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println("Is 19 a happy number? " + isHappy(19)); // true
        System.out.println("Is 2 a happy number? " + isHappy(2));   // false
    }
}
