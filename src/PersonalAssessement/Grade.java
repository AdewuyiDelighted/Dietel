package PersonalAssessement;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a score");
        int score = scanner.nextInt();

        if(score >= 90){
            System.out.println("A");
        }
        else if(score >= 80){
            System.out.print("B");
        }
        else if(score >= 70){
            System.out.print("C");
        }
        else if(score >= 60){
            System.out.print("D");
        }
        else {
            System.out.println("F");
        }
    }
}
