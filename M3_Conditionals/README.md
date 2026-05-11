# 🚦 Module 3: Conditional Statements (Master Guide)
> **Level:** Beginner to FAANG-Pro 🚀 | **Status:** Completed ✅

Conditional statements give your program the power to **make decisions**. Every DSA algorithm — binary search, graph traversal, greedy choices — is built on branching logic. Master this and your code starts truly *thinking*.

---

## 📑 Table of Contents
1. [If-Else Basics](#1-if-else-basics)
2. [Nested If-Else](#2-nested-if-else)
3. [Else-If Ladder](#3-else-if-ladder)
4. [Switch-Case Statement](#4-switch-case-statement)
5. [Ternary Operator (Review)](#5-ternary-operator-review)
6. [String Comparison Trap](#6-string-comparison-trap)
7. [Real-World Problems Solved](#7-real-world-problems-solved)
8. [🔥 FAANG-Level Interview Masterclass](#-faang-level-interview-masterclass)
9. [⚠️ Common Pitfalls & Gotchas](#️-common-pitfalls--gotchas)
10. [📂 Chapter-wise Code Index](#-chapter-wise-code-index)
11. [🗺️ Practice Problem Map](#️-practice-problem-map)
12. [📋 Quick Reference Cheat Sheet](#-quick-reference-cheat-sheet)

---

## 1. If-Else Basics

Use when your program has **exactly two paths** — condition is true, or condition is false.

### Syntax
```java
if (condition) {
    // executes when condition is TRUE
} else {
    // executes when condition is FALSE
}
```

### Example — Age Check
```java
int age = 20;
if (age >= 18) {
    System.out.println("ADULT — Can vote, can drive.");
} else {
    System.out.println("MINOR.");
}
```

### Rules
- The condition inside `if()` **must** return a `boolean`.
- `if (x = 10)` → ❌ **Compile Error** (assignment returns `int`, not `boolean`).
- `if (x == 10)` → ✅ Correct.
- The `else` block is **optional**.

---

## 2. Nested If-Else

An `if` statement **inside** another `if` — used to check **dependent conditions**.

```java
if (age >= 18) {
    if (age >= 60) {
        System.out.println("Senior Citizen.");
    } else {
        System.out.println("Working Professional.");
    }
} else {
    System.out.println("Minor.");
}
```

### Dangling Else Problem
When nesting, `else` always binds to the **nearest unmatched `if`**:
```java
if (x > 0)
    if (x > 10)
        System.out.println("Big");
else                       // ← This else belongs to inner if (x > 10), NOT outer!
    System.out.println("Small");
```
> ✅ **Fix:** Always use `{}` curly braces, even for single-line bodies.

---

## 3. Else-If Ladder

Use when you have **more than two independent paths** (e.g., grades, tax slabs, ranges).

### Syntax
```java
if (condition1) {
    // path 1
} else if (condition2) {
    // path 2
} else if (condition3) {
    // path 3
} else {
    // default path (if nothing matches)
}
```

### Example — Grade System (from Ch02)
```java
if (marks >= 90)      System.out.println("A+");
else if (marks >= 80) System.out.println("A");
else if (marks >= 70) System.out.println("B");
else if (marks >= 33) System.out.println("C (Pass)");
else                  System.out.println("F (Fail)");
```

### Example — Income Tax Slabs (from Ch04)
```java
double tax = 0;
if (income < 500000)
    tax = 0;
else if (income >= 500000 && income < 1000000)
    tax = income * 0.20;   // 20% tax
else
    tax = income * 0.30;   // 30% tax

System.out.println("Tax: " + tax);
System.out.println("Net Salary: " + (income - tax));
```

### Key Behaviour
- Java **stops** at the **first true** condition. Remaining `else-if` blocks are **skipped**.
- This makes the ladder more efficient than multiple separate `if` statements.

---

## 4. Switch-Case Statement

Best for **discrete exact values** — menu options, day names, characters.

### Syntax
```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // executes if no case matches
}
```

### Example — Day of Week (from Ch05)
```java
switch (day) {
    case 1: System.out.println("Monday");  break;
    case 2: System.out.println("Tuesday"); break;
    // ...
    case 7: System.out.println("Sunday");  break;
    default: System.out.println("Invalid!");
}
```

### Example — Calculator Using Switch (from Ch06)
```java
switch (op) {
    case '+': System.out.println(a + b); break;
    case '-': System.out.println(a - b); break;
    case '*': System.out.println(a * b); break;
    case '/':
        if (b != 0) System.out.println(a / b);
        else System.out.println("Error: Division by zero!");
        break;
    case '%': System.out.println(a % b); break;
    default: System.out.println("Invalid Operator!");
}
```

### Switch Supported Types
| ✅ Supported | ❌ NOT Supported |
|---|---|
| `byte`, `short`, `int`, `char` | `float`, `double` |
| `String` (Java 7+) | `long` |
| `enum` | `boolean` |

### Fall-Through — The Critical Trap ⚠️
If you **forget `break`**, all subsequent cases execute automatically:
```java
int x = 2;
switch (x) {
    case 1: System.out.println("One");
    case 2: System.out.println("Two");   // ← starts here
    case 3: System.out.println("Three"); // ← ALSO runs! (Fall-Through)
    case 4: System.out.println("Four");  // ← ALSO runs!
}
// Output: Two, Three, Four  ← Unexpected!
```
> ✅ **Fix:** Always add `break` at the end of every case.

### Intentional Fall-Through (Grouping Cases)
```java
// Vowel check — multiple cases, one result
switch (ch) {
    case 'a': case 'e': case 'i': case 'o': case 'u':
        System.out.println("Vowel");
        break;
    default:
        System.out.println("Consonant");
}
```

### Switch vs If-Else Ladder
| Feature | `if-else-if` | `switch` |
|---------|-------------|---------|
| Checks | **Ranges** (`x > 10`) | **Exact values** only |
| Types | Any boolean expression | `int`, `char`, `String`, `enum` |
| Performance | O(N) — linear | O(1) — JVM uses Jump Table |
| Readability | Better for complex logic | Better for menus/options |

---

## 5. Ternary Operator Review

One-line `if-else` that **returns a value**:
```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

```java
// Positive/Negative/Zero
String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";

// Largest of 2
int max = (a > b) ? a : b;

// Pass/Fail
String status = (marks >= 33) ? "PASS" : "FAIL";
```

> ⚠️ Avoid **deeply nested** ternary — it becomes unreadable and unmaintainable.

---

## 6. String Comparison Trap

This is one of the **most common bugs** in Java interviews and production code.

```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

// Case 1: String Pool (Interning)
System.out.println(s1 == s2);       // ✅ true  (same pool reference)

// Case 2: New Object on Heap
System.out.println(s1 == s3);       // ❌ false (different memory address!)
System.out.println(s1.equals(s3));  // ✅ true  (same text content)
```

| Method | Compares | Use For |
|--------|----------|---------|
| `==` | Memory address (reference) | **Never** use for Strings |
| `.equals()` | Actual text content | ✅ Always use this |
| `.equalsIgnoreCase()` | Content, ignoring case | Case-insensitive comparison |

> 🏆 **Golden Rule:** **Always** use `.equals()` for String comparison. **Never** `==`.

---

## 7. Real-World Problems Solved

### Largest of 3 Numbers (Ch03)
```java
// Pseudo Code:
// 1. If (a >= b AND a >= c) → Largest is a
// 2. Else If (b >= c)       → Largest is b
// 3. Else                   → Largest is c

if (a >= b && a >= c)      System.out.println("Largest: " + a);
else if (b >= c)           System.out.println("Largest: " + b);
else                       System.out.println("Largest: " + c);
```

### Leap Year Logic (Ch08) — Classic Interview Question
```java
// A year is Leap if:
// 1. Divisible by 400  →  Leap (e.g., 2000, 1600)
// 2. OR (Divisible by 4 AND NOT divisible by 100)  →  Leap (e.g., 2024)

if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
    System.out.println(year + " is a LEAP YEAR ✅");
} else {
    System.out.println(year + " is NOT a leap year ❌");
}
```
> Test Cases: 2000 ✅ Leap | 1900 ❌ Not Leap | 2024 ✅ Leap | 2023 ❌ Not Leap

### Positive / Negative / Zero (Ch09 Q1)
```java
if (n > 0)       System.out.println("Positive");
else if (n < 0)  System.out.println("Negative");
else             System.out.println("Zero");
```

### Vowel or Consonant (Ch09 Q10)
```java
char ch = 'e';
switch (ch) {
    case 'a': case 'e': case 'i': case 'o': case 'u':
    case 'A': case 'E': case 'I': case 'O': case 'U':
        System.out.println("Vowel"); break;
    default: System.out.println("Consonant");
}
```

### Quadrant of Point (Ch09 Q14)
```java
if (x > 0 && y > 0)       System.out.println("1st Quadrant");
else if (x < 0 && y > 0)  System.out.println("2nd Quadrant");
else if (x < 0 && y < 0)  System.out.println("3rd Quadrant");
else if (x > 0 && y < 0)  System.out.println("4th Quadrant");
else                       System.out.println("On Axis / Origin");
```

### Electricity Bill (Ch09 Q15)
```java
double bill;
if (units <= 100) bill = units * 5;
else              bill = 100 * 5 + (units - 100) * 10;
System.out.println("Bill: ₹" + bill);
```

---

## 🔥 FAANG-Level Interview Masterclass

### Q1: What is Fall-Through in switch and when is it useful?
**Ans:** Fall-through occurs when a `case` has **no `break`**, so execution "falls through" to the next case. It's dangerous unintentionally but useful for **grouping cases** (e.g., treating all vowels the same).

### Q2: Can we use `float` or `double` in switch?
**Ans:** No. Switch supports `byte`, `short`, `int`, `char`, `String`, and `enum`. Floating-point types are excluded because of **precision issues** — two `double` values that appear equal may differ at the bit level.

### Q3: What is the difference between `if-else-if` ladder and `switch`?
**Ans:**
- Ladder can check **ranges** (`marks >= 80`) and **any boolean expression**.
- Switch only checks **exact equality** (`day == 1`).
- Switch is **O(1)** via JVM Jump Table; ladder is **O(N)**.

### Q4: What is the Dangling Else problem?
**Ans:** In nested `if-else`, the `else` always belongs to the **nearest unmatched `if`**, which can create unexpected logic. **Fix:** Always use curly braces `{}`.

### Q5: What happens with `if (x = 10)` in Java?
**Ans:** **Compile-time error.** Java requires `if()` to contain a `boolean`. The assignment `x = 10` returns an `int`, not a `boolean`. (In C/C++ this compiles but causes a bug — Java is safer.)

### Q6: How to check Leap Year?
**Ans:** `(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)`
- 2000 ✅ (divisible by 400)
- 1900 ❌ (divisible by 100 but not 400)
- 2024 ✅ (divisible by 4, not by 100)

### Q7: Why is `switch` O(1)?
**Ans:** JVM uses a **Jump Table** (or Lookup Table) for switch statements. It maps each case value directly to the corresponding code block, so lookup time is constant — O(1) — regardless of how many cases exist.

### Q8: Can you nest a `switch` inside an `if`?
**Ans:** Yes. Any conditional or loop can be nested inside any other. Nesting is unlimited, but deep nesting reduces readability. Refactor into methods if nesting exceeds 3 levels.

### Q9: What is the role of `default` in switch?
**Ans:** `default` acts like the final `else` — it runs when **no case matches**. It can be placed **anywhere** in the switch (not just at the end), but by convention goes last. It does NOT require a `break` if it's the last case.

### Q10: What is the difference between `==` and `.equals()` for Strings?
**Ans:**
- `==` compares **references** (memory addresses).
- `.equals()` compares **content** (actual text).
- Strings from literals go to the **String Pool** (same reference), but `new String(...)` creates a new Heap object.

### Q11: Can `switch` work with `String`?
**Ans:** Yes, since **Java 7**. The comparison is done using `.equals()` internally, so it's case-sensitive.
```java
String day = "Monday";
switch (day) {
    case "Monday": System.out.println("Start of week!"); break;
    // ...
}
```

### Q12: Can two `switch` cases have the same value?
**Ans:** No. It causes a **compile-time error**: "Duplicate case label."

### Q13: What is `equalsIgnoreCase()` and when to use it?
**Ans:** Compares two Strings **ignoring uppercase/lowercase**:
```java
"Hello".equalsIgnoreCase("hello")  // true
```
Use it when you want case-insensitive comparison (e.g., user input validation).

### Q14: Predict the output:
```java
int a = 63, b = 36;
boolean x = (a < b) ? true : false;
int y = (a > b) ? a : b;
System.out.println(x + " " + y);
```
**Ans:** `false 63`. Since `63 > 36`, `x = false` and `y = 63`.

### Q15: Is `else` mandatory in `if`?
**Ans:** No. `else` is completely optional. A standalone `if` is valid:
```java
if (score > 100) score = 100; // cap score without needing else
```

### Q16: What is `switch` expression (Java 14+)?
**Ans:** Modern syntax — no `break` needed, returns a value directly:
```java
String day = switch (num) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};
```

### Q17: How is character comparison done in `if`?
**Ans:** Characters are internally **integers (Unicode)**. `==` works correctly:
```java
char ch = 'A';
if (ch >= 'A' && ch <= 'Z') System.out.println("Uppercase");
if (ch >= 'a' && ch <= 'z') System.out.println("Lowercase");
```

### Q18: Can `continue` be used inside `switch`?
**Ans:** No. `continue` is only valid inside loops. Inside `switch`, only `break` is used. If a `switch` is **inside a loop**, `continue` will skip the loop iteration (not just the case).

### Q19: What is the difference between `break` in a loop vs in `switch`?
**Ans:** Both exit the **immediately enclosing** construct. In a loop, `break` exits the loop. In `switch`, `break` exits the switch block. If you have a `switch` inside a `for` loop, `break` only exits the `switch`, not the loop.

### Q20: How to handle multiple conditions elegantly without a deep ladder?
**Ans:** Use a **Map** for lookup, or **enum + switch** for clean structure:
```java
// Instead of deep if-else, use a map:
Map<String, Integer> grades = Map.of("A+", 90, "A", 80, "B", 70);
// Or use switch expressions (Java 14+) with arrow syntax for clarity
```

---

## ⚠️ Common Pitfalls & Gotchas

| # | Pitfall | Fix |
|---|---------|-----|
| 1 | `if (x = 10)` — assignment in condition | Use `if (x == 10)`. Java gives compile error (safer than C++) |
| 2 | Missing `break` in switch → Fall-Through | Add `break` after every case |
| 3 | Using `==` to compare Strings | Always use `.equals()` or `.equalsIgnoreCase()` |
| 4 | Dangling Else in nested if | Always use `{}` curly braces |
| 5 | Using `float`/`double` in switch | Not supported. Use `if-else` for floating-point ranges |
| 6 | Duplicate case labels in switch | Compile error. Each case value must be unique |
| 7 | Not handling `default` in switch | Always add `default` for unexpected inputs |
| 8 | Leap year: checking only `% 4` | Full rule: `(% 400 == 0) \|\| (% 4 == 0 && % 100 != 0)` |
| 9 | Deep nested if-else (Callback Hell) | Refactor to methods or use early return |
| 10 | `if` without braces on multi-line | Only the FIRST line belongs to `if` — rest executes always |

---

## 📂 Chapter-wise Code Index

| File | Topic | Key Concepts |
|------|-------|--------------|
| [Ch01_If_Else.java](Ch01_If_Else.java) | If-Else Basics | Age check, basic decision, nested if |
| [Ch02_Else_If_Ladder.java](Ch02_Else_If_Ladder.java) | Else-If Ladder | Grade system, short-circuit stopping |
| [Ch03_Largest_of_3.java](Ch03_Largest_of_3.java) | Largest of 3 | Nested conditions, pseudocode pattern |
| [Ch04_Income_Tax.java](Ch04_Income_Tax.java) | Income Tax Slabs | Real-world range-based ladder |
| [Ch05_Switch.java](Ch05_Switch.java) | Switch Statement | Days of week, fall-through, break |
| [Ch06_Calculator.java](Ch06_Calculator.java) | Mini Calculator | Switch on `char`, division by zero guard |
| [Ch07_String_Comparison.java](Ch07_String_Comparison.java) | String Trap | `==` vs `.equals()`, String Pool demo |
| [Ch08_Leap_Year.java](Ch08_Leap_Year.java) | Leap Year | Complex boolean logic, all 4 test cases |
| [Ch09_PracticeSet.java](Ch09_PracticeSet.java) | 15-Q Practice | Full set: +ve/-ve, vowel, quadrant, bill |
| [Ch10_My.java](Ch10_My.java) | Personal Practice | Positive/Negative/Zero, Odd/Even, Max |

---

## 🗺️ Practice Problem Map

### 🔰 Beginner
- [x] Check if a number is Positive, Negative, or Zero
- [x] Even or Odd check
- [x] Voting eligibility (`age >= 18`)
- [x] Student Passed or Failed (`marks >= 33`)
- [x] Largest of 2 numbers using ternary

### ⚡ Intermediate
- [x] Grade system using else-if ladder (`>90: A+`, etc.)
- [x] Income Tax calculator with slabs
- [x] Find Largest of 3 numbers (all edge cases)
- [x] Leap Year check (all 4 test cases)
- [x] Quadrant of a point (x, y)
- [x] Vowel or Consonant using switch (case grouping)
- [x] Electricity Bill with slab pricing

### 🔥 Advanced / FAANG-Level
- [ ] Check validity of a triangle (angle sum == 180 and side rules)
- [ ] Implement a menu-driven program (switch + loop)
- [ ] Character case check using Unicode ranges (`'A'-'Z'`, `'a'-'z'`, `'0'-'9'`)
- [ ] Write a leap year checker that handles negative years (BCE)
- [ ] Replace a 5-level else-if ladder with a `Map<Range, String>` lookup

---

## 📋 Quick Reference Cheat Sheet

```
┌──────────────────────────────────────────────────────────────┐
│         JAVA CONDITIONALS — QUICK REF                        │
├──────────────────┬───────────────────────────────────────────┤
│  IF-ELSE         │  if(cond){} else{}                        │
│                  │  else is optional                         │
│                  │  Condition MUST be boolean                │
├──────────────────┼───────────────────────────────────────────┤
│  ELSE-IF LADDER  │  if() {} else if() {} else {}            │
│                  │  Stops at first true condition            │
│                  │  Use for RANGES                           │
├──────────────────┼───────────────────────────────────────────┤
│  SWITCH          │  switch(var){ case X: ... break; }        │
│                  │  Use for EXACT VALUES                     │
│                  │  Supports: int, char, String, enum        │
│                  │  Fall-through if break is missing!        │
│                  │  JVM Jump Table → O(1) performance        │
├──────────────────┼───────────────────────────────────────────┤
│  TERNARY         │  (cond) ? trueVal : falseVal              │
│                  │  Returns a value — use in assignments     │
├──────────────────┼───────────────────────────────────────────┤
│  STRING COMPARE  │  NEVER ==  →  Always .equals()           │
├──────────────────┼───────────────────────────────────────────┤
│  LEAP YEAR       │  (y%400==0) || (y%4==0 && y%100!=0)      │
├──────────────────┼───────────────────────────────────────────┤
│  DANGLING ELSE   │  else → nearest unmatched if             │
│                  │  Fix: Always use {}                       │
└──────────────────┴───────────────────────────────────────────┘

COMMON PATTERNS:
  Positive/Neg/Zero : if(n>0)… else if(n<0)… else…
  Max of 2          : (a > b) ? a : b
  Vowel check       : switch(ch){ case 'a':case 'e':… }
  Even/Odd          : (n % 2 == 0) ? "Even" : "Odd"
  Grade             : if(m>=90)"A+" else if(m>=80)"A"…
```

---

> 💡 **Revision Tip:** Every DSA algorithm has a decision point. Understanding `if`, `switch`, and `?:` deeply means you can **translate any algorithm to code**. The pattern is: **if-else → ladder → switch → ternary → String traps → Real problems**.

---
**Bhai, logic strong hai toh DSA easy lagega! Keep grinding. 🚦🔥**
