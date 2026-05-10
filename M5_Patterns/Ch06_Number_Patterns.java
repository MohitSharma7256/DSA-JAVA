public class Ch06_Number_Patterns {
    public static void main(String[] args) {
        int n = 5;

        /*
         * ==========================================
         * 1. FLOYD'S TRIANGLE
         * ==========================================
         * Keep a continuous counter that increments 
         * regardless of the row or column loop.
         */
        System.out.println("--- 1. Floyd's Triangle ---");
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

        /*
         * ==========================================
         * 2. 0-1 TRIANGLE
         * ==========================================
         * Logic: The matrix cell (i, j) prints '1' if 
         * (i + j) is EVEN, else it prints '0'.
         * 
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */
        System.out.println("\n--- 2. 0-1 Triangle ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
