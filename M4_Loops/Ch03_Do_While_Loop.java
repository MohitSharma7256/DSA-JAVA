import java.util.Scanner;

public class Ch03_Do_While_Loop {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. INTRODUCTION TO DO-WHILE LOOP
         * ==========================================
         * A do-while loop is an exit-controlled loop.
         * The code block will execute AT LEAST ONCE before the condition is checked.
         * Useful for menu-driven programs.
         */

        System.out.println("--- Basic Do-While Loop ---");
        int counter = 1;
        do {
            System.out.println("This is iteration: " + counter);
            counter++;
        } while (counter <= 5);

        /*
         * ==========================================
         * 2. DEMONSTRATING "EXECUTES AT LEAST ONCE"
         * ==========================================
         * Even if the condition is false initially, the block runs once.
         */
        System.out.println("\n--- False Condition Example ---");
        int num = 10;
        do {
            System.out.println("This will print exactly once, even though 10 > 5!");
        } while (num < 5); // Condition is false from the start

        /*
         * ==========================================
         * 3. MENU DRIVEN PROGRAM (Real-world Use Case)
         * ==========================================
         */
        System.out.println("\n--- Menu Driven Example ---");
        Scanner sc = new Scanner(System.in);
        int choice;
        
        // Uncomment to test interactively!
        /*
        do {
            System.out.println("1. Print Hello");
            System.out.println("2. Print Bye");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            if(choice == 1) System.out.println("Hello!");
            else if(choice == 2) System.out.println("Bye!");
            
        } while(choice != 3);
        System.out.println("Exited the menu!");
        */
        sc.close();
    }
}
