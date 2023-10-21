package ChapterSix;

import java.util.Scanner;

public class CAITypeOfProblemMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        typeOfProblems();
    }

    public static void typeOfProblems() {
        System.out.println("Enter 1 for easy question or enter 2 for difficult question");
        int response = scanner.nextInt();

        switch (response) {
            case 1:

                System.out.println("""
                        Enter any of the number below to chose the arithmetic problem to solve
                         1.Addition
                         2.Subtraction
                         3.Multiplication
                         4.Division
                         5.Mixture""");
                int answer = scanner.nextInt();

                switch (answer) {
                    case 1:
                        int add = CAITypeOfProblems.addition(10);
                        CAIStudentPerformance.checkPercentage(add);
                        break;

                    case 2:
                        int minus = CAITypeOfProblems.subtraction(10);
                        CAIStudentPerformance.checkPercentage(minus);
                        break;
                    case 3:
                        int times = CAIStudentPerformance.computeStudentPerformance(10);
                        CAIStudentPerformance.checkPercentage(times);
                        break;
                    case 4:
                        int division = CAITypeOfProblems.divide(10);
                        CAIStudentPerformance.checkPercentage(division);
                        break;
                    case 5:
                        int mix = CAITypeOfProblems.mixedArithmetic();
                        CAIStudentPerformance.checkPercentage(mix);
                    default:
                        while (answer < 1 || answer > 5) {

                            System.out.println("""
                                    Invalid response
                                    Enter any of the number below to chose the arithmetic problem to solve
                                     1.Addition
                                     2.Subtraction
                                     3.Multiplication
                                     4.Division
                                     5.Mixture""");
                            answer = scanner.nextInt();
                            if (answer == 1) {
                                add = CAITypeOfProblems.addition(10);
                                CAIStudentPerformance.checkPercentage(add);
                            } else if (answer == 2) {
                                minus = CAITypeOfProblems.subtraction(10);
                                CAIStudentPerformance.checkPercentage(minus);
                            } else if (answer == 3) {
                                times = CAIStudentPerformance.computeStudentPerformance(10);
                                CAIStudentPerformance.checkPercentage(times);
                            } else if (answer == 4) {
                                division = CAITypeOfProblems.divide(10);
                                CAIStudentPerformance.checkPercentage(division);
                            } else if (answer == 5) {
                                mix = CAITypeOfProblems.mixedArithmetic();
                                CAIStudentPerformance.checkPercentage(mix);
                            }
                        }
                }

            case 2:
                System.out.println("""
                        Enter any of the number below to chose the arithmetic problem to solve
                         1.Addition
                         2.Subtraction
                         3.Multiplication
                         4.Division
                         5.Mixture""");
                int answerTwo = scanner.nextInt();

                switch (answerTwo) {
                    case 1:
                        int add = CAITypeOfProblems.twoAddition(10);
                        CAIStudentPerformance.checkPercentage(add);
                        break;
                    case 2:
                        int minus = CAITypeOfProblems.twoDigitSubtraction(10);
                        CAIStudentPerformance.checkPercentage(minus);
                        break;
                    case 3:
                        int times = CAIDifficultLevel.twoDigitMultiplication(10);
                        CAIStudentPerformance.checkPercentage(times);
                        break;
                    case 4:
                        int divide = CAITypeOfProblems.twoDigitDivide(10);
                        CAIStudentPerformance.checkPercentage(divide);
                        break;
                    case 5:
                        int mix = CAITypeOfProblems.twoDigitMixedArithmetic();
                        CAIStudentPerformance.checkPercentage(mix);
                        break;
                    default:

                        while (answerTwo < 1 || answerTwo > 5) {
                            System.out.println("""
                                    Invalid response
                                    Enter any of the number below to chose the arithmetic problem to solve
                                     1.Addition
                                     2.Subtraction
                                     3.Multiplication
                                     4.Division
                                     5.Mixture""");
                            answer = scanner.nextInt();

                            if (answer == 1) {
                                add = CAITypeOfProblems.twoAddition(10);
                                CAIStudentPerformance.checkPercentage(add);
                            } else if (answer == 2) {
                                minus = CAITypeOfProblems.twoDigitSubtraction(10);
                                CAIStudentPerformance.checkPercentage(minus);
                            } else if (answer == 3) {
                                times = CAIDifficultLevel.twoDigitMultiplication(10);
                                CAIStudentPerformance.checkPercentage(times);
                            } else if (answer == 4) {
                                divide = CAITypeOfProblems.twoDigitDivide(10);
                                CAIStudentPerformance.checkPercentage(divide);
                            } else if (answer == 5) {
                                mix = CAITypeOfProblems.twoDigitMixedArithmetic();
                                CAIStudentPerformance.checkPercentage(mix);
                            }
                        }


                }

        }
    }
}

