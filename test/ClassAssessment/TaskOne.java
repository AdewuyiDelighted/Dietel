package ClassAssessment;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 10;
        for(int num = 1;num <= number;num++){
            System.out.println("Enter your score ");
            int score = scanner.nextInt();
            count += score;
        }
        System.out.println("The total score is " + count);
    }

}
