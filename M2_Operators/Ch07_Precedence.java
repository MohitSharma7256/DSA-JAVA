import java.util.*;

// ============================================================
//  CH-07: OPERATOR PRECEDENCE & ASSOCIATIVITY
//  DSA Module 2: Operators | Beginner to Pro
// ============================================================
//
//  Precedence    = Kaun pehle solve hoga? (Priority)
//  Associativity = Agar priority same ho, toh Left se solve karein ya Right se?
//
// ============================================================

public class Ch07_Precedence {

    public static void main(String[] args) {
        
        // ── 1. Priority Example ──────────────────────────────
        // Multiplication (*) has higher priority than (+)
        int res1 = 10 + 5 * 2; // 10 + 10 = 20
        System.out.println("10 + 5 * 2 = " + res1);

        // Parentheses () have highest priority
        int res2 = (10 + 5) * 2; // 15 * 2 = 30
        System.out.println("(10 + 5) * 2 = " + res2);


        // ── 2. Associativity Example ─────────────────────────
        // Multiplication and Division have SAME priority.
        // Inka associativity Left to Right (L → R) hota hai.
        int res3 = 10 * 5 / 2; // (10 * 5) = 50 / 2 = 25
        System.out.println("10 * 5 / 2 = " + res3);

        int res4 = 10 / 5 * 2; // (10 / 5) = 2 * 2 = 4
        System.out.println("10 / 5 * 2 = " + res4);

        // Assignment (=) has Right to Left (R ← L) associativity
        int a, b, c;
        a = b = c = 100; // Pehle c=100, phir b=c, phir a=b
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        // ════════════════════════════════════════════════════
        //  PRECEDENCE TABLE (Top to Bottom):
        // ════════════════════════════════════════════════════
        //  1. ()  []  .
        //  2. ++  --  !  (Unary)
        //  3. *  /  %
        //  4. +  -
        //  5. <<  >>  >>>
        //  6. <  <=  >  >=
        //  7. ==  !=
        //  8. &  (Bitwise AND)
        //  9. ^  (Bitwise XOR)
        //  10. | (Bitwise OR)
        //  11. && (Logical AND)
        //  12. || (Logical OR)
        //  13. ?: (Ternary)
        //  14. =  +=  -=  etc.
        // ════════════════════════════════════════════════════
    }
}
