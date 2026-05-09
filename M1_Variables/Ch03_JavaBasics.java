// ============================================================
//  JAVA BASICS — Variables, Operators, Output
//  DSA Notes | Beginner Level
// ============================================================
//
//  Java Program ki basic structure:
//
//  public class Ch03_JavaBasics {           ← class ka naam = file ka naam
//      public static void main(String[] args) {   ← entry point
//          // code yahan likhte hain
//      }
//  }
//
// ============================================================

public class Ch03_JavaBasics {

    public static void main(String[] args) {

        // ── 1. VARIABLES ──────────────────────────────────────
        // Variable = naam deke value store karna
        // Syntax: datatype variableName = value;

        int a = 10;
        int b = 20;

        // ── 2. ARITHMETIC OPERATORS ───────────────────────────
        int sum        = a + b;   // Addition       → 30
        int diff       = a - b;   // Subtraction    → -10
        int product    = a * b;   // Multiplication → 200
        int quotient   = b / a;   // Division       → 2
        int remainder  = b % a;   // Modulus        → 0  (20 % 10)

        System.out.println("Sum        : " + sum);
        System.out.println("Difference : " + diff);
        System.out.println("Product    : " + product);
        System.out.println("Quotient   : " + quotient);
        System.out.println("Remainder  : " + remainder);

        // ── 3. STRING CONCATENATION ───────────────────────────
        // + operator strings ko jodta hai
        String firstName = "Mohit";
        String lastName  = "Sharma";
        String fullName  = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // ── 4. System.out.println vs print vs printf ──────────
        System.out.println("println → line break aata hai end mein");
        System.out.print("print → ");
        System.out.print("no line break\n");          // \n manually dena padta hai
        System.out.printf("printf → formatted: %d + %d = %d%n", a, b, sum);

        // ── 5. INCREMENT / DECREMENT ──────────────────────────
        int x = 5;
        x++;   // x = x + 1 → 6   (post-increment)
        System.out.println("After x++: " + x);   // 6

        x--;   // x = x - 1 → 5   (post-decrement)
        System.out.println("After x--: " + x);   // 5

        // Pre vs Post increment difference:
        int y = 5;
        System.out.println("y++: " + y++);   // prints 5, THEN increments → y=6
        System.out.println("++y: " + ++y);   // increments FIRST → y=7, prints 7

        // ── 6. COMPOUND ASSIGNMENT ────────────────────────────
        int n = 10;
        n += 5;   // n = n + 5  → 15
        n -= 3;   // n = n - 3  → 12
        n *= 2;   // n = n * 2  → 24
        n /= 4;   // n = n / 4  → 6
        n %= 4;   // n = n % 4  → 2
        System.out.println("After compound ops: " + n);
    }
}

// ============================================================
//  OPERATORS QUICK REFERENCE
// ============================================================
//
//  ARITHMETIC:           ASSIGNMENT:         COMPARISON:
//  +  Addition           =   assign          ==  equal to
//  -  Subtraction        +=  add & assign    !=  not equal
//  *  Multiplication     -=  sub & assign    >   greater than
//  /  Division           *=  mul & assign    <   less than
//  %  Modulus            /=  div & assign    >=  >=
//     (remainder)        %=  mod & assign    <=  <=
//
//  LOGICAL:              INCREMENT:
//  &&  AND               ++  increment by 1
//  ||  OR                --  decrement by 1
//  !   NOT
//
// ============================================================
//  OUTPUT METHODS COMPARISON
// ============================================================
//
//  println("text")   → text print karta hai + newline
//  print("text")     → text print karta hai, NO newline
//  printf("%d", n)   → formatted output (C-style)
//
//  printf FORMAT SPECIFIERS:
//  %d  → int / long
//  %f  → float / double
//  %s  → String
//  %c  → char
//  %b  → boolean
//  %n  → newline (cross-platform)
//  %.2f → 2 decimal places: printf("%.2f", 3.14159) → "3.14"
//
// ============================================================
//  VARIABLE NAMING RULES (Java)
// ============================================================
//
//  ✅ camelCase use karo  → myVariableName
//  ✅ letter ya _ se shuru  → _count, firstName
//  ✅ Meaningful names  → age, totalMarks, studentName
//
//  ❌ number se shuru mat karo  → 1name (error!)
//  ❌ spaces nahi  → my name (error!)
//  ❌ reserved words mat use karo  → int, class, void, etc.
//
//  CONSTANTS: ALL_CAPS with underscore
//  final int MAX_SIZE = 100;
//
// ============================================================
