import java.util.*;

// ============================================================
//  CH-03: FIND LARGEST OF 3 NUMBERS
//  DSA Module 3: Conditionals | Logic Building
// ============================================================

public class Ch03_Largest_of_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // ── Method 1: Nested If-Else ────────────────────────
        if (a >= b && a >= c) {
            System.out.println("Largest is: " + a);
        } 
        else if (b >= c) {
            System.out.println("Largest is: " + b);
        } 
        else {
            System.out.println("Largest is: " + c);
        }

        // ════════════════════════════════════════════════════
        //  PSEUDO CODE:
        // ════════════════════════════════════════════════════
        //  1. Start
        //  2. Input a, b, c
        //  3. If (a >= b) AND (a >= c) -> Largest is a
        //  4. Else If (b >= c) -> Largest is b
        //  5. Else -> Largest is c
        //  6. End
        // ════════════════════════════════════════════════════
    }
}
