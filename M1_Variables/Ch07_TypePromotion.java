// ============================================================
//  JAVA — Type Promotion in Expressions
//  DSA Notes | Beginner Level
// ============================================================
//
//  What is Type Promotion?
//  → Jab hum koi expression evaluate karte hain (jaise a + b * c), 
//    toh Java automatically chhote data types ko bade types mein 
//    promote kar deta hai calculation ke waqt.
//
//  RULES OF TYPE PROMOTION:
//  ────────────────────────────────────────────────────────
//  RULE 1: Java automatically promotes each 'byte', 'short', 
//          or 'char' operand to 'int' when evaluating an expression.
//
//  RULE 2: Agar expression mein koi bhi operand:
//          - 'long' hai   → Poora expression 'long' ban jayega.
//          - 'float' hai  → Poora expression 'float' ban jayega.
//          - 'double' hai → Poora expression 'double' ban jayega.
//
// ============================================================

public class Ch07_TypePromotion {

    public static void main(String[] args) {

        // ════════════════════════════════════════════════════
        //  CASE 1: byte/short/char to int promotion
        // ════════════════════════════════════════════════════
        
        System.out.println("===== CASE 1: byte/short/char to int =====");
        
        char a = 'a'; // ASCII 97
        char b = 'b'; // ASCII 98
        
        // char + char = int
        System.out.println("a + b = " + (a + b)); // 97 + 98 = 195
        System.out.println("b - a = " + (b - a)); // 98 - 97 = 1
        
        byte b1 = 5;
        // byte b2 = b1 * 2; // ❌ ERROR: b1*2 is now an 'int'
        byte b2 = (byte) (b1 * 2); // ✅ Explicit casting needed
        System.out.println("b2: " + b2);


        // ════════════════════════════════════════════════════
        //  CASE 2: Promotion to largest type
        // ════════════════════════════════════════════════════
        
        System.out.println("\n===== CASE 2: Promotion to Largest Type =====");
        
        int i = 10;
        float f = 20.5f;
        long l = 30;
        double d = 40.5;
        
        // int + float + long + double = double
        double result = i + f + l + d; 
        System.out.println("Result (double): " + result);


        // ════════════════════════════════════════════════════
        //  IMPORTANT EXAMPLE: Problem with byte arithmetic
        // ════════════════════════════════════════════════════
        
        System.out.println("\n===== IMPORTANT: Byte Arithmetic Error =====");
        
        byte smallB = 10;
        // smallB = smallB * 2; // ❌ Compile Error! 
        // Kyun? Kyunki 'smallB * 2' ka result 'int' hai.
        
        smallB = (byte) (smallB * 2); // ✅ Correct way
        System.out.println("smallB after cast: " + smallB);
    }
}

// ============================================================
//  WHY DOES THIS HAPPEN?
// ============================================================
//
//  1. Accuracy: Calculation ke waqt precision loss na ho.
//  2. Overflow Prevention: Do bytes ko multiply karne par result 
//     byte ki range (-128 to 127) se bahar ja sakta hai, isliye 
//     Java usko int (4 bytes) mein promote kar deta hai.
//
// ============================================================
//  COMMON INTERVIEW QUESTION
// ============================================================
//
//  Q: What is the output of: System.out.println('a' + 1);
//  A: 98. 
//     Kyunki 'a' (char) int mein promote hokar 97 ban gaya, 
//     phir 97 + 1 = 98.
//
// ============================================================
