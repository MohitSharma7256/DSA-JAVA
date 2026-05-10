public class Ch04_Print_Patterns {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. NESTED LOOPS & PATTERNS
         * ==========================================
         * A loop inside another loop is a nested loop.
         * Outer loop determines the number of rows/lines.
         * Inner loop determines the content of each row.
         */

        System.out.println("--- Square Pattern ---");
        /*
         * ****
         * ****
         * ****
         * ****
         */
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= 4; star++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after printing row
        }

        System.out.println("\n--- Half-Pyramid Pattern ---");
        /*
         * *
         * **
         * ***
         * ****
         */
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) { // inner loop depends on outer loop
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n--- Inverted Half-Pyramid ---");
        /*
         * ****
         * ***
         * **
         * *
         */
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= (n - line + 1); star++) { 
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n--- Half-Pyramid with Numbers ---");
        /*
         * 1
         * 12
         * 123
         * 1234
         */
        for(int line = 1; line <= 4; line++) {
            for(int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
