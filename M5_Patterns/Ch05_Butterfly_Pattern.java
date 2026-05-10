public class Ch05_Butterfly_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * BUTTERFLY PATTERN - DEEP MATHEMATICAL EXPLANATION
         * ==========================================
         * 
         * A butterfly consists of two wings: Left Stars and Right Stars, separated by Spaces.
         * Assume n = 4 (half the height).
         * 
         * UPPER HALF (Rows 1 to 4):
         * Row (i) | Left Stars | Middle Spaces | Right Stars | Total Columns
         * ------------------------------------------------------------------
         * i = 1   |      1     |       6       |      1      | 1+6+1 = 8 (which is 2*n)
         * i = 2   |      2     |       4       |      2      | 2+4+2 = 8
         * i = 3   |      3     |       2       |      3      | 3+2+3 = 8
         * i = 4   |      4     |       0       |      4      | 4+0+4 = 8
         * 
         * DERIVATION OF THE FORMULA:
         * 1. Left Stars: Exactly equals the row number `i`.
         * 2. Right Stars: Exactly equals the row number `i`.
         * 3. Middle Spaces: 
         *    We know Total Columns = 2 * n. (For n=4, total cols = 8).
         *    Middle Spaces = Total Columns - (Left Stars + Right Stars)
         *    Middle Spaces = (2 * n) - (i + i)
         *    Middle Spaces = (2 * n) - (2 * i)
         *    Middle Spaces = 2 * (n - i)  <--- THIS IS THE MAGIC FORMULA!
         * 
         * LOWER HALF:
         * Exact same formulas, just run the outer loop in reverse (from i = n down to 1).
         */

        int n = 4;
        System.out.println("--- Butterfly Pattern ---");

        // 1. UPPER HALF
        for (int i = 1; i <= n; i++) {
            // STEP 1: Print Left Stars (j goes from 1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // STEP 2: Print Middle Spaces using derived formula 2*(n-i)
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // STEP 3: Print Right Stars (j goes from 1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. LOWER HALF
        // Run outer loop in reverse
        for (int i = n; i >= 1; i--) {
            // STEP 1: Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // STEP 2: Middle Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // STEP 3: Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
