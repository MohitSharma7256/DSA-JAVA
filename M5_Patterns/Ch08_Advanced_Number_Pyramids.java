public class Ch08_Advanced_Number_Pyramids {
    public static void main(String[] args) {
        int n = 5;

        /*
         * ==========================================
         * 1. NUMBER PYRAMID
         * ==========================================
         *    1 
         *   2 2 
         *  3 3 3 
         * 4 4 4 4 
         * Spaces = n - i
         * Numbers printed = i times (the number printed is 'i' itself)
         */
        System.out.println("--- 1. Number Pyramid ---");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Numbers + Space
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * ==========================================
         * 2. PALINDROMIC NUMBER PATTERN
         * ==========================================
         *         1
         *       2 1 2
         *     3 2 1 2 3
         *   4 3 2 1 2 3 4
         * 
         * Spaces: n - i
         * Descending part: from i down to 1
         * Ascending part: from 2 up to i
         */
        System.out.println("\n--- 2. Palindromic Number Pattern ---");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // double space for better alignment
            }
            // Descending half (left)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Ascending half (right)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
