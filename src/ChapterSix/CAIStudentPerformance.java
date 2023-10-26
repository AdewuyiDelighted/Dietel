package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIStudentPerformance {
    static Scanner scanner = new Scanner(System.in);




    public static int computeStudentPerformance(int count) {
        int correctAnswer = 0;
        for (int index = 0; index < count; index++) {
            SecureRandom secureRandom = new SecureRandom();

            int randomOne = secureRandom.nextInt(9);
            int randomTwo = secureRandom.nextInt(9);

            print("How much is " + randomOne + " time " + randomTwo);

            int answer = scanner.nextInt();
            int result = randomOne * randomTwo;

            if (answer == result) {
                ComputedAssistedInstructionModify.correctAnswerResponse();
                correctAnswer++;
            } else {
                ComputedAssistedInstructionModify.notCorrectAnswerResponse();

            }
        }
        return correctAnswer;
    }

    public static void checkPercentage(int count) {
        double result = (double) count / 10 * 100;

        if (result >= 75.0) {
            print(" ");
            print("Congratulation,You are ready to go to the next level");
        } else if (result < 75.0) {
            print("Please ask your teacher for extra help");
        }
    }

    public static void continues() {
        print("Next Student evaluation(Enter 1 to continue)");

        int response = scanner.nextInt();
        if (response == 1) {
            response = computeStudentPerformance(10);
            checkPercentage(response);
        }


    }

    public static void combine() {
        int total = computeStudentPerformance(10);

        checkPercentage(total);
        continues();
    }

    public static void print(String input) {
        System.out.println(input);
    }
}