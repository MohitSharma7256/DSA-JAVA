public class Ch12_Sandglass_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * SANDGLASS PATTERN
         * ==========================================
         * An inverted pyramid followed by an upright pyramid.
         * 
         * * * * * *
         *  * * * *
         *   * * *
         *    * *
         *     *
         *     *
         *    * *
         *   * * *
         *  * * * *
         * * * * * *
         */

        int n = 5;
        System.out.println("--- Sandglass Pattern ---");

        // 1. TOP HALF (Inverted Pyramid)
        for (int i = 0; i <= n - 1; i++) {
            // Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Stars with space
            for (int k = i; k <= n - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // 2. BOTTOM HALF (Upright Pyramid)
        for (int i = n - 1; i >= 0; i--) {
            // Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Stars with space
            for (int k = i; k <= n - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
