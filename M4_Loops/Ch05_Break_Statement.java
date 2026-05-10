import java.util.Scanner;

public class Ch05_Break_Statement {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. INTRODUCTION TO BREAK STATEMENT
         * ==========================================
         * The 'break' keyword is used to exit a loop immediately, 
         * skipping any remaining iterations.
         */

        System.out.println("--- Basic Break ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Loop terminates when i is 3
            }
            System.out.println("Value of i: " + i);
        }
        System.out.println("Exited loop.");

        /*
         * ==========================================
         * 2. REAL-WORLD USE CASE
         * ==========================================
         * Keep taking numbers from the user until they enter a multiple of 10.
         */
        System.out.println("\n--- Multiple of 10 exit ---");
        Scanner sc = new Scanner(System.in);
        
        // Uncomment to test interactively
        /*
        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            
            if (n % 10 == 0) {
                System.out.println("Entered multiple of 10. Exiting...");
                break; // Break the loop
            }
            System.out.println("You entered: " + n);
        } while (true);
        */
        
        sc.close();
    }
}
