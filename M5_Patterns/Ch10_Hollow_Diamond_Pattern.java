public class Ch10_Hollow_Diamond_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * HOLLOW DIAMOND - DEEP MATHEMATICAL EXPLANATION
         * ==========================================
         * 
         * A hollow diamond is a solid diamond where we ONLY print the boundary stars.
         * This means inside the "Stars" loop, we need an IF-ELSE condition.
         * 
         * Recall the Solid Diamond Logic for Row `i`:
         * - Outer Spaces = `n - i`
         * - Total Columns in the Star Block = `(2 * i) - 1`
         * 
         * DERIVING THE HOLLOW BOUNDARY LOGIC:
         * We loop `j` from 1 to `(2*i)-1`. This represents the width of the triangle at row `i`.
         * We only want a star at the VERY BEGINNING of this width, and the VERY END.
         * 
         * Example for Row 3 (i=3):
         * Total columns = 2(3) - 1 = 5 columns.
         * Columns: [1] [2] [3] [4] [5]
         * We want a star at j=1, and j=5.
         * Everything else (j=2, 3, 4) should be a space.
         * 
         * Formula: 
         * if (j == 1 OR j == (2 * i) - 1) -> Print "*"
         * else -> Print " "
         */

        int n = 5;
        System.out.println("--- Hollow Diamond ---");

        // 1. UPPER HALF
        for (int i = 1; i <= n; i++) {
            // Print Outer Spaces: n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print Boundary Stars and Inner Spaces
            int totalCols = (2 * i) - 1;
            for (int j = 1; j <= totalCols; j++) {
                // Check if we are at the first column OR the last column of this block
                if (j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 2. LOWER HALF
        // We start from n-1 so the middle row (the widest part) is not printed twice!
        for (int i = n - 1; i >= 1; i--) {
            // Print Outer Spaces: n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print Boundary Stars and Inner Spaces
            int totalCols = (2 * i) - 1;
            for (int j = 1; j <= totalCols; j++) {
                if (j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
