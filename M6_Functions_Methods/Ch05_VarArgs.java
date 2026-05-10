import java.util.Arrays;

public class Ch05_VarArgs {
    /*
     * ==========================================
     * VARIABLE LENGTH ARGUMENTS (VarArgs)
     * ==========================================
     * Introduced in Java 5. What if you don't know how many arguments 
     * the caller will pass? Do you create 10 overloaded methods? No!
     * 
     * We use VarArgs: 'DataType... variableName'
     * Internally, Java treats this as an Array.
     * 
     * RULES:
     * 1. There can be only ONE varargs parameter in a method.
     * 2. The varargs parameter MUST be the LAST parameter in the list.
     */

    // Takes ANY number of integers (0, 1, or 100)
    public static void printNumbers(int... numbers) {
        System.out.println("You passed " + numbers.length + " arguments: " + Arrays.toString(numbers));
    }
    
    // Multiple parameters (VarArgs MUST be at the end!)
    public static void printStudentDetails(String name, int... marks) {
        System.out.println("Student: " + name);
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args) {
        System.out.println("--- Variable Arguments ---");
        
        printNumbers(); // Passing 0 arguments
        printNumbers(10); // Passing 1 argument
        printNumbers(10, 20, 30, 40, 50); // Passing 5 arguments
        
        System.out.println("\n--- Multiple Parameters ---");
        printStudentDetails("Mohit", 85, 90, 95);
    }
}
