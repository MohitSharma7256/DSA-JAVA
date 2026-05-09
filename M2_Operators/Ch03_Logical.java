import java.util.*;

// ============================================================
//  CH-03: LOGICAL OPERATORS
//  DSA Module 2: Operators | Beginner to Pro
// ============================================================
//
//  Multiple conditions ko combine karne ke liye use hote hain.
//
//  1. Logical AND (&&) : Dono true toh result True.
//  2. Logical OR  (||) : Ek bhi true toh result True.
//  3. Logical NOT (!)  : True ko False, False ko True bana deta hai.
//
// ============================================================

public class Ch03_Logical {

    public static void main(String[] args) {
        
        // ── 1. Logical AND (&&) ──────────────────────────────
        // TRUTH TABLE: T && T = T | Baaki sab False
        System.out.println(" (5 > 3) && (8 > 5) : " + ((5 > 3) && (8 > 5))); // true
        System.out.println(" (5 > 3) && (8 < 5) : " + ((5 > 3) && (8 < 5))); // false

        // ── 2. Logical OR (||) ───────────────────────────────
        // TRUTH TABLE: F || F = F | Baaki sab True
        System.out.println(" (5 < 3) || (8 > 5) : " + ((5 < 3) || (8 > 5))); // true
        System.out.println(" (5 < 3) || (8 < 5) : " + ((5 < 3) || (8 < 5))); // false

        // ── 3. Logical NOT (!) ───────────────────────────────
        // Inverter ki tarah kaam karta hai
        System.out.println(" !(5 > 3) : " + !(5 > 3)); // false (kyunki 5>3 true tha)

        // ════════════════════════════════════════════════════
        //  DSA TIP: Short-Circuit Evaluation
        // ════════════════════════════════════════════════════
        //  - && mein agar pehli condition FALSE hai, toh Java 
        //    doosri check hi nahi karta (kyunki final result false hi hoga).
        //  - || mein agar pehli condition TRUE hai, toh Java 
        //    doosri check nahi karta.
        //  Ye loops mein performance badhane ke kaam aata hai.
        // ════════════════════════════════════════════════════
    }
}
