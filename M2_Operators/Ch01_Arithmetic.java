import java.util.*;

// ============================================================
//  CH-01: ARITHMETIC OPERATORS
//  DSA Module 2: Operators | Beginner to Pro
// ============================================================
//
//  Arithmetic operators humein mathematical calculations 
//  karne mein madad karte hain.
//
//  Types:
//  1. Binary Operators (+, -, *, /, %) → Needs 2 operands
//  2. Unary Operators (++, --) → Needs 1 operand (Next chapter)
//
// ============================================================

public class Ch01_Arithmetic {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // ── 1. Addition (+) ──────────────────────────────────
        System.out.println("Sum: " + (a + b)); // 13

        // ── 2. Subtraction (-) ───────────────────────────────
        System.out.println("Diff: " + (a - b)); // 7

        // ── 3. Multiplication (*) ────────────────────────────
        System.out.println("Mul: " + (a * b)); // 30

        // ── 4. Division (/) ──────────────────────────────────
        // ⚠️ TRAP: int / int = int (decimal loss!)
        System.out.println("Div: " + (a / b)); // 3 (not 3.33)
        
        // FIX: Ek operand ko double banao
        System.out.println("Precise Div: " + ((double)a / b)); // 3.333...

        // ── 5. Modulo (%) ────────────────────────────────────
        // Yeh humein REMAINDER (shesh-fal) deta hai.
        // DSA mein bahut use hota hai digits nikalne ke liye.
        System.out.println("Remainder: " + (a % b)); // 1 (10 ko 3 se divide karo toh 1 bachta hai)

        // ════════════════════════════════════════════════════
        //  DSA TIP: Modulo Property
        // ════════════════════════════════════════════════════
        //  1. anyNumber % 10 → Hamesha LAST DIGIT deta hai.
        //     Example: 123 % 10 = 3
        //  2. anyNumber / 10 → Hamesha LAST DIGIT HATA deta hai.
        //     Example: 123 / 10 = 12
        // ════════════════════════════════════════════════════
    }
}
