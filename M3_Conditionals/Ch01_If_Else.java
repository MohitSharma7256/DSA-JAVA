import java.util.*;

// ============================================================
//  CH-01: IF-ELSE STATEMENTS
//  DSA Module 3: Conditionals | Programming Logic
// ============================================================
//
//  Conditionals humein rasta chunne (Decision making) mein 
//  madad karte hain.
//
//  Syntax:
//  if (condition) {
//      // code if true
//  } else {
//      // code if false
//  }
//
// ============================================================

public class Ch01_If_Else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // ── Basic Decision ──────────────────────────────────
        if (age >= 18) {
            System.out.println("Result: You are an ADULT (Can vote, can drive).");
        } else {
            System.out.println("Result: You are a MINOR.");
        }

        // ── Nested If-Else ──────────────────────────────────
        // (Condition ke andar condition)
        if (age >= 18) {
            if (age >= 60) {
                System.out.println("Category: Senior Citizen.");
            } else {
                System.out.println("Category: Working Professional.");
            }
        }

        sc.close();
    }
}
