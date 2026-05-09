import java.util.*;

// ============================================================
//  CH-02: ELSE-IF LADDER
//  DSA Module 3: Conditionals | Programming Logic
// ============================================================
//
//  Jab humare paas 2 se zyada raste (options) hon, 
//  toh hum else-if ladder ka use karte hain.
//
// ============================================================

public class Ch02_Else_If_Ladder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();

        // ── Else-If Ladder ──────────────────────────────────
        if (marks >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } 
        else if (marks >= 80) {
            System.out.println("Grade: A (Very Good)");
        } 
        else if (marks >= 70) {
            System.out.println("Grade: B (Good)");
        } 
        else if (marks >= 33) {
            System.out.println("Grade: C (Pass)");
        } 
        else {
            System.out.println("Grade: F (Fail)");
        }

        // ════════════════════════════════════════════════════
        //  DSA TIP:
        // ════════════════════════════════════════════════════
        //  Ladder mein Java pehli TRUE condition par ruk jata hai. 
        //  Isse "short-circuiting" ki wajah se performance 
        //  behtar hoti hai compared to multiple separate IFs.
        // ════════════════════════════════════════════════════
    }
}
