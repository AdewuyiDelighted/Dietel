package PersonalAssessement;

import java.util.Scanner;
// Dont read!!!!!!!!!!!!!!
public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter number 1 -3
                1--> Enter your name
                2 -> Enter the name of your school
                3->  Enter the name of your Teacher
                """);
        int enter = scanner.nextInt();
        if(enter == 1) {
            System.out.println("Enter your name");
            int enterTwo = scanner.nextInt();
            if (enterTwo == 1) System.out.println("good one");
            if (enterTwo == 2) System.out.println("very good one");
        }
        if(enter == 2) System.out.println("Enter the name of your school");
        if(enter == 3) System.out.println("Enter the name of your teacher");
        if(enter == 4) System.out.println("Enter the name of your street");

    }
}
