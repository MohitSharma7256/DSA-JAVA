import java.util.*;

// ╔══════════════════════════════════════════════════════════════╗
//  JAVA — Type Conversion & Type Casting (MASTER NOTES)
//  DSA Notes | Beginner Level
// ╚══════════════════════════════════════════════════════════════╝
//
//  DEFINITION:
//  → Ek data type ki value ko kisi doosre data type mein badalna
//
//  ┌─────────────────────────────────────────────────────────┐
//  │  TYPE           │ Direction      │ Java kaise karta hai │
//  ├─────────────────┼────────────────┼──────────────────────┤
//  │ Type Conversion │ Chhota → Bada  │ Automatic (Implicit) │
//  │ Type Casting    │ Bada → Chhota  │ Manual    (Explicit) │
//  └─────────────────────────────────────────────────────────┘
//
//  SIZE HIERARCHY (Widening/Conversion direction →):
//
//  byte → short → int → long → float → double
//   1B     2B     4B    8B     4B       8B
//
//  ⬆ Is direction mein: AUTOMATIC, NO DATA LOSS
//  ⬇ Ulta direction mein: MANUAL CAST chahiye, DATA LOSS possible
//
// ══════════════════════════════════════════════════════════════

public class Ch06_TypeConversion {

    public static void main(String[] args) {

        // ════════════════════════════════════════════════════════
        //  PART 1 — TYPE CONVERSION (Implicit / Widening)
        // ════════════════════════════════════════════════════════
        //
        //  KYA HOTA HAI?
        //  → Java automatically chhote type ko bade type mein convert
        //    kar deta hai — programmer ko kuch likhna nahi padta
        //
        //  KYU HOTA HAI?
        //  → Bada type mein zyada space hota hai, isliye chhoti value
        //    fit ho jaati hai bina koi data khoye
        //    Example: int (4 bytes) → long (8 bytes): plenty of space
        //
        //  ADVANTAGES:
        //  ✅ Automatic — koi extra code nahi likhna
        //  ✅ Safe — data loss kabhi nahi hota
        //  ✅ Clean code — casting syntax ki zaroorat nahi
        //
        //  DISADVANTAGE:
        //  ⚠️ Ek special case: int/long → float/double mein
        //     precision thodi kam ho sakti hai (very large numbers)
        //     Example: long l = 123456789012345L;
        //              float f = l;   → approximate value ho sakti hai

        System.out.println("===== PART 1: TYPE CONVERSION (Widening) =====");

        byte  b  = 10;
        short s  = b;        // byte  → short   auto ✅
        int   i  = s;        // short → int     auto ✅
        long  l  = i;        // int   → long    auto ✅
        float f  = l;        // long  → float   auto ✅
        double d = f;        // float → double  auto ✅

        System.out.println("byte   : " + b);
        System.out.println("short  : " + s);
        System.out.println("int    : " + i);
        System.out.println("long   : " + l);
        System.out.println("float  : " + f);
        System.out.println("double : " + d);

        // char → int bhi automatic hai (ASCII value milti hai)
        char ch1 = 'A';
        int charToInt = ch1;   // auto: 'A' = 65
        System.out.println("char 'A' → int (auto): " + charToInt);


        // ════════════════════════════════════════════════════════
        //  PART 2 — TYPE CASTING (Explicit / Narrowing)
        // ════════════════════════════════════════════════════════
        //
        //  KYA HOTA HAI?
        //  → Programmer manually batata hai ki "yaar is bade type ko
        //    is chhote type mein daaldo"
        //  → Syntax: (targetDataType) value
        //
        //  KYU KARNA PADTA HAI?
        //  → Java safe hai — wo khud chhote box mein badi value
        //    NAHI daalta, kyunki data kho sakta hai
        //  → Isliye Java kehta hai: "Tu khud bol ki tune socha hai"
        //
        //  ADVANTAGES:
        //  ✅ Control deta hai programmer ko
        //  ✅ Memory save (chhota type use kar sakte ho)
        //  ✅ DSA mein char/int conversions ke liye zaroori
        //
        //  DISADVANTAGES:
        //  ⚠️ Data loss ho sakta hai (decimal cut, overflow)
        //  ⚠️ Galat use karo toh wrong results milenge
        //  ⚠️ Tumhari zimmedari hai — Java check nahi karta

        System.out.println("\n===== PART 2: TYPE CASTING (Narrowing) =====");

        // double → int : decimal part KATT JAATA HAI (round nahi hota!)
        double d2 = 9.99;
        int i2 = (int) d2;
        System.out.println("double 9.99 → int    : " + i2);   // 9, NOT 10

        double d3 = -4.7;
        int i3 = (int) d3;
        System.out.println("double -4.7 → int    : " + i3);   // -4, NOT -5

        // long → int : overflow possible
        long l2 = 1234567890123L;
        int i4 = (int) l2;
        System.out.println("long → int (overflow): " + i4);   // unexpected value

        // int → char : ASCII se character banta hai
        int num = 65;
        char ch2 = (char) num;
        System.out.println("int 65 → char        : " + ch2);  // 'A'

        int num2 = 97;
        char ch3 = (char) num2;
        System.out.println("int 97 → char        : " + ch3);  // 'a'


        // ════════════════════════════════════════════════════════
        //  PART 3 — STRING CONVERSIONS (Special Cases)
        // ════════════════════════════════════════════════════════
        //
        //  String ek class hai — normal casting nahi hoti
        //  Iske liye special methods use karte hain
        //
        //  String → Primitive:  parse methods use karo
        //  Primitive → String:  String.valueOf() ya "" + value

        System.out.println("\n===== PART 3: STRING CONVERSIONS =====");

        // int → String (3 ways)
        int val = 42;
        String way1 = String.valueOf(val);      // ✅ Recommended
        String way2 = Integer.toString(val);    // ✅ Also works
        String way3 = "" + val;                 // ✅ Shortcut trick
        System.out.println("int → String: " + way1);

        // String → int
        String numStr = "123";
        int parsed = Integer.parseInt(numStr);
        System.out.println("String \"123\" → int   : " + parsed);

        // String → double
        String dblStr = "3.14";
        double parsedD = Double.parseDouble(dblStr);
        System.out.println("String \"3.14\" → double: " + parsedD);

        // String → long
        String longStr = "99999999999";
        long parsedL = Long.parseLong(longStr);
        System.out.println("String → long        : " + parsedL);

        // String → boolean
        String boolStr = "true";
        boolean parsedB = Boolean.parseBoolean(boolStr);
        System.out.println("String → boolean     : " + parsedB);


        // ════════════════════════════════════════════════════════
        //  PART 4 — DSA IMPORTANT USE CASES
        // ════════════════════════════════════════════════════════

        System.out.println("\n===== PART 4: DSA USE CASES =====");

        // ── DSA Case 1: Average Calculation Trap ─────────────
        // BAHUT COMMON MISTAKE in DSA problems!
        int p = 5, q = 2;
        double wrongAvg   = p / q;              // ❌ 2.0 (int÷int=int, then widened)
        double correctAvg = (double) p / q;     // ✅ 2.5 (cast pehle, phir divide)
        System.out.println("Wrong avg  : " + wrongAvg);
        System.out.println("Correct avg: " + correctAvg);

        // ── DSA Case 2: char ↔ int (Strings & Arrays problems) ─
        // Bahut zyada use hota hai — String problems, frequency count, etc.
        char letter = 'a';
        char nextLetter = (char)(letter + 1);   // 'a'→'b'
        System.out.println("Next letter: " + nextLetter);

        // Lowercase → Uppercase
        char low = 'g';
        char up  = (char)(low - 32);            // 'g'(103) - 32 = 71 = 'G'
        System.out.println("'g' uppercase: " + up);

        // Uppercase → Lowercase
        char UP2  = 'M';
        char low2 = (char)(UP2 + 32);           // 'M'(77) + 32 = 109 = 'm'
        System.out.println("'M' lowercase: " + low2);

        // ── DSA Case 3: digit char → int ─────────────────────
        // String ke andar numbers process karne ke liye
        char digitChar = '7';
        int  digitInt  = digitChar - '0';       // '7'(55) - '0'(48) = 7
        System.out.println("char '7' → int: " + digitInt);

        // ── DSA Case 4: Index calculation with char ───────────
        // Frequency array mein index find karna
        char c = 'e';
        int index = c - 'a';    // 'e'(101) - 'a'(97) = 4 → index 4
        System.out.println("'e' ka index: " + index);

        // Usage: int[] freq = new int[26];
        //        freq[c - 'a']++;   ← 'e' ki frequency increment

        // ── DSA Case 5: int → char (Build string from numbers) ─
        int digitValue = 5;
        char digitBackToChar = (char)(digitValue + '0');  // 5 + 48 = 53 = '5'
        System.out.println("int 5 → char: " + digitBackToChar);
    }
}

// ══════════════════════════════════════════════════════════════
//  DIFFERENCE: TYPE CONVERSION vs TYPE CASTING
// ══════════════════════════════════════════════════════════════
//
//  Feature           Type Conversion (Widening)   Type Casting (Narrowing)
//  ─────────────────────────────────────────────────────────────────────
//  Direction         Chhota → Bada                Bada → Chhota
//  How               Automatic (Java karta hai)   Manual (tum likhte ho)
//  Syntax            int x = myByte;              int x = (int) myDouble;
//  Data Loss         NEVER                        HO SAKTA HAI
//  Safety            100% Safe                    Programmer ki zimmedari
//  Example           byte→int, int→double         double→int, long→int
//
// ══════════════════════════════════════════════════════════════
//  WHY USE TYPE CASTING IN DSA?
// ══════════════════════════════════════════════════════════════
//
//  1. AVERAGE / DIVISION:
//     int a = 7, b = 2;
//     double avg = (double)a / b;  → 3.5  (correct!)
//
//  2. CHAR ↔ INT TRICKS:
//     - Frequency array: freq[ch - 'a']++
//     - Case conversion: (char)(ch ± 32)
//     - Digit extraction: ch - '0'
//
//  3. LARGE NUMBER PROBLEMS:
//     long result = (long)a * b;  // int*int overflow rok do
//
//  4. BINARY / BITWISE:
//     byte b = (byte)(someInt & 0xFF);
//
//  5. STRING TO NUMBER (Competitive Programming input):
//     int n = Integer.parseInt(sc.nextLine());
//
// ══════════════════════════════════════════════════════════════
//  WIDENING CONVERSION — Full Table
// ══════════════════════════════════════════════════════════════
//
//  FROM    →  TO (all automatic)
//  byte    →  short, int, long, float, double
//  short   →  int, long, float, double
//  int     →  long, float, double
//  long    →  float, double
//  float   →  double
//  char    →  int, long, float, double  (ASCII value use hoti hai)
//
// ══════════════════════════════════════════════════════════════
//  NARROWING CASTING — Full Table
// ══════════════════════════════════════════════════════════════
//
//  FROM    →  TO (manual cast needed)     Risk
//  double  →  float                       precision loss
//  double  →  long, int, short, byte      decimal cut + overflow
//  float   →  long, int, short, byte      decimal cut + overflow
//  long    →  int, short, byte            overflow
//  int     →  short, byte                 overflow
//  int     →  char                        ASCII to character
//
// ══════════════════════════════════════════════════════════════
//  STRING CONVERSION — Parse Methods Reference
// ══════════════════════════════════════════════════════════════
//
//  String → Type:
//  Integer.parseInt("10")         → 10      (int)
//  Long.parseLong("9999999999")   → long
//  Double.parseDouble("3.14")     → 3.14    (double)
//  Float.parseFloat("1.5f")       → 1.5     (float)
//  Boolean.parseBoolean("true")   → true    (boolean)
//
//  Type → String:
//  String.valueOf(42)             → "42"    ✅ Recommended
//  Integer.toString(42)           → "42"
//  "" + 42                        → "42"    (shortcut)
//
// ══════════════════════════════════════════════════════════════
//  COMMON MISTAKES TO AVOID
// ══════════════════════════════════════════════════════════════
//
//  ❌ double d = 9.99;  int i = d;        // Error: manual cast chahiye
//  ✅ double d = 9.99;  int i = (int)d;   // i = 9
//
//  ❌ int a=5, b=2;  double avg = a/b;    // avg = 2.0 (WRONG!)
//  ✅ double avg = (double)a / b;          // avg = 2.5
//
//  ❌ char c = 65;                         // Error: int→char cast chahiye
//  ✅ char c = (char)65;                   // c = 'A'
//
//  ❌ long l = 999L;  int i = l;           // Error: manual cast
//  ✅ int i = (int)l;                      // possible overflow!
//
//  ❌ (int)(double)a / b                   // wrong bracket order
//  ✅ (double)a / b                        // cast pehle, divide baad mein
//
// ══════════════════════════════════════════════════════════════
//  ASCII QUICK REFERENCE (DSA mein zaroori — yaad rakho!)
// ══════════════════════════════════════════════════════════════
//
//  'A' = 65   'B' = 66  ...  'Z' = 90
//  'a' = 97   'b' = 98  ...  'z' = 122
//  '0' = 48   '1' = 49  ...  '9' = 57
//
//  TRICKS:
//  lower → upper      :  (char)(ch - 32)    'a'→'A'
//  upper → lower      :  (char)(ch + 32)    'A'→'a'
//  digit char → int   :  ch - '0'           '5'→5
//  int → digit char   :  (char)(n + '0')    5→'5'
//  char → a-z index   :  ch - 'a'           'e'→4
//  char → A-Z index   :  ch - 'A'           'C'→2
//
// ══════════════════════════════════════════════════════════════
