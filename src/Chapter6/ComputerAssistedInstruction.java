package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    static Scanner scanner = new Scanner(System.in);


    public static void promptStudent() {
        SecureRandom secureRandom = new SecureRandom();
        int firstTimesNumber = secureRandom.nextInt(9);
        int secondTimesNumber = secureRandom.nextInt(9);
        print("How much is " + firstTimesNumber + " times " + secondTimesNumber);
        int answer = firstTimesNumber * secondTimesNumber;
        int studentAnswer = scanner.nextInt();
        while (studentAnswer != answer) {
            print("No. Please try again");
            print("How much is " + firstTimesNumber + " times " + secondTimesNumber);
            studentAnswer = scanner.nextInt();
        }
        if (studentAnswer == answer) {
            print("Very Good");
            generateQuestions();
        }

    }

    public static void generateQuestions() {
        SecureRandom random = new SecureRandom();
        int firstNumber = random.nextInt(9);
        int secondNumber = random.nextInt(9);
        print("How much is " + firstNumber + " times " + secondNumber);
        int randomAnswer = firstNumber * secondNumber;
        int studentAnswer = scanner.nextInt();
        while (studentAnswer != randomAnswer) {
            print("No. Please try again");
            print("How much is " + firstNumber + " times " + secondNumber);
            studentAnswer = scanner.nextInt();
        }
        if (studentAnswer == randomAnswer) {
            generateQuestions();
        }
    }


    public static void print(String input) {
        System.out.println(input);
    }
}

