import java.util.Scanner;

public class Ch09_PracticeSet {
    public static void main(String[] args) {
        /*
         * ==========================================
         * PRACTICE SET: LOOPS
         * ==========================================
         */
        
        System.out.println("--- Q1: Print multiplication table of a number N ---");
        int n = 5; // Example number
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        
        System.out.println("\n--- Q2: Find the Factorial of a number N ---");
        // Factorial of 4 (4!) = 4 * 3 * 2 * 1 = 24
        int num = 4;
        long fact = 1; // using long to avoid overflow for large numbers
        for (int i = 1; i <= num; i++) {
            fact *= i; // fact = fact * i
        }
        System.out.println("Factorial of " + num + " is: " + fact);
        
        System.out.println("\n--- Q3: Sum of Even and Odd integers ---");
        // Program that reads a set of integers and prints sum of even and odd separately.
        /*
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();
            
        } while (choice == 1);
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        sc.close();
        */
        System.out.println("Uncomment the code in Q3 to run it interactively.");
    }
}
