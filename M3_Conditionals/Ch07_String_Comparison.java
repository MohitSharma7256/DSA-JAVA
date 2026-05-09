import java.util.*;

// ============================================================
//  CH-09: THE STRING COMPARISON TRAP ⚠️
//  DSA Module 3: Conditionals | Pro-Coding Tips
// ============================================================
//
//  Java mein Strings ko compare karne ke liye '==' ka use
//  karna sabse badi galti hai.
//
//  '=='      → Memory Address (Reference) compare karta hai.
//  .equals() → Actual Text (Value) compare karta hai.
//
// ============================================================

public class Ch07_String_Comparison {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // ── Case 1: Interning (String Pool) ──────────────────
        // s1 aur s2 dono same "Hello" ko point kar rahe hain
        if (s1 == s2) {
            System.out.println("s1 == s2 : TRUE (Same memory)");
        }

        // ── Case 2: New Object ──────────────────────────────
        // s3 ek naya object hai heap mein, address alag hai
        if (s1 == s3) {
            System.out.println("s1 == s3 : TRUE");
        } else {
            System.out.println("s1 == s3 : FALSE (Memory address different hai!)");
        }

        // ── CORRECT WAY: .equals() ───────────────────────────
        if (s1.equals(s3)) {
            System.out.println("s1.equals(s3) : TRUE (Kyunki text same hai)");
        }

        // ════════════════════════════════════════════════════
        //  DSA MASTER RULE:
        // ════════════════════════════════════════════════════
        //  Hamesha Strings ko compare karne ke liye .equals() 
        //  use karein, '==' kabhi nahi!
        // ════════════════════════════════════════════════════
    }
}
