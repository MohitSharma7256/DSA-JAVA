import java.util.*;

// ============================================================
//  CH-05: SWITCH STATEMENT
//  DSA Module 3: Conditionals | Programming Logic
// ============================================================
//
//  Jab humare paas fixed options hote hain (e.g. Menu, Days), 
//  toh Switch zyada readable aur fast hota hai.
//
//  ⚠️ IMPORTANT: 'break' nahi lagaya toh 'Fall-Through' ho jata hai 
//  (saare niche ke cases run ho jayenge).
//
// ============================================================

public class Ch05_Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday - Back to work!");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday - Weekend!");
                    break;
            case 7: System.out.println("Sunday - Holiday!");
                    break;
            default: System.out.println("Invalid day! Please enter 1-7.");
        }
    }
}
