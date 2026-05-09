import java.util.*;

// ============================================================
//  CH-05: UNARY OPERATORS (++, --)
//  DSA Module 2: Operators | Beginner to Pro
// ============================================================
//
//  Unary = Jo sirf EK operand par kaam karein.
//  Inka sabse zyada use Loops mein hota hai.
//
//  1. Increment (++) → Value ko 1 se badhana
//  2. Decrement (--) → Value ko 1 se kam karna
//
// ============================================================

public class Ch05_Unary {

    public static void main(String[] args) {
        
        // ── 1. INCREMENT (++) ────────────────────────────────
        
        // POST-INCREMENT (a++)
        // Pehle value USE hogi, phir CHANGE hogi.
        int a = 10;
        int b = a++; 
        System.out.println("Post-Inc: a=" + a + ", b=" + b); // a=11, b=10

        // PRE-INCREMENT (++a)
        // Pehle value CHANGE hogi, phir USE hogi.
        int x = 10;
        int y = ++x;
        System.out.println("Pre-Inc : x=" + x + ", y=" + y); // x=11, y=11


        // ── 2. DECREMENT (--) ────────────────────────────────
        
        // POST-DECREMENT (a--)
        int c = 10;
        int d = c--;
        System.out.println("Post-Dec: c=" + c + ", d=" + d); // c=9, d=10

        // PRE-DECREMENT (--a)
        int e = 10;
        int f = --e;
        System.out.println("Pre-Dec : e=" + e + ", f=" + f); // e=9, f=9

        // ════════════════════════════════════════════════════
        //  DSA TIP:
        // ════════════════════════════════════════════════════
        //  Loops (for, while) mein hamesha dhyaan rakho:
        //  - for(int i=0; i<n; i++)  → 0 to n-1 (normal)
        //  - for(int i=n; i>0; i--)  → Reverse iteration
        // ════════════════════════════════════════════════════
    }
}
