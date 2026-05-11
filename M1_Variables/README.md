# 📌 Module 1: Variables & Data Types (Master Guide)
> **Level:** Beginner to FAANG-Pro 🚀 | **Status:** Advanced Notes Completed ✅

Welcome to the ultimate guide for Java Variables and Data Types. This isn't just about syntax; it's about understanding how Java breathes under the hood.

---

## 📑 Table of Contents
1. [Java Execution & JIT Architecture](#1-java-execution--jit-architecture)
2. [Memory Management: Stack vs Heap](#2-memory-management-stack-vs-heap)
3. [Internal Representation (2's Complement & Unicode)](#3-internal-representation)
4. [Data Types: The Bit-Level Breakdown](#4-data-types-the-bit-level-breakdown)
5. [Literals, Constants & Underscores](#5-literals-constants--underscores)
6. [Type Conversion, Casting & Promotion](#6-type-conversion-casting--promotion)
7. [Variable Scopes (Local, Instance, Static)](#7-variable-scopes)
8. [🔥 FAANG-Level Interview Masterclass](#-faang-level-interview-masterclass)

---

## 1. Java Execution & JIT Architecture
Java uses a **Hybrid Approach** (Compilation + Interpretation).
- **javac**: Source Code (.java) ➡️ Bytecode (.class).
- **JVM**: Bytecode ➡️ Machine Code.
- **JIT (Just-In-Time) Compiler**: Identifies "Hot Code" (repeatedly used code) and compiles it directly into machine code for extreme performance. This is why Java is so fast despite being interpreted.

---

## 2. Memory Management: Stack vs Heap
Where does your variable actually live? This is a crucial interview concept.

| Feature | **Stack Memory** | **Heap Memory** |
|---------|------------------|-----------------|
| **Storage** | Primitive variables & Reference variables. | Actual Objects (Strings, Arrays, Classes). |
| **Lifecycle** | Follows LIFO (Last In First Out). Destroyed when method finishes. | Managed by **Garbage Collector**. |
| **Speed** | Extremely Fast. | Slower than Stack. |
| **Scope** | Private to the thread. | Shared across the entire application. |

> **Pro Tip:** When you write `int x = 10;`, `x` is on the **Stack**. When you write `String s = new String("Hello");`, the reference `s` is on the **Stack**, but the object `"Hello"` is on the **Heap**.

---

## 3. Internal Representation
### A. 2's Complement (How negative numbers are stored)
Computer hardware doesn't understand the minus `-` sign. It uses **2's Complement**.
- **Rule:** Flip all bits (1's Complement) and add 1.
- **Example:** To store -5 in 8 bits:
  1. 5 in binary: `00000101`
  2. Flip bits: `11111010`
  3. Add 1: `11111011` (This is how -5 looks in memory).

### B. Unicode (UTF-16)
Unlike C++ (which uses 1-byte ASCII), Java uses **2-byte Unicode**.
- **Why?** To support international languages (Hindi, Chinese, Emoji, etc.).
- **Size:** `char` is 16-bit (0 to 65,535).

---

## 4. Data Types: The Bit-Level Breakdown
| Type | Bits | Default | Range Logic |
|------|------|---------|-------------|
| `byte` | 8 | 0 | $-2^7$ to $2^7-1$ (-128 to 127) |
| `short` | 16 | 0 | $-2^{15}$ to $2^{15}-1$ |
| `int` | 32 | 0 | $-2^{31}$ to $2^{31}-1$ (Default for whole numbers) |
| `long` | 64 | 0L | $-2^{63}$ to $2^{63}-1$ (Use `L` suffix) |
| `float` | 32 | 0.0f | 7 decimal digits precision (Use `f` suffix) |
| `double`| 64 | 0.0d | 15 decimal digits precision (Default for decimals) |
| `char` | 16 | '\u0000' | Unicode characters |
| `boolean`| JVM Dep. | false | true / false |

---

## 5. Literals, Constants & Underscores
### A. Numeric Literals (Prefixes)
- **Binary:** `0b101` (5)
- **Octal:** `010` (8)
- **Hexadecimal:** `0x1A` (26)

### B. Underscores (Java 7+)
For readability, you can use `_` in numbers:
`int salary = 1_00_00_000;` // Readable as 1 Crore.

### C. Constants
Use the `final` keyword. Once assigned, the value cannot be changed.
`final double PI = 3.14159;`

---

## 6. Type Conversion, Casting & Promotion
### A. Widening (Implicit)
`byte` ➡️ `short` ➡️ `char` ➡️ `int` ➡️ `long` ➡️ `float` ➡️ `double`
(Safe, no data loss).

### B. Narrowing (Explicit)
`double` ➡️ `float` ➡️ `long` ➡️ `int` ➡️ `short` ➡️ `byte`
`int x = (int) 10.99;` // x becomes 10 (Truncation).

### C. Type Promotion Rules
1. `byte`, `short`, `char` are promoted to `int` during calculation.
2. If one operand is `double`, the whole expression becomes `double`.

---

## 7. Variable Scopes
1. **Local Variables**: Declared inside a method. Must be initialized before use. Lives on **Stack**.
2. **Instance Variables**: Declared inside class but outside methods. Have default values. Lives on **Heap**.
3. **Static Variables**: Shared by all objects of the class. Lives in **Method Area/Metaspace**.

---

## 🔥 FAANG-Level Interview Masterclass

### Q1: Why does `byte b = 127; b++;` result in -128?
**Ans:** This is **Integer Overflow**. 127 is `01111111`. Adding 1 makes it `10000000`, which in 2's complement is -128.

### Q2: Is `char c = 65;` valid?
**Ans:** Yes! It will store 'A' because 65 is the Unicode/ASCII value for 'A'.

### Q3: Why is `long x = 9999999999;` a compile error?
**Ans:** Java treats whole numbers as `int` by default. This number exceeds `int` range. Fix: `9999999999L`.

### Q4: Difference between `String s1 = "Hi";` and `String s2 = new String("Hi");`?
**Ans:** `s1` goes to the **String Constant Pool (SCP)** (memory optimization). `s2` forces a new object creation in the general **Heap**.

### Q5: What is 'Type Erasure' (Intro)?
**Ans:** It's a mechanism where generic type info is removed at runtime to ensure backward compatibility. (Advanced Topic).

### Q6: Can a `double` store an `int` without casting?
**Ans:** Yes, it's called **Widening**. Since `double` (64-bit) is larger than `int` (32-bit), no data is lost.

### Q7: What happens if you don't initialize a local variable?
**Ans:** **Compile-time error**. Java is strictly typed and safety-first. Unlike instance variables, local variables don't get default values.

### Q8: How to represent a Hexadecimal color code in Java?
**Ans:** Use the `0x` prefix: `int myColor = 0xFF0000;` (Red).

### Q9: Why doesn't Java support `unsigned int`?
**Ans:** To keep the language simple and avoid complexities related to sign bit interpretation during arithmetic.

### Q10: How much memory does a `boolean` array take?
**Ans:** In most JVMs, a `boolean` array takes 1 byte per element (for performance/alignment), even though a single boolean only needs 1 bit of information.

### Q11: What is the String Constant Pool (SCP)?
**Ans:** The SCP (also called String Intern Pool) is a special region inside the **Heap** where JVM stores **string literals** to avoid duplicate objects. When you write `String s = "Hello"`, JVM first checks the SCP. If `"Hello"` exists, it reuses it. This is why:
```java
String a = "Hello";
String b = "Hello";
System.out.println(a == b); // true → same SCP reference
```

### Q12: What's the difference between `==` and `.equals()` for Strings?
**Ans:**
- `==` compares **references** (memory addresses).
- `.equals()` compares **content** (actual characters).
```java
String s1 = new String("Hi");
String s2 = new String("Hi");
System.out.println(s1 == s2);       // false → different Heap objects
System.out.println(s1.equals(s2));  // true  → same content
```

### Q13: Can you change a `final` variable?
**Ans:** No. `final` makes a variable a **constant** — it can only be assigned **once**. Attempting to reassign it causes a **compile-time error**. For objects, `final` means the **reference** cannot change, but the object's internal state can still be mutated.
```java
final int X = 10;
X = 20; // ❌ Compile Error: cannot assign a value to final variable X
```

### Q14: What is integer overflow and how do you avoid it?
**Ans:** Integer overflow happens silently when a value exceeds the type's range — it **wraps around** without any exception. To handle large numbers, use:
- `long` for bigger integers.
- `Math.addExact()` which throws `ArithmeticException` on overflow.
- `BigInteger` for arbitrarily large numbers.
```java
int max = Integer.MAX_VALUE; // 2147483647
System.out.println(max + 1); // -2147483648 (overflow!)
```

### Q15: Why is `float` inaccurate? How to fix it?
**Ans:** `float` and `double` use **IEEE 754 binary floating-point**, which cannot represent all decimals exactly in binary. This causes precision errors:
```java
System.out.println(0.1 + 0.2); // 0.30000000000000004 (NOT 0.3!)
```
**Fix:** Use `BigDecimal` for financial/precise calculations:
```java
BigDecimal result = new BigDecimal("0.1").add(new BigDecimal("0.2"));
System.out.println(result); // 0.3 ✅
```

### Q16: What is auto-boxing and unboxing?
**Ans:** Java automatically converts between primitives and their Wrapper class equivalents.
- **Auto-boxing:** `int` → `Integer` (primitive to object).
- **Unboxing:** `Integer` → `int` (object to primitive).
```java
Integer obj = 42;        // Auto-boxing
int num   = obj;         // Unboxing
```
> ⚠️ Unboxing a `null` Integer causes a **NullPointerException** at runtime!

### Q17: What are Wrapper Classes and why are they needed?
**Ans:** Each primitive has a Wrapper class to use it as an **Object** (required for Collections, Generics, etc.):
| Primitive | Wrapper |
|-----------|---------|
| `int`     | `Integer` |
| `double`  | `Double` |
| `char`    | `Character` |
| `boolean` | `Boolean` |

### Q18: What is `var` in Java (Java 10+)?
**Ans:** `var` enables **local variable type inference** — the compiler infers the type from the right-hand side. It only works for **local variables**.
```java
var name = "Mohit";  // inferred as String
var age  = 21;       // inferred as int
var list = new ArrayList<String>(); // inferred as ArrayList<String>
```
> It does **NOT** make Java dynamically typed. Types are still fixed at compile time.

### Q19: What's the difference between `int` and `Integer`?
| Feature | `int` | `Integer` |
|---------|-------|-----------|
| Type | Primitive | Object (Wrapper) |
| Default Value | `0` | `null` |
| Memory | 4 bytes on Stack | Object on Heap |
| Can be `null`? | ❌ No | ✅ Yes |
| Usable in Collections? | ❌ No | ✅ Yes |

### Q20: How does JVM handle small `Integer` values?
**Ans:** JVM **caches** `Integer` objects from **-128 to 127** (Integer Cache). So `==` works for values in this range but fails outside it:
```java
Integer a = 127;
Integer b = 127;
System.out.println(a == b); // true  (cached)

Integer x = 128;
Integer y = 128;
System.out.println(x == y); // false (new objects on Heap!)
```
> Always use `.equals()` for `Integer` comparison. Never `==`.

---

## ⚠️ Common Pitfalls & Gotchas

| # | Pitfall | Explanation |
|---|---------|-------------|
| 1 | `byte b = 127; b++;` → gives `-128` | Integer overflow, wraps around silently |
| 2 | `0.1 + 0.2 != 0.3` | Floating-point precision error |
| 3 | `int x = 9999999999;` → Compile Error | Literal exceeds `int` range; use `9999999999L` |
| 4 | Unboxing `null` Integer | Causes `NullPointerException` at runtime |
| 5 | `==` on `String` objects | Compares references, not content; use `.equals()` |
| 6 | `==` on `Integer` > 127 | Integer cache ends at 127; always use `.equals()` |
| 7 | Dividing two `int`s | `7/2 = 3` (not 3.5); cast to `double` first |
| 8 | `char + char` arithmetic | `'A' + 'B'` gives `131` (int), not a char concat |
| 9 | Local variable without init | Compile error — no default values for local vars |
| 10 | `float f = 3.14;` | `3.14` is a `double` literal; use `3.14f` |

---

## 📂 Chapter-wise Code Index

| File | Topic | Key Concepts |
|------|-------|--------------|
| [Ch01_JavaExecution.java](Ch01_JavaExecution.java) | JVM & JIT | Compilation flow, Bytecode |
| [Ch02_Comments.java](Ch02_Comments.java) | Comments | Single-line, Multi-line, Javadoc |
| [Ch03_JavaBasics.java](Ch03_JavaBasics.java) | Java Basics | `main()`, `System.out`, naming conventions |
| [Ch04_DataTypes.java](Ch04_DataTypes.java) | Data Types | All 8 primitives, ranges, bit-level demo |
| [Ch05_Input.java](Ch05_Input.java) | Scanner Input | `nextInt()`, `nextLine()`, `nextDouble()` |
| [Ch06_TypeConversion.java](Ch06_TypeConversion.java) | Conversion | Widening, Narrowing, Casting, Truncation |
| [Ch07_TypePromotion.java](Ch07_TypePromotion.java) | Promotion | byte/short → int, mixed-type expressions |
| [Ch08_Practice_Basics.java](Ch08_Practice_Basics.java) | Practice | Variable declarations, output formatting |
| [Ch09_Practice_Geometry.java](Ch09_Practice_Geometry.java) | Geometry Practice | Area/perimeter with correct types |
| [Ch11_PracticeSet.java](Ch11_PracticeSet.java) | Full Practice Set | End-to-end variable + type problems |
| [Ch13_Memory_Basics.java](Ch13_Memory_Basics.java) | Memory Internals | Stack vs Heap demo, SCP demo |

---

## 🗺️ Practice Problem Map

### 🔰 Beginner
- [x] Declare all 8 primitive types with valid values
- [x] Print size of each data type using a program
- [x] Take user input and print formatted output
- [x] Calculate area and perimeter of a circle

### ⚡ Intermediate
- [x] Demonstrate widening vs narrowing conversion
- [x] Show type promotion in arithmetic expressions
- [x] Prove integer overflow with `byte` and `int`
- [x] Compare `String` using `==` vs `.equals()`

### 🔥 Advanced / FAANG-Level
- [ ] Implement a `BigDecimal` calculator for currency
- [ ] Benchmark `int` vs `Integer` in a large loop (boxing overhead)
- [ ] Demonstrate Integer Cache trap (`==` vs `.equals()` for > 127)
- [ ] Write a method that detects overflow before it happens using `Math.addExact()`

---

## 📋 Quick Reference Cheat Sheet

```
┌─────────────────────────────────────────────────────────┐
│              JAVA DATA TYPES — QUICK REF                │
├──────────┬──────┬──────────────┬───────────────────────┤
│  Type    │ Bits │  Default     │  Suffix / Note        │
├──────────┼──────┼──────────────┼───────────────────────┤
│  byte    │   8  │  0           │  -128 to 127          │
│  short   │  16  │  0           │  -32768 to 32767      │
│  int     │  32  │  0           │  Default whole number │
│  long    │  64  │  0L          │  Suffix: L            │
│  float   │  32  │  0.0f        │  Suffix: f            │
│  double  │  64  │  0.0d        │  Default decimal      │
│  char    │  16  │  '\u0000'    │  Unicode (UTF-16)     │
│  boolean │  JVM │  false       │  true / false only    │
└──────────┴──────┴──────────────┴───────────────────────┘

CASTING:  (targetType) value     e.g., (int) 9.99  → 9
WIDENING: automatic              byte → short → int → long → float → double
SCOPE:    local(Stack) | instance(Heap) | static(Metaspace)
CONSTANT: final int MAX = 100;
LITERAL:  0b1010 (bin) | 010 (oct) | 0xFF (hex) | 1_000_000 (underscore)
```

---

> 💡 **Revision Tip:** Read this file top-to-bottom once before any Java interview. The pattern is: **Theory → Memory → Bits → Casting → Scope → Gotchas → Practice**.

---
**Bhai, ye notes FAANG interview crack karne ke liye kafi hain! Keep grinding. 🚀🔥**
