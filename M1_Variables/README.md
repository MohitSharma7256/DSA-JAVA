# 📌 Module 1: Variables & Data Types
> **Status:** Completed ✅ | **Level:** Beginner to Pro

Welcome to the first module of the Java + DSA journey! This module covers the fundamental building blocks of Java programming.

---

## 📑 Table of Contents
1. [Java Execution Flow](#1-java-execution-flow)
2. [Variables & Identifiers](#2-variables--identifiers)
3. [Data Types (Primitives & Non-Primitives)](#3-data-types)
4. [Type Conversion & Casting](#4-type-conversion--casting)
5. [Type Promotion in Expressions](#5-type-promotion)
6. [Top 20 Interview Questions](#-top-20-interview-questions-and-answers)

---

## 1. Java Execution Flow
- **Source Code (.java):** Human-readable code.
- **Compiler (javac):** Converts .java to .class (Bytecode).
- **Bytecode (.class):** Platform-independent code.
- **JVM (Java Virtual Machine):** Runs the bytecode on specific OS.
- **WORA:** "Write Once, Run Anywhere."

## 2. Variables & Identifiers
- **Variable:** A container to store data values.
- **Identifiers:** Names given to variables, classes, methods.
  - *Rules:* Must start with a letter, `_`, or `$`. Cannot start with a number. No spaces.

## 3. Data Types
| Type | Size | Range/Value | Default |
|------|------|-------------|---------|
| `byte` | 1 byte | -128 to 127 | 0 |
| `short` | 2 bytes | -32,768 to 32,767 | 0 |
| `int` | 4 bytes | ~2.1 Billion | 0 |
| `long` | 8 bytes | ~9 x 10^18 | 0L |
| `float` | 4 bytes | 7 decimal digits | 0.0f |
| `double`| 8 bytes | 15 decimal digits| 0.0d |
| `char` | 2 bytes | Unicode characters | '\u0000'|
| `boolean`| ~1 bit | true / false | false |

## 4. Type Conversion & Casting
- **Widening (Auto):** Small type to Big type (`int` -> `double`). No data loss.
- **Narrowing (Manual):** Big type to Small type (`double` -> `int`). Data loss occurs.
- **Casting Syntax:** `int x = (int) 9.99; // x = 9`

## 5. Type Promotion
1. Java promotes `byte`, `short`, `char` to `int` during expressions.
2. If any operand is `long`, `float`, or `double`, the whole expression is promoted to that largest type.

---

## 🎓 Top 20 Interview Questions and Answers

### Q1: Is Java a purely Object-Oriented language?
**Ans:** No, because it supports **Primitive Data Types** (int, char, etc.) which are not objects.

### Q2: What is the difference between `float` and `double`?
**Ans:** `float` is 32-bit (7 decimal digits precision), while `double` is 64-bit (15-16 digits precision). Double is the default for decimals in Java.

### Q3: Why is Java platform-independent?
**Ans:** Due to **Bytecode**. The compiler generates a `.class` file that can run on any OS provided it has a JVM.

### Q4: What are the default values of local variables?
**Ans:** Local variables in Java **do not have default values**. They must be initialized before use, otherwise, it gives a compile error.

### Q5: Can we start a variable name with a number?
**Ans:** No. Identifiers can only start with a letter, `_`, or `$`.

### Q6: What is 'Type Promotion' in expressions?
**Ans:** It’s the automatic conversion of smaller data types to larger ones during calculations to prevent overflow.

### Q7: What is a Literal in Java?
**Ans:** A constant value assigned to a variable, e.g., `100`, `3.14f`, `'A'`.

### Q8: Difference between `>>` and `>>>` operators?
**Ans:** `>>` is Arithmetic Right Shift (preserves sign bit), `>>>` is Logical Right Shift (fills 0 regardless of sign).

### Q9: How is `char` stored in Java?
**Ans:** Java uses **Unicode (UTF-16)**, which takes 2 bytes. This allows it to support international languages.

### Q10: What happens during Integer Overflow?
**Ans:** It wraps around. For example, `Integer.MAX_VALUE + 1` becomes `Integer.MIN_VALUE`.

### Q11: What is the range of `byte`? Why is it -128 to 127?
**Ans:** It’s 1 byte (8 bits). $2^8 = 256$ total values. Using 2's complement, half are negative, half positive (including 0).

### Q12: Can we store `10.5` in an `int` variable?
**Ans:** Not directly. We need manual casting: `int x = (int) 10.5;`. The decimal part will be lost.

### Q13: What is the difference between `JDK`, `JRE`, and `JVM`?
**Ans:** 
- **JVM:** Runs bytecode.
- **JRE:** JVM + Libraries (to run apps).
- **JDK:** JRE + Compiler/Debugger (to develop apps).

### Q14: Why do we write `f` after a float value like `3.14f`?
**Ans:** Because Java treats all decimal literals as `double` by default. `f` tells the compiler to treat it as a `float`.

### Q15: What is the size of `boolean` in Java?
**Ans:** It is not precisely defined by the Java spec, but it is typically 1 byte in most JVMs.

### Q16: What is the result of `10 / 3` in Java?
**Ans:** `3`. Since both are integers, the result is an integer (decimal part is truncated).

### Q17: What is the difference between `System.out.print()` and `System.out.println()`?
**Ans:** `print()` stays on the same line, `println()` moves the cursor to the next line after printing.

### Q18: Can we use reserved keywords as variable names?
**Ans:** No, keywords like `int`, `class`, `public` cannot be used as identifiers.

### Q19: What is the use of `Scanner` class?
**Ans:** It is used to take input from the user via the keyboard (`System.in`).

### Q20: What is 'Explicit Casting' also known as?
**Ans:** Narrowing. It is when we manually convert a larger type to a smaller type.

---
**Happy Coding! 🚀**
