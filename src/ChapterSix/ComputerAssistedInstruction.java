package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        promptStudent();


    }


    public static int promptStudent() {
        SecureRandom secureRandom = new SecureRandom();
        int firstTimesNumber = secureRandom.nextInt(9);
        int secondTimesNumber = secureRandom.nextInt(9);
        System.out.println("How much is " + firstTimesNumber + " times " + secondTimesNumber);
        return firstTimesNumber * secondTimesNumber;
    }
    public static void checkAnswer(int studentAnswer) {
        studentAnswer = scanner.nextInt();
        int answer = promptStudent();
        studentAnswer = scanner.nextInt();
        while (studentAnswer != answer) {
            System.out.println("No. Please try again");
            studentAnswer = scanner.nextInt();
        }
        if (studentAnswer == answer) {
            System.out.println("Very Good");
        }

    }

    public static void generateQuestions(int studentAnswer) {
        promptStudent();
        checkAnswer(studentAnswer);
    }

}

