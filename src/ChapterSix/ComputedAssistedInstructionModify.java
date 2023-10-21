package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputedAssistedInstructionModify {
    public static void main(String[] args) {
        questions();
    }

    public static void questions() {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int randomOne = secureRandom.nextInt(9);
        int randomTwo = secureRandom.nextInt(9);
        System.out.println("How much is " + randomOne + " * " + randomTwo + "?");
        int answer = randomOne * randomTwo;
        int studentResponses = scanner.nextInt();
        while (studentResponses != answer) {
            notCorrectAnswerResponse();
            System.out.println("How much is " + randomOne + " * " + randomTwo + "?");
            studentResponses = scanner.nextInt();
        }
        if (studentResponses == answer) {
            correctAnswerResponse();
            generateNewQuestions();
        }


    }


    public static void correctAnswerResponse() {
        SecureRandom secureRandom = new SecureRandom();
        int response = secureRandom.nextInt(1, 5);
        switch (response) {
            case 1:
                System.out.println("Very Good");
                break;
            case 2:
                System.out.println("Excellent");
                break;
            case 3:
                System.out.println("Nice Work");
                break;
            case 4:
                System.out.println("Keep up the good work");
                break;
        }
    }

    public static void notCorrectAnswerResponse() {
        SecureRandom secureRandom = new SecureRandom();
        int response = secureRandom.nextInt(1, 5);
        switch (response) {
            case 1:
                System.out.println("No,Please try again");
                break;
            case 2:
                System.out.println("Wrong,Try once more");
                break;
            case 3:
                System.out.println("Dont give up");
                break;
            case 4:
                System.out.println("No,Keep trying");
                break;
        }
    }

    public static void generateNewQuestions() {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int numberOne = secureRandom.nextInt(9);
        int numberTwo = secureRandom.nextInt(9);
        System.out.println("How much is " + numberOne + " * " + numberTwo + "?");
        int studentResponse = scanner.nextInt();
        int answer = numberTwo * numberOne;
        while (studentResponse != answer){
            notCorrectAnswerResponse();
            System.out.println("How much is " + numberOne + " * " + numberTwo + "?");
            studentResponse = scanner.nextInt();
        }
        if(studentResponse == answer){
            correctAnswerResponse();
            generateNewQuestions();
        }
    }
}

