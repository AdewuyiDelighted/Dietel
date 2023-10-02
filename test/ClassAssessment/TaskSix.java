package ClassAssessment;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 10;
        int evenNum = 0;
        int count = 0;
        for (int num = 1; num <= number; num++) {
            System.out.println("Enter a number :");
            int input = scanner.nextInt();
            if (input % 2 == 0) {
                evenNum += input;
                count++;
            }
        }
        System.out.println("The average of even number is " + evenNum / count);

    }
}

