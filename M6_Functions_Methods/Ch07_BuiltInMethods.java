public class Ch07_BuiltInMethods {
    public static void main(String[] args) {
        /*
         * ==========================================
         * BUILT-IN METHODS (Math Class)
         * ==========================================
         * Java provides thousands of pre-written methods.
         * The `Math` class is the most commonly used for DSA.
         */

        System.out.println("--- Math Class Examples ---");
        
        int a = 10;
        int b = 25;
        
        // 1. Maximum of two numbers
        System.out.println("Max of 10 and 25: " + Math.max(a, b));
        
        // 2. Minimum of two numbers
        System.out.println("Min of 10 and 25: " + Math.min(a, b));
        
        // 3. Power (Returns a double)
        System.out.println("2 to the power 3: " + Math.pow(2, 3));
        
        // 4. Square Root (Returns a double)
        System.out.println("Square root of 25: " + Math.sqrt(b));
        
        // 5. Absolute Value (Converts negative to positive)
        System.out.println("Absolute of -50: " + Math.abs(-50));
        
        // 6. Random Number (Generates a double between 0.0 and 1.0)
        System.out.println("Random number: " + Math.random());
    }
}
