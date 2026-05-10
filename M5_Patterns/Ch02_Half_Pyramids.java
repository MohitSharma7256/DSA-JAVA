public class Ch02_Half_Pyramids {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        /*
         * ==========================================
         * 1. HALF PYRAMID
         * ==========================================
         * Row 1: 1 star
         * Row 2: 2 stars
         * Logic: columns <= row number
         */
        System.out.println("--- 1. Half Pyramid ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * ==========================================
         * 2. INVERTED HALF PYRAMID
         * ==========================================
         * Row 1: 4 stars
         * Row 2: 3 stars
         * Logic: loop from n down to 1
         */
        System.out.println("\n--- 2. Inverted Half Pyramid ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * ==========================================
         * 3. INVERTED HALF PYRAMID (Rotated 180 deg)
         * ==========================================
         * We need to print SPACES first, then STARS.
         * Row 1: 3 spaces, 1 star
         * Row 2: 2 spaces, 2 stars
         * Logic: Spaces = n - i, Stars = i
         */
        System.out.println("\n--- 3. Rotated Half Pyramid (Right Aligned) ---");
        for (int i = 1; i <= n; i++) {
            // Print Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * ==========================================
         * 4. HALF PYRAMID WITH NUMBERS
         * ==========================================
         */
        System.out.println("\n--- 4. Half Pyramid with Numbers ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        /*
         * ==========================================
         * 5. INVERTED HALF PYRAMID WITH NUMBERS
         * ==========================================
         */
        System.out.println("\n--- 5. Inverted Half Pyramid with Numbers ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
