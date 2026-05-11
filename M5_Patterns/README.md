# 🎨 Module 5: Patterns (Master Guide)
> **Level:** Beginner to FAANG-Pro 🚀 | **Status:** Completed ✅

Patterns = **Nested Loops + Mathematics + Coordinate Logic**. If you can map any 2D shape to `i` (row) and `j` (column) formulas, you can solve Spiral Matrix, Rotate Image, and any grid-based DSA problem.

---

## 📑 Table of Contents
1. [The Universal Approach](#1-the-universal-approach)
2. [Rectangles (Solid & Hollow)](#2-rectangles-solid--hollow)
3. [Half Pyramids (5 variants)](#3-half-pyramids)
4. [Full Pyramids](#4-full-pyramids)
5. [Diamond Pattern](#5-diamond-pattern)
6. [Butterfly Pattern](#6-butterfly-pattern)
7. [Number Patterns](#7-number-patterns)
8. [Rhombus Patterns](#8-rhombus-patterns)
9. [Advanced Number Pyramids](#9-advanced-number-pyramids)
10. [Pascal's Triangle](#10-pascals-triangle)
11. [Advanced Patterns (Ch10–Ch17)](#11-advanced-patterns)
12. [🔥 FAANG Interview Masterclass](#-faang-interview-masterclass)
13. [⚠️ Common Pitfalls](#️-common-pitfalls)
14. [📂 Chapter Index](#-chapter-index)
15. [🗺️ Practice Problem Map](#️-practice-problem-map)
16. [💻 LeetCode Integration](#-leetcode-integration)
17. [📋 Formula Cheat Sheet](#-formula-cheat-sheet)

---

## 1. The Universal Approach

**3-Step Framework for ANY pattern:**

```
Step 1 → Count ROWS        → Outer loop runs n times
Step 2 → Find COLUMN MATH  → Relate inner loop bound to outer 'i'
Step 3 → Identify ELEMENTS → Stars? Spaces? Numbers? Boundaries?
```

**Key Insight:** Spaces are NOT empty — they must be **explicitly printed** with `System.out.print(" ")`.

**Performance Tip:** Instead of thousands of `System.out.print()` calls, use `StringBuilder`:
```java
StringBuilder sb = new StringBuilder();
for (int j = 0; j < cols; j++) sb.append("*");
System.out.println(sb);  // One I/O call per row — much faster!
```

---

## 2. Rectangles (Solid & Hollow)

### Solid Rectangle (Ch01)
```java
// rows=4, cols=5
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) System.out.print("*");
    System.out.println();
}
// *****
// *****
// *****
// *****
```

### Hollow Rectangle (Ch01)
```java
// Print star ONLY on boundaries
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        if (i == 1 || i == rows || j == 1 || j == cols)
            System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}
// *****
// *   *
// *   *
// *****
```
**Hollow Rule:** `i==1 || i==rows || j==1 || j==cols` → boundary condition works for ANY shape.

---

## 3. Half Pyramids

All 5 variants (Ch02):

### 1. Half Pyramid (Left-aligned)
```
*          Formula: stars = i
**         Inner: j <= i
***
****
```
```java
for (int i=1;i<=n;i++) { for(int j=1;j<=i;j++) System.out.print("*"); System.out.println(); }
```

### 2. Inverted Half Pyramid
```
****       Formula: stars = n-i+1
***        Outer: i from n down to 1
**
*
```
```java
for (int i=n;i>=1;i--) { for(int j=1;j<=i;j++) System.out.print("*"); System.out.println(); }
```

### 3. Right-Aligned (Rotated) Half Pyramid
```
   *       Spaces = n-i,  Stars = i
  **
 ***
****
```
```java
for (int i=1;i<=n;i++) {
    for(int j=1;j<=n-i;j++) System.out.print(" "); // spaces first
    for(int j=1;j<=i;j++) System.out.print("*");
    System.out.println();
}
```

### 4. Half Pyramid with Numbers
```
1          Inner prints j (column number)
1 2
1 2 3
1 2 3 4
```
```java
for(int i=1;i<=n;i++) { for(int j=1;j<=i;j++) System.out.print(j+" "); System.out.println(); }
```

### 5. Inverted Half Pyramid with Numbers
```
1 2 3 4
1 2 3
1 2
1
```
```java
for(int i=n;i>=1;i--) { for(int j=1;j<=i;j++) System.out.print(j+" "); System.out.println(); }
```

---

## 4. Full Pyramids

### Solid Full Pyramid (Ch03)
```
    *          Row i: spaces=(n-i), stars=(2*i-1)
   ***         Stars follow ODD sequence: 1,3,5,7...
  *****        Formula: stars = 2*i - 1
 *******
```
```java
for (int i=1;i<=n;i++) {
    for(int j=1;j<=n-i;j++) System.out.print(" ");   // spaces
    for(int j=1;j<=(2*i)-1;j++) System.out.print("*"); // stars
    System.out.println();
}
```

### Inverted Full Pyramid
Same formulas, outer loop runs **i from n down to 1**.

---

## 5. Diamond Pattern

**Diamond = Upper Full Pyramid + Lower Inverted Pyramid** (Ch04)

```
   *       Upper: spaces=n-i, stars=2*i-1
  ***       
 *****      Lower: reverse loop (i from n to 1)
  ***       Same formulas work!
   *
```

**Math derivation:**
| Row i | Spaces (n-i) | Stars (2i-1) |
|-------|-------------|-------------|
| 1 | 3 | 1 |
| 2 | 2 | 3 |
| 3 | 1 | 5 |
| 4 | 0 | 7 |

```java
// Upper half
for(int i=1;i<=n;i++) {
    for(int j=1;j<=n-i;j++) System.out.print(" ");
    for(int j=1;j<=(2*i)-1;j++) System.out.print("*");
    System.out.println();
}
// Lower half (start at n to avoid duplicating middle row use n-1)
for(int i=n;i>=1;i--) {
    for(int j=1;j<=n-i;j++) System.out.print(" ");
    for(int j=1;j<=(2*i)-1;j++) System.out.print("*");
    System.out.println();
}
```

---

## 6. Butterfly Pattern

**Wings on both sides, spaces in the middle** (Ch05)

```
*      *     Row i: Left=i stars, Spaces=2*(n-i), Right=i stars
**    **      Total columns = 2*n always
***  ***
********
***  ***
**    **
*      *
```

**Magic Formula:** Middle spaces = `2 * (n - i)`

```java
// Upper half
for(int i=1;i<=n;i++) {
    for(int j=1;j<=i;j++) System.out.print("*");         // left
    for(int j=1;j<=2*(n-i);j++) System.out.print(" ");   // middle
    for(int j=1;j<=i;j++) System.out.print("*");         // right
    System.out.println();
}
// Lower half (reverse)
for(int i=n;i>=1;i--) {
    for(int j=1;j<=i;j++) System.out.print("*");
    for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
    for(int j=1;j<=i;j++) System.out.print("*");
    System.out.println();
}
```

---

## 7. Number Patterns

### Floyd's Triangle (Ch06)
```
1           Continuous counter regardless of i,j
2 3
4 5 6
7 8 9 10
```
```java
int counter = 1;
for(int i=1;i<=n;i++) {
    for(int j=1;j<=i;j++) System.out.print(counter++ + " ");
    System.out.println();
}
```

### 0-1 Triangle (Ch06)
```
1           Print 1 if (i+j) is EVEN, else 0
0 1
1 0 1
0 1 0 1
```
```java
for(int i=1;i<=n;i++) {
    for(int j=1;j<=i;j++) System.out.print(((i+j)%2==0 ? "1":"0") + " ");
    System.out.println();
}
```

---

## 8. Rhombus Patterns

**Rhombus = Shifted Square** (Ch07)

```
    *****    Spaces = n-i (decreasing)
   *****     Stars = always n
  *****
 *****
*****
```
```java
for(int i=1;i<=n;i++) {
    for(int j=1;j<=n-i;j++) System.out.print(" "); // shift
    for(int j=1;j<=n;j++) System.out.print("*");   // always n stars
    System.out.println();
}
```
**Hollow Rhombus:** Same shift, but apply boundary check `(i==1||i==n||j==1||j==n)`.

---

## 9. Advanced Number Pyramids

### Number Pyramid (Ch08)
```
   1         Spaces=n-i, prints 'i' exactly i times
  2 2
 3 3 3
4 4 4 4
```
```java
for(int i=1;i<=n;i++) {
    for(int j=1;j<=n-i;j++) System.out.print(" ");
    for(int j=1;j<=i;j++) System.out.print(i+" ");
    System.out.println();
}
```

### Palindromic Number Pattern (Ch08)
```
        1       Spaces=n-i
      2 1 2     Descending: i→1, Ascending: 2→i
    3 2 1 2 3
  4 3 2 1 2 3 4
```
```java
for(int i=1;i<=n;i++) {
    for(int j=1;j<=n-i;j++) System.out.print("  ");
    for(int j=i;j>=1;j--) System.out.print(j+" ");  // descending
    for(int j=2;j<=i;j++) System.out.print(j+" ");  // ascending
    System.out.println();
}
```

---

## 10. Pascal's Triangle

```
    1          Each value = C(row, col) = row! / (col! * (row-col)!)
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```
```java
// Helper
static int fact(int n) { int f=1; for(int i=1;i<=n;i++) f*=i; return f; }

// Main
for(int i=0;i<n;i++) {
    for(int j=0;j<n-i;j++) System.out.print(" ");
    for(int j=0;j<=i;j++) {
        int val = fact(i) / (fact(j) * fact(i-j)); // iCj
        System.out.print(val + " ");
    }
    System.out.println();
}
```
> **LeetCode Connection:** LC 118 (Pascal's Triangle), LC 119 (Row optimization to O(n) space)

---

## 11. Advanced Patterns

### Hollow Diamond (Ch10)
- **Outer spaces:** `n - i`
- **Inner spaces:** `(2*i) - 3` (only for middle rows, not first/last col)
- **Rule:** Print `*` only if `j==1` or `j==(2*i)-1`

### Hollow Butterfly (Ch11)
- Left wing boundary + right wing boundary + inner space
- 4-way space checking for each cell

### Sandglass Pattern (Ch12)
- Inverted Full Pyramid on top + Full Pyramid on bottom
- Exact mirror of Diamond logic

### Alphabet Patterns (Ch13)
```
A           Cast row number to char: (char)('A' + i - 1)
A B
A B C
```
```java
for(int i=1;i<=n;i++) {
    for(int j=1;j<=i;j++) System.out.print((char)('A'+j-1) + " ");
    System.out.println();
}
```

### Cross (X) Pattern (Ch14)
```
*   *       Star printed if: i==j (primary diagonal)
 * *        OR i+j == n+1 (secondary diagonal)
  *
 * *
*   *
```
```java
for(int i=1;i<=n;i++) {
    for(int j=1;j<=n;j++) {
        if(i==j || i+j==n+1) System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}
```

### Concentric Square Pattern (Ch15)
```
5 5 5 5 5   Value at (i,j) = min distance from any border
5 4 4 4 5   = min(i, j, n-i+1, n-j+1)
5 4 3 4 5
5 4 4 4 5
5 5 5 5 5
```
```java
for(int i=1;i<=n;i++) {
    for(int j=1;j<=n;j++) {
        int val = Math.min(Math.min(i,j), Math.min(n-i+1, n-j+1));
        System.out.print((n+1-val) + " ");
    }
    System.out.println();
}
```

### Heart Pattern (Ch16)
- Upper: Two humps using circle-boundary math
- Lower: Inverted triangle

### Arrow Pattern (Ch17)
- Upper: right-aligned expanding
- Lower: right-aligned shrinking

---

## 🔥 FAANG Interview Masterclass

### Q1: How to approach ANY pattern problem?
**Ans:** 3 steps: (1) Outer loop = rows. (2) Find math relation between row `i` and column count. (3) Print spaces BEFORE stars for right-alignment. **Never skip the space loop.**

### Q2: Time complexity of pattern problems?
**Ans:** Always **O(n²)** — outer loop runs n times, inner loop runs proportionally to n.

### Q3: How to print a hollow shape?
**Ans:** Inside the inner loop, check if on boundary: `i==1 || i==rows || j==1 || j==cols`. Print `*` for boundary, `" "` for interior.

### Q4: Why `System.out.print` vs `println`?
**Ans:** `print` keeps output on the same line (builds columns). `println` at end of outer loop moves to next row.

### Q5: How to optimize pattern I/O performance?
**Ans:** Use `StringBuilder` — build entire row string, then `System.out.println(sb)` once per row. Reduces thousands of I/O calls to n calls.

### Q6: What formula gives stars in a Full Pyramid?
**Ans:** `(2 * i) - 1` — generates odd sequence 1, 3, 5, 7... Spaces = `n - i`.

### Q7: Butterfly middle spaces formula?
**Ans:** `2 * (n - i)`. Total width = `2*n`. Left+Right = `2*i`. So middle = `2n - 2i = 2(n-i)`.

### Q8: How to print a Cross (X) pattern efficiently?
**Ans:** In an N×N grid, print `*` when `i == j` (primary diagonal) OR `i + j == n + 1` (secondary diagonal). No multiple loops needed.

### Q9: What is Pascal's Triangle value at position (i, j)?
**Ans:** `C(i, j) = i! / (j! * (i-j)!)`. For O(n) space optimization (LC 119), use the previous row to generate next: `val = prevRow[j-1] + prevRow[j]`.

### Q10: What is the Concentric Square formula?
**Ans:** Value at (i,j) = `n + 1 - min(i, j, n-i+1, n-j+1)`. Represents the "layer" number from outside in.

### Q11: How does Floyd's Triangle work?
**Ans:** Maintain a `counter` variable outside all loops. Increment it inside the inner loop regardless of `i` or `j`. Row 1 gets 1 number, row 2 gets 2, etc.

### Q12: How does the 0-1 Triangle decide what to print?
**Ans:** Print `1` if `(i + j) % 2 == 0` (even sum), else `0`. This creates the alternating pattern without any external counter.

### Q13: How to print alphabet patterns?
**Ans:** Cast to `char`: `(char)('A' + j - 1)` gives letters A, B, C... Use `(char)('A' + i - 1)` to print the row's letter repeatedly.

### Q14: What is the Hollow Diamond inner space formula?
**Ans:** For row `i`, total stars = `2*i - 1`. Stars are at positions `j==1` and `j==2*i-1`. Inner spaces = `2*i - 3` (for rows 2 to n-1).

### Q15: How does Spiral Matrix relate to patterns? (LeetCode 54)
**Ans:** Uses 4 boundary pointers (`top`, `bottom`, `left`, `right`) that shrink after each direction pass. It's coordinate geometry on a 2D grid — same mental model as pattern printing.

---

## ⚠️ Common Pitfalls

| # | Pitfall | Fix |
|---|---------|-----|
| 1 | Forgetting to print spaces | Spaces must be explicitly printed — never assume they exist |
| 2 | `System.out.println` inside inner loop | Use `print` for columns, `println` only after inner loop |
| 3 | Diamond middle row duplicated | Start lower half at `n-1` to avoid repeating center row |
| 4 | Pascal's Triangle: using `int` for large n | Use `long` for factorial — `int` overflows at 13! |
| 5 | Right-aligned pyramid: wrong space formula | Spaces = `n - i`, not `i` |
| 6 | Off-by-one in hollow shape | Boundary check must use `== 1` and `== cols` (not `< 2`) |
| 7 | Floyd's Triangle counter reset inside loop | Counter must be declared **outside** both loops |
| 8 | Concentric square: wrong formula direction | Value should **decrease** toward center, not increase |
| 9 | Butterfly: left and right wings equal | Both wings = `i` stars. Middle space only = `2*(n-i)` |
| 10 | Cross pattern: using multiple specific loops | Use `i==j || i+j==n+1` — single condition, one inner loop |

---

## 📂 Chapter Index

| File | Pattern | Key Formula |
|------|---------|-------------|
| [Ch01_Solid_Hollow_Rectangles.java](Ch01_Solid_Hollow_Rectangles.java) | Rectangle + Hollow | Boundary: `i==1\|\|i==n\|\|j==1\|\|j==cols` |
| [Ch02_Half_Pyramids.java](Ch02_Half_Pyramids.java) | 5 Half Pyramid variants | Stars=i, Spaces=n-i |
| [Ch03_Full_Pyramids.java](Ch03_Full_Pyramids.java) | Full + Inverted Pyramid | Stars=2i-1, Spaces=n-i |
| [Ch04_Diamond_Pattern.java](Ch04_Diamond_Pattern.java) | Diamond | Upper+Lower pyramid combined |
| [Ch05_Butterfly_Pattern.java](Ch05_Butterfly_Pattern.java) | Butterfly | Middle spaces=2*(n-i) |
| [Ch06_Number_Patterns.java](Ch06_Number_Patterns.java) | Floyd's + 0-1 Triangle | counter++, (i+j)%2 |
| [Ch07_Rhombus_Patterns.java](Ch07_Rhombus_Patterns.java) | Solid+Hollow Rhombus | Shift=n-i, Stars=n |
| [Ch08_Advanced_Number_Pyramids.java](Ch08_Advanced_Number_Pyramids.java) | Number + Palindromic | Print i, descend+ascend |
| [Ch09_Pascals_Triangle.java](Ch09_Pascals_Triangle.java) | Pascal's Triangle | nCr = n!/(r!(n-r)!) |
| [Ch10_Hollow_Diamond_Pattern.java](Ch10_Hollow_Diamond_Pattern.java) | Hollow Diamond | j==1 \|\| j==2i-1 |
| [Ch11_Hollow_Butterfly_Pattern.java](Ch11_Hollow_Butterfly_Pattern.java) | Hollow Butterfly | 4-way boundary check |
| [Ch12_Sandglass_Pattern.java](Ch12_Sandglass_Pattern.java) | Sandglass | Inverted+Upright pyramid |
| [Ch13_Alphabet_Patterns.java](Ch13_Alphabet_Patterns.java) | Alphabet Patterns | (char)('A'+j-1) |
| [Ch14_Cross_Pattern.java](Ch14_Cross_Pattern.java) | Cross (X) | i==j \|\| i+j==n+1 |
| [Ch15_Concentric_Square_Pattern.java](Ch15_Concentric_Square_Pattern.java) | Concentric Square | min(i,j,n-i+1,n-j+1) |
| [Ch16_Heart_Pattern.java](Ch16_Heart_Pattern.java) | Heart | Two humps + triangle |
| [Ch17_Arrow_Pattern.java](Ch17_Arrow_Pattern.java) | Arrow | Expanding+Shrinking right |

---

## 🗺️ Practice Problem Map

### 🔰 Beginner
- [x] Solid Rectangle (4×5)
- [x] Hollow Rectangle
- [x] Half Pyramid (all 5 variants)
- [x] Inverted Half Pyramid

### ⚡ Intermediate
- [x] Full Pyramid + Inverted Full Pyramid
- [x] Diamond Pattern (with formula derivation)
- [x] Butterfly Pattern (middle space formula)
- [x] Floyd's Triangle + 0-1 Triangle
- [x] Solid + Hollow Rhombus
- [x] Number Pyramid + Palindromic Pattern
- [x] Pascal's Triangle

### 🔥 Advanced / FAANG-Level
- [x] Hollow Diamond
- [x] Hollow Butterfly
- [x] Sandglass
- [x] Alphabet Patterns
- [x] Cross (X) Pattern using diagonal math
- [x] Concentric Square using `min()` formula
- [ ] Heart Pattern
- [ ] Arrow Pattern
- [ ] LC 54: Spiral Matrix (boundary pointer technique)
- [ ] LC 48: Rotate Image (transpose + reverse)

---

## 💻 LeetCode Integration

| # | Problem | Level | Connection to Patterns |
|---|---------|-------|------------------------|
| LC 118 | [Pascal's Triangle](LeetCode_Practice/LC_118_PascalsTriangle.java) | Easy | nCr formula, nested loop |
| LC 119 | [Pascal's Triangle II](LeetCode_Practice/LC_119_PascalsTriangleII.java) | Easy | O(n) space — prev row trick |
| LC 6 | [Zigzag Conversion](LeetCode_Practice/LC_006_ZigzagConversion.java) | Medium | Diagonal string pattern |
| LC 38 | [Count and Say](LeetCode_Practice/LC_038_CountAndSay.java) | Medium | Sequential string generation |
| LC 54 | [Spiral Matrix](LeetCode_Practice/LC_054_SpiralMatrix.java) | Medium | 4 boundary pointers |
| LC 59 | [Spiral Matrix II](LeetCode_Practice/LC_059_SpiralMatrixII.java) | Medium | Fill numbers in spiral |
| LC 48 | [Rotate Image](LeetCode_Practice/LC_048_RotateImage.java) | Medium | Transpose + Reverse |
| LC 12 | [Integer to Roman](LeetCode_Practice/LC_012_IntegerToRoman.java) | Medium | Parallel array pattern |
| LC 13 | [Roman to Integer](LeetCode_Practice/LC_013_RomanToInteger.java) | Easy | Reverse loop + subtract |
| LC 2125 | [Laser Beams in Bank](LeetCode_Practice/LC_2125_NumberOfLaserBeams.java) | Medium | Row pattern detection |

---

## 📋 Formula Cheat Sheet

```
┌────────────────────────────────────────────────────────────┐
│              PATTERN FORMULAS — QUICK REF                  │
├──────────────────────┬─────────────────────────────────────┤
│  PATTERN             │  FORMULA                            │
├──────────────────────┼─────────────────────────────────────┤
│  Half Pyramid        │  Stars = i (j <= i)                 │
│  Inverted Half       │  Stars = i (outer: n→1)             │
│  Right-Aligned       │  Spaces=n-i, Stars=i                │
│  Full Pyramid        │  Spaces=n-i, Stars=2*i-1            │
│  Inverted Full       │  Same, outer: n→1                   │
│  Diamond             │  Upper+Lower pyramid combined       │
│  Butterfly           │  Stars=i, Spaces=2*(n-i), Stars=i  │
│  Rhombus             │  Spaces=n-i, Stars=n (always)       │
│  Number Pyramid      │  Spaces=n-i, print i, i times       │
│  Palindromic         │  Descend(i→1) + Ascend(2→i)        │
│  Floyd's Triangle    │  counter++ regardless of i,j        │
│  0-1 Triangle        │  (i+j)%2==0 → 1, else 0            │
│  Pascal's Triangle   │  C(i,j) = i!/(j!*(i-j)!)           │
│  Cross (X)           │  i==j OR i+j==n+1                  │
│  Concentric Square   │  n+1 - min(i,j,n-i+1,n-j+1)        │
│  Hollow (any shape)  │  Print * only on boundary, else ' ' │
│  Alphabet            │  (char)('A' + j - 1)               │
└──────────────────────┴─────────────────────────────────────┘

UNIVERSAL RULE:
  Outer loop  → controls ROWS
  Inner loop  → controls COLUMNS (formula depends on pattern)
  print       → same line (columns)
  println()   → end of outer loop (next row)
  Spaces      → always printed BEFORE stars for alignment
```

---

> 💡 **Revision Tip:** The 3 hardest patterns — Diamond, Butterfly, Concentric Square — all have elegant single formulas. Memorize them and you can derive everything else. **Pattern: Rectangle → Half Pyramid → Full Pyramid → Diamond → Butterfly → Number → Advanced.**

---
**Bhai, patterns master karne ke baad 2D arrays aur DP grid easy lagenge! 🎨🔥**
