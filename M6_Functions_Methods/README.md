# ⚙️ Module 6: Functions & Methods (Master Guide)
> **Level:** Beginner to FAANG-Pro 🚀 | **Status:** Completed ✅

Functions transform your code from a long script into **modular, reusable, testable units**. This module also covers the #1 Java interview topic — **Call by Value** — and introduces **Recursion**, the foundation of Trees, Graphs, and Dynamic Programming.

---

## 📑 Table of Contents
1. [Function Basics](#1-function-basics)
2. [Memory & Call By Value](#2-memory--call-by-value)
3. [Method Overloading](#3-method-overloading)
4. [Scope & Variable Shadowing](#4-scope--variable-shadowing)
5. [VarArgs (Variable Arguments)](#5-varargs)
6. [Basic Recursion](#6-basic-recursion)
7. [Built-in Math Methods](#7-built-in-math-methods)
8. [🔥 FAANG Interview Masterclass](#-faang-interview-masterclass)
9. [⚠️ Common Pitfalls](#️-common-pitfalls)
10. [📂 Chapter Index](#-chapter-index)
11. [🗺️ Practice Problem Map](#️-practice-problem-map)
12. [💻 LeetCode Integration](#-leetcode-integration)
13. [📋 Quick Reference Cheat Sheet](#-quick-reference-cheat-sheet)

---

## 1. Function Basics

A **method** is a reusable block of code that runs only when called.

### Why Use Methods?
- **DRY Principle** — Don't Repeat Yourself. Write once, call many times.
- **Modularity** — Break complex problems into smaller chunks.
- **Readability** — Code reads like English: `calculateTax()`, `isPrime()`.

### Syntax
```java
returnType methodName(dataType param1, dataType param2) {
    // body
    return value; // omit if returnType is void
}
```

### 3 Types (from Ch01)
```java
// Type 1: No parameters, no return
public static void printHelloWorld() {
    System.out.println("Hello World!");
}

// Type 2: Parameters, no return (void)
public static void greetUser(String name) {  // 'name' is the PARAMETER
    System.out.println("Welcome, " + name + "!");
}

// Type 3: Parameters + returns a value
public static int calculateSum(int a, int b) {
    return a + b;
}

// Calling them:
printHelloWorld();
greetUser("Mohit");     // "Mohit" is the ARGUMENT
int result = calculateSum(10, 20);
```

### Parameter vs Argument
| Term | Definition | Example |
|------|-----------|---------|
| **Parameter** | Variable in method signature | `void greet(String name)` → `name` |
| **Argument** | Actual value passed at call | `greet("Mohit")` → `"Mohit"` |

### Method Anatomy
```
public  static  int  calculateSum  (int a, int b)
  ↑       ↑     ↑        ↑              ↑
Access  Modifier Return  Name       Parameters
```

---

## 2. Memory & Call By Value

**The #1 Java interview question.** Java is strictly **Call by Value** — always.

### The Call Stack (Stack Memory)
Every method call gets its own **Stack Frame** — an isolated memory block containing local variables. When the method returns, the frame is **destroyed** and popped off.

```
MEMORY DIAGRAM when swap(num1, num2) is called:

Stack (top to bottom):
┌─────────────────────────┐
│ swap() Stack Frame      │  ← Created when swap() called
│   a = 10 (COPY)         │
│   b = 20 (COPY)         │
│   temp = ...            │
├─────────────────────────┤
│ main() Stack Frame      │  ← Always at bottom
│   num1 = 10             │  ← ORIGINAL — never touched by swap()
│   num2 = 20             │
└─────────────────────────┘
```

### Proof — Call by Value (Ch02)
```java
public static void swap(int a, int b) {
    int temp = a; a = b; b = temp;
    System.out.println("Inside swap: a=" + a + ", b=" + b); // a=20, b=10
}

public static void main(String[] args) {
    int num1 = 10, num2 = 20;
    System.out.println("Before: num1=" + num1 + ", num2=" + num2); // 10, 20
    swap(num1, num2);  // COPIES of 10 and 20 are passed
    System.out.println("After:  num1=" + num1 + ", num2=" + num2); // STILL 10, 20 !!
}
```

### Arrays — The "Apparent" Reference Trick
```java
// When you pass an array, you pass a COPY OF THE REFERENCE.
// Both the copy and original point to THE SAME array in Heap.
// So changes to array ELEMENTS are visible in main!
public static void change(int[] arr) {
    arr[0] = 99; // Modifies Heap memory — VISIBLE in main
}
// But reassigning arr = new int[]{...} won't affect main's array.
```

---

## 3. Method Overloading

**Same method name, different parameters** — also called **Compile-Time Polymorphism**.

### Rules
- Different **number** of parameters ✅
- Different **types** of parameters ✅
- Different **order** of parameter types ✅
- Different **return type only** ❌ → Compile Error

### Example (Ch03)
```java
public static int sum(int a, int b)           { return a + b; }
public static int sum(int a, int b, int c)    { return a + b + c; } // diff count
public static double sum(double a, double b)  { return a + b; }     // diff type

// Java compiler picks the right one at COMPILE TIME based on arguments:
sum(10, 20);        // → int version
sum(10, 20, 30);    // → 3-arg version
sum(4.5, 3.2);      // → double version
```

### How Java Resolves Overloading
1. **Exact match** — same types passed
2. **Widening** — `int` can be widened to `double`
3. **Varargs** — last resort

---

## 4. Scope & Variable Shadowing

**Scope** = where a variable is visible and accessible.

### 3 Levels of Scope
| Scope | Declared In | Visible Until |
|-------|------------|---------------|
| **Block Scope** | `{ }` curly braces | End of that block |
| **Method Scope** | Inside a method | End of method |
| **Class Scope** | Outside methods, inside class | Entire class |

### Example (Ch04)
```java
static int x = 90; // Class-level (global) variable

public static void main(String[] args) {
    int a = 10; // Method scope — exists in all of main

    {   // Block starts
        int b = 20; // Block scope — dies when block ends
        System.out.println(a + " " + b); // OK: 10 20
        a = 15; // Can modify method-scoped var inside block
    }   // Block ends — b is destroyed here

    // System.out.println(b); // ❌ ERROR: b not found

    // VARIABLE SHADOWING:
    int x = 40; // Local x HIDES the global x = 90
    System.out.println(x);    // 40 (local wins)
    // To access global: Ch04_Scope_And_Shadowing.x  (class name prefix)
}

public static void printGlobalX() {
    System.out.println(x); // 90 — sees global, no local x here
}
```

### Shadowing Rules
- Local variable with same name as class-level variable → local **shadows** (hides) global.
- Inside the shadowed scope, the global is inaccessible by simple name.
- Other methods without a local `x` still see the global.

---

## 5. VarArgs

**Variable Length Arguments** (Java 5+) — accept **any number** of arguments without overloading.

### Syntax
```java
returnType methodName(DataType... variableName)
// Internally treated as an ARRAY
```

### Rules
1. Only **one** varargs parameter per method.
2. Varargs must be the **LAST** parameter.

### Examples (Ch05)
```java
// Takes any count of ints (0, 1, or 100)
public static void printNumbers(int... numbers) {
    System.out.println("Count: " + numbers.length);
    System.out.println(Arrays.toString(numbers));
}

// Mixing with fixed params — varargs MUST be last
public static void printStudentDetails(String name, int... marks) {
    System.out.println("Student: " + name);
    int total = 0;
    for (int mark : marks) total += mark;
    System.out.println("Total: " + total);
}

// Calling:
printNumbers();                    // 0 args
printNumbers(10);                  // 1 arg
printNumbers(10, 20, 30, 40, 50);  // 5 args
printStudentDetails("Mohit", 85, 90, 95);
```

### VarArgs vs Array Parameter
```java
void foo(int... nums)  // Can call as foo(1,2,3) OR foo(new int[]{1,2,3})
void bar(int[] nums)   // MUST call as bar(new int[]{1,2,3})
```

---

## 6. Basic Recursion

**Recursion** = A method that calls **itself** to solve a smaller version of the problem.

### Two Mandatory Components
1. **Base Case** — the stopping condition (prevents infinite recursion)
2. **Recursive Call** — calling self with modified (smaller) parameters

### How the Call Stack Builds
```
factorial(5)
  └─ 5 * factorial(4)
         └─ 4 * factorial(3)
                └─ 3 * factorial(2)
                       └─ 2 * factorial(1)
                              └─ returns 1  ← BASE CASE
                       returns 2*1 = 2
                returns 3*2 = 6
         returns 4*6 = 24
  returns 5*24 = 120
```

### Examples (Ch06)

**Print N to 1:**
```java
public static void printNto1(int n) {
    if (n == 0) return;      // BASE CASE
    System.out.print(n + " ");
    printNto1(n - 1);        // RECURSIVE CALL
}
// printNto1(5) → 5 4 3 2 1
```

**Factorial:**
```java
public static int factorial(int n) {
    if (n == 0 || n == 1) return 1;   // BASE CASE
    return n * factorial(n - 1);       // RECURSIVE CALL
}
// factorial(5) = 5*4*3*2*1 = 120
```

### Recursion vs Iteration
| | Recursion | Iteration |
|--|-----------|-----------|
| Code clarity | ✅ Cleaner for tree/graph | ✅ Cleaner for loops |
| Memory | ❌ Stack frame per call | ✅ O(1) extra space |
| Speed | ❌ Function call overhead | ✅ Faster |
| Risk | `StackOverflowError` | Infinite loop (CPU hang) |

### StackOverflowError
```java
// Missing base case → infinite recursion → stack overflow!
public static void bad(int n) {
    System.out.print(n + " ");
    bad(n - 1); // No base case → runs forever → crash!
}
```

---

## 7. Built-in Math Methods

Most-used methods from `java.lang.Math` class (Ch07):

```java
Math.max(10, 25)     // 25  — maximum of two numbers
Math.min(10, 25)     // 10  — minimum of two numbers
Math.pow(2, 3)       // 8.0 — 2³ (returns double)
Math.sqrt(25)        // 5.0 — square root (returns double)
Math.abs(-50)        // 50  — absolute value (removes negative sign)
Math.random()        // 0.0 to 0.9999... — random double
Math.floor(3.9)      // 3.0 — rounds DOWN
Math.ceil(3.1)       // 4.0 — rounds UP
Math.round(3.5)      // 4   — rounds to nearest (returns long)
Math.log(Math.E)     // 1.0 — natural log
Math.PI              // 3.141592... — constant
Math.E               // 2.718281... — Euler's number
```

### DSA-Critical Ones
```java
// Prime check — most important
for (int i = 2; i <= Math.sqrt(n); i++) { ... }  // O(√n)

// Random int from 0 to 99:
int rand = (int)(Math.random() * 100);

// Clamp a value between min and max:
int clamped = Math.min(max, Math.max(min, value));
```

---

## 🔥 FAANG Interview Masterclass

### Q1: Function vs Method in Java?
**Ans:** In Java, they're the same — every function is attached to a class (making it a "method"). Pure standalone functions don't exist in Java (unlike C/C++).

### Q2: Does Java use Call by Value or Call by Reference?
**Ans:** **Java strictly uses Call by Value — always.** For primitives, a copy of the value is passed. For objects/arrays, a copy of the **reference** is passed (both copies point to same heap object, but reassigning the parameter doesn't affect the original).

### Q3: Prove Java is Call by Value using the swap example.
**Ans:** If you pass two ints to `swap()` and swap them inside, the original variables in `main()` remain unchanged. Each method has its own **Stack Frame** with its own copies. The output:
```
Before: num1=10, num2=20
Inside swap: a=20, b=10   ← swapped in frame
After:  num1=10, num2=20  ← originals unchanged
```

### Q4: What is a Stack Frame?
**Ans:** A block of memory on the **Call Stack** allocated for each method call. It holds the method's local variables, parameters, and return address. When the method returns, its frame is **popped and destroyed**.

### Q5: What is Method Overloading?
**Ans:** Having **multiple methods with the same name** but different parameter signatures. Java resolves which to call at **compile time** (Compile-Time Polymorphism). Cannot overload by return type alone.

### Q6: What is StackOverflowError?
**Ans:** Occurs when **infinite recursion** fills up the stack memory. Each recursive call creates a new Stack Frame — without a base case, frames pile up until RAM is exhausted.

### Q7: What are the two mandatory parts of every recursive function?
**Ans:** (1) **Base Case** — the stopping condition that returns without calling recursively. (2) **Recursive Case** — the call to itself with a modified (smaller/simpler) input.

### Q8: What is Variable Shadowing?
**Ans:** When a **local variable** has the same name as a **class-level variable**, the local variable "shadows" (hides) the global one within its scope. Other methods without that local variable still see the global.

### Q9: What are VarArgs? What are the rules?
**Ans:** Variable-length arguments (`DataType... name`) allow a method to accept **any number** of arguments. Rules: (1) Only one varargs per method. (2) Must be the **last parameter**.

### Q10: Can you overload methods by changing only the return type?
**Ans:** **No.** Return type is not part of the method signature for overloading. Two methods with same name and parameters but different return types cause a **compile error**.

### Q11: What is the DRY principle?
**Ans:** **Don't Repeat Yourself** — if you write the same code more than once, extract it into a method. This improves maintainability, reduces bugs, and makes code testable.

### Q12: What is Tail Recursion?
**Ans:** When the recursive call is the **last operation** in the function (no pending work after it returns). Some compilers optimize this to avoid creating new stack frames (Tail Call Optimization — TCO). Java does NOT do TCO, but it's still important for interviews.
```java
// Normal recursion (NOT tail recursive — multiplication pending)
return n * factorial(n-1);

// Tail recursive version:
return factHelper(n, n-1, accumulator * n);
```

### Q13: What happens to local variables when a method returns?
**Ans:** They are **destroyed** along with the Stack Frame. They cannot be accessed after the method returns. This is why you must `return` a value to pass data back to the caller.

### Q14: What is `Math.random()` and how to get a random integer in range?
**Ans:** Returns a `double` between 0.0 (inclusive) and 1.0 (exclusive). For random int in `[0, n)`:
```java
int rand = (int)(Math.random() * n);
// Range [min, max] inclusive:
int rand = min + (int)(Math.random() * (max - min + 1));
```

### Q15: Difference between `Math.floor`, `Math.ceil`, and `Math.round`?
**Ans:**
```java
Math.floor(3.9)  = 3.0  // Always rounds DOWN
Math.ceil(3.1)   = 4.0  // Always rounds UP
Math.round(3.5)  = 4    // Rounds to nearest (returns long/int)
Math.round(3.4)  = 3
```

### Q16: Why does passing an array to a method allow modification of elements?
**Ans:** The array reference is copied (Call by Value), but both the copy and the original reference point to the **same array object in Heap memory**. So modifying `arr[0]` inside the method changes the Heap object — visible everywhere.

### Q17: What is Recursive Exponentiation and why is it O(log n)?
**Ans:** Instead of multiplying `x` by itself `n` times (O(n)), use:
```java
// x^n = x^(n/2) * x^(n/2)  if n is even
// x^n = x * x^(n-1)         if n is odd
long power(long x, long n) {
    if (n == 0) return 1;
    if (n % 2 == 0) { long half = power(x, n/2); return half * half; }
    return x * power(x, n-1);
}
// Halves n each time → O(log n). Used in LC 50: Pow(x,n)
```

### Q18: Can recursion always be converted to iteration?
**Ans:** Yes — any recursive function can be rewritten iteratively using an explicit **Stack data structure** to simulate the call stack. Iterative is usually faster and avoids `StackOverflowError`, but recursive code is often more readable for tree/graph problems.

### Q19: What is the maximum recursion depth in Java?
**Ans:** Depends on **stack size** (default ~512KB–1MB). A recursive function with simple frames can go ~5,000–10,000 levels deep. Use `-Xss` JVM flag to increase stack size if needed.

### Q20: What is method signature in Java?
**Ans:** A method's signature = **name + parameter types** (NOT return type, NOT parameter names). Java uses signature to resolve overloading:
```java
sum(int, int)     // signature 1
sum(int, int, int) // signature 2 — different
sum(double, double) // signature 3 — different
```

---

## ⚠️ Common Pitfalls

| # | Pitfall | Fix |
|---|---------|-----|
| 1 | Thinking Java has Call by Reference | Java is ALWAYS Call by Value — no exceptions |
| 2 | Forgetting base case in recursion | Every recursion needs a base case or → StackOverflowError |
| 3 | VarArgs not last parameter | `foo(int... nums, String s)` → Compile Error |
| 4 | Overloading by return type only | Not valid — same name + same params = compile error |
| 5 | Accessing block-scoped variable outside | Variable dies at `}` — declare outside block if needed later |
| 6 | Using `int` for factorial of large N | `int` overflows at 13! — use `long` (overflows at 20!) |
| 7 | Shadowing confusion | Local `x` hides global `x` — can cause subtle bugs |
| 8 | `Math.pow()` returns `double` | Cast to `int` if needed: `(int) Math.pow(2, 3)` |
| 9 | Recursive swap doesn't work | Swapping copies inside recursion won't affect originals |
| 10 | Deep recursion → StackOverflowError | Convert to iteration or use tail recursion pattern |

---

## 📂 Chapter Index

| File | Topic | Key Concepts |
|------|-------|--------------|
| [Ch01_FunctionBasics.java](Ch01_FunctionBasics.java) | Method Basics | Syntax, void, return, parameters, arguments |
| [Ch02_Memory_CallByValue.java](Ch02_Memory_CallByValue.java) | Call by Value | Stack Frame, swap proof, array note |
| [Ch03_MethodOverloading.java](Ch03_MethodOverloading.java) | Method Overloading | Compile-time polymorphism, 3 variants |
| [Ch04_Scope_And_Shadowing.java](Ch04_Scope_And_Shadowing.java) | Scope & Shadowing | Block/method/class scope, local hides global |
| [Ch05_VarArgs.java](Ch05_VarArgs.java) | VarArgs | `int... nums`, rules, mixed params |
| [Ch06_BasicRecursion.java](Ch06_BasicRecursion.java) | Recursion | Base case, recursive call, factorial, N-to-1 |
| [Ch07_BuiltInMethods.java](Ch07_BuiltInMethods.java) | Math Class | max, min, pow, sqrt, abs, random |

---

## 🗺️ Practice Problem Map

### 🔰 Beginner
- [x] Write a method to check if a number is even/odd
- [x] Write a method to calculate sum of two numbers
- [x] Demonstrate Call by Value with a swap method
- [x] Overload a `sum()` method for 2 ints, 3 ints, and 2 doubles
- [x] Use VarArgs to calculate total marks of any number of subjects

### ⚡ Intermediate
- [x] Print N to 1 using recursion
- [x] Calculate factorial using recursion
- [x] Demonstrate variable shadowing with a class-level and local variable
- [x] Write a method using all 6 Math class functions
- [x] Prove array modification is visible in caller (vs primitive is not)

### 🔥 Advanced / FAANG-Level
- [x] Fibonacci using recursion (LC 509)
- [x] Power of 2/3/4 using recursion (LC 231, 326, 342)
- [x] Fast Power: `Pow(x, n)` in O(log n) — Divide & Conquer (LC 50)
- [x] Modular Exponentiation (LC 1922)
- [ ] Print 1 to N using recursion (reverse the order in the call)
- [ ] Sum of digits using recursion
- [ ] Check palindrome using recursion
- [ ] Tower of Hanoi (3 parameters recursive problem)

---

## 💻 LeetCode Integration

| # | Problem | Level | Key Technique |
|---|---------|-------|---------------|
| LC 509 | [Fibonacci Number](LeetCode_Practice/LC_509_FibonacciNumber.java) | Easy | Basic recursion tree |
| LC 231 | [Power of Two](LeetCode_Practice/LC_231_PowerOfTwo.java) | Easy | Divide by 2 recursively |
| LC 326 | [Power of Three](LeetCode_Practice/LC_326_PowerOfThree.java) | Easy | Divide by 3 recursively |
| LC 342 | [Power of Four](LeetCode_Practice/LC_342_PowerOfFour.java) | Easy | Divide by 4 recursively |
| LC 1342 | [Steps to Reduce to Zero](LeetCode_Practice/LC_1342_NumberOfStepsToReduceToZero.java) | Easy | Recursive step counter |
| LC 50 | [Pow(x, n)](LeetCode_Practice/LC_050_PowXN.java) | Medium | **D&C recursion O(log n)** — FAANG Favorite |
| LC 1922 | [Count Good Numbers](LeetCode_Practice/LC_1922_CountGoodNumbers.java) | Medium | Modular Exponentiation |
| LC 258 | [Add Digits](LeetCode_Practice/LC_258_AddDigits.java) | Easy | Helper method extraction |
| LC 7 | [Reverse Integer](LeetCode_Practice/LC_007_ReverseInteger.java) | Medium | Helper with `long` overflow guard |
| LC 69 | [Sqrt(x)](LeetCode_Practice/LC_069_SqrtX.java) | Easy | Rebuild `Math.sqrt()` manually |

---

## 📋 Quick Reference Cheat Sheet

```
┌──────────────────────────────────────────────────────────────┐
│         FUNCTIONS & METHODS — QUICK REF                      │
├──────────────────┬───────────────────────────────────────────┤
│  SYNTAX          │  returnType name(Type p1, Type p2) { }   │
│                  │  void = no return value                   │
├──────────────────┼───────────────────────────────────────────┤
│  CALL BY VALUE   │  Java ALWAYS passes COPIES               │
│                  │  Primitives: copy of value               │
│                  │  Objects/Arrays: copy of reference        │
│                  │  Modifying reference copy ≠ reassigning   │
├──────────────────┼───────────────────────────────────────────┤
│  STACK FRAME     │  Created per method call                  │
│                  │  Destroyed when method returns            │
│                  │  Holds: params + local vars               │
├──────────────────┼───────────────────────────────────────────┤
│  OVERLOADING     │  Same name, diff params (type or count)  │
│                  │  NOT by return type alone                 │
│                  │  Resolved at COMPILE TIME                 │
├──────────────────┼───────────────────────────────────────────┤
│  SCOPE           │  Block { } → dies at closing }           │
│                  │  Method → dies when method ends           │
│                  │  Class → accessible to all methods        │
│                  │  Local shadows global if same name        │
├──────────────────┼───────────────────────────────────────────┤
│  VARARGS         │  Type... name  (must be LAST param)       │
│                  │  Internally treated as array              │
│                  │  Only ONE varargs per method              │
├──────────────────┼───────────────────────────────────────────┤
│  RECURSION       │  Base Case + Recursive Call               │
│                  │  No base case → StackOverflowError        │
│                  │  Each call = new Stack Frame              │
├──────────────────┼───────────────────────────────────────────┤
│  MATH CLASS      │  max, min, pow, sqrt, abs, random        │
│                  │  pow/sqrt return DOUBLE                   │
│                  │  floor/ceil/round for rounding            │
└──────────────────┴───────────────────────────────────────────┘

RECURSION TEMPLATE:
  returnType solve(params) {
      if (baseCondition) return baseValue;   // BASE CASE
      // some work
      return solve(smallerParams);           // RECURSIVE CALL
  }

CALL BY VALUE PROOF:
  swap(a, b) inside method → a,b swapped (copies)
  swap(a, b) in main       → num1,num2 UNCHANGED

FAST POWER O(log n):
  power(x, n) = power(x, n/2)² if n even
              = x * power(x, n-1) if n odd
```

---

> 💡 **Revision Tip:** Call by Value + Recursion = the two most-asked topics in Java FAANG interviews. Nail the swap proof, know the stack frame model, and always write base case FIRST in recursion. **Pattern: Basics → Memory → Overloading → Scope → VarArgs → Recursion → Built-ins.**

---
**Bhai, functions master ho gaye toh OOP aur DSA dono easy ho jayenge! Keep grinding. ⚙️🔥**
