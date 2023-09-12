package ClassAssessment;

import java.util.Scanner;

public class PsuedoCode {
    public static void main(String[]args) {
        // collect score from user and save
        // check the score collected from user
        // if score is 90 <= 100;
        // if score is 80 <= 89;
        // if score is 70 <= 79;
        // if score is 60 <= 79;
        // if score is < 60;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user Score :");
        int score = scanner.nextInt();

        if(score <= 100 && score >=90) System.out.println("A");
        if(score <= 89 && score >=80) System.out.println("B");
        if(score <= 79 && score >=70) System.out.println("C");
        if(score <= 69 && score >=60) System.out.println("D");
        if(score < 60) System.out.println("F");


    }
}