public class Ch11_ForEach_Loop {
    public static void main(String[] args) {
        /*
         * ==========================================
         * ENHANCED FOR LOOP (FOR-EACH LOOP)
         * ==========================================
         * Introduced in Java 5. It is exclusively used to iterate through 
         * arrays or collections (like Lists, Sets).
         * 
         * Syntax:
         * for (DataType variable : array) {
         *     // code
         * }
         * 
         * Advantages: No index errors, much cleaner to read.
         * Disadvantages: Cannot traverse in reverse, cannot skip elements (no i+=2).
         */

        System.out.println("--- For-Each Loop Example ---");
        
        int[] numbers = {10, 20, 30, 40, 50}; // Basic Array
        
        System.out.println("Traversing array using standard for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Traversing array using for-each loop:");
        // Reads as: "For each integer 'num' in 'numbers' array"
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
