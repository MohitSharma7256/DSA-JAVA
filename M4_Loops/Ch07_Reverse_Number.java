public class Ch07_Reverse_Number {
    public static void main(String[] args) {
        /*
         * ==========================================
         * 1. REVERSE THE DIGITS OF A NUMBER
         * ==========================================
         * Mathematical logic:
         * 1. Get the last digit: number % 10
         * 2. Remove the last digit: number / 10
         * 3. Add to reverse: reverse = (reverse * 10) + last_digit
         */

        System.out.println("--- Reverse a Number ---");
        int num = 10899;
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num = num / 10; // reduce the number
        }

        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);
        
        /*
         * Note: This is a fundamental building block for LeetCode Problem #7 (Reverse Integer)
         * and Problem #9 (Palindrome Number).
         */
    }
}
