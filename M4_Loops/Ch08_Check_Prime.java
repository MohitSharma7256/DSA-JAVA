import java.util.Scanner;

public class Ch08_Check_Prime {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. CHECK IF A NUMBER IS PRIME
         * ==========================================
         * A prime number is only divisible by 1 and itself.
         * Example: 2, 3, 5, 7, 11
         * 
         * Naive Approach: Loop from 2 to n-1. O(n) Time Complexity.
         * Optimized Approach: Loop from 2 to Math.sqrt(n). O(√n) Time Complexity.
         * Why sqrt(n)? Because factors repeat after the square root.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if prime: ");
        // int n = sc.nextInt(); 
        int n = 37; // Hardcoded for demonstration, replace with scanner input
        System.out.println("Checking: " + n);

        if (n <= 1) {
            System.out.println(n + " is neither prime nor composite.");
        } else if (n == 2) {
            System.out.println("2 is a prime number.");
        } else {
            boolean isPrime = true;

            // OPTIMIZED LOOP: Only check up to square root of n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // No need to check further if we found a factor
                }
            }

            if (isPrime) {
                System.out.println(n + " is a PRIME number.");
            } else {
                System.out.println(n + " is NOT a prime number.");
            }
        }
        sc.close();
    }
}
