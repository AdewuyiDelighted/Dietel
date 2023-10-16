package PersonalAssessement;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scanner.nextInt();
        int count = 0;

        while(score < 10) {
            System.out.println("enter score o");
            score = scanner.nextInt();
            for(int num = 0; num <= 10; num++){
            if (score >= 10) {
                System.out.println("good 0");
                score = scanner.nextInt();
                count++;

            }
        }
        }
        System.out.println(count);


    }


}


