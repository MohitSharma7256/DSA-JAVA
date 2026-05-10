public class Ch03_MethodOverloading {
    
    /*
     * ==========================================
     * METHOD OVERLOADING (Compile-Time Polymorphism)
     * ==========================================
     * Multiple methods can have the SAME NAME as long as the number and/or 
     * type of parameters are DIFFERENT.
     * 
     * Note: Method overloading DOES NOT depend on the return type. 
     * You cannot have two methods with the exact same parameters but different return types.
     */

    // Method 1: Adds two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method 2: Adds THREE integers (Different number of parameters)
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two DOUBLES (Different parameter data types)
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 ints (10, 20): " + sum(10, 20));
        System.out.println("Sum of 3 ints (10, 20, 30): " + sum(10, 20, 30));
        System.out.println("Sum of 2 doubles (4.5, 3.2): " + sum(4.5, 3.2));
        
        /*
         * How does Java know which method to call?
         * Based on the arguments you pass, the Java Compiler links the method call 
         * to the correct method signature at compile time. 
         * This is why it's called "Compile-Time Polymorphism".
         */
    }
}
