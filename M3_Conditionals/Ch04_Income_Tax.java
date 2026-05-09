import java.util.*;

// ============================================================
//  CH-04: INCOME TAX CALCULATOR
//  DSA Module 3: Conditionals | Practical Programming
// ============================================================
//
//  Rules:
//  - Income < 5L      → 0% Tax
//  - Income 5L - 10L  → 20% Tax
//  - Income > 10L     → 30% Tax
//
// ============================================================

public class Ch04_Income_Tax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your income (in Rupees): ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income < 500000) {
            tax = 0;
        } 
        else if (income >= 500000 && income < 1000000) {
            tax = (income * 0.20);
        } 
        else {
            tax = (income * 0.30);
        }

        System.out.println("Your total tax is: " + tax);
        System.out.println("Net Salary: " + (income - tax));
    }
}
