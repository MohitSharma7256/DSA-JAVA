public class Ch04_Scope_And_Shadowing {

    // Class level variable (Static)
    static int x = 90; // This is globally available to all methods

    public static void main(String[] args) {
        /*
         * ==========================================
         * METHOD SCOPE & BLOCK SCOPE
         * ==========================================
         */
        
        int a = 10; // 'a' is method-scoped (exists everywhere inside main)
        
        { // Block starts here
            int b = 20; // 'b' is block-scoped (exists only inside these brackets)
            System.out.println("Inside Block: a = " + a + ", b = " + b);
            
            // You can modify method-scoped variables inside a block
            a = 15; 
        } // Block ends here
        
        System.out.println("Outside Block: a = " + a);
        // System.out.println(b); // ERROR: 'b' cannot be resolved. It was destroyed!

        /*
         * ==========================================
         * VARIABLE SHADOWING
         * ==========================================
         * If a local variable has the SAME NAME as a global (class-level) variable, 
         * the local variable HIDES (shadows) the global variable.
         */
        System.out.println("\n--- Variable Shadowing ---");
        System.out.println("Global x before shadowing: " + x); // 90
        
        int x = 40; // This local 'x' shadows the global 'x'
        System.out.println("Local x after declaration: " + x); // 40
        
        printGlobalX();
    }
    
    public static void printGlobalX() {
        // This method does not have its own 'x', so it looks for the global one.
        System.out.println("Inside printGlobalX method: " + x); // 90
    }
}
