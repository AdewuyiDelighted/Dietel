package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIDifficultLevel {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        selectLevel();
    }

    public static void selectLevel() {
        System.out.println("Enter 1 for easy level or enter 2 for difficult level");
        int response = scanner.nextInt();
        switch (response) {
            case 1:
                int total = CAIStudentPerformance.computeStudentPerformance(10);
                CAIStudentPerformance.checkPercentage(total);break;
            case 2:
                int result = twoDigitMultiplication(10);
                CAIStudentPerformance.checkPercentage(result); break;
            default:
                while (response != 1 || response != 2) {
                    System.out.println("Invalid Input(Enter 1 for easy level or enter 2 for difficult level)");
                    response = scanner.nextInt();
                    if (response == 1) {
                        response = CAIStudentPerformance.computeStudentPerformance(10);
                        CAIStudentPerformance.checkPercentage(response);
                    } else if (response == 2) {
                        response = twoDigitMultiplication(10);
                        CAIStudentPerformance.checkPercentage(response);
                    }
                }

        }
    }

    public static int twoDigitMultiplication(int count) {
        int correctCount = 0;
        for (int index = 0; index < count; index++) {
            SecureRandom secureRandom = new SecureRandom();

            int firstNumber = secureRandom.nextInt(10, 20);
            int secondNumber = secureRandom.nextInt(10, 20);
            System.out.println("How much is " + firstNumber + " * " + secondNumber + " ?");

            int studentResponse = scanner.nextInt();
            int result = firstNumber * secondNumber;

            if (studentResponse != result) {
                ComputedAssistedInstructionModify.notCorrectAnswerResponse();
            }
            if (studentResponse == result) {
                ComputedAssistedInstructionModify.correctAnswerResponse();
                correctCount++;

            }

        }
        return correctCount;
    }


}



