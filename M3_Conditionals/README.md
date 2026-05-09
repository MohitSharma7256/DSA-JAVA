# 🚦 Module 3: Conditional Statements
> **Status:** Completed ✅ | **Level:** Logic Building Master

Conditional statements allow your program to make decisions based on certain criteria. This is where your code starts "thinking."

---

## 📑 Table of Contents
1. [If-Else Basics](#1-if-else-basics)
2. [Else-If Ladder](#2-else-if-ladder)
3. [Switch-Case Statement](#3-switch-case-statement)
4. [Ternary Operator (Review)](#4-ternary-operator-review)
5. [Top 20 Interview Questions](#-top-20-interview-questions-and-answers)

---

## 1. If-Else Basics
- Use when you have two paths (True or False).
- **Nested If:** An `if` statement inside another `if`. Use it to check dependent conditions.

## 2. Else-If Ladder
- Use when you have multiple independent paths (e.g., Grades, Tax Slabs).
- **Short-circuiting:** Only the first true block is executed; others are skipped.

## 3. Switch-Case Statement
- Best for discrete values (1, 2, 'A', 'B', "Sunday").
- **Break Keyword:** Essential to prevent **Fall-Through** (executing subsequent cases).
- **Default Case:** Executed if no match is found.

## 4. Ternary Operator
- `(condition) ? trueValue : falseValue;`
- Great for simple one-liners.

---

## 🎓 Top 20 Interview Questions and Answers

### Q1: What is 'Fall-Through' in a Switch statement?
**Ans:** If we forget the `break` statement in a `case`, Java continues to execute all the following cases regardless of their condition until it hits a break or the end.

### Q2: Can we use `float` or `double` in a switch case?
**Ans:** No. Switch supports `byte`, `short`, `char`, `int`, `String`, and `Enum`. It does not support floating-point numbers because of precision issues.

### Q3: What is the difference between `if-else-if` ladder and `switch`?
**Ans:** Ladder can check ranges (e.g., `x > 10`), whereas `switch` only checks for exact equality (`x == 10`).

### Q4: Can we have an `if` without an `else`?
**Ans:** Yes. `else` is optional.

### Q5: What is the 'Dangling Else' problem?
**Ans:** It occurs in nested `if-else` where an `else` is not clearly matched with an `if`. In Java, the `else` always associates with the nearest unmatched `if`.

### Q6: How to check if a year is a Leap Year?
**Ans:** `(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))`.

### Q7: What is the purpose of the `default` case in `switch`?
**Ans:** It acts like the `else` in an `if-else-if` ladder, executing when no other cases match.

### Q8: Can we use a String in a switch statement?
**Ans:** Yes, since Java 7, strings are supported in switch cases.

### Q9: What is the result of `if (x = 10)` in Java?
**Ans:** It gives a **Compile-time Error**. Java requires a `boolean` inside `if()`, but `x = 10` returns an `int`. Correct: `if (x == 10)`.

### Q10: Is it mandatory to put a `break` in the `default` case?
**Ans:** No, because `default` is usually the last case. But it's good practice for consistency.

### Q11: What is the difference between `==` and `.equals()` for Strings?
**Ans:** `==` compares the reference (memory address), whereas `.equals()` compares the actual text content.

### Q12: Can we use boolean expressions in switch?
**Ans:** No. Switch only takes the variable itself and matches exact values in cases.

### Q13: What is the max number of `else-if` we can use?
**Ans:** Technically, there is no limit, but for too many conditions, `switch` or design patterns are better.

### Q14: Can we nest a `switch` inside an `if`?
**Ans:** Yes, nesting of any conditional or loop is allowed in Java.

### Q15: Why is `switch` considered faster than `if-else-if`?
**Ans:** JVM uses a "Jump Table" or "Lookup Table" for switch, making it $O(1)$ in many cases, whereas ladder is $O(N)$.

### Q16: What happens if two cases in `switch` have the same value?
**Ans:** Compile-time error: "Duplicate case label."

### Q17: What is the 'Short-Circuit' property of `&&`?
**Ans:** If the first part of an `if (A && B)` is false, `B` is never evaluated because the whole thing must be false.

### Q18: Predict: `System.out.println(true ? "A" : "B");`
**Ans:** "A".

### Q19: Can we use `continue` inside a `switch`?
**Ans:** No. `continue` is only for loops. `break` is for both loops and switch.

### Q20: How to compare two characters in `if`?
**Ans:** Use `==` (e.g., `if (ch1 == ch2)`). Characters are internally numbers, so it works perfectly.

---
**Build strong logic, solve more problems! 🚦**
