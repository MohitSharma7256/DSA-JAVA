import java.util.*;

// ============================================================
//  CH-10: TERNARY OPERATOR (Conditional Operator)
//  DSA Module 2: Operators | Pro-Coding Tips
// ============================================================
//
//  Ternary Operator if-else ka ek chhota (one-liner) version hai.
//  Iska use code ko clean aur readable banane ke liye hota hai.
//
//  Syntax:
//  variable = (condition) ? statement1 : statement2;
//
//  - Agar condition TRUE hai → statement1 execute hoga.
//  - Agar condition FALSE hai → statement2 execute hoga.
//
// ============================================================

public class Ch10_Ternary {

    public static void main(String[] args) {
        
        // ── 1. Basic Example (Pass/Fail) ────────────────────
        int marks = 65;
        String status = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println("Student Status: " + status);

        // ── 2. Find Larger of 2 Numbers ─────────────────────
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Larger number: " + max);

        // ── 3. Check Even or Odd ────────────────────────────
        int n = 7;
        String type = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(n + " is " + type);

        // ── 4. Nested Ternary (Avoid this, it's confusing!) ──
        // Par knowledge ke liye dekh lo:
        int x = 5, y = 10, z = 15;
        int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Largest of 3: " + largest);

        // ════════════════════════════════════════════════════
        //  DSA TIP:
        // ════════════════════════════════════════════════════
        //  Ternary operator hamesha ek VALUE return karta hai.
        //  Isko aap directly print statement ya return statement 
        //  mein use kar sakte ho jo code ko fast aur compact banata hai.
        // ════════════════════════════════════════════════════
    }
}
