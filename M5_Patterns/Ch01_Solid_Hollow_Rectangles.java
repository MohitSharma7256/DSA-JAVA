public class Ch01_Solid_Hollow_Rectangles {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. SOLID RECTANGLE
         * ==========================================
         * A basic nested loop. 
         * Outer loop -> Controls Rows (i)
         * Inner loop -> Controls Columns (j)
         */
        System.out.println("--- 1. Solid Rectangle ---");
        int rows = 4;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }

        /*
         * ==========================================
         * 2. HOLLOW RECTANGLE
         * ==========================================
         * We only print stars on the boundaries.
         * Boundaries are:
         * 1. First Row (i == 1)
         * 2. Last Row (i == rows)
         * 3. First Column (j == 1)
         * 4. Last Column (j == cols)
         */
        System.out.println("\n--- 2. Hollow Rectangle ---");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for inner cells
                }
            }
            System.out.println();
        }
    }
}
