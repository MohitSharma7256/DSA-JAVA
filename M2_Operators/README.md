# ⚡ Module 2: Operators in Java
> **Status:** Completed ✅ | **Level:** Pro-Logic Building

Operators are special symbols that perform operations on variables and values. Mastering operators is key to writing efficient DSA solutions.

---

## 📑 Table of Contents
1. [Arithmetic Operators](#1-arithmetic-operators)
2. [Relational Operators](#2-relational-operators)
3. [Logical Operators](#3-logical-operators)
4. [Assignment Operators](#4-assignment-operators)
5. [Unary Operators (Pre/Post)](#5-unary-operators)
6. [Bitwise Operators (DSA Special)](#6-bitwise-operators)
7. [Operator Precedence](#7-operator-precedence)
8. [Top 20 Interview Questions](#-top-20-interview-questions-and-answers)

---

## 1. Arithmetic Operators
- `+`, `-`, `*`, `/`, `%`
- **Important:** `int / int` results in an `int`. To get decimals, use `(double)`.
- **Modulo (%):** Returns the remainder. Very useful for digit extraction.

## 2. Relational Operators
- `==`, `!=`, `>`, `<`, `>=`, `<=`
- Always return a `boolean` value (`true` or `false`).

## 3. Logical Operators
- `&&` (Logical AND): True if both are true.
- `||` (Logical OR): True if at least one is true.
- `!` (Logical NOT): Reverses the boolean state.
- **Short-Circuiting:** In `&&`, if the first is false, the second isn't checked. In `||`, if the first is true, the second isn't checked.

## 4. Assignment Operators
- `=`, `+=`, `-=`, `*=`, `/=`, `%=`
- **Compound Assignment:** `a += b` is faster and handles **Auto-Type Casting**.

## 5. Unary Operators
- `++` (Increment), `--` (Decrement)
- **Pre-increment (++a):** Change first, then use.
- **Post-increment (a++):** Use first, then change.

## 6. Bitwise Operators (Fastest 🚀)
- `&` (AND), `|` (OR), `^` (XOR), `~` (NOT)
- `<<` (Left Shift): Multiply by $2^n$.
- `>>` (Right Shift): Divide by $2^n$.
- **XOR Trick:** `a ^ a = 0`, `a ^ 0 = a`. Used for finding unique numbers.

---

## 🎓 Top 20 Interview Questions and Answers

### Q1: What is the difference between `&` and `&&`?
**Ans:** `&` is a bitwise operator (checks all bits), while `&&` is a logical operator (supports **short-circuiting**).

### Q2: What is Short-Circuit evaluation?
**Ans:** It’s a performance optimization where the second part of a logical expression is not evaluated if the result is already determined by the first part.

### Q3: Predict result: `int x=10; System.out.println(x++ + ++x);`
**Ans:** `22`. (10 + 12). After `x++`, x becomes 11. Then `++x` makes it 12.

### Q4: How to check if a number is even or odd without using `%`?
**Ans:** Use bitwise AND: `(n & 1) == 0` means Even, else Odd. It is faster than `%`.

### Q5: What does the `^` (XOR) operator do?
**Ans:** It returns 1 if bits are different, and 0 if they are same. Property: `x ^ x = 0`.

### Q6: What is the Ternary Operator?
**Ans:** It’s a shorthand for if-else. Syntax: `variable = (condition) ? valueIfTrue : valueIfFalse;`.

### Q7: What is Operator Precedence?
**Ans:** It defines the order in which operators are evaluated in an expression (like BODMAS). Parentheses `()` have the highest priority.

### Q8: What is Associativity?
**Ans:** It defines the direction of evaluation (Left-to-Right or Right-to-Left) when operators have the same precedence.

### Q9: How can we multiply a number by 8 without using `*`?
**Ans:** Use Left Shift: `n << 3` (because $2^3 = 8$).

### Q10: What is the result of `~0` in Java?
**Ans:** `-1`. Flip all 0s to 1s in 32-bit signed integer results in -1 (2's complement).

### Q11: Can we apply modulo `%` on floating-point numbers?
**Ans:** Yes, Java allows `10.5 % 3.0`, result is `1.5`. (Unlike C/C++).

### Q12: Difference between `=` and `==`?
**Ans:** `=` is for assignment; `==` is for comparing values.

### Q13: What is the result of `10 / 0` in Java?
**Ans:** `ArithmeticException` (Division by zero). However, `10.0 / 0.0` results in `Infinity`.

### Q14: How does `a += b` differ from `a = a + b`?
**Ans:** `a += b` includes an implicit type cast. If `a` is `byte`, `a += 1` works, but `a = a + 1` fails.

### Q15: What is the purpose of the `instanceof` operator?
**Ans:** It checks if an object belongs to a specific class or interface.

### Q16: What is the 'Unary Plus' operator?
**Ans:** The `+` sign before a number. It can promote a `byte` or `short` to `int`.

### Q17: How do you find the last digit of a number?
**Ans:** Use `n % 10`.

### Q18: How do you remove the last digit of a number?
**Ans:** Use `n / 10`.

### Q19: Which operator has the lowest precedence in Java?
**Ans:** The Assignment operators (`=`, `+=`, etc.) have the lowest precedence.

### Q20: What is the difference between `>>` and `>>>`?
**Ans:** `>>` preserves the sign (sign-extension), while `>>>` always fills the left with 0 (zero-fill right shift).

---
**Keep Practicing Bitwise Logic! 🚀**
