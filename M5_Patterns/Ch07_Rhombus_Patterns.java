public class Ch07_Rhombus_Patterns {
    public static void main(String[] args) {
        int n = 5;

        /*
         * ==========================================
         * 1. SOLID RHOMBUS
         * ==========================================
         * A rhombus is basically a square that is shifted to the right.
         * Row 1: (n-1) spaces, then n stars.
         * Row 2: (n-2) spaces, then n stars.
         * 
         * Spaces: n - i
         * Stars: Always n stars
         */
        System.out.println("--- 1. Solid Rhombus ---");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * ==========================================
         * 2. HOLLOW RHOMBUS
         * ==========================================
         * Same logic as Solid Rhombus, but the star loop only prints 
         * boundaries (j=1, j=n, i=1, i=n).
         */
        System.out.println("\n--- 2. Hollow Rhombus ---");
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Boundary Stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
