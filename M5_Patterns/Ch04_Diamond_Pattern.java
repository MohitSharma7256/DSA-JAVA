public class Ch04_Diamond_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * DIAMOND PATTERN - DEEP MATHEMATICAL EXPLANATION
         * ==========================================
         * 
         * A diamond is formed by combining an UPWARD Pyramid and a DOWNWARD Pyramid.
         * Assume n = 4 (half the height).
         * 
         * UPPER HALF (Rows 1 to 4):
         * Row (i) | Spaces | Stars | Formula Derivation
         * ------------------------------------------------
         * i = 1   |   3    |   1   | Spaces: 4-1 = 3. Stars: 2(1)-1 = 1
         * i = 2   |   2    |   3   | Spaces: 4-2 = 2. Stars: 2(2)-1 = 3
         * i = 3   |   1    |   5   | Spaces: 4-3 = 1. Stars: 2(3)-1 = 5
         * i = 4   |   0    |   7   | Spaces: 4-4 = 0. Stars: 2(4)-1 = 7
         * 
         * DERIVATION OF THE FORMULA:
         * 1. Spaces: The number of spaces is decreasing by 1 each row. 
         *    Since n=4 and row 1 has 3 spaces, the math is exactly `(n - i)`.
         * 2. Stars: The number of stars follows the sequence of odd numbers: 1, 3, 5, 7.
         *    In mathematics, the sequence of odd numbers is defined by `(2 * i) - 1`.
         * 
         * LOWER HALF:
         * It is the exact mirror of the upper half. We don't need to change the math formulas.
         * We simply run the outer loop in REVERSE! (from i = n down to 1).
         */

        int n = 4; 
        System.out.println("--- Diamond Pattern ---");

        // 1. UPPER HALF
        for (int i = 1; i <= n; i++) {
            // STEP 1: Print spaces using derived formula (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // STEP 2: Print stars using derived odd number formula (2*i - 1)
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // STEP 3: Move to next line
            System.out.println();
        }

        // 2. LOWER HALF
        // To prevent doubling the middle row, some interviews ask you to start at n-1.
        // We will start at n to make a perfectly symmetric split diamond.
        for (int i = n; i >= 1; i--) {
            // STEP 1: Same space formula (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // STEP 2: Same star formula (2*i - 1)
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
