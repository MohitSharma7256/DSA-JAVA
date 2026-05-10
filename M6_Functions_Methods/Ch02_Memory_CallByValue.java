public class Ch02_Memory_CallByValue {
    
    /*
     * ==========================================
     * MEMORY IN JAVA: CALL BY VALUE
     * ==========================================
     * EXTREMELY IMPORTANT INTERVIEW QUESTION:
     * "Does Java use Call by Value or Call by Reference?"
     * 
     * ANSWER: Java ALWAYS uses **Call by Value**. It never uses Call by Reference.
     * 
     * What does this mean?
     * When you pass a variable to a method, Java creates a COPY of that variable's value 
     * and passes the copy. Changing the copy inside the method DOES NOT affect the original 
     * variable in the main method.
     * 
     * THE CALL STACK:
     * - Every method call gets its own memory block called a "Stack Frame".
     * - `main` method has its own stack frame.
     * - `swap` method has its own completely separate stack frame.
     */

    public static void swap(int a, int b) {
        System.out.println("Inside Swap (Before change) - a: " + a + ", b: " + b);
        
        // Swapping logic using a temp variable
        int temp = a;
        a = b;
        b = temp;
        
        // The swap is ONLY happening inside this method's Stack Frame.
        System.out.println("Inside Swap (After change)  - a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Main (Before calling swap) - num1: " + num1 + ", num2: " + num2);
        
        // Passing copies of the values 10 and 20
        swap(num1, num2);
        
        // Did the original variables change? NO.
        System.out.println("Main (After calling swap)  - num1: " + num1 + ", num2: " + num2);
        
        /*
         * NOTE ON ARRAYS/OBJECTS:
         * When you pass an Array to a method, you are passing a COPY OF THE REFERENCE.
         * The reference still points to the same array in Heap Memory. So changing array 
         * elements inside a method WILL reflect in main. 
         * (We will cover this deeply in the Arrays module).
         */
    }
}
