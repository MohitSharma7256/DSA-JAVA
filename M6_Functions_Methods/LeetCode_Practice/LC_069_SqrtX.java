package LeetCode_Practice;

public class LC_069_SqrtX {
    /*
     * ---------------------------------------------------------
     * LeetCode 69: Sqrt(x) (Easy)
     * ---------------------------------------------------------
     * Given a non-negative integer x, return the square root of x rounded 
     * down to the nearest integer. The returned integer should be non-negative as well.
     * You must not use any built-in exponent function or operator.
     * 
     * Approach: Built-in method proxy or Math simulation.
     * Since we covered Math methods in Ch07, we can show both approaches.
     */

    // Approach 1: Helper Method approach using basic loop
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        
        long i = 1;
        while (i * i <= x) {
            i++;
        }
        return (int) (i - 1);
    }
    
    // Approach 2: Using the built-in Math function (though LC asks not to for the exact challenge)
    public static int builtInSqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        System.out.println("Sqrt(8) custom: " + mySqrt(8)); // 2
        System.out.println("Sqrt(8) built-in: " + builtInSqrt(8)); // 2
    }
}
