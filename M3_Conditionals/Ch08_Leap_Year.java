import java.util.*;

// ============================================================
//  CH-08: LEAP YEAR LOGIC (Interview Special)
//  DSA Module 3: Conditionals | Logic Building
// ============================================================

public class Ch08_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        // ── Leap Year Rule ──────────────────────────────────
        // 1. Divisible by 400 → Leap
        // 2. OR (Divisible by 4 AND NOT divisible by 100)
        // ────────────────────────────────────────────────────
        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a LEAP YEAR ✅");
        } else {
            System.out.println(year + " is NOT a leap year ❌");
        }
        
        sc.close();
    }
}
