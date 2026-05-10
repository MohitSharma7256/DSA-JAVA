# Module 6: Functions & Methods

Welcome to **Module 6: Functions & Methods**. This module transitions you from writing procedural scripts into modular, reusable, and enterprise-grade code. You will also learn the absolute most important interview topic regarding Java memory: **Call by Value vs Call by Reference**, and dive into the foundation of advanced DSA: **Recursion**.

---

## 🎯 Theoretical Questions & Interview Prep

### **Level 1: The Basics**

**Q1: What is the difference between a Function and a Method?**
- **Ans:** In Java, they are the exact same thing. The term "Method" is used because the function is attached to a Class (Object-Oriented Programming). In languages like C++, functions can exist outside of classes.

**Q2: What is a Parameter vs an Argument?**
- **Ans:** 
  - **Parameter:** The variable defined in the method signature (e.g., `void greet(String name)` -> `name` is the parameter).
  - **Argument:** The actual value passed when calling the method (e.g., `greet("Mohit")` -> `"Mohit"` is the argument).

### **Level 2: Memory & Execution (SDE-1 Level)**

**Q3: Does Java use Call by Value or Call by Reference?**
- **Ans:** **Java strictly uses Call by Value.** It NEVER uses Call by Reference.
- **Proof:** When you pass a primitive variable (like `int x = 10`) to a method, Java creates a **copy** of the value `10` and gives it to the method. If the method modifies it, only the copy changes. The original `x` in the `main` method remains `10`.

**Q4: Explain the Call Stack (Stack Memory).**
- **Ans:** Every time a method is called, Java allocates a new block of memory called a **Stack Frame** on top of the Call Stack. This frame holds the method's local variables. When the method finishes (returns), its Stack Frame is destroyed and popped off the stack. This is why local variables cannot be accessed outside their methods!

### **Level 3: Recursion & Advanced Scope**

**Q5: What is Method Overloading?**
- **Ans:** It is Compile-Time Polymorphism. You can have multiple methods with the *exact same name*, as long as they have different parameters (different amount of parameters, or different data types). Java figures out which one to call based on the arguments you provide.

**Q6: What is a StackOverflowError?**
- **Ans:** It occurs during **infinite recursion**. If a recursive function keeps calling itself without a proper **Base Case** to stop it, Java keeps creating new Stack Frames. Eventually, the RAM allocated for the Stack Memory gets completely full, and the program crashes with a `StackOverflowError`.

---

## 💻 LeetCode Integration & Advanced Practice

Recursion and helper-method extraction are heavily tested in FAANG. I have solved **10 specific problems** in the `LeetCode_Practice` directory:

### Core Recursion (The Fundamentals)
1. **[LC 509: Fibonacci Number](LeetCode_Practice/LC_509_FibonacciNumber.java)** (Easy) - The absolute classic recursion tree problem.
2. **[LC 231: Power of Two](LeetCode_Practice/LC_231_PowerOfTwo.java)** (Easy) - Dividing by 2 recursively.
3. **[LC 326: Power of Three](LeetCode_Practice/LC_326_PowerOfThree.java)** (Easy) - Dividing by 3 recursively.
4. **[LC 342: Power of Four](LeetCode_Practice/LC_342_PowerOfFour.java)** (Easy) - Dividing by 4 recursively.
5. **[LC 1342: Number of Steps to Reduce a Number to Zero](LeetCode_Practice/LC_1342_NumberOfStepsToReduceToZero.java)** (Easy) - Tracking steps using a recursive helper parameter.

### Advanced Math & Method Extraction
6. **[LC 50: Pow(x, n)](LeetCode_Practice/LC_050_PowXN.java)** (Medium) - **FAANG Favorite!** Uses Divide and Conquer recursion to achieve $O(\log n)$ time instead of $O(n)$.
7. **[LC 1922: Count Good Numbers](LeetCode_Practice/LC_1922_CountGoodNumbers.java)** (Medium) - Extreme math. Uses recursive Modular Exponentiation.
8. **[LC 258: Add Digits](LeetCode_Practice/LC_258_AddDigits.java)** (Easy) - Extracts digit summation into a reusable helper method.
9. **[LC 7: Reverse Integer](LeetCode_Practice/LC_007_ReverseInteger.java)** (Medium) - Extracts reversing logic into a helper method that uses `long` to prevent crash overflows.
10. **[LC 69: Sqrt(x)](LeetCode_Practice/LC_069_SqrtX.java)** (Easy) - Rebuilding the built-in `Math.sqrt()` method manually.

---

## 🛠️ The Chapters Covered:
- `Ch01_FunctionBasics.java`: Syntax, Returns, Parameters.
- `Ch02_Memory_CallByValue.java`: The Stack Frame Proof.
- `Ch03_MethodOverloading.java`: Compile time polymorphism.
- `Ch04_Scope_And_Shadowing.java`: Block vs Method scope.
- `Ch05_VarArgs.java`: `int... args` logic.
- `Ch06_BasicRecursion.java`: Base cases and recursive steps.
- `Ch07_BuiltInMethods.java`: `Math.max`, `Math.pow`, etc.
