public class Ch16_Heart_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * FAANG ADVANCED: HEART PATTERN
         * ==========================================
         * A heart shape is constructed by combining two different mathematical shapes:
         * 1. UPPER PART: Two semi-circles (or two adjoining pyramids/curves).
         * 2. LOWER PART: A perfect Inverted Full Pyramid.
         * 
         * This pattern tests your ability to fuse multiple complex nested loops 
         * seamlessly without breaking alignment.
         */

        int n = 6; // Height parameter for the heart (must be even for symmetry)
        System.out.println("--- Heart Pattern ---");

        // 1. UPPER PART (Two semi-circles)
        // i goes from n/2 to n. It increments by 2 to make the curves smoother.
        for (int i = n / 2; i <= n; i += 2) {
            
            // Left spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            
            // Left curve stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Middle spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Right curve stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        // 2. LOWER PART (Inverted Pyramid)
        // Standard inverted pyramid from row n down to 1
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Stars: (i * 2) - 1
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
