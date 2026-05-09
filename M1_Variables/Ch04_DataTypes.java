// ============================================================
//  JAVA DATA TYPES — Complete Notes
//  DSA Notes | Beginner Level
// ============================================================
//
//  Java mein 2 tarah ke data types hote hain:
//
//  1. PRIMITIVE  → directly value store karte hain (memory efficient)
//     byte, short, int, long, float, double, boolean, char
//
//  2. NON-PRIMITIVE (Reference Types) → object ka reference store karte hain
//     String, Array, Class, Interface, etc.
//
// ============================================================

public class Ch04_DataTypes {
    public static void main(String[] args) {

        // ── 1. byte ──────────────────────────────────────────
        // Size   : 1 byte (8 bits)
        // Range  : -128  to  127
        // Use    : Jab bahut chhoti integer value chahiye (memory save)
        byte b = 8;
        System.out.println("byte    : " + b);

        // ── 2. short ─────────────────────────────────────────
        // Size   : 2 bytes (16 bits)
        // Range  : -32,768  to  32,767
        // Use    : byte se bada, int se chhota — rarely used
        short s = 8989;
        System.out.println("short   : " + s);

        // ── 3. int ───────────────────────────────────────────
        // Size   : 4 bytes (32 bits)
        // Range  : -2,147,483,648  to  2,147,483,647  (~2 billion)
        // Use    : Default integer type — DSA mein sabse zyada use hota hai
        int i = 89898;
        System.out.println("int     : " + i);

        // ── 4. long ──────────────────────────────────────────
        // Size   : 8 bytes (64 bits)
        // Range  : -9.2 × 10^18  to  9.2 × 10^18
        // Use    : int overflow kare tab — very large numbers
        // ⚠️ NOTE: long literal ke end mein 'L' lagao!
        long l = 89898989898L;   // ← 'L' without this → compile error
        System.out.println("long    : " + l);

        // ── 5. float ─────────────────────────────────────────
        // Size      : 4 bytes (32 bits)
        // Precision : ~7 decimal digits
        // Use       : Decimal numbers (less precision needed)
        // ⚠️ NOTE: float literal ke end mein 'f' lagao!
        float f = 89.89f;        // ← 'f' without this → treated as double
        System.out.println("float   : " + f);

        // ── 6. double ────────────────────────────────────────
        // Size      : 8 bytes (64 bits)
        // Precision : ~15-16 decimal digits
        // Use       : Default decimal type — float se zyada accurate
        double d = 89.8989;      // ← koi suffix nahi chahiye
        System.out.println("double  : " + d);

        // ── 7. boolean ───────────────────────────────────────
        // Size   : ~1 bit (JVM dependent)
        // Values : true  ya  false  (sirf do values)
        // Use    : Conditions, flags, loops
        boolean bool = true;
        System.out.println("boolean : " + bool);

        // ── 8. char ──────────────────────────────────────────
        // Size   : 2 bytes (16 bits) — Unicode character
        // Range  : 0  to  65,535 (unsigned)
        // Use    : Single character store karne ke liye
        // ⚠️ NOTE: Single quotes use karo ('a'), double nahi ("a")
        char ch = 'a';
        System.out.println("char    : " + ch);
        System.out.println("char as int: " + (int) ch);  // ASCII value = 97

        // ── 9. String (Non-Primitive) ─────────────────────────
        // String ek class hai, primitive nahi
        // Double quotes use hote hain
        // Immutable hai — ek baar banao, change nahi hota
        String name = "mohit";
        System.out.println("String  : " + name);
    }
}

// ============================================================
//  DATA TYPES QUICK REFERENCE TABLE
// ============================================================
//
//  Type      Size     Range / Values              Default
//  ──────────────────────────────────────────────────────────
//  byte      1 byte   -128 to 127                  0
//  short     2 bytes  -32,768 to 32,767            0
//  int       4 bytes  -2.1B to 2.1B                0
//  long      8 bytes  -9.2×10^18 to 9.2×10^18     0L
//  float     4 bytes  ~7 decimal digits            0.0f
//  double    8 bytes  ~15-16 decimal digits        0.0d
//  boolean   ~1 bit   true / false                 false
//  char      2 bytes  0 to 65,535 (Unicode)        '\u0000'
//  String    varies   any text                     null
//
// ============================================================
//  TYPE CASTING (Conversion)
// ============================================================
//
//  1. Widening (Automatic) — chhota → bada (no data loss)
//     byte → short → int → long → float → double
//     int x = 10;
//     double d = x;  // automatic, koi error nahi
//
//  2. Narrowing (Manual) — bada → chhota (data loss possible)
//     double → float → long → int → short → byte
//     double d = 9.99;
//     int x = (int) d;  // x = 9 (decimal part cut ho jaata hai!)
//
// ============================================================
//  COMMON MISTAKES
// ============================================================
//
//  ❌ long l = 9999999999;       // Error! 'L' suffix missing
//  ✅ long l = 9999999999L;
//
//  ❌ float f = 3.14;            // Error! treated as double
//  ✅ float f = 3.14f;
//
//  ❌ char c = "a";              // Error! double quotes → String
//  ✅ char c = 'a';
//
//  ❌ boolean b = 1;             // Error! Java mein 1/0 nahi chalega
//  ✅ boolean b = true;
//
// ============================================================