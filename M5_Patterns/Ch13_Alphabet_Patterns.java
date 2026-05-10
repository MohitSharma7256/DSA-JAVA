public class Ch13_Alphabet_Patterns {
    public static void main(String[] args) {
        /*
         * ==========================================
         * ALPHABET / CHARACTER PATTERNS
         * ==========================================
         * Characters in Java are backed by ASCII values.
         * 'A' = 65, 'B' = 66 ... 'Z' = 90
         * 'a' = 97, 'b' = 98 ... 'z' = 122
         * 
         * By typecasting integers to char, we can print alphabets easily.
         */

        int n = 5;
        
        System.out.println("--- 1. Continuous Alphabet Pyramid ---");
        /*
         * A
         * B C
         * D E F
         * G H I J
         */
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; // Increment ASCII value
            }
            System.out.println();
        }

        System.out.println("\n--- 2. Resetting Alphabet Pyramid ---");
        /*
         * A
         * A B
         * A B C
         * A B C D
         */
        for (int i = 1; i <= n; i++) {
            char resetCh = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(resetCh + " ");
                resetCh++;
            }
            System.out.println();
        }
    }
}
