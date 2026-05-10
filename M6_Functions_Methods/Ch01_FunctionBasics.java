import java.util.Scanner;

public class Ch01_FunctionBasics {
    
    /*
     * ==========================================
     * 1. WHAT IS A FUNCTION (METHOD)?
     * ==========================================
     * A method is a block of code which only runs when it is called.
     * We pass data (parameters) into a method, and it returns a result.
     * 
     * WHY USE METHODS?
     * - Reusability: Write code once, use it many times (DRY Principle - Don't Repeat Yourself).
     * - Modularity: Break complex problems into smaller chunks.
     * 
     * SYNTAX:
     * returnType methodName(dataType parameter1, dataType parameter2) {
     *     // body
     *     return value;
     * }
     */

    // Method 1: No Parameters, No Return (void)
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    // Method 2: With Parameters, No Return (void)
    // Here 'name' is a formal parameter
    public static void greetUser(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    // Method 3: With Parameters, Returns a Value
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum; // returns the result back to the caller
    }

    public static void main(String[] args) {
        System.out.println("--- Inside Main Method ---");
        
        // Calling Method 1
        printHelloWorld();
        
        // Calling Method 2
        // "Mohit" is the ACTUAL Argument
        greetUser("Mohit");
        
        // Calling Method 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = 10; // sc.nextInt()
        System.out.print("Enter second number: ");
        int num2 = 20; // sc.nextInt()
        
        int result = calculateSum(num1, num2);
        System.out.println("Sum is: " + result);
        
        sc.close();
    }
}
