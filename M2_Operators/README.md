# ⚡ Module 2: Operators in Java (Master Guide)
> **Level:** Beginner to FAANG-Pro 🚀 | **Status:** Completed ✅

Operators are the **building blocks of logic**. Every DSA problem — from checking even/odd to finding unique elements in an array — depends on your ability to use operators efficiently.

---

## 📑 Table of Contents
1. [Arithmetic Operators](#1-arithmetic-operators)
2. [Relational Operators](#2-relational-operators)
3. [Logical Operators](#3-logical-operators)
4. [Assignment Operators](#4-assignment-operators)
5. [Unary Operators (Pre/Post)](#5-unary-operators)
6. [Bitwise Operators (DSA Special)](#6-bitwise-operators)
7. [Ternary Operator](#7-ternary-operator)
8. [Operator Precedence & Associativity](#8-operator-precedence--associativity)
9. [🔥 FAANG-Level Interview Masterclass](#-faang-level-interview-masterclass)
10. [⚠️ Common Pitfalls & Gotchas](#️-common-pitfalls--gotchas)
11. [📂 Chapter-wise Code Index](#-chapter-wise-code-index)
12. [🗺️ Practice Problem Map](#️-practice-problem-map)
13. [📋 Quick Reference Cheat Sheet](#-quick-reference-cheat-sheet)

---

## 1. Arithmetic Operators

Perform basic **mathematical calculations**. Needs **two operands** (Binary Operators).

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `+` | Addition | `10 + 3` | `13` |
| `-` | Subtraction | `10 - 3` | `7` |
| `*` | Multiplication | `10 * 3` | `30` |
| `/` | Division | `10 / 3` | `3` ⚠️ (truncates!) |
| `%` | Modulo (Remainder) | `10 % 3` | `1` |

> ⚠️ **TRAP:** `int / int = int`. Decimal part is **lost silently**!
> **FIX:** Cast one operand: `(double) 10 / 3` → `3.333...`

### DSA Modulo Tricks
```java
// Last digit of any number:
123 % 10 = 3

// Remove last digit:
123 / 10 = 12

// Check divisibility:
n % k == 0  →  n is divisible by k
```

---

## 2. Relational Operators

**Compare two values**. Always return a `boolean` (`true` or `false`).

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `==` | Equal to | `10 == 20` | `false` |
| `!=` | Not equal to | `10 != 20` | `true` |
| `>` | Greater than | `10 > 20` | `false` |
| `<` | Less than | `10 < 20` | `true` |
| `>=` | Greater or equal | `10 >= 10` | `true` |
| `<=` | Less or equal | `10 <= 20` | `true` |

> ⚠️ **Classic Bug:** `=` is **assignment**, `==` is **comparison**. Never confuse them!

---

## 3. Logical Operators

**Combine multiple boolean conditions** into one expression.

| Operator | Name | Rule |
|----------|------|------|
| `&&` | Logical AND | `true` only if **both** are `true` |
| `\|\|` | Logical OR | `true` if **at least one** is `true` |
| `!` | Logical NOT | Reverses the boolean value |

### Truth Tables

**AND (`&&`)**
| A | B | A && B |
|---|---|--------|
| T | T | **T** |
| T | F | F |
| F | T | F |
| F | F | F |

**OR (`||`)**
| A | B | A \|\| B |
|---|---|--------|
| T | T | **T** |
| T | F | **T** |
| F | T | **T** |
| F | F | F |

### Short-Circuit Evaluation ⚡
```java
// && : If first is FALSE, second is NEVER checked
false && someMethod()  →  someMethod() is skipped

// || : If first is TRUE, second is NEVER checked
true || someMethod()   →  someMethod() is skipped
```
> **Why it matters in DSA:** Prevents `NullPointerException` and improves loop performance.

---

## 4. Assignment Operators

**Store values** into variables. Compound versions are **shorter + auto-cast**.

| Operator | Long Form | Example | Result |
|----------|-----------|---------|--------|
| `=` | — | `a = 10` | `a = 10` |
| `+=` | `a = a + b` | `a += 5` | `a = 15` |
| `-=` | `a = a - b` | `a -= 3` | `a = 12` |
| `*=` | `a = a * b` | `a *= 2` | `a = 24` |
| `/=` | `a = a / b` | `a /= 4` | `a = 6` |
| `%=` | `a = a % b` | `a %= 4` | `a = 2` |

### Auto-Type Casting in Compound Assignment
```java
byte b = 5;
b = b + 2;   // ❌ Compile Error: int cannot be assigned to byte
b += 2;      // ✅ Works! Internally: b = (byte)(b + 2)
```
> Compound assignment operators **automatically include a narrowing cast**.

---

## 5. Unary Operators

Operate on **a single operand**. Most commonly used in loops.

| Operator | Name | Behaviour |
|----------|------|-----------|
| `++a` | Pre-Increment | **Change first**, then use |
| `a++` | Post-Increment | **Use first**, then change |
| `--a` | Pre-Decrement | **Change first**, then use |
| `a--` | Post-Decrement | **Use first**, then change |
| `-a` | Unary Minus | Negates the value |
| `+a` | Unary Plus | Promotes byte/short to int |
| `!a` | Logical NOT | Flips boolean |

### Pre vs Post — The Golden Rule
```java
int a = 10;
int b = a++;  // b = 10 (old value used), then a becomes 11
// Result: a=11, b=10

int x = 10;
int y = ++x;  // x becomes 11 first, then y = 11
// Result: x=11, y=11
```

### Tricky Expression
```java
int a = 10;
int result = a++ + ++a;
// Step 1: a++ → uses 10, then a becomes 11
// Step 2: ++a → a becomes 12, then uses 12
// Result: 10 + 12 = 22
```

---

## 6. Bitwise Operators

Work at the **binary (bit) level**. These are the **fastest operators** in Java — crucial for DSA.

| Operator | Name | Rule |
|----------|------|------|
| `&` | Bitwise AND | `1` if **both** bits are 1 |
| `\|` | Bitwise OR | `1` if **at least one** bit is 1 |
| `^` | Bitwise XOR | `1` if bits are **different** |
| `~` | Bitwise NOT | Flips all bits |
| `<<` | Left Shift | Multiply by `2^n` |
| `>>` | Right Shift | Divide by `2^n` (sign-preserving) |
| `>>>` | Unsigned Right Shift | Divide by `2^n` (fills 0 always) |

### Bit-Level Example (a=5, b=6)
```
a = 5  →  0 1 0 1
b = 6  →  0 1 1 0
         ─────────
a & b  →  0 1 0 0  =  4   (AND: both 1)
a | b  →  0 1 1 1  =  7   (OR:  any 1)
a ^ b  →  0 0 1 1  =  3   (XOR: different)
~a     →  -(a+1)   = -6   (Flip all bits)
```

### 🚀 DSA Bitwise Master Tricks
```java
// 1. Even/Odd check (faster than %)
(n & 1) == 0 ? "Even" : "Odd"

// 2. Multiply by 2
n << 1   // n * 2

// 3. Multiply by 8
n << 3   // n * 2^3 = n * 8

// 4. Divide by 2
n >> 1   // n / 2

// 5. Divide by 4
n >> 2   // n / 4

// 6. XOR Swap (no temp variable!)
a = a ^ b;
b = a ^ b;
a = a ^ b;

// 7. Check power of 2
(n > 0) && ((n & (n - 1)) == 0)

// 8. XOR unique element (find the one that appears once)
// x ^ x = 0  →  duplicates cancel out
// x ^ 0 = x  →  unique survives

// 9. Bitwise NOT formula
~n = -(n + 1)
```

---

## 7. Ternary Operator

A **one-line if-else** that returns a value. Syntax:
```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

### Examples
```java
// Pass/Fail
int marks = 65;
String result = (marks >= 33) ? "PASS" : "FAIL";

// Maximum of 2 numbers
int max = (a > b) ? a : b;

// Even/Odd
String type = (n % 2 == 0) ? "Even" : "Odd";

// Nested Ternary (avoid in real code — unreadable!)
int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
```

> **DSA Tip:** Ternary always **returns a value** — use it inside `return` or `print` for clean one-liners.

---

## 8. Operator Precedence & Associativity

**Precedence** = Which operator evaluates first (like BODMAS).
**Associativity** = Direction when same precedence (Left→Right or Right←Left).

| Priority | Operators | Associativity |
|----------|-----------|---------------|
| 1 (Highest) | `()` `[]` `.` | Left → Right |
| 2 | `++` `--` `!` `~` (Unary) | Right ← Left |
| 3 | `*` `/` `%` | Left → Right |
| 4 | `+` `-` | Left → Right |
| 5 | `<<` `>>` `>>>` | Left → Right |
| 6 | `<` `<=` `>` `>=` | Left → Right |
| 7 | `==` `!=` | Left → Right |
| 8 | `&` (Bitwise AND) | Left → Right |
| 9 | `^` (Bitwise XOR) | Left → Right |
| 10 | `\|` (Bitwise OR) | Left → Right |
| 11 | `&&` (Logical AND) | Left → Right |
| 12 | `\|\|` (Logical OR) | Left → Right |
| 13 | `?:` (Ternary) | Right ← Left |
| 14 (Lowest) | `=` `+=` `-=` etc. | Right ← Left |

### Examples
```java
int res = 10 + 5 * 2;     // = 10 + 10 = 20  (* before +)
int res = (10 + 5) * 2;   // = 15 * 2 = 30   (parentheses win)

int res = 10 * 5 / 2;     // = (10*5)/2 = 25  (L→R, same priority)
int res = 10 / 5 * 2;     // = (10/5)*2 = 4   (L→R)

int a = b = c = 100;      // c=100, then b=c, then a=b  (R←L)

// && before || !
boolean r = (10 > 5) || (20 < 10) && (5 == 5);
// Step 1: (20<10) && (5==5) → false && true = false
// Step 2: (10>5) || false   → true || false = true
```

---

## 🔥 FAANG-Level Interview Masterclass

### Q1: What is the difference between `&` and `&&`?
**Ans:** `&` is **Bitwise AND** (evaluates both sides always). `&&` is **Logical AND** with **short-circuit evaluation** (skips the second condition if the first is `false`). In DSA, `&&` is preferred for null-safety checks.

### Q2: What is Short-Circuit Evaluation?
**Ans:** A performance optimization where Java skips evaluating the second operand when the result is already determined:
- `false && anything` → Java **skips** `anything`
- `true || anything` → Java **skips** `anything`

### Q3: Predict result: `int x=10; System.out.println(x++ + ++x);`
**Ans:** `22`.
- `x++` → uses `10`, then x becomes `11`
- `++x` → x becomes `12`, then uses `12`
- Result: `10 + 12 = 22`

### Q4: How to check if a number is Even/Odd without `%`?
**Ans:** Use Bitwise AND: `(n & 1) == 0` means **Even**, else **Odd**. Faster than `%` because it's a single CPU instruction.

### Q5: What does `~0` return in Java?
**Ans:** `-1`. Formula: `~n = -(n+1)`. Flipping all 0s in a 32-bit int gives `111...1` which is `-1` in 2's complement.

### Q6: How to check if a number is a power of 2?
**Ans:** `(n > 0) && ((n & (n-1)) == 0)`.
```
8  = 1000
7  = 0111
8 & 7 = 0000  →  Power of 2 ✅
```

### Q7: How to swap two numbers without a third variable?
**Ans:** XOR swap:
```java
a = a ^ b;
b = a ^ b;   // = (a^b)^b = a
a = a ^ b;   // = (a^b)^a = b
```

### Q8: What is the difference between `>>` and `>>>`?
**Ans:** `>>` is **Signed Right Shift** — it preserves the sign bit (fills with 1 for negative numbers). `>>>` is **Unsigned Right Shift** — always fills the left with `0` regardless of sign. Used in hashing algorithms.

### Q9: How to multiply a number by 8 without `*`?
**Ans:** `n << 3` (because 2³ = 8). Left shift by `k` = multiply by `2^k`.

### Q10: Can `%` be applied on `double` in Java?
**Ans:** Yes! `10.5 % 3.0 = 1.5`. Unlike C/C++, Java supports modulo on floating-point numbers.

### Q11: What is the result of `10 / 0` vs `10.0 / 0`?
**Ans:**
- `10 / 0` → **`ArithmeticException`** (runtime crash for integer division)
- `10.0 / 0` → **`Infinity`** (IEEE 754 floating point standard)
- `0.0 / 0.0` → **`NaN`** (Not a Number)

### Q12: How does `a += b` differ from `a = a + b` for `byte`?
**Ans:** `a += b` includes an **implicit narrowing cast**, so it works. `a = a + b` promotes `a+b` to `int`, causing a **compile error** when assigning back to `byte`.

### Q13: What is `instanceof`?
**Ans:** Checks if an object is an instance of a class/interface at runtime:
```java
String s = "Hello";
System.out.println(s instanceof String); // true
```

### Q14: Explain Logical NOT priority vs Relational operators.
**Ans:** `!` (Unary, priority 2) is evaluated **before** relational operators (priority 6):
```java
!(5 > 10)   // 5>10 is false, !false = true ✅
```

### Q15: What is the XOR property used in DSA?
**Ans:** Two key properties:
- `x ^ x = 0` → Same values cancel out
- `x ^ 0 = x` → XOR with 0 gives same value
- **Use case:** Find the unique element in an array where every other element appears twice.

### Q16: What is the Unary `+` operator?
**Ans:** It **promotes** `byte` and `short` to `int`:
```java
byte b = 5;
int result = +b; // byte promoted to int
```

### Q17: Why is `&&` preferred over `&` in conditions?
**Ans:** `&&` short-circuits, preventing unnecessary computation and avoiding `NullPointerException`:
```java
if (obj != null && obj.getValue() > 0) // Safe: obj.getValue() only called if obj != null
if (obj != null & obj.getValue() > 0)  // Unsafe: obj.getValue() always called!
```

### Q18: What is the result of `0.1 + 0.2 == 0.3`?
**Ans:** `false`. Due to **IEEE 754 floating-point** representation, `0.1 + 0.2 = 0.30000000000000004`. Always use `Math.abs(a - b) < 1e-9` for floating-point comparisons.

### Q19: Can you use bitwise operators on `boolean`?
**Ans:** Yes, but only `&`, `|`, and `^` (NOT `~`). They do NOT short-circuit:
```java
boolean r = true & false; // Works, no short-circuit
boolean s = true | false; // Works, no short-circuit
```

### Q20: What does `n & (n-1)` do?
**Ans:** It **removes the lowest set bit** (rightmost 1-bit) from `n`. Key DSA use cases:
- Check power of 2: `n & (n-1) == 0`
- Count set bits (Brian Kernighan's algorithm)

---

## ⚠️ Common Pitfalls & Gotchas

| # | Pitfall | Explanation & Fix |
|---|---------|-------------------|
| 1 | `int / int` truncates | `10 / 3 = 3`, not `3.33`. Fix: cast to `double` first |
| 2 | `=` vs `==` confusion | `=` assigns, `==` compares. Wrong one → logic bug or compile error |
| 3 | `10 / 0` crashes | Integer division by zero → `ArithmeticException`. Use `10.0 / 0` for `Infinity` |
| 4 | Post-increment in expression | `b = a++` gives `b` the OLD value. Very tricky in complex expressions |
| 5 | `byte b = 5; b = b + 1;` | `b + 1` promotes to `int`. Fix: use `b += 1` or cast `(byte)(b + 1)` |
| 6 | `& ` not short-circuiting | Using `&` instead of `&&` evaluates both sides always — can cause NPE |
| 7 | `&&` before `\|\|` priority | `(A \|\| B && C)` ≠ `((A \|\| B) && C)`. `&&` binds tighter than `\|\|` |
| 8 | `~n` formula forgotten | `~n = -(n+1)`, NOT just `-n`. `~5 = -6`, `~0 = -1` |
| 9 | `>>` on negative numbers | `>>` fills with 1 (sign bit). Use `>>>` if you want 0-fill |
| 10 | Floating-point `==` | `0.1 + 0.2 == 0.3` is `false`. Use `Math.abs(diff) < epsilon` |

---

## 📂 Chapter-wise Code Index

| File | Topic | Key Concepts |
|------|-------|--------------|
| [Ch01_Arithmetic.java](Ch01_Arithmetic.java) | Arithmetic Operators | `+` `-` `*` `/` `%`, int truncation, modulo DSA tricks |
| [Ch02_Relational.java](Ch02_Relational.java) | Relational Operators | `==` `!=` `>` `<` `>=` `<=`, always returns boolean |
| [Ch03_Logical.java](Ch03_Logical.java) | Logical Operators | `&&` `\|\|` `!`, Truth tables, Short-circuit evaluation |
| [Ch04_Assignment.java](Ch04_Assignment.java) | Assignment Operators | `=` `+=` `-=` `*=` `/=` `%=`, auto-type casting |
| [Ch05_Unary.java](Ch05_Unary.java) | Unary Operators | `++` `--` pre/post, loop usage patterns |
| [Ch06_Bitwise.java](Ch06_Bitwise.java) | Bitwise Operators | `&` `\|` `^` `~` `<<` `>>`, DSA bit tricks |
| [Ch07_Precedence.java](Ch07_Precedence.java) | Precedence & Associativity | Priority table, L→R vs R←L, BODMAS equivalent |
| [Ch08_PracticeSet.java](Ch08_PracticeSet.java) | 15-Question Practice Set | All operator types combined, tricky output questions |
| [Ch10_Ternary.java](Ch10_Ternary.java) | Ternary Operator | `?:` syntax, nested ternary, DSA one-liners |

---

## 🗺️ Practice Problem Map

### 🔰 Beginner
- [x] Even/Odd without `%` using bitwise AND
- [x] Swap two numbers using XOR (no temp variable)
- [x] Find last digit of a number (`% 10`)
- [x] Demonstrate pre vs post increment
- [x] Check compound assignment vs simple assignment for `byte`

### ⚡ Intermediate
- [x] Predict output: `x++ + ++x` expressions
- [x] Logical operator priority: `&&` before `||`
- [x] Multi-level left shift: `10 << 2 << 1`
- [x] Divide by 4 using right shift (`>> 2`)
- [x] Compound modulo: `n %= 4`

### 🔥 Advanced / FAANG-Level
- [x] Check if number is power of 2 using `n & (n-1)`
- [ ] Count number of set bits (1s) in binary using Brian Kernighan's algorithm
- [ ] Find the unique element in an array (all others appear twice) using XOR
- [ ] Reverse bits of a 32-bit integer using `>>>` and `<<`
- [ ] Detect if two integers have opposite signs using XOR: `(a ^ b) < 0`

---

## 📋 Quick Reference Cheat Sheet

```
┌──────────────────────────────────────────────────────────────┐
│              JAVA OPERATORS — QUICK REF                      │
├──────────────┬──────────────────────────────────────────────┤
│  ARITHMETIC  │  +  -  *  /  %                               │
│              │  int/int = int (truncates!) Cast to double    │
├──────────────┼──────────────────────────────────────────────┤
│  RELATIONAL  │  ==  !=  >  <  >=  <=  → always boolean      │
├──────────────┼──────────────────────────────────────────────┤
│  LOGICAL     │  &&  ||  !  → short-circuits                 │
│              │  &   |   ^  → no short-circuit (bitwise too) │
├──────────────┼──────────────────────────────────────────────┤
│  ASSIGNMENT  │  =  +=  -=  *=  /=  %=                       │
│              │  Compound += auto-casts (byte-safe)          │
├──────────────┼──────────────────────────────────────────────┤
│  UNARY       │  ++a (pre) → change THEN use                 │
│              │  a++ (post)→ use THEN change                 │
├──────────────┼──────────────────────────────────────────────┤
│  BITWISE     │  &  |  ^  ~  <<  >>  >>>                     │
│              │  ~n = -(n+1)                                  │
│              │  n<<k = n*2^k  |  n>>k = n/2^k              │
├──────────────┼──────────────────────────────────────────────┤
│  TERNARY     │  (cond) ? trueVal : falseVal                 │
├──────────────┼──────────────────────────────────────────────┤
│  PRECEDENCE  │  () > Unary > */% > +- > shifts >           │
│              │  relational > == != > & > ^ > | >           │
│              │  && > || > ?: > assignment                   │
└──────────────┴──────────────────────────────────────────────┘

DSA BIT TRICKS:
  Even/Odd    : (n & 1) == 0
  Power of 2  : (n > 0) && (n & (n-1)) == 0
  Multiply×2  : n << 1
  Divide÷2    : n >> 1
  XOR Swap    : a^=b; b^=b; a^=b;  (wait: a^=b; b^=a; a^=b;)
  Unique Elem : XOR all elements (duplicates cancel to 0)
  ~n formula  : -(n + 1)
```

---

> 💡 **Revision Tip:** Bitwise operators are asked in **every** FAANG interview. Know the bit tricks cold. The pattern is: **Arithmetic → Relational → Logical → Assignment → Unary → Bitwise → Ternary → Precedence**.

---
**Bhai, operators master karne ke baad DSA problems aasaan lagenge! Keep grinding. 🚀🔥**
