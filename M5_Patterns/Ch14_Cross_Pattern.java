public class Ch14_Cross_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * CROSS (X) PATTERN - DEEP MATHEMATICAL EXPLANATION
         * ==========================================
         * 
         * To understand the Cross Pattern, you MUST visualize the console as a 2D Matrix grid
         * where `i` is the row index and `j` is the column index.
         * 
         * Let's map a 5x5 grid (n = 5):
         *   (1,1) (1,2) (1,3) (1,4) (1,5)
         *   (2,1) (2,2) (2,3) (2,4) (2,5)
         *   (3,1) (3,2) (3,3) (3,4) (3,5)
         *   (4,1) (4,2) (4,3) (4,4) (4,5)
         *   (5,1) (5,2) (5,3) (5,4) (5,5)
         * 
         * DERIVATION OF THE DIAGONAL FORMULAS:
         * 1. Primary Diagonal (Top-Left to Bottom-Right):
         *    Look at the coordinates: (1,1), (2,2), (3,3), (4,4), (5,5).
         *    What is the mathematical relationship?
         *    Row index is always equal to Column index! 
         *    FORMULA 1: `i == j`
         * 
         * 2. Secondary Diagonal (Top-Right to Bottom-Left):
         *    Look at the coordinates: (1,5), (2,4), (3,3), (4,2), (5,1).
         *    What is the mathematical relationship? 
         *    If you add them together: 1+5=6, 2+4=6, 3+3=6, 4+2=6, 5+1=6.
         *    The sum is always 6. Since n=5, the sum is always `n + 1`.
         *    FORMULA 2: `i + j == n + 1`
         * 
         * Therefore, we print a star IF `i == j` OR `i + j == n + 1`.
         */

        int n = 9; // Odd numbers work best for a perfect center intersection
        System.out.println("--- Cross (X) Pattern ---");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                // STEP 1: Apply the derived diagonal formulas
                if (i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
