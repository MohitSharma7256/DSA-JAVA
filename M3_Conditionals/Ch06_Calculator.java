import java.util.*;

// ============================================================
//  CH-06: MINI PROJECT — SIMPLE CALCULATOR
//  DSA Module 3: Conditionals | Practical Programming
// ============================================================

public class Ch06_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- WELCOME TO JAVA CALCULATOR ---");
        System.out.print("Enter number 1: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter number 2: ");
        double b = sc.nextDouble();

        System.out.print("Choose operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + (a + b));
                      break;
            case '-': System.out.println("Result: " + (a - b));
                      break;
            case '*': System.out.println("Result: " + (a * b));
                      break;
            case '/': if (b != 0) {
                        System.out.println("Result: " + (a / b));
                      } else {
                        System.out.println("Error: Cannot divide by zero!");
                      }
                      break;
            case '%': System.out.println("Result: " + (a % b));
                      break;
            default: System.out.println("Invalid Operator!");
        }
    }
}
