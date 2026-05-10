public class Ch12_Loop_Scope {
    public static void main(String[] args) {
        /*
         * ==========================================
         * LOOP VARIABLE SCOPE
         * ==========================================
         * Scope means "where is the variable visible and usable?".
         */

        System.out.println("--- Variable declared INSIDE the loop ---");
        // 'i' is declared inside the loop initialization.
        // It ONLY exists while the loop is running.
        for (int i = 1; i <= 3; i++) {
            System.out.println("Inside loop i: " + i);
        }
        // System.out.println(i); // ERROR: Cannot resolve symbol 'i'

        System.out.println("\n--- Variable declared OUTSIDE the loop ---");
        // 'j' is declared outside. It exists for the entire method.
        int j = 1;
        for (; j <= 3; j++) {
            System.out.println("Inside loop j: " + j);
        }
        System.out.println("Outside loop, j's final value is: " + j); // Prints 4!
        
        /*
         * Note: When a loop ends, the increment/update runs ONE LAST TIME, 
         * which causes the condition to fail. So j became 4, 4 <= 3 is false, 
         * loop exits. But j is still holding the value 4.
         */
    }
}
