import java.util.*;

// ============================================================
//  CH-02: RELATIONAL OPERATORS (Comparison)
//  DSA Module 2: Operators | Beginner to Pro
// ============================================================
//
//  Yeh operators do values ko compare karte hain aur result
//  hamesha BOOLEAN (true ya false) mein dete hain.
//
// ============================================================

public class Ch02_Relational {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 1. Equal to (==)
        System.out.println("a == b: " + (a == b)); // false

        // 2. Not Equal to (!=)
        System.out.println("a != b: " + (a != b)); // true

        // 3. Greater than (>)
        System.out.println("a > b : " + (a > b));  // false

        // 4. Less than (<)
        System.out.println("a < b : " + (a < b));  // true

        // 5. Greater or Equal (>=)
        System.out.println("a >= b: " + (a >= b)); // false

        // 6. Less or Equal (<=)
        System.out.println("a <= b: " + (a <= b)); // true
        
        // ════════════════════════════════════════════════════
        //  DSA TIP:
        // ════════════════════════════════════════════════════
        //  '==' vs '='
        //  '='  is Assignment (value daalne ke liye)
        //  '==' is Comparison (check karne ke liye)
        // ════════════════════════════════════════════════════
    }
}
