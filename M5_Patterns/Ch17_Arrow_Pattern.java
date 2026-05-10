public class Ch17_Arrow_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * FAANG ADVANCED: ARROW PATTERN
         * ==========================================
         * This pattern forms an arrow pointing to the right.
         * It requires dynamic spacing that matches the row number for the upper half,
         * and inversely matches for the lower half.
         * 
         * *
         *   *
         *     *
         *       *
         *         *
         *       *
         *     *
         *   *
         * *
         * 
         * DERIVATION:
         * - We print Spaces BEFORE the star.
         * - Upper Half Spaces: `i * 2` (or similar multiplier to slope it).
         * - Lower Half Spaces: `(n - i) * 2`.
         */

        int n = 5; // Size of arrow
        System.out.println("--- Right Pointing Arrow ---");

        // UPPER HALF
        for (int i = 0; i < n; i++) {
            // Print Spaces: i times 2
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            // Print Star
            System.out.print("*\n");
        }

        // LOWER HALF
        for (int i = n - 2; i >= 0; i--) {
            // Print Spaces: i times 2
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            // Print Star
            System.out.print("*\n");
        }
    }
}
