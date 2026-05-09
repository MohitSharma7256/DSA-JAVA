import java.util.*;

// ============================================================
//  CH-06: BITWISE OPERATORS (DSA SPECIAL 🚀)
//  DSA Module 2: Operators | Beginner to Pro
// ============================================================
//
//  Ye operators BINARY (0 aur 1) level par kaam karte hain.
//  Inka use karne se aapka code 10x FAST chalta hai.
//
//  1. Binary AND (&)
//  2. Binary OR  (|)
//  3. Binary XOR (^)
//  4. Binary NOT (~)
//  5. Left Shift  (<<)
//  6. Right Shift (>>)
//
// ============================================================

public class Ch06_Bitwise {

    public static void main(String[] args) {
        
        int a = 5; // Binary: 0101
        int b = 6; // Binary: 0110

        // 1. Bitwise AND (&)
        // Dono bits 1 toh result 1
        // 0101 & 0110 = 0100 (4)
        System.out.println("5 & 6 : " + (a & b)); 

        // 2. Bitwise OR (|)
        // Ek bhi bit 1 toh result 1
        // 0101 | 0110 = 0111 (7)
        System.out.println("5 | 6 : " + (a | b));

        // 3. Bitwise XOR (^)
        // Dono bits DIFFERENT toh result 1
        // 0101 ^ 0110 = 0011 (3)
        System.out.println("5 ^ 6 : " + (a ^ b));

        // 4. Binary One's Complement (~)
        // Bits ko flip kar deta hai
        System.out.println("~5    : " + (~a)); // -6 (2's complement logic)

        // 5. Left Shift (<<)
        // Formula: a * 2^b
        // 5 << 2 = 5 * 2^2 = 5 * 4 = 20
        System.out.println("5 << 2: " + (5 << 2));

        // 6. Right Shift (>>)
        // Formula: a / 2^b
        // 10 >> 1 = 10 / 2^1 = 5
        System.out.println("10 >> 1: " + (10 >> 1));

        // ════════════════════════════════════════════════════
        //  DSA MASTER TRICKS:
        // ════════════════════════════════════════════════════
        //  1. Even/Odd Check: (n & 1) == 0 ? "Even" : "Odd"
        //     (Modulo % se FAST chalta hai)
        //  2. Swapping: a = a^b; b = a^b; a = a^b;
        //  3. Multiply by 2: (n << 1)
        //  4. Divide by 2:   (n >> 1)
        // ════════════════════════════════════════════════════
    }
}
