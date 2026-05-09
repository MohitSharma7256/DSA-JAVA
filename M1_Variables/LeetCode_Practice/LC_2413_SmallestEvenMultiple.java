/**
 * LEETCODE ID: 2413
 * TITLE: Smallest Even Multiple
 * DIFFICULTY: Easy
 */
public class LC_2413_SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        // Smallest number divisible by both 2 and n
        return (n % 2 == 0) ? n : n * 2;
    }
}
