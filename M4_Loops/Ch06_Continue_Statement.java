import java.util.Scanner;

public class Ch06_Continue_Statement {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. INTRODUCTION TO CONTINUE STATEMENT
         * ==========================================
         * The 'continue' keyword skips the CURRENT iteration of a loop
         * and jumps straight to the updation/next iteration.
         */

        System.out.println("--- Basic Continue ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the rest of the loop block when i is 3
            }
            System.out.println("Value of i: " + i);
        }

        /*
         * ==========================================
         * 2. REAL-WORLD USE CASE
         * ==========================================
         * Keep taking numbers from the user and print them.
         * BUT, if the user enters a multiple of 10, skip printing it.
         */
        System.out.println("\n--- Skip multiples of 10 ---");
        Scanner sc = new Scanner(System.in);
        
        // Uncomment to test interactively
        /*
        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            
            if (n % 10 == 0) {
                continue; // Skip printing this number
            }
            System.out.println("Number was: " + n);
        } while (true);
        */
        
        sc.close();
    }
}
