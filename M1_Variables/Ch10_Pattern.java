// ============================================================
//  PATTERN — Descending Star Triangle
//  DSA Practice | Beginner Level
// ============================================================
//
//  PROBLEM: Star pattern print karo (Descending Triangle)
//
//  OUTPUT:
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
//
//  NOTE: Yeh manually (hardcoded) print kiya hai
//        Loops seekhne ke baad → isko loops se banana seekhenge
//        for loop version → patterns folder mein hoga
//
// ============================================================

public class Ch10_Pattern {

    public static void main(String[] args) {

        // Manually pattern print kar rahe hain
        // Row 1: 5 stars
        System.out.println("* * * * *");
        // Row 2: 4 stars
        System.out.println("* * * *");
        // Row 3: 3 stars
        System.out.println("* * *");
        // Row 4: 2 stars
        System.out.println("* *");
        // Row 5: 1 star
        System.out.println("*");
    }
}

// ============================================================
//  CONCEPTS USED
// ============================================================
//
//  println → Print with newline at the end
//
//  Pattern logic (when using loops later):
//  Row 1 → 5 stars  (total - 0)
//  Row 2 → 4 stars  (total - 1)
//  Row 3 → 3 stars  (total - 2)
//  Row 4 → 2 stars  (total - 3)
//  Row 5 → 1 star   (total - 4)
//
//  Pattern → har row mein ek star kam hota jaata hai
//
//  Loop version (future):
//  for(int i = 5; i >= 1; i--) {
//      for(int j = 1; j <= i; j++) {
//          System.out.print("* ");
//      }
//      System.out.println();
//  }
//
// ============================================================