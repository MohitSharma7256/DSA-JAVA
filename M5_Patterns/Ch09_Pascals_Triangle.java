public class Ch09_Pascals_Triangle {
    
    /*
     * ==========================================
     * PASCAL'S TRIANGLE
     * ==========================================
     *     1
     *    1 1
     *   1 2 1
     *  1 3 3 1
     * 1 4 6 4 1
     * 
     * Formula based on Combinations (nCr)
     * value = n! / (r! * (n-r)!)
     * 
     * Here 'i' is the row index, 'j' is the column index.
     * The value at row i, col j is C(i, j)
     */
     
    // Helper method to calculate factorial
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows
        System.out.println("--- Pascal's Triangle ---");

        // Row loops (starts from 0 to n-1)
        for (int i = 0; i < n; i++) {
            
            // Spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Numbers in the row (starts from 0 to i)
            for (int j = 0; j <= i; j++) {
                // value = iCr = i! / (j! * (i-j)!)
                int icr = fact(i) / (fact(j) * fact(i - j));
                System.out.print(icr + " ");
            }
            System.out.println();
        }
    }
}
