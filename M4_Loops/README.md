# 🔁 Module 4: Loops & Control Flow (Master Guide)
> **Level:** Beginner to FAANG-Pro 🚀 | **Status:** Completed ✅

Loops are the **engine of every algorithm**. Sorting, searching, traversal, pattern printing — everything runs on loops. Master loops and DSA becomes 10x easier.

---

## 📑 Table of Contents
1. [While Loop](#1-while-loop)
2. [For Loop](#2-for-loop)
3. [Do-While Loop](#3-do-while-loop)
4. [For-Each Loop](#4-for-each-loop)
5. [Nested Loops & Patterns](#5-nested-loops--patterns)
6. [Break Statement](#6-break-statement)
7. [Continue Statement](#7-continue-statement)
8. [Labeled Break & Continue](#8-labeled-break--continue)
9. [Loop Variable Scope](#9-loop-variable-scope)
10. [Key Algorithms](#10-key-algorithms)
11. [🔥 FAANG-Level Interview Masterclass](#-faang-level-interview-masterclass)
12. [⚠️ Common Pitfalls & Gotchas](#️-common-pitfalls--gotchas)
13. [📂 Chapter-wise Code Index](#-chapter-wise-code-index)
14. [🗺️ Practice Problem Map](#️-practice-problem-map)
15. [💻 LeetCode Integration](#-leetcode-integration)
16. [📋 Quick Reference Cheat Sheet](#-quick-reference-cheat-sheet)

---

## 1. While Loop

**Entry-controlled loop** — condition is checked **before** each iteration. Use when you **don't know** the number of iterations in advance.

### Syntax
```java
// Initialization (outside)
while (condition) {
    // loop body
    // updation (inside — MUST change condition or infinite loop!)
}
```

### Examples (from Ch01)
```java
// Print 1 to 5
int counter = 1;
while (counter <= 5) {
    System.out.println("Count: " + counter);
    counter++; // CRUCIAL: prevents infinite loop
}

// Print 1 to N
int i = 1, n = 10;
while (i <= n) {
    System.out.print(i + " ");
    i++;
}
```

### Key Rules
- If condition is **false initially** → body **never executes**.
- Must always have an **updation** inside the body, or it runs forever.
- `while (true)` → intentional infinite loop, must have a `break` inside.

---

## 2. For Loop

**Entry-controlled loop** — use when you **know exactly** how many iterations needed. All three parts (init, condition, update) are in one line.

### Syntax
```java
for (initialization; condition; updation) {
    // loop body
}
```

### Examples (from Ch02)
```java
// Basic: 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}

// Sum of first N natural numbers
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
System.out.println("Sum: " + sum); // 55

// Multiple variables (same type only)
for (int i = 0, j = 10; i <= j; i++, j--) {
    System.out.println("i: " + i + ", j: " + j);
}
```

### Flowchart
```
Start → [Init] → [Condition?] --false--> End
                      |
                    true
                      ↓
               [Execute Body]
                      ↓
                 [Updation]
                      ↑────────────────┘
```

### Omitting Parts
```java
for (;;)          // Infinite loop — condition defaults to true
for (;i < 10; i++) // Init outside, no problem
for (int i=0; i<n;) { ...; i++; } // Update inside body
```

---

## 3. Do-While Loop

**Exit-controlled loop** — body executes **at least once**, then condition is checked. Best for **menu-driven programs**.

### Syntax
```java
do {
    // loop body (runs AT LEAST ONCE)
} while (condition); // ← semicolon is MANDATORY
```

### Examples (from Ch03)
```java
// Basic do-while
int counter = 1;
do {
    System.out.println("Iteration: " + counter);
    counter++;
} while (counter <= 5);

// Even if condition is false — runs once!
int num = 10;
do {
    System.out.println("Prints once even though 10 < 5 is false!");
} while (num < 5);

// Menu-driven program pattern
int choice;
do {
    System.out.println("1. Print Hello  2. Print Bye  3. Exit");
    choice = sc.nextInt();
    if (choice == 1) System.out.println("Hello!");
    else if (choice == 2) System.out.println("Bye!");
} while (choice != 3);
```

---

## 4. For-Each Loop

**Enhanced for loop** (Java 5+) — clean, index-free traversal of arrays and collections. Cannot modify the array or traverse in reverse.

### Syntax
```java
for (DataType variable : array) {
    // code
}
```

### Examples (from Ch11)
```java
int[] numbers = {10, 20, 30, 40, 50};

// Standard for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}

// For-each — cleaner, no index
for (int num : numbers) {
    System.out.print(num + " ");
}
```

### For vs For-Each
| Feature | `for` loop | `for-each` loop |
|---------|-----------|----------------|
| Index access | ✅ Yes | ❌ No |
| Reverse traversal | ✅ Yes | ❌ No |
| Skip elements (`i+=2`) | ✅ Yes | ❌ No |
| Modify array elements | ✅ Yes | ❌ No |
| Readability | OK | ✅ Cleaner |
| Works on Collections | ❌ Limited | ✅ Yes |

---

## 5. Nested Loops & Patterns

A loop **inside** another loop. Outer loop = **rows**, Inner loop = **columns**.

### Time Complexity: O(n²) for double nested loops.

### Patterns (from Ch04)

**Square Pattern (4×4)**
```java
for (int line = 1; line <= 4; line++) {
    for (int star = 1; star <= 4; star++) {
        System.out.print("*");
    }
    System.out.println();
}
// Output:
// ****
// ****
// ****
// ****
```

**Half-Pyramid**
```java
for (int line = 1; line <= 4; line++) {
    for (int star = 1; star <= line; star++) { // inner depends on outer
        System.out.print("*");
    }
    System.out.println();
}
// Output:
// *
// **
// ***
// ****
```

**Inverted Half-Pyramid**
```java
int n = 4;
for (int line = 1; line <= n; line++) {
    for (int star = 1; star <= (n - line + 1); star++) {
        System.out.print("*");
    }
    System.out.println();
}
// Output:
// ****
// ***
// **
// *
```

**Half-Pyramid with Numbers**
```java
for (int line = 1; line <= 4; line++) {
    for (int number = 1; number <= line; number++) {
        System.out.print(number);
    }
    System.out.println();
}
// Output:
// 1
// 12
// 123
// 1234
```

---

## 6. Break Statement

**Immediately exits** the loop — skips all remaining iterations.

### Examples (from Ch05)
```java
// Exit when i == 3
for (int i = 1; i <= 5; i++) {
    if (i == 3) break; // Loop stops here
    System.out.println("i: " + i); // Prints 1, 2 only
}

// Real-world: exit when user enters multiple of 10
do {
    int n = sc.nextInt();
    if (n % 10 == 0) { System.out.println("Exiting!"); break; }
    System.out.println("You entered: " + n);
} while (true);
```

> In a **nested loop**, `break` only exits the **innermost** loop. Use **Labeled Break** for outer loops.

---

## 7. Continue Statement

**Skips current iteration** — jumps to next iteration's updation/condition check.

### Examples (from Ch06)
```java
// Skip i == 3
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // skip rest of body for this iteration
    System.out.println("i: " + i); // Prints 1, 2, 4, 5
}

// Skip multiples of 10
do {
    int n = sc.nextInt();
    if (n % 10 == 0) continue; // Don't print it
    System.out.println("Number: " + n);
} while (true);
```

### Break vs Continue
| | `break` | `continue` |
|--|---------|-----------|
| Effect | **Exits** the loop entirely | **Skips** current iteration only |
| Remaining iterations | ❌ None — loop ends | ✅ Continue from next |
| Works in | Loops + Switch | Loops only |

---

## 8. Labeled Break & Continue

Control **outer loops** from inside nested inner loops using labels.

### Examples (from Ch10)
```java
// Labeled Break — exit outer loop from inside inner loop
outerLoop:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            System.out.println("Breaking outer at i=" + i + ", j=" + j);
            break outerLoop; // Exits OUTER loop entirely
        }
        System.out.println("i: " + i + ", j: " + j);
    }
}
// Output stops at i=2, j=2

// Labeled Continue — skip outer loop iteration
outerLoop2:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            continue outerLoop2; // Skips rest of inner + jumps to outer i++
        }
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

> ⚠️ Use sparingly — labeled jumps reduce code readability. But it's a **hot interview topic**.

---

## 9. Loop Variable Scope

Where a variable is declared determines where it can be accessed.

### Examples (from Ch12)
```java
// Variable INSIDE loop — only exists during loop
for (int i = 1; i <= 3; i++) {
    System.out.println("i = " + i); // OK
}
// System.out.println(i); // ❌ ERROR: 'i' not found here

// Variable OUTSIDE loop — exists after loop too
int j = 1;
for (; j <= 3; j++) {
    System.out.println("j = " + j);
}
System.out.println("Final j = " + j); // Prints 4! (updation ran one last time)
```

> **Why is `j = 4` after the loop?** The updation `j++` runs once more, making `j = 4`. Then `4 <= 3` is false, so loop exits — but `j` holds `4`.

---

## 10. Key Algorithms

### Reverse a Number (Ch07)
```java
// Logic: extract last digit, build reversed number
int num = 10899, reversed = 0;
while (num > 0) {
    int lastDigit = num % 10;          // Extract last digit
    reversed = (reversed * 10) + lastDigit; // Append to reversed
    num = num / 10;                     // Remove last digit
}
// 10899 → 99801
// Basis for: LeetCode 7 (Reverse Integer), LeetCode 9 (Palindrome Number)
```

### Check Prime — Optimized O(√n) (Ch08)
```java
// Naive: loop 2 to n-1 → O(n)
// Optimized: loop 2 to √n → O(√n) because factors repeat after sqrt

boolean isPrime = true;
if (n <= 1) isPrime = false;
else {
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) { isPrime = false; break; }
    }
}
```

### Multiplication Table (Ch09 Q1)
```java
int n = 5;
for (int i = 1; i <= 10; i++) {
    System.out.println(n + " x " + i + " = " + (n * i));
}
```

### Factorial (Ch09 Q2)
```java
int num = 4;
long fact = 1; // long to avoid overflow
for (int i = 1; i <= num; i++) {
    fact *= i;
}
System.out.println("4! = " + fact); // 24
```

### Sum of Even & Odd (Ch09 Q3)
```java
int evenSum = 0, oddSum = 0;
do {
    int number = sc.nextInt();
    if (number % 2 == 0) evenSum += number;
    else oddSum += number;
    System.out.print("Continue? 1=Yes 0=No: ");
    choice = sc.nextInt();
} while (choice == 1);
```

---

## 🔥 FAANG-Level Interview Masterclass

### Q1: What is a loop? What are the 4 types in Java?
**Ans:** A loop executes a block **repeatedly** while a condition is true. Java has: `while`, `for`, `do-while`, and `for-each` (enhanced for).

### Q2: Difference between `while` and `do-while`?
**Ans:** `while` is **entry-controlled** (condition checked first — may run 0 times). `do-while` is **exit-controlled** (body runs **at least once** before condition check).

### Q3: When to use `for` vs `while`?
**Ans:** Use `for` when you **know the count** in advance (array iteration, fixed repetitions). Use `while` when the termination depends on a **dynamic condition** (reading file, user input, convergence).

### Q4: Can we initialize multiple variables in `for`?
**Ans:** Yes, but they must be the **same data type**:
```java
for (int i = 0, j = 10; i < j; i++, j--) { }  // ✅ Valid
```

### Q5: What does `for(;;)` do?
**Ans:** Creates an **infinite loop** — the condition defaults to `true`. You must use `break` inside to exit.

### Q6: Difference between `break` and `continue`?
**Ans:** `break` **exits the entire loop**. `continue` **skips the current iteration** and moves to the next. `continue` cannot be used in `switch`.

### Q7: What is a Labeled Break?
**Ans:** Allows breaking out of an **outer loop** from inside a nested inner loop:
```java
outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 1) break outer; // exits OUTER loop
    }
}
```

### Q8: Why is the prime check loop `i <= Math.sqrt(n)` and not `i < n`?
**Ans:** If `n` has a factor greater than `√n`, it **must** have a corresponding factor smaller than `√n`. So checking up to `√n` is sufficient, reducing complexity from O(n) to O(√n).

### Q9: What is Loop Unrolling?
**Ans:** A JVM/compiler optimization where the loop body is **duplicated multiple times** and the loop runs fewer iterations. Reduces overhead of condition-checking and counter-incrementing. Improves CPU instruction-level parallelism.

### Q10: How can an infinite loop cause `OutOfMemoryError`?
**Ans:** An infinite loop that **creates objects** (e.g., `list.add(new Object())`) without GC clearing them fills the heap, causing `java.lang.OutOfMemoryError: Java heap space`.

### Q11: What is the value of the loop variable after the loop ends?
**Ans:** If declared **outside**, the variable retains its last updated value (the value that failed the condition):
```java
int j = 1;
for (; j <= 3; j++) { }
System.out.println(j); // 4 — updation ran, then 4<=3 failed
```

### Q12: Can `for-each` modify array elements?
**Ans:** No. The loop variable is a **copy** of the element. Modifying it doesn't affect the original array:
```java
int[] arr = {1, 2, 3};
for (int x : arr) { x = 99; } // Does NOT change arr
```

### Q13: What is the difference between `break` in loop vs `switch`?
**Ans:** Both exit the **immediately enclosing** construct. `break` in a `switch` inside a loop exits the switch only — the loop continues.

### Q14: Explain the Reverse Number algorithm.
**Ans:** Three steps per iteration: (1) extract last digit via `% 10`, (2) append to reversed via `reversed = reversed * 10 + digit`, (3) remove last digit via `/ 10`. Loop while `num > 0`.

### Q15: What is the time complexity of nested loops?
**Ans:** Two nested loops of size `n` → O(n²). Three nested → O(n³). But inner loop can have a different bound — always analyze each separately.

### Q16: Can `continue` be used in `switch`?
**Ans:** No. `continue` is only for loops. In a `switch` inside a loop, `continue` applies to the **enclosing loop**, not the switch.

### Q17: How does Fibonacci work iteratively?
**Ans:** Track two previous values:
```java
int a = 0, b = 1;
for (int i = 0; i < n; i++) {
    System.out.print(a + " ");
    int temp = a + b;
    a = b;
    b = temp;
}
```

### Q18: What is an entry-controlled vs exit-controlled loop?
**Ans:** **Entry-controlled** (`while`, `for`): condition checked **before** body — may run 0 times. **Exit-controlled** (`do-while`): body runs first, condition checked after — always runs **at least once**.

### Q19: How to print only even numbers from 1 to 20 using `continue`?
**Ans:**
```java
for (int i = 1; i <= 20; i++) {
    if (i % 2 != 0) continue; // skip odds
    System.out.print(i + " ");
}
```

### Q20: Predict output:
```java
int j = 1;
for (; j <= 3; j++) { }
System.out.println(j);
```
**Ans:** `4`. The updation `j++` runs making `j=4`, then `4 <= 3` is false so loop exits. `j` is declared outside, so it's still accessible with value `4`.

---

## ⚠️ Common Pitfalls & Gotchas

| # | Pitfall | Fix |
|---|---------|-----|
| 1 | Forgetting updation in `while` → infinite loop | Always update the loop variable inside `while` body |
| 2 | Missing `;` after `do-while` condition | `} while(cond);` — semicolon is mandatory |
| 3 | `break` only exits innermost loop | Use **labeled break** to exit outer loops |
| 4 | `continue` inside `switch` | `continue` applies to enclosing loop, not switch |
| 5 | Modifying array in `for-each` | Use standard `for` loop with index to modify |
| 6 | Off-by-one error (`< n` vs `<= n`) | `i < n` → 0 to n-1; `i <= n` → 0 to n |
| 7 | Using `int` for factorial of large numbers | Use `long` — `int` overflows at 13! |
| 8 | Naive prime check `i < n` | Use `i <= Math.sqrt(n)` → O(√n) instead of O(n) |
| 9 | Accessing loop variable after loop | Only possible if declared **outside** the loop |
| 10 | Reverse number: using `String` | Use mathematical approach: `% 10` and `/ 10` |

---

## 📂 Chapter-wise Code Index

| File | Topic | Key Concepts |
|------|-------|--------------|
| [Ch01_While_Loop.java](Ch01_While_Loop.java) | While Loop | Entry-controlled, infinite loop warning |
| [Ch02_For_Loop.java](Ch02_For_Loop.java) | For Loop | Sum of N, multiple variables, `for(;;)` |
| [Ch03_Do_While_Loop.java](Ch03_Do_While_Loop.java) | Do-While Loop | Exit-controlled, menu-driven pattern |
| [Ch04_Print_Patterns.java](Ch04_Print_Patterns.java) | Nested Loops & Patterns | Square, half-pyramid, inverted, numbers |
| [Ch05_Break_Statement.java](Ch05_Break_Statement.java) | Break | Early exit, exit on condition |
| [Ch06_Continue_Statement.java](Ch06_Continue_Statement.java) | Continue | Skip iteration, filter pattern |
| [Ch07_Reverse_Number.java](Ch07_Reverse_Number.java) | Reverse Number | `% 10`, `/ 10` algorithm — basis for LC#7, LC#9 |
| [Ch08_Check_Prime.java](Ch08_Check_Prime.java) | Prime Check | Naive O(n) vs Optimized O(√n) |
| [Ch09_PracticeSet.java](Ch09_PracticeSet.java) | Practice Set | Multiplication table, factorial, even/odd sum |
| [Ch10_Labeled_Break_Continue.java](Ch10_Labeled_Break_Continue.java) | Labeled Break/Continue | Outer loop control from inner loop |
| [Ch11_ForEach_Loop.java](Ch11_ForEach_Loop.java) | For-Each Loop | Array traversal, vs standard for loop |
| [Ch12_Loop_Scope.java](Ch12_Loop_Scope.java) | Loop Variable Scope | Inside vs outside declaration, final value |

---

## 🗺️ Practice Problem Map

### 🔰 Beginner
- [x] Print 1 to N using all 3 loop types
- [x] Sum of first N natural numbers
- [x] Multiplication table of N
- [x] Print even numbers 1 to 20 (using `continue`)
- [x] Exit loop when user enters multiple of 10 (using `break`)

### ⚡ Intermediate
- [x] Factorial of N (use `long` for overflow safety)
- [x] Reverse the digits of a number
- [x] Check if a number is Prime (O(√n))
- [x] Sum of even & odd numbers (do-while with user input)
- [x] Print 4 different star patterns using nested loops
- [x] Labeled break from nested loops

### 🔥 Advanced / FAANG-Level
- [x] LeetCode 7: Reverse Integer (handle overflow)
- [x] LeetCode 9: Palindrome Number (no string conversion)
- [x] LeetCode 50: Pow(x, n) — Binary Exponentiation O(log n)
- [x] LeetCode 191: Count 1 bits (Brian Kernighan `n & (n-1)`)
- [x] LeetCode 202: Happy Number (cycle detection)
- [ ] LeetCode 412: FizzBuzz
- [ ] LeetCode 509: Fibonacci (iterative)
- [ ] Print Hollow Diamond, Butterfly, Concentric Square patterns

---

## 💻 LeetCode Integration

15 problems solved in `LeetCode_Practice/` directory:

| # | Problem | Level | Key Technique |
|---|---------|-------|---------------|
| LC 7 | [Reverse Integer](LeetCode_Practice/LC_007_ReverseInteger.java) | Medium | Overflow check with `while` |
| LC 9 | [Palindrome Number](LeetCode_Practice/LC_009_PalindromeNumber.java) | Easy | Math reverse, O(1) space |
| LC 50 | [Pow(x, n)](LeetCode_Practice/LC_050_PowXN.java) | Medium | Binary Exponentiation O(log n) |
| LC 69 | [Sqrt(x)](LeetCode_Practice/LC_069_SqrtX.java) | Easy | Binary search in while loop |
| LC 70 | [Climbing Stairs](LeetCode_Practice/LC_070_ClimbingStairs.java) | Easy | Fibonacci iterative |
| LC 191 | [Number of 1 Bits](LeetCode_Practice/LC_191_NumberOf1Bits.java) | Easy | `n & (n-1)` loop |
| LC 202 | [Happy Number](LeetCode_Practice/LC_202_HappyNumber.java) | Easy | Cycle detection |
| LC 231 | [Power of Two](LeetCode_Practice/LC_231_PowerOfTwo.java) | Easy | Division loop |
| LC 258 | [Add Digits](LeetCode_Practice/LC_258_AddDigits.java) | Easy | Nested while digit sum |
| LC 326 | [Power of Three](LeetCode_Practice/LC_326_PowerOfThree.java) | Easy | Division loop |
| LC 412 | [Fizz Buzz](LeetCode_Practice/LC_412_FizzBuzz.java) | Easy | For loop + conditionals |
| LC 509 | [Fibonacci Number](LeetCode_Practice/LC_509_FibonacciNumber.java) | Easy | State tracking in loop |
| LC 1281 | [Subtract Product & Sum](LeetCode_Practice/LC_1281_SubtractProductAndSum.java) | Easy | Digit extraction loop |
| LC 1492 | [Kth Factor of n](LeetCode_Practice/LC_1492_KthFactorOfN.java) | Medium | Factor finding loop |
| LC 1523 | [Count Odd in Range](LeetCode_Practice/LC_1523_CountOddNumbers.java) | Easy | Math over loop (no TLE) |

---

## 📋 Quick Reference Cheat Sheet

```
┌──────────────────────────────────────────────────────────────┐
│              JAVA LOOPS — QUICK REF                          │
├──────────────┬───────────────────────────────────────────────┤
│  WHILE       │  Entry-controlled. Use when count unknown.    │
│              │  while(cond) { body; update; }                │
├──────────────┼───────────────────────────────────────────────┤
│  FOR         │  Entry-controlled. Use when count known.      │
│              │  for(init; cond; update) { body; }            │
│              │  for(;;) → infinite loop                      │
├──────────────┼───────────────────────────────────────────────┤
│  DO-WHILE    │  Exit-controlled. Runs AT LEAST ONCE.         │
│              │  do { body; } while(cond);  ← semicolon!     │
│              │  Best for: menu-driven programs               │
├──────────────┼───────────────────────────────────────────────┤
│  FOR-EACH    │  for(Type var : array) — no index, read-only  │
│              │  Cannot reverse/skip/modify elements          │
├──────────────┼───────────────────────────────────────────────┤
│  BREAK       │  Exits innermost loop entirely                │
│              │  break labelName; → exits labeled outer loop  │
├──────────────┼───────────────────────────────────────────────┤
│  CONTINUE    │  Skips current iteration only                 │
│              │  continue labelName; → skips outer iteration  │
│              │  NOT valid in switch                          │
└──────────────┴───────────────────────────────────────────────┘

KEY ALGORITHMS:
  Reverse num   : rev = rev*10 + n%10;  n /= 10;
  Prime O(√n)   : for(i=2; i<=Math.sqrt(n); i++) if(n%i==0) notPrime
  Factorial     : for(i=1;i<=n;i++) fact *= i;  (use long!)
  Fibonacci     : a=0,b=1; temp=a+b; a=b; b=temp;
  Sum 1 to N    : n*(n+1)/2  (O(1) formula, no loop needed!)
  Last digit    : n % 10
  Remove digit  : n / 10

SCOPE RULE:
  Inside for()  → dies when loop ends
  Outside for() → survives, holds final incremented value
```

---

> 💡 **Revision Tip:** Every DSA problem is a loop in disguise. Binary Search = `while(lo <= hi)`. Array traversal = `for`. BFS = `while(!queue.isEmpty())`. **The pattern is: while → for → do-while → for-each → break/continue → labeled → scope → algorithms.**

---
**Bhai, loops master ho gaye toh DSA ka 70% done! Keep grinding. 🔁🔥**
