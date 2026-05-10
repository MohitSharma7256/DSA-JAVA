# Module 5: Patterns (Nested Loops & Logic Building)

Welcome to **Module 5: Patterns**. Printing patterns is the ultimate test of your **Nested Loop** logic, mathematical thinking, and coordinate geometry skills. If you can map out a 2D geometry problem into `i` (rows) and `j` (columns), you can solve almost any grid-based problem in advanced DSA (like 2D Arrays and Dynamic Programming).

---

## 🎯 Theoretical Questions & Interview Prep

### **Level 1: The Basics (Junior / Fresher Level)**

**Q1: How do you approach ANY pattern problem?**
- **Ans:** I break it down into 3 steps:
  1. **Rows:** The outer loop always runs for the number of rows.
  2. **Columns/Logic:** The inner loop runs for columns. I find the mathematical relationship between row `i` and col `j` (e.g., if row 2 has 4 stars, I map the equation).
  3. **Print Elements:** I identify if I need to print spaces, stars, or numbers. If spaces are needed for alignment, they must be printed in a separate inner loop *before* the stars.

**Q2: What is the Time Complexity of pattern printing algorithms?**
- **Ans:** Almost all pattern problems have a time complexity of **$O(n^2)$**. This is because an outer loop runs $n$ times, and an inner loop runs proportionally to $n$ times. $n \times n = n^2$.

### **Level 2: Intermediate (Logic & Optimization)**

**Q3: How do you print a "Hollow" pattern instead of a solid one?**
- **Ans:** To print a hollow shape, we use `if-else` inside the inner loop to check if we are at the **boundaries**. We only print a star if `i == 1` (top boundary), `i == n` (bottom boundary), `j == 1` (left boundary), or `j == max` (right boundary). Otherwise, we print a space `" "`.

**Q4: Why is `System.out.print` used instead of `System.out.println` inside the inner loop?**
- **Ans:** `System.out.print` prints elements on the *same line*, which is required to form the columns of a row. We use `System.out.println()` only at the end of the outer loop to break the line and move to the next row.

### **Level 3: Pro / SDE-2 Level (Performance)**

**Q5: String Concatenation vs. System.out.print in Patterns?**
- **Ans:** In standard basic learning, we use `System.out.print("*")`. However, in production or competitive programming with massive grids, making thousands of I/O calls to the console is extremely slow. 
  - **Optimization:** We should build the entire row string using a `StringBuilder`, and then print the entire `StringBuilder` once per row. This drastically reduces I/O overhead.

**Q6: Can you solve the Cross (X) pattern without writing multiple specific space loops?**
- **Ans:** Yes! You visualize the cross as an $N \times N$ matrix. A star is printed only when `i == j` (the Primary Diagonal) or when `i + j == n + 1` (the Secondary Diagonal).

---

## 🗺️ Visualizing Complex Grids

### **The Hollow Diamond Formula**
A diamond requires extreme precision because you are tracking outer spaces and inner spaces simultaneously.
- **Outer spaces:** `n - i`
- **Total column width per row:** `(2 * i) - 1`
- **Hollow Logic:** Only print a star if column `j == 1` OR `j == (2*i) - 1`. Else, print a space.

### **The Butterfly Pattern Logic**
The Butterfly Pattern is a mirror reflection across the X and Y axis.
**Formula for Middle Spaces:** `2 * (n - i)`.

---

## 💻 LeetCode Integration & Advanced Practice

Pure "Star Printing" is often asked in HackerRank or TCS/Wipro screening rounds. However, LeetCode focuses on **Matrix & String Pattern Logic**, which is the advanced version of star printing.

I have solved **10 specific pattern-logic problems** in the `LeetCode_Practice` directory:

### Core Geometrical Patterns (The Fundamentals)
1. `Ch01_Solid_Hollow_Rectangles.java` (Boundary logic)
2. `Ch02_Half_Pyramids.java` (Right angled, rotated)
3. `Ch03_Full_Pyramids.java` (Equilateral Triangles)
4. `Ch04_Diamond_Pattern.java` (Upper + Lower Pyramids)
5. `Ch05_Butterfly_Pattern.java` (Mirroring Logic)
6. `Ch06_Number_Patterns.java` (Floyd's and 0-1 Triangles)
7. `Ch07_Rhombus_Patterns.java` (Shifted Squares)
8. `Ch08_Advanced_Number_Pyramids.java` (Palindromic alignment)
9. `Ch09_Pascals_Triangle.java` (nCr mathematical approach)
10. `Ch10_Hollow_Diamond_Pattern.java` (Advanced inner boundary tracking)
11. `Ch11_Hollow_Butterfly_Pattern.java` (Complex 4-way space checking)
12. `Ch12_Sandglass_Pattern.java` (Inverted + Upright pyramids)
13. `Ch13_Alphabet_Patterns.java` (ASCII typecasting patterns)
14. `Ch14_Cross_Pattern.java` (Diagonal Matrix logic)

### LeetCode Problem List (Matrix & String Patterns)
1. **[LC 118: Pascal's Triangle](LeetCode_Practice/LC_118_PascalsTriangle.java)** (Easy) - Iterative list approach.
2. **[LC 119: Pascal's Triangle II](LeetCode_Practice/LC_119_PascalsTriangleII.java)** (Easy) - $O(n)$ space optimization to fetch a specific row.
3. **[LC 6: Zigzag Conversion](LeetCode_Practice/LC_006_ZigzagConversion.java)** (Medium) - Diagonal string patterns using an array of StringBuilders.
4. **[LC 38: Count and Say](LeetCode_Practice/LC_038_CountAndSay.java)** (Medium) - Sequential string pattern generation.
5. **[LC 54: Spiral Matrix](LeetCode_Practice/LC_054_SpiralMatrix.java)** (Medium) - The ultimate grid traversal pattern using 4 boundary pointers.
6. **[LC 59: Spiral Matrix II](LeetCode_Practice/LC_059_SpiralMatrixII.java)** (Medium) - Generating numbers inside a spiral.
7. **[LC 48: Rotate Image](LeetCode_Practice/LC_048_RotateImage.java)** (Medium) - Matrix pattern shifting (Transpose + Reverse).
8. **[LC 12: Integer to Roman](LeetCode_Practice/LC_012_IntegerToRoman.java)** (Medium) - Parallel arrays pattern matching.
9. **[LC 13: Roman to Integer](LeetCode_Practice/LC_013_RomanToInteger.java)** (Easy) - Reverse string loop pattern with subtraction checks.
10. **[LC 2125: Number of Laser Beams in a Bank](LeetCode_Practice/LC_2125_NumberOfLaserBeams.java)** (Medium) - Finding horizontal patterns in a grid.
