import java.util.*;

// ============================================================
//  CH-04: ASSIGNMENT OPERATORS
//  DSA Module 2: Operators | Beginner to Pro
// ============================================================
//
//  Variables mein value store karne ke liye use hote hain.
//  Inka "Compound" version code ko chhota aur fast banata hai.
//
// ============================================================

public class Ch04_Assignment {

    public static void main(String[] args) {
        
        int a = 10;
        
        // 1. Simple Assignment (=)
        int b = a; 

        // 2. Add and Assign (+=)
        a += 5; // Matlab: a = a + 5 → 15
        System.out.println("a += 5 : " + a);

        // 3. Subtract and Assign (-=)
        a -= 3; // Matlab: a = a - 3 → 12
        System.out.println("a -= 3 : " + a);

        // 4. Multiply and Assign (*=)
        a *= 2; // Matlab: a = a * 2 → 24
        System.out.println("a *= 2 : " + a);

        // 5. Divide and Assign (/=)
        a /= 4; // Matlab: a = a / 4 → 6
        System.out.println("a /= 4 : " + a);

        // 6. Modulo and Assign (%=)
        a %= 4; // Matlab: a = a % 4 → 2
        System.out.println("a %= 4 : " + a);
        
        // ════════════════════════════════════════════════════
        //  DSA TIP:
        // ════════════════════════════════════════════════════
        //  Compound assignment (+=, *= etc.) mein Java 
        //  automatically TYPE CASTING kar leta hai.
        //  Example: 
        //  byte b = 5;
        //  b = b + 2;   // ❌ Error (int to byte)
        //  b += 2;      // ✅ Works fine (Auto cast)
        // ════════════════════════════════════════════════════
    }
}
