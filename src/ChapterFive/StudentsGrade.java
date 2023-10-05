package ChapterFive;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        System.out.println("""
                *********************************
                        GRADE EVALUATION PAGE
                **********************************""");
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
        for (int student = 1; student <= 5; student++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("""
                    Enter your grade
                    Enter a letter between A - F
                    (Note all input must be uppercase)""");
            String grade = scanner.nextLine();
            switch (grade) {
                case "A":
                    countA++; break;
                case "B":
                    countB++; break;
                case "C":
                    countC++; break;
                case "D":
                    countD++; break;
                case "F":
                    countF++; break;
                default:
                    System.out.println("""
                            Invalid input
                            Enter between A - F
                            (Note input must be in Uppercase)""");


            }
        }
            System.out.println("The total of student that got A is "+ countA);
            System.out.println("The total of student that got B is "+ countB);
            System.out.println("The total of student that got C is "+ countC);
            System.out.println("The total of student that got D is "+ countD);
            System.out.println("The total of student that got F is "+ countF);


    }
}