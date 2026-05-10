public class Ch15_Concentric_Square_Pattern {
    public static void main(String[] args) {
        /*
         * ==========================================
         * FAANG ADVANCED: CONCENTRIC SQUARE MATRIX (HackerRank)
         * ==========================================
         * Print the following pattern for n = 4:
         * 4 4 4 4 4 4 4  
         * 4 3 3 3 3 3 4   
         * 4 3 2 2 2 3 4   
         * 4 3 2 1 2 3 4   
         * 4 3 2 2 2 3 4   
         * 4 3 3 3 3 3 4   
         * 4 4 4 4 4 4 4   
         * 
         * DEEP MATHEMATICAL EXPLANATION:
         * This is a grid of size (2n-1) x (2n-1). For n=4, it's 7x7.
         * The value at any coordinate (i, j) depends entirely on its 
         * MINIMUM DISTANCE TO THE BOUNDARIES.
         * 
         * Let's use 0-indexed coordinates for a 7x7 matrix.
         * The boundaries are:
         * - Top Edge: i
         * - Bottom Edge: (size - 1) - i
         * - Left Edge: j
         * - Right Edge: (size - 1) - j
         * 
         * The "distance" of a cell to the nearest edge is the minimum of these 4 values.
         * distance = min( min(i, bottom), min(j, right) )
         * 
         * The value to print is simply: `n - distance`.
         * Example: Center cell is at (3,3). 
         * distance to top=3, bottom=7-1-3=3, left=3, right=7-1-3=3. Minimum is 3.
         * Value printed = 4 - 3 = 1. (Correct!)
         */

        int n = 4;
        int size = 2 * n - 1; // 7

        System.out.println("--- Concentric Square Matrix Pattern ---");

        // Use 0-based indexing for easier math
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                // Calculate distance to all 4 boundaries
                int distTop = i;
                int distBottom = (size - 1) - i;
                int distLeft = j;
                int distRight = (size - 1) - j;
                
                // Find the absolute minimum distance to any boundary
                int minDistI = Math.min(distTop, distBottom);
                int minDistJ = Math.min(distLeft, distRight);
                int minDistance = Math.min(minDistI, minDistJ);
                
                // The value to print is n minus the minimum distance
                System.out.print((n - minDistance) + " ");
            }
            System.out.println();
        }
    }
}
