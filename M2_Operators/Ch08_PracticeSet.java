import java.util.*;

/**
 * ============================================================
 *  CH-08: OPERATORS PRACTICE SET (15 QUESTIONS)
 *  DSA Module 2: Operators | Logic Building
 * ============================================================
 * 
 * "Bhai, coding seekhne ka sabse best tareeka hai logic samajhna."
 * In this file, you'll find solutions with Hinglish explanations 
 * for better conceptual clarity.
 */

public class Ch08_PracticeSet {

    public static void main(String[] args) {
        System.out.println("=== JAVA OPERATORS PRACTICE SET SOLUTIONS ===\n");

        // --------------------------------------------------------------------------------
        // QUESTION 1: Even or Odd without % (Bitwise AND)
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Bina modulo (%) operator use kiye check karo number Even hai ya Odd."
         * METHOD: Bitwise AND (&) use karenge.
         * LOGIC: Binary mein har Odd number ki last bit '1' hoti hai aur Even ki '0'.
         *        Agar (n & 1) == 0, toh number EVEN hai.
         */
        int n1 = 15;
        String res1 = (n1 & 1) == 0 ? "Even" : "Odd";
        System.out.println("Q1: Number " + n1 + " is " + res1);


        // --------------------------------------------------------------------------------
        // QUESTION 2: Predict Output (Precedence & Associativity)
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Is code ka output kya hoga?"
         * Logic: multiplication (*) aur division (/) ki priority same hoti hai, 
         *        isliye hum Left-to-Right solve karte hain.
         */
        int x2 = 2, y2 = 5;
        int exp1 = (x2 * y2 / x2);  // (2 * 5) / 2 = 10 / 2 = 5
        int exp2 = (x2 * (y2 / x2)); // 2 * (5 / 2) = 2 * 2 = 4 (Bracket first)
        System.out.println("Q2: exp1 = " + exp1 + ", exp2 = " + exp2);


        // --------------------------------------------------------------------------------
        // QUESTION 3: Check if number is Power of 2
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Check karo number 2 ki power (2, 4, 8, 16...) hai ya nahi."
         * LOGIC: Binary magic! Agar n power of 2 hai, toh (n & (n-1)) hamesha 0 hoga.
         *        Example: 8 is 1000, 7 is 0111. 1000 & 0111 = 0000.
         */
        int n3 = 16;
        boolean isPower = (n3 > 0) && ((n3 & (n3 - 1)) == 0);
        System.out.println("Q3: Is " + n3 + " power of 2? " + isPower);


        // --------------------------------------------------------------------------------
        // QUESTION 4: Swap two numbers using XOR
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Bina teesre (3rd) variable ke do numbers swap karo."
         * METHOD: XOR (^) operator properties use karenge.
         */
        int a4 = 10, b4 = 20;
        a4 = a4 ^ b4;
        b4 = a4 ^ b4;
        a4 = a4 ^ b4;
        System.out.println("Q4: After swapping a=" + a4 + ", b=" + b4);


        // --------------------------------------------------------------------------------
        // QUESTION 5: Compound Assignment Type Casting
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Kya 'byte b = 5; b = b + 5;' error dega? Aur 'b += 5' ka kya?"
         * EXPLANATION: 'b = b + 5' error dega kyunki (b+5) int ban jata hai.
         *              Lekin 'b += 5' internally '(byte)(b + 5)' hota hai, toh ye chalta hai.
         */
        byte b5 = 5;
        b5 += 5; // Valid! Implicit casting happens here.
        System.out.println("Q5: Byte b after compound add: " + b5);


        // --------------------------------------------------------------------------------
        // QUESTION 6: Pre-increment vs Post-increment
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "++a aur a++ mein kya farq hai mixed expression mein?"
         * LOGIC: ++a pehle value badhata hai, phir use karta hai.
         *        a++ pehle purani value use karta hai, phir badhata hai.
         */
        int a6 = 10;
        int res6 = ++a6 + a6++; // 11 + 11 (a becomes 12 after this)
        System.out.println("Q6: result=" + res6 + ", final a=" + a6);


        // --------------------------------------------------------------------------------
        // QUESTION 7: Logical Operators Priority
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Predict: (10 > 5) || (20 < 10) && (5 == 5)"
         * PRIORITY: AND (&&) hamesha OR (||) se pehle solve hota hai.
         */
        boolean res7 = (10 > 5) || (20 < 10) && (5 == 5);
        // 1. (20 < 10) && (5 == 5) -> false && true = false
        // 2. (10 > 5) || false -> true || false = true
        System.out.println("Q7: Logical Priority Result: " + res7);


        // --------------------------------------------------------------------------------
        // QUESTION 8: Multi-level Left Shift
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "10 << 2 << 1 ka output kya hoga?"
         * LOGIC: Left shift (<<) matlab number ko 2 ki power se multiply karna.
         *        10 << 2 = 10 * 2^2 = 40.
         *        40 << 1 = 40 * 2^1 = 80.
         */
        int res8 = 10 << 2 << 1;
        System.out.println("Q8: 10 << 2 << 1 = " + res8);


        // --------------------------------------------------------------------------------
        // QUESTION 9: Absolute value without Math.abs()
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Binary/Ternary operator se positive value (absolute) nikaalo."
         * LOGIC: Agar number negative hai (<0), toh use minus (-) se multiply kar do.
         */
        int n9 = -15;
        int absVal = n9 < 0 ? -n9 : n9;
        System.out.println("Q9: Absolute of -15 is: " + absVal);


        // --------------------------------------------------------------------------------
        // QUESTION 10: Last digit check
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Kya number ki last digit 3 se divisible hai?"
         * METHOD: % 10 se last digit milti hai.
         */
        int n10 = 129;
        int lastDigit = n10 % 10;
        boolean isDivBy3 = (lastDigit % 3 == 0);
        System.out.println("Q10: Is last digit of " + n10 + " div by 3? " + isDivBy3);


        // --------------------------------------------------------------------------------
        // QUESTION 11: Bitwise NOT (~) Mystery
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "~0 ka output kya hoga aur kyun?"
         * LOGIC: 0 binary mein 000...0 hota hai. ~ flip karke 111...1 bana deta hai.
         *        Java mein leading bits 1 matlab negative number (2's complement).
         *        Formula: ~n = -(n + 1). So, ~0 = -(0 + 1) = -1.
         */
        System.out.println("Q11: Bitwise NOT of 0 is: " + (~0));


        // --------------------------------------------------------------------------------
        // QUESTION 12: Divide by 4 using Right Shift
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Right shift use karke number ko 4 se divide karo."
         * LOGIC: n >> k matlab n / 2^k.
         *        4 se divide karne ke liye 2 baar shift karna hoga (2^2 = 4).
         */
        int n12 = 100;
        int res12 = n12 >> 2; 
        System.out.println("Q12: 100 >> 2 (Divide by 4) = " + res12);


        // --------------------------------------------------------------------------------
        // QUESTION 13: Logical NOT on complex expression
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "!(5 > 10) true hoga ya false?"
         * EXPLANATION: 5 > 10 false hai. ! use false ko true kar dega.
         */
        boolean res13 = !(5 > 10);
        System.out.println("Q13: !(5 > 10) is: " + res13);


        // --------------------------------------------------------------------------------
        // QUESTION 14: Relational + Logical check
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "Dono conditions check karo: (10 != 5) AND (10 > 5)."
         */
        boolean res14 = (10 != 5) && (10 > 5);
        System.out.println("Q14: (10 != 5) && (10 > 5) is: " + res14);


        // --------------------------------------------------------------------------------
        // QUESTION 15: Compound Modulo
        // --------------------------------------------------------------------------------
        /* 
         * HINGLISH: "n %= 4 ka kya matlab hota hai?"
         * EXPLANATION: Ye n = n % 4 ka short form hai.
         */
        int n15 = 15;
        n15 %= 4; // n = 15 % 4 = 3
        System.out.println("Q15: 15 %= 4 result is: " + n15);

        System.out.println("\n=== PRACTICE SET COMPLETE - AAP TOPPER BANOGE! ===");
    }
}
