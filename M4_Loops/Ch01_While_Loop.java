public class Ch01_While_Loop {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. INTRODUCTION TO WHILE LOOP
         * ==========================================
         * A while loop evaluates a boolean expression and executes the 
         * block of code as long as the expression remains true.
         * Useful when you DON'T know exactly how many times the loop should run.
         */

        System.out.println("--- Basic While Loop (1 to 5) ---");
        int counter = 1; // Initialization
        
        while (counter <= 5) { // Condition
            System.out.println("Hello World! Count: " + counter);
            counter++; // Updation (Crucial: prevents infinite loop)
        }
        
        /*
         * ==========================================
         * 2. PRINT NUMBERS FROM 1 TO N
         * ==========================================
         */
        System.out.println("\n--- Print 1 to N ---");
        int n = 10;
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Move to next line

        /*
         * ==========================================
         * 3. INFINITE WHILE LOOP (Caution!)
         * ==========================================
         * If the condition never becomes false, the loop runs forever.
         * Uncommenting the code below will crash or hang the program.
         * 
         * while (true) {
         *     System.out.println("I will run forever!");
         * }
         */
    }
}
