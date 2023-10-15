package CardValidatorAndShoppingList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MBTITest {
   // static String response = "A";
    //static String responseTwo = "B";
    static Scanner scanner = new Scanner(System.in);
    int count = 0;

    public static void main(String[] args) {
        mbtiQuestions();

    }

    public static void mbtiQuestions() {
        questionSetOne();

    }

    public static void questionSetOne() {
        String response = "A";
        String responseTwo = "B";
        String[] setOne = new String[5];
        for (int index = 0; index < setOne.length; index++) {
            switch (index) {
                case 0:
                    System.out.println("""
                            A.Extend energy,enjoy group
                            B.Conserve energy,enjoy one on one""");
                    String output = scanner.next().toUpperCase();
                    while (!output.equals(response) || !output.equals(responseTwo)) {
                        System.out.println("""
                                Expected A or B as responses""");
                        output = scanner.next().toUpperCase();
                        if (output.equals(response)) {
                            setOne[index] = " A.Extend energy,enjoy group";
                        } else if (output.equals(responseTwo)) {
                            setOne[index] = "B.Conserve energy,enjoy one on one";
                        }
                    }
                    break;

                case 1:
                    System.out.println("""
                            A.More outgoing,think out loud
                            B.More reserved ,think to yourself
                                                
                            """);
                    String questionTwo = scanner.next().toUpperCase();
                    while (!questionTwo.equals(response) || !questionTwo.equals(responseTwo)) {
                        System.out.println("""
                                Expected A or B as responses""");
                        questionTwo = scanner.next();
                        if (questionTwo.equals(response)) {
                            setOne[index] = "More outgoing,think out loud";
                        } else if (questionTwo.equals(responseTwo)) {
                            setOne[index] = "More reserved ,think to yourself";
                        }

                    }
                    break;

                case 2:
                    System.out.println("""
                            A.seek many tasks,public activities, interaction with others
                            B.seek many tasks,public activities, interaction with others""");
                    String questionThree = scanner.next();
                    while (!questionThree.equals(response) || !questionThree.equals(responseTwo)) {
                        System.out.println("""
                                Expected A or B as responses""");
                        questionThree = scanner.next();
                        if (questionThree.equals(response)) {
                            setOne[index] = "seek many tasks,public activities, interaction with others";
                        } else if (questionThree.equals(responseTwo)) {
                            setOne[index] = "seek many tasks,public activities, interaction with others";
                        }
                    }
                    break;

                case 3:
                    System.out.println("""
                            A.External,Communicative,Express Yourself
                            B.Internal,Reticent,Keep to yourself""");
                    String questionFour = scanner.next().toUpperCase();
                    while (!questionFour.equals(response) || !questionFour.equals(responseTwo)) {
                        System.out.println("""
                                Expected A or B as responses""");
                        questionFour = scanner.next();
                        if (questionFour.equals(response)) {
                            setOne[index] = "External,Communicative,Express Yourself";
                        } else if (questionFour.equals(responseTwo)) {
                            setOne[index] = "Internal,Reticent,Keep to yourself";
                        }


                    }
                case 4:
                    System.out.println("""
                            A. Active initiate
                            B. Reflective,deliberate""");
                    String questionFive = scanner.next().toUpperCase();
                    while (!questionFive.equals(response) || !questionFive.equals(responseTwo)) {
                        System.out.println("""
                                Expected A or B as responses""");
                        questionFive = scanner.next();
                        if (questionFive.equals(response)) {
                            setOne[index] = "Active initiate";
                        } else if (questionFive.equals(responseTwo)) {
                            setOne[index] = "Reflective,deliberate";
                        }
                    }
                    break;


            }


        }

    }
}
