import java.util.*;

// ============================================================
//  JAVA — VARIABLES & DATA TYPES PRACTICE SET (20 QUESTIONS)
//  DSA Preparation | Thinking & Logic Building
// ============================================================
//
//  In this file:
//  - Questions + Answers
//  - Pseudo Code (Step-by-step logic)
//  - Text-based Flowcharts
//  - Code Implementation
//  - Rationale (Kyun ho raha hai?)
//
// ============================================================

public class Ch11_PracticeSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- WELCOME TO JAVA PRACTICE SET ---");
        System.out.println("Check the source code comments for all 20 questions!");
        
        // Note: Running this main method will only show some demo outputs.
        // Pura material comments mein hai niche.
    }
}

/*
--------------------------------------------------------------------------------
QUESTION 1: Average of 3 numbers
--------------------------------------------------------------------------------
Problem: Input 3 numbers A, B, and C. Output their average.

PSEUDO CODE:
1. Start
2. Input A, B, C
3. Sum = A + B + C
4. Avg = Sum / 3
5. Print Avg
6. End

FLOWCHART:
[Start] -> [Input A,B,C] -> [Sum = A+B+C] -> [Avg = Sum/3.0] -> [Print Avg] -> [End]

CODE:
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    double avg = (A + B + C) / 3.0; // Use 3.0 to get decimal result
    System.out.println(avg);

EXPLANATION:
- We use 3.0 instead of 3 because integer/integer = integer. 
- Dividing by 3.0 promotes the result to double.

--------------------------------------------------------------------------------
QUESTION 2: Area of a Square
--------------------------------------------------------------------------------
Problem: Input the side of a square. Output the area.

PSEUDO CODE:
1. Input side
2. Area = side * side
3. Print Area

FLOWCHART:
[Start] -> [Input side] -> [Area = side * side] -> [Print Area] -> [End]

CODE:
    float side = sc.nextFloat();
    float area = side * side;
    System.out.println(area);

--------------------------------------------------------------------------------
QUESTION 3: GST Bill Calculation
--------------------------------------------------------------------------------
Problem: Input cost of pencil, pen, and eraser (float). Output total bill with 18% GST.

PSEUDO CODE:
1. Input PencilCost, PenCost, EraserCost
2. TotalWithoutGST = PencilCost + PenCost + EraserCost
3. GST = TotalWithoutGST * 0.18
4. FinalBill = TotalWithoutGST + GST
5. Print FinalBill

FLOWCHART:
[Start] -> [Input items] -> [Sum total] -> [Add 18% tax] -> [Print Bill] -> [End]

CODE:
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    float total = pencil + pen + eraser;
    float finalBill = total + (0.18f * total);
    System.out.println("Total Bill with 18% GST: " + finalBill);

--------------------------------------------------------------------------------
QUESTION 4: Identifying Type of Result
--------------------------------------------------------------------------------
Code: 
    byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;
    result = (f * b) + (i % c) - (d * s);

ANSWER: 
- result will be of type DOUBLE.
- Reason: Double is the largest data type in the expression. 
- Promotion Rule: int -> float -> double.

--------------------------------------------------------------------------------
QUESTION 5: Advanced Variable Naming
--------------------------------------------------------------------------------
Question: Will "int $ = 24;" give an error?

ANSWER: 
- NO, it will not give an error.
- Rule: Variable names can start with a letter, underscore (_), or dollar sign ($). 
- However, it's not a good practice to use just $ as a name.

--------------------------------------------------------------------------------
QUESTION 6: Swapping 2 numbers (Using 3rd variable)
--------------------------------------------------------------------------------
Problem: Swap values of A and B using a temporary variable 'temp'.

PSEUDO CODE:
1. temp = A (A safe kar liya)
2. A = B    (B ki value A mein daali)
3. B = temp (temp ki value B mein daali)

FLOWCHART:
[A=1, B=2] -> [temp=A] -> [A=B] -> [B=temp] -> [A=2, B=1]

CODE:
    int a = 10, b = 20;
    int temp = a;
    a = b;
    b = temp;

--------------------------------------------------------------------------------
QUESTION 7: Simple Interest
--------------------------------------------------------------------------------
Problem: Calculate SI = (P * R * T) / 100.

PSEUDO CODE:
1. Input Principal(P), Rate(R), Time(T)
2. SI = (P * R * T) / 100
3. Print SI

CODE:
    double p = 10000, r = 7.5, t = 2;
    double si = (p * r * t) / 100;
    System.out.println(si);

--------------------------------------------------------------------------------
QUESTION 8: Swapping WITHOUT 3rd Variable (Advanced)
--------------------------------------------------------------------------------
Logic:
1. A = A + B
2. B = A - B
3. A = A - B

Example: A=5, B=10
1. A = 5 + 10 = 15
2. B = 15 - 10 = 5  (B swap ho gaya)
3. A = 15 - 5 = 10  (A swap ho gaya)

--------------------------------------------------------------------------------
QUESTION 9: Celsius to Fahrenheit
--------------------------------------------------------------------------------
Formula: F = (C * 9/5) + 32

CODE:
    double celsius = 37.0;
    double fahrenheit = (celsius * 9/5) + 32;
    System.out.println(fahrenheit);

--------------------------------------------------------------------------------
QUESTION 10: ASCII value of a character
--------------------------------------------------------------------------------
Logic: Char ko int mein cast karo.

CODE:
    char ch = 'A';
    int ascii = ch;
    System.out.println("ASCII of " + ch + " is " + ascii);

--------------------------------------------------------------------------------
QUESTION 11: Perimeter of Rectangle
--------------------------------------------------------------------------------
Formula: 2 * (length + width)

CODE:
    int l = 10, w = 5;
    int perimeter = 2 * (l + w);
    System.out.println(perimeter);

--------------------------------------------------------------------------------
QUESTION 12: Find remainder without % operator
--------------------------------------------------------------------------------
Thinking: a % b = a - (b * (a / b))

CODE:
    int a = 17, b = 3;
    int remainder = a - (b * (a / b)); // 17 - (3 * 5) = 2
    System.out.println(remainder);

--------------------------------------------------------------------------------
QUESTION 13: Volume of a Cylinder
--------------------------------------------------------------------------------
Formula: PI * r * r * h

CODE:
    double r = 5, h = 10;
    double vol = Math.PI * r * r * h;

--------------------------------------------------------------------------------
QUESTION 14: Days to Years, Weeks, Days
--------------------------------------------------------------------------------
Logic: 
- Years = days / 365
- RemainingDays = days % 365
- Weeks = RemainingDays / 7
- LeftDays = RemainingDays % 7

--------------------------------------------------------------------------------
QUESTION 15: Compound Interest (Annual)
--------------------------------------------------------------------------------
Formula: P * (1 + R/100)^T

CODE:
    double p = 1000, r = 10, t = 2;
    double amount = p * Math.pow((1 + r/100), t);
    double ci = amount - p;

--------------------------------------------------------------------------------
QUESTION 16: Check Even/Odd using only variables (Logical thinking)
--------------------------------------------------------------------------------
Thinking: If (n / 2) * 2 == n, it's even.

--------------------------------------------------------------------------------
QUESTION 17: Sum of digits of a 3-digit number
--------------------------------------------------------------------------------
Logic: n = 123
1. lastDigit = 123 % 10 = 3
2. n = 123 / 10 = 12
3. midDigit = 12 % 10 = 2
4. firstDigit = 12 / 10 = 1
5. sum = 3 + 2 + 1 = 6

--------------------------------------------------------------------------------
QUESTION 18: Area of Triangle (Heron's Formula)
--------------------------------------------------------------------------------
s = (a+b+c)/2
Area = sqrt(s * (s-a) * (s-b) * (s-c))

--------------------------------------------------------------------------------
QUESTION 19: Distance between 2 points (x1,y1) and (x2,y2)
--------------------------------------------------------------------------------
Formula: sqrt((x2-x1)^2 + (y2-y1)^2)

--------------------------------------------------------------------------------
QUESTION 20: Type Casting Error Check
--------------------------------------------------------------------------------
Question: 
    int a = 10;
    byte b = a; 
    Will this work?
Answer: NO. Error because int is larger than byte. 
Fix: byte b = (byte) a; (Narrowing)

--------------------------------------------------------------------------------
LOGIC BUILDING TIPS:
1. Always draw a small diagram or write steps (Pseudo Code) before coding.
2. Use meaningful variable names (e.g., 'radius' instead of 'r').
3. Be careful with Integer Division (5/2 = 2, but 5.0/2 = 2.5).
4. Break big problems into smaller steps.
--------------------------------------------------------------------------------
*/
