package ClassAssessment;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int number = 10;
        double count = 0;
        for (int num = 1; num <= number; num++) {
            System.out.println("Enter your score ");
            int score = scanner.nextInt();
            counter += score;
            count++;
        }
        System.out.println("The average of the score is "+ counter / count);
    }
}