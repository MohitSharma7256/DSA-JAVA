import java.util.*;

public class Ch10_My {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Checking the number is Positive or Negative or Zero: ");
        // int num = sc.nextInt();

        // if (num >= 0 ) {
        //     if (num == 0) {
        //         System.out.println("The number is Zero");
        //     } else {
        //         System.out.println("The number is Positive");
        //     }
        // } else{
        //     System.out.println("The number is Negative");
        // }

        System.out.print("Checking odd or even: ");
        int num = sc.nextInt();
        if (num % 2 == 0 ) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }



    
    }
}