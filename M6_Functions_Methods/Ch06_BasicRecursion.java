public class Ch06_BasicRecursion {
    /*
     * ==========================================
     * BASIC RECURSION
     * ==========================================
     * Recursion is when a method CALLS ITSELF to solve a smaller piece of the problem.
     * 
     * It is identical to the mathematical principle of Mathematical Induction.
     * 
     * EVERY RECURSIVE FUNCTION NEEDS TWO THINGS:
     * 1. Base Case: The condition that stops the recursion. (Crucial, otherwise you get StackOverflowError)
     * 2. Recursive Call: The function calling itself with modified parameters.
     */

    // Example 1: Print numbers from N down to 1
    public static void printNto1(int n) {
        // 1. BASE CASE (Stop when n becomes 0)
        if (n == 0) {
            return; 
        }
        
        System.out.print(n + " ");
        
        // 2. RECURSIVE CALL (Call with n-1)
        printNto1(n - 1);
    }

    // Example 2: Factorial of N
    // factorial(5) = 5 * factorial(4)
    public static int factorial(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive Call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("--- Printing N down to 1 ---");
        printNto1(5);
        System.out.println(); // New line
        
        System.out.println("\n--- Calculating Factorial ---");
        int ans = factorial(5);
        System.out.println("Factorial of 5 is: " + ans);
        
        /*
         * WHY DO WE GET StackOverflowError?
         * If you forget the Base Case, the method keeps adding new "Stack Frames" 
         * to the memory stack infinitely. Eventually, the RAM allocated for the 
         * stack runs out, and the program crashes.
         */
    }
}
