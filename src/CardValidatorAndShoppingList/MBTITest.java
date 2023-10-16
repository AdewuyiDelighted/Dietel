package CardValidatorAndShoppingList;

import java.util.Objects;
import java.util.Scanner;

public class MBTITest {
    static Scanner scanner = new Scanner(System.in);
    static String response = "A";
    static String responseTwo = "B";

    public static void main(String[] args) {
        questionSetOne();
        questionSetTwo();
    }


    public static void questionSetOne() {
        String[] setOne = new String[5];
        for (int index = 0; index < setOne.length; index++) {
            switch (index) {
                case 0:
                    System.out.println("""
                            A. Expend energy,enjoy groups               B.Conserve energy, enjoy one on one""");
                    String answer = scanner.nextLine().toUpperCase();
                    while (!(answer.equals(response) || answer.equals(responseTwo))) {
                        System.out.println("Error");
                        answer = scanner.nextLine().toUpperCase();
                    }
                    if (answer.equals(response)) {
                        setOne[index] = "Expend energy,enjoy groups";
                    } else if (answer.equals(responseTwo)) {
                        setOne[index] = "Conserve energy, enjoy one on one";
                    }

                case 1:
                    System.out.println("""
                            A. More outgoing,think out aloud              B.More Reserved,Think to yourself""");
                    String questionTwo = scanner.nextLine().toUpperCase();
                    while (!(questionTwo.equals(response) || questionTwo.equals(responseTwo))) {
                        System.out.println("Error");
                        questionTwo = scanner.nextLine().toUpperCase();
                    }
                    if (questionTwo.equals(response)) {
                        setOne[index] = "More outgoing,think out aloud";
                    } else if (questionTwo.equals(responseTwo)) {
                        setOne[index] = "More Reserved,Think to yourself";
                    }
                case 2:
                    System.out.println("""
                            A. Seek many tasks,public activities interaction with others              B.Seek private solitary activities with quiet to concentrate""");
                    String questionThree = scanner.nextLine().toUpperCase();
                    while (!(questionThree.equals(response) || questionThree.equals(responseTwo))) {
                        System.out.println("Error");
                        questionThree = scanner.nextLine().toUpperCase();
                    }
                    if (questionThree.equals(response)) {
                        setOne[index] = "Seek many tasks,public activities interaction with others";
                    } else if (questionThree.equals(responseTwo)) {
                        setOne[index] = "Seek private solitary activities with quiet to concentrate";
                    }
                case 3:
                    System.out.println("""
                            A. External, communicative,express yourself               B.Internal,reticent,keep to yourself""");
                    String questionFour = scanner.nextLine().toUpperCase();
                    while (!(questionFour.equals(response) || questionFour.equals(responseTwo))) {
                        System.out.println("Error");
                        questionFour = scanner.nextLine().toUpperCase();
                    }
                    if (questionFour.equals(response)) {
                        setOne[index] = "External, communicative,express yourself";
                    } else if (questionFour.equals(responseTwo)) {
                        setOne[index] = "Internal,reticent,keep to yourself";
                    }
                case 4:
                    System.out.println("""
                            A. Active,initiate             B.Reflective,deliberate""");
                    String questionFive = scanner.nextLine().toUpperCase();
                    while (!(questionFive.equals(response) || questionFive.equals(responseTwo))) {
                        System.out.println("Error");
                        questionFive = scanner.nextLine().toUpperCase();
                    }
                    if (questionFive.equals(response)) {
                        setOne[index] = "Active,initiate";

                    } else if (questionFive.equals(responseTwo)) {
                        setOne[index] = ".Reflective,deliberate";
                    }
                    System.out.println("Enter c to move to tbe next set of questions");
                    String rec = "C";
                    String next = scanner.nextLine().toUpperCase();
                    switch (next) {
                        case "C":
                            questionSetTwo();
                        default:
                            while (!next.equals(rec)) {
                                System.out.println("Invalid input(Enter C to move to the next set of questions");
                                next = scanner.nextLine().toUpperCase();
                            }

                                }

                            }


                    }


            }





    public static void questionSetTwo() {
        String[] setTwo = new String[5];
        for (int index = 0; index < setTwo.length; index++) {
            switch (index) {
                case 0:
                    System.out.println("""
                            A."Interpret literally"                         B.Look for meaning and possibilities""");
                    String questionSix = scanner.nextLine().toUpperCase();
                    while (!(questionSix.equals(response) || questionSix.equals(responseTwo))) {
                        System.out.println("Error");
                        questionSix = scanner.nextLine().toUpperCase();
                    }
                    if (questionSix.equals(response)) {
                        setTwo[index] = "Interpret literally";
                    } else if (questionSix.equals(responseTwo)) {
                        setTwo[index] = "Look for meaning and possibilities";
                    }
                case 1:
                    System.out.println("""
                            A.Practical, realistic,experiential                     B.Imaginative,Innovative,Theoretical""");
                    String questionSeven = scanner.nextLine().toUpperCase();
                    while(!(questionSeven.equals(response)|| questionSeven.equals(responseTwo))){
                        System.out.println("Error");
                        questionSeven = scanner.nextLine().toUpperCase();
                    }
                    if(questionSeven.equals(response)){
                        setTwo[index] ="Practical, realistic,experiential";
                    } else if (questionSeven.equals(responseTwo)) {
                        setTwo[index] ="Imaginative,Innovative,Theoretical";

                    }
                case 2:
                    System.out.println("""
                            A.Standard, usual,conventional                                       B.Different, novel,unique""");
            }
        }


    }

}

