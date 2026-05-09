// ============================================================
//  JAVA COMMENTS — Complete Notes
//  DSA Notes | Beginner Level
// ============================================================
//
//  Comment kya hota hai?
//  → Woh code jo compiler IGNORE kar deta hai.
//  → Sirf developer ke padhne ke liye hota hai.
//  → Code ko samjhane mein help karta hai.
//
//  Java mein 3 tarah ke comments hote hain:
//  1. Single-line comment  →  //
//  2. Multi-line comment   →  /* ... */
//  3. Documentation comment → /** ... */   (Javadoc ke liye)
//
// ============================================================

public class Ch02_Comments {

    public static void main(String[] args) {

        // ── 1. Single-line Comment ───────────────────────────
        // Ek line ko comment karta hai
        // Shortcut: Ctrl + /

        // Yeh print hoga
        System.out.println("Jai Shree Mahakal");  // yeh bhi comment hai

        // System.out.println("Yeh print NAHI hoga");  ← commented out


        // ── 2. Multi-line Comment ─────────────────────────────
        /*
            Yeh ek multi-line comment hai.
            Isko tab use karo jab ek se zyada lines
            explain karni ho.

            Kya haal hai?
            Sab theek!
        */

        System.out.println("Hello from Mohit");


        // ── 3. Documentation Comment (Javadoc) ───────────────
        // /** ... */ syntax use hota hai
        // Yeh automatically HTML documentation generate karne ke liye
        // Libraries aur APIs mein use hota hai

        // Example:
        /**
         * Yeh method do numbers ka sum return karta hai.
         * @param a pehla number
         * @param b doosra number
         * @return a + b ka result
         */
        int result = add(5, 10);
        System.out.println("Sum: " + result);
    }

    // Helper method for demonstration
    static int add(int a, int b) {
        return a + b;
    }
}

// ============================================================
//  COMMENTS QUICK REFERENCE
// ============================================================
//
//  Type           Syntax          Use Case
//  ─────────────────────────────────────────────────────────
//  Single-line    // comment      Ek line explain karna
//  Multi-line     /* comment */   Paragraph-level explanation
//  Documentation  /** comment */  API docs generate karna
//
// ============================================================
//  KEYBOARD SHORTCUTS (VS Code / IntelliJ)
// ============================================================
//
//  Line toggle    : Ctrl + /         (single-line comment on/off)
//  Block comment  : Ctrl + Shift + / (multi-line comment)
//
// ============================================================
//  BEST PRACTICES
// ============================================================
//
//  ✅ Complex logic explain karo comments se
//  ✅ Function/method ka purpose likho
//  ✅ TODO/FIXME notes ke liye comments use karo
//     // TODO: add null check here
//     // FIXME: this breaks when input is negative
//
//  ❌ Obvious cheezein mat likho:
//     int x = 5;  // x ko 5 assign kiya  ← useless comment!
//
// ============================================================