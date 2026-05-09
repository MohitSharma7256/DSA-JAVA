import java.util.*;

// ============================================================
//  PROBLEM 1 — Area of a Circle
//  DSA Practice | Beginner Level
// ============================================================
//
//  FORMULA:
//  ─────────────────────────────────────────────────────────
//  Area = π × r²
//
//  Jahan:
//    π (pi) = 3.14159...  (Math.PI use karo — Java mein built-in hai)
//    r      = radius of circle
//
//  EXAMPLE:
//    radius = 7
//    area   = 3.14159 × 7 × 7
//           = 3.14159 × 49
//           = 153.938...
//
// ============================================================

public class Ch09_Practice_Geometry {

    public static void main(String[] args) {

        // ── METHOD 1: Hardcoded radius ────────────────────────
        // Jab radius pehle se pata ho

        double radius = 7.0;

        // Math.PI → Java ka built-in pi constant = 3.141592653589793
        // Math.pow(radius, 2) → radius² (radius × radius)
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("=== Method 1: Hardcoded ===");
        System.out.println("Radius : " + radius);
        System.out.printf("Area   : %.2f%n", area);   // %.2f → 2 decimal places


        // ── METHOD 2: User se radius input lena ───────────────
        // Jab user apna radius type kare

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Method 2: User Input ===");
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double userArea = Math.PI * r * r;   // r² = r × r (same as Math.pow)

        System.out.println("Radius : " + r);
        System.out.printf("Area   : %.2f%n", userArea);

        // ── Bonus: Circumference bhi nikaal lo ─────────────────
        // Circumference = 2 × π × r
        double circumference = 2 * Math.PI * r;
        System.out.printf("Circumference: %.2f%n", circumference);

        sc.close();
    }
}

// ============================================================
//  CONCEPT BREAKDOWN
// ============================================================
//
//  1. WHY double and not int?
//     π = 3.14159... → decimal number hai
//     Area bhi decimal mein aayega
//     → isliye double use karte hain (float se zyada accurate)
//
//  2. Math.PI vs 3.14:
//     ❌ double area = 3.14 * r * r;       → imprecise (rough value)
//     ✅ double area = Math.PI * r * r;    → accurate  (full precision)
//
//     Math.PI = 3.141592653589793  ← Java ka built-in constant
//
//  3. r² kaise likhte hain Java mein:
//     Option A: r * r               → simple, recommended
//     Option B: Math.pow(r, 2)      → r^2 kisi bhi power ke liye
//
//     Math.pow(base, exponent):
//       Math.pow(2, 3) = 8.0   (2³)
//       Math.pow(5, 2) = 25.0  (5²)
//
//  4. printf se formatting:
//     System.out.printf("Area: %.2f%n", area);
//       %.2f → float/double ko 2 decimal places tak round karo
//       %n   → newline (platform-safe)
//
//     Examples:
//       %.0f → no decimal  → 154
//       %.2f → 2 decimals  → 153.94
//       %.4f → 4 decimals  → 153.9380
//
// ============================================================
//  FORMULAS REFERENCE (Circle)
// ============================================================
//
//  Area          = π × r²          → Math.PI * r * r
//  Circumference = 2 × π × r       → 2 * Math.PI * r
//  Diameter      = 2 × r           → 2 * r
//
//  Given diameter (d) instead of radius:
//    r = d / 2
//    Area = π × (d/2)²
//
// ============================================================
//  MATH CLASS — Useful Methods
// ============================================================
//
//  Math.PI          → 3.141592653589793
//  Math.pow(x, n)   → x^n  (x ki n power)
//  Math.sqrt(x)     → √x   (square root)
//  Math.abs(x)      → |x|  (absolute value, negative → positive)
//  Math.max(a, b)   → bada wala return karta hai
//  Math.min(a, b)   → chhota wala return karta hai
//  Math.round(x)    → nearest integer pe round off
//  Math.floor(x)    → neeche round  (3.9 → 3.0)
//  Math.ceil(x)     → upar round   (3.1 → 4.0)
//
// ============================================================
