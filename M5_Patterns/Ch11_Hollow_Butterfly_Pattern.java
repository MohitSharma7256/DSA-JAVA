public class Ch11_Hollow_Butterfly_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * HOLLOW BUTTERFLY - DEEP MATHEMATICAL EXPLANATION
         * ==========================================
         * 
         * This is a brutal FAANG screening pattern. It combines the Hollow Logic 
         * with the Butterfly Space Logic.
         * 
         * Recall Solid Butterfly logic for Row `i`:
         * 1. Left Stars (loop j from 1 to i)
         * 2. Middle Spaces (loop j from 1 to 2*(n-i))
         * 3. Right Stars (loop j from 1 to i)
         * 
         * DERIVING THE HOLLOW BOUNDARY LOGIC:
         * Instead of solid left stars, we only want the boundaries.
         * The Left block has `i` columns. We print a star IF:
         *   - `j == 1` (The absolute left edge)
         *   - `j == i` (The inner diagonal edge of the wing)
         * Everything else in the left block is a space.
         * 
         * The exact same logic applies to the Right Wing block.
         * 
         * Row 3 Breakdown (i=3, n=4):
         * - Left Block: j=1 to 3. Star at j=1, j=3. Space at j=2.
         * - Middle Spaces: 2*(4-3) = 2 spaces.
         * - Right Block: j=1 to 3. Star at j=1, j=3. Space at j=2.
         * Result: `* *  * *`
         */

        int n = 5;
        System.out.println("--- Hollow Butterfly ---");

        // 1. UPPER HALF
        for (int i = 1; i <= n; i++) {
            
            // STEP 1: Left Hollow Wing
            for (int j = 1; j <= i; j++) {
                // Star at boundary (1 or i), else space
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // STEP 2: Middle Spaces using formula 2*(n-i)
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // STEP 3: Right Hollow Wing
            for (int j = 1; j <= i; j++) {
                // Star at boundary (1 or i), else space
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 2. LOWER HALF
        // Reverse the outer loop
        for (int i = n; i >= 1; i--) {
            
            // STEP 1: Left Hollow Wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // STEP 2: Middle Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // STEP 3: Right Hollow Wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
