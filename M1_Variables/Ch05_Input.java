import java.util.*;

// ============================================================
//  JAVA INPUT — Scanner Class (java.util.Scanner)
//  DSA Notes | Beginner Level
// ============================================================

public class Ch05_Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ── 1. String ────────────────────────────────────────
        // next()     → ek word padh ta hai (space pe rok jaata hai)
        // nextLine() → poori line padh ta hai (Enter/newline tak)

        System.out.print("Enter a word (next): ");
        String word = sc.next();               // e.g. "Hello"
        System.out.println("Word: " + word);

        sc.nextLine(); // ⚠️ IMPORTANT: next() ke baad leftover newline
                       //   flush karna zaroori hai, warna nextLine() 
                       //   empty string return kar deta hai!

        System.out.print("Enter full name (nextLine): ");
        String fullName = sc.nextLine();        // e.g. "Mohit Sharma"
        System.out.println("Full Name: " + fullName);

        // ── 2. Integer (int) ─────────────────────────────────
        // Range: -2,147,483,648  to  2,147,483,647
        System.out.print("Enter an int: ");
        int num = sc.nextInt();
        System.out.println("Int: " + num);

        // ── 3. Float ─────────────────────────────────────────
        // Range: ~±3.4 × 10^38  (7 decimal digits precision)
        // Note: float literals mein 'f' suffix lagao: 3.14f
        System.out.print("Enter a float: ");
        float price = sc.nextFloat();
        System.out.println("Float: " + price);

        // ── 4. Double ────────────────────────────────────────
        // Range: ~±1.8 × 10^308  (15–16 decimal digits precision)
        // Float se zyada accurate → prefer double in most cases
        System.out.print("Enter a double: ");
        double db = sc.nextDouble();
        System.out.println("Double: " + db);

        // ── 5. Long ──────────────────────────────────────────
        // Range: -9,223,372,036,854,775,808  to  +9,223,372,...807
        // Bade numbers ke liye jab int overflow kare
        System.out.print("Enter a long: ");
        long ln = sc.nextLong();
        System.out.println("Long: " + ln);

        // ── 6. Short ─────────────────────────────────────────
        // Range: -32,768  to  32,767
        // Memory-efficient, rarely used directly in DSA
        System.out.print("Enter a short: ");
        short st = sc.nextShort();
        System.out.println("Short: " + st);

        // ── 7. Byte ──────────────────────────────────────────
        // Range: -128  to  127
        // Bahut chhoti range, mainly binary/stream data ke liye
        System.out.print("Enter a byte (-128 to 127): ");
        byte bt = sc.nextByte();
        System.out.println("Byte: " + bt);

        // ── 8. Boolean ───────────────────────────────────────
        // Input: "true" ya "false" (case-insensitive)
        // "True", "TRUE", "true" — sab kaam karte hain
        System.out.print("Enter boolean (true/false): ");
        boolean bl = sc.nextBoolean();
        System.out.println("Boolean: " + bl);

        // ── 9. Char ──────────────────────────────────────────
        // ⚠️ Scanner mein nextChar() method EXIST NAHI KARTA!
        // Workaround: next().charAt(0) use karo
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);   // next() se string lo, 
                                          // charAt(0) se first char lo
        System.out.println("Char: " + ch);

        // ── 10. Scanner close karna ──────────────────────────
        // Resource leak avoid karne ke liye close() call karo
        sc.close();
    }
}

// ============================================================
//  QUICK REFERENCE — Scanner Methods
// ============================================================
//
//  Method            Return Type   Notes
//  ─────────────────────────────────────────────────────────
//  sc.next()         String        Space tak padh ta hai
//  sc.nextLine()     String        Poori line padh ta hai
//  sc.nextInt()      int           Integer value
//  sc.nextFloat()    float         Float value (7 digit precision)
//  sc.nextDouble()   double        Double (15-16 digit precision)
//  sc.nextLong()     long          Bade integers ke liye
//  sc.nextShort()    short         -32768 to 32767
//  sc.nextByte()     byte          -128 to 127
//  sc.nextBoolean()  boolean       "true"/"false" input
//  sc.next().charAt(0)  char       ← nextChar() NAHI hota!
//  sc.hasNext()      boolean       Aur input available hai?
//  sc.close()        void          Scanner band karo
//
// ============================================================
//  COMMON MISTAKE — nextLine() after next() / nextInt() etc.
// ============================================================
//
//  sc.nextInt() → sirf number consume karta hai, '\n' nahi.
//  Agar uske baad sc.nextLine() karo → empty string milega!
//
//  FIX: next/nextInt ke baad ek extra sc.nextLine() call karo
//       sirf newline buffer ko flush karne ke liye.
//
//  EXAMPLE:
//    int age = sc.nextInt();
//    sc.nextLine();          // ← flush the leftover '\n'
//    String name = sc.nextLine();  // ← ab sahi kaam karega
//
// ============================================================
//  DIFFERENCE: next() vs nextLine()
// ============================================================
//
//  Input: "Mohit Sharma"
//
//  sc.next()     → "Mohit"         (space pe rok gaya)
//  sc.nextLine() → "Mohit Sharma"  (puri line le li)
//
// ============================================================
//  WHY nextChar() DOESN'T EXIST?
// ============================================================
//
//  Java Scanner char type directly support nahi karta
//  kyunki char internally ek numeric type hai (Unicode).
//  Isliye workaround use karte hain:
//
//    char c = sc.next().charAt(0);
//
// ============================================================