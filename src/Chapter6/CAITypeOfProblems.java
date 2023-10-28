package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAITypeOfProblems {
    static Scanner scanner = new Scanner(System.in);

    public static int addition(int count) {
        int correctAnswer = 0;

        for (int index = 0; index < count; index++) {
            SecureRandom secureRandom = new SecureRandom();

            int randomOne = secureRandom.nextInt(9);
            int randomTwo = secureRandom.nextInt(9);

            print("How much is " + randomOne + " + " + randomTwo);

            int answer = scanner.nextInt();
            int result = randomOne + randomTwo;

            if (answer == result) {
                ComputedAssistedInstructionModify.correctAnswerResponse();
                correctAnswer++;
            } else {
                ComputedAssistedInstructionModify.notCorrectAnswerResponse();

            }
        }
        return correctAnswer;
    }

    public static int subtraction(int count) {
        int correctAnswer = 0;

        for (int index = 0; index < count; index++) {
            SecureRandom secureRandom = new SecureRandom();

            int randomOne = secureRandom.nextInt(9);
            int randomTwo = secureRandom.nextInt(9);

            print("How much is " + randomOne + " - " + randomTwo);

            int answer = scanner.nextInt();
            int result = randomOne - randomTwo;

            if (answer == result) {
                ComputedAssistedInstructionModify.correctAnswerResponse();
                correctAnswer++;
            } else {
                ComputedAssistedInstructionModify.notCorrectAnswerResponse();

            }
        }
        return correctAnswer;
    }

    public static int divide(int count) {
        double div = 0.0;
        int correctAnswer = 0;
        double result = 0.0;

        for (int index = 0; index < count; index++) {
            System.out.println("Your answer should in 1 decimal place");
            SecureRandom secureRandom = new SecureRandom();

            int randomOne = secureRandom.nextInt(1, 9);
            int randomTwo = secureRandom.nextInt(1, 9);
            int max = Math.max(randomOne, randomTwo);

            if (max == randomOne) {
                System.out.println("How much is " + randomOne + " / " + randomTwo);
                result = scanner.nextDouble();

                double division = (double) max / randomTwo;
                String form = String.format("%.1f", division);
                div = Double.parseDouble(form);

            } else if (max == randomTwo) {
                System.out.println("How much is " + randomTwo + " / " + randomOne);
                result = scanner.nextDouble();

                double division = (double) max / randomOne;
                String form = String.format("%.1f", division);
                div = Double.parseDouble(form);
            }

            if (result == div) {
                ComputedAssistedInstructionModify.correctAnswerResponse();
                correctAnswer++;
            } else if (result != div) {
                ComputedAssistedInstructionModify.notCorrectAnswerResponse();

            }
        }

        return correctAnswer;
    }

    public static int mixedArithmetic() {
        int result = addition(1);

        result += divide(1);
        result += subtraction(1);
        result += addition(1);
        result += CAIStudentPerformance.computeStudentPerformance(2);
        result += subtraction(1);
        result += divide(1);
        result += CAIStudentPerformance.computeStudentPerformance(1);

        return result;
    }

    public static void print(String input) {
        System.out.println(input);
    }

    public static int twoAddition(int count) {
        int correctAnswer = 0;

        for (int index = 0; index < count; index++) {
            SecureRandom secureRandom = new SecureRandom();
            int firstRandom = secureRandom.nextInt(10, 20);
            int secondRandom = secureRandom.nextInt(10, 20);

            print("How much is " + firstRandom + " +  " + secondRandom);

            int answer = scanner.nextInt();
            int result = firstRandom + secondRandom;

            if (answer == result) {
                ComputedAssistedInstructionModify.correctAnswerResponse();
                correctAnswer++;
            } else {
                ComputedAssistedInstructionModify.notCorrectAnswerResponse();

            }
        }
        return correctAnswer;
    }

    public static int twoDigitSubtraction(int count) {
        int correctAnswer = 0;

        for (int index = 0; index < count; index++) {
            SecureRandom secureRandom = new SecureRandom();

            int randomOne = secureRandom.nextInt(10, 20);
            int randomTwo = secureRandom.nextInt(10, 20);

            print("How much is " + randomOne + " -  " + randomTwo);

            int answer = scanner.nextInt();
            int result = randomOne - randomTwo;

            if (answer == result) {
                ComputedAssistedInstructionModify.correctAnswerResponse();
                correctAnswer++;
            } else {
                ComputedAssistedInstructionModify.notCorrectAnswerResponse();

            }
        }
        return correctAnswer;
    }

    public static int twoDigitDivide(int count) {
        double div = 0.0;
        int correctAnswer = 0;
        double result = 0.0;

        for (int index = 0; index < count; index++) {
            System.out.println("Your answer should in 1 decimal place");
            SecureRandom secureRandom = new SecureRandom();

            int randomOne = secureRandom.nextInt(10, 20);
            int randomTwo = secureRandom.nextInt(10, 20);
            int max = Math.max(randomOne, randomTwo);

            if (max == randomOne) {

                System.out.println("How much is " + randomOne + "  / " + randomTwo);
                result = scanner.nextDouble();
                double division = (double) max / randomTwo;

                String form = String.format("%.1f", division);
                div = Double.parseDouble(form);

            } else if (max == randomTwo) {
                System.out.println("How much is  " + randomTwo + " / " + randomOne);
                result = scanner.nextDouble();

                double division = (double) max / randomOne;
                String form = String.format("%.1f", division);
                div = Double.parseDouble(form);
            }

            if (result == div) {
                ComputedAssistedInstructionModify.correctAnswerResponse();
                correctAnswer++;

            } else if (result != div) {
                ComputedAssistedInstructionModify.notCorrectAnswerResponse();

            }
        }

        return correctAnswer;
    }

    public static int twoDigitMixedArithmetic() {
        int result = twoAddition(1);

        result += twoDigitDivide(1);
        result += twoDigitSubtraction(1);
        result += twoAddition(1);
        result += CAIDifficultLevel.twoDigitMultiplication(2);
        result += subtraction(1);
        result += divide(1);
        result += CAIDifficultLevel.twoDigitMultiplication(1);

        return result;
    }


}