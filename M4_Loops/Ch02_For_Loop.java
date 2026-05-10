public class Ch02_For_Loop {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. INTRODUCTION TO FOR LOOP
         * ==========================================
         * A for loop is best used when you KNOW exactly how many times 
         * you want to iterate through a block of code.
         * Syntax: for(initialization; condition; updation)
         */

        System.out.println("--- Basic For Loop (1 to 5) ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        /*
         * ==========================================
         * 2. SUM OF FIRST 'N' NATURAL NUMBERS
         * ==========================================
         * Very common interview logic building question.
         */
        System.out.println("\n--- Sum of First N Natural Numbers ---");
        int n = 10;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i; // equivalent to sum = sum + i
        }
        System.out.println("Sum of first " + n + " numbers is: " + sum);

        /*
         * ==========================================
         * 3. MULTIPLE VARIABLES IN FOR LOOP
         * ==========================================
         * You can declare multiple variables of the same type in the initialization block.
         */
        System.out.println("\n--- Multiple Variables ---");
        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }
}
