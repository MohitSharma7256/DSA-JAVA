public class Ch03_Full_Pyramids {
    public static void main(String[] args) {
        int n = 5;

        /*
         * ==========================================
         * 1. FULL PYRAMID (Equilateral Triangle)
         * ==========================================
         * Row 1: 4 spaces, 1 star  -> Spaces: n-i
         * Row 2: 3 spaces, 3 stars -> Stars: (2*i)-1
         * Row 3: 2 spaces, 5 stars
         */
        System.out.println("--- 1. Full Pyramid ---");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars (2*i - 1) gives odd sequence: 1, 3, 5, 7...
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * ==========================================
         * 2. INVERTED FULL PYRAMID
         * ==========================================
         * Same logic as above, but reverse the outer loop.
         */
        System.out.println("\n--- 2. Inverted Full Pyramid ---");
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
