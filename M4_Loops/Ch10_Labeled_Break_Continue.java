public class Ch10_Labeled_Break_Continue {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. LABELED BREAK AND CONTINUE
         * ==========================================
         * By default, 'break' and 'continue' only affect the INNERMOST loop.
         * What if you have nested loops and you want to break out of the OUTER loop 
         * from inside the INNER loop? 
         * We use "Labels" (an identifier followed by a colon).
         */

        System.out.println("--- Labeled Break Example ---");
        
        outerLoop: // This is a label
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of OUTER loop at i=" + i + ", j=" + j);
                    break outerLoop; // Terminates the entire outerLoop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        System.out.println("Exited outer loop via labeled break.");

        System.out.println("\n--- Labeled Continue Example ---");
        
        outerLoop2: // Another label
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Skipping OUTER loop iteration at i=" + i + ", j=" + j);
                    continue outerLoop2; // Skips rest of inner loop AND triggers outer loop's updation
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        
        /*
         * Note: Labeled break/continue should be used sparingly as it can make 
         * the code logic harder to trace (spaghetti code). However, it is an 
         * important concept for interviews.
         */
    }
}
