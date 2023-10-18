package CardValidatorAndShoppingList;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MBTITest {
    static Scanner scanner = new Scanner(System.in);
    static String response = "A";
    static String responseTwo = "B";

    static int countResponse = 0;
    static int countResponseTwo = 0;
   static String[] setOne = new String[5];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(questionSetOne()));
        System.out.println(Arrays.toString(questionSetTwo()));
        System.out.println(Arrays.toString(questionSetThree()));
        System.out.println(Arrays.toString(questionSetFour()));
        System.out.println("Hello What is your name");
        String name = scanner.nextLine();
        System.out.println("Hello "+name+" You selected");
        for(int index = 0; index < 5;index++) {
            System.out.println(setOne[index]);
        }
    }


    public static String [] questionSetOne() {
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
                        setOne[index] = "A.Expend energy,enjoy groups";
                    } else if (answer.equals(responseTwo)) {
                        setOne[index] = "B.Conserve energy, enjoy one on one";
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
                    System.out.println("Enter C to move to tbe next set of questions");
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
                            if(next.equals(rec)){
                                questionSetTwo();
                            }

                    }

            }


        }
    return setOne;

    }


    public static String [] questionSetTwo() {
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
                    while (!(questionSeven.equals(response) || questionSeven.equals(responseTwo))) {
                        System.out.println("Error");
                        questionSeven = scanner.nextLine().toUpperCase();
                    }
                    if (questionSeven.equals(response)) {
                        setTwo[index] = "Practical, realistic,experiential";
                    } else if (questionSeven.equals(responseTwo)) {
                        setTwo[index] = "Imaginative,Innovative,Theoretical";

                    }
                case 2:
                    System.out.println("""
                            A.Standard, usual,conventional                                 B.Different, novel,unique""");
                    String questionEight = scanner.nextLine().toUpperCase();
                    while (!(questionEight.equals(response) || questionEight.equals(responseTwo))) {
                        System.out.println("Error");
                        questionEight = scanner.nextLine().toUpperCase();
                    }
                    if (questionEight.equals(response)) {
                        setTwo[index] = "Standard, usual,conventional";
                    } else if (questionEight.equals(responseTwo)) {
                        setTwo[index] = "Different, novel,unique";

                    }

                case 3:
                    System.out.println("""
                            A.Focus on here-and-now,look to the future                                           B.Global perspective, Big Picture""");
                    String questionNine = scanner.nextLine().toUpperCase();
                    while (!(questionNine.equals(response) || questionNine.equals(responseTwo))) {
                        System.out.println("Error");
                        questionNine = scanner.nextLine().toUpperCase();
                    }
                    if (questionNine.equals(response)) {
                        setTwo[index] = "Focus on here-and-now,look to the future";
                    } else if (questionNine.equals(responseTwo)) {
                        setTwo[index] = "Global perspective, Big Picture";
                    }
                case 4:
                    System.out.println("""
                            A.Facts,Things,What is                                                                  B.Ideas,Dreams,What Could Be""");
                    String questionTen = scanner.nextLine().toUpperCase();
                    while (!(questionTen.equals(response) || questionTen.equals(responseTwo))) {
                        System.out.println("Error");
                    }
                    if (questionTen.equals(response)) {
                        setTwo[index] = "Facts,Things,What is";
                    } else if (questionTen.equals(responseTwo)) {
                        setTwo[index] = "Ideas,Dreams,What Could Be";

                    }
                    System.out.println("Enter C to move to tbe next set of questions");
                    String rec = "C";
                    String next = scanner.nextLine().toUpperCase();
                    switch (next) {
                        case "C":
                            questionSetThree();
                        default:
                            while (!next.equals(rec)) {
                                System.out.println("Invalid input(Enter C to move to the next set of questions");
                                next = scanner.nextLine().toUpperCase();
                            }
                            if(next.equals(rec)){
                                questionSetThree();
                            }


                    }
            }


        }
           return setTwo;
    }

    public static String[] questionSetThree() {
        String[] setThree = new String[5];
        for (int index = 0; index < setThree.length; index++) {
            switch (index) {
                case 0:
                    System.out.println("""
                            A.Logical,Thinking,Questioning                                                   B.Empathetic,Feeling,Accommodating""");
                    String questionEleven = scanner.nextLine().toUpperCase();
                    while (!(questionEleven.equals(response) || questionEleven.equals(responseTwo))) {
                        System.out.println("error");
                        questionEleven = scanner.nextLine().toUpperCase();
                    }
                    if (questionEleven.equals(response)) {
                        setThree[index] = "Logical,Thinking,Questioning";
                    } else if (questionEleven.equals(responseTwo)) {
                        setThree[index] = "Empathetic,Feeling,Accommodating";
                    }
                case 1:
                    System.out.println("""
                            A. Candid,Straight forward,Frank                                                 B.Tactful,Kind,Encouraging""");
                    String questionTwelve = scanner.nextLine().toUpperCase();
                    while (!(questionTwelve.equals(response) || questionTwelve.equals(responseTwo))) {
                        System.out.println("Error");
                        questionTwelve = scanner.nextLine().toUpperCase();
                    }
                    if (questionTwelve.equals(response)) {
                        setThree[index] = "Candid,Straight forward,Frank";
                    } else if (questionTwelve.equals(responseTwo)) {
                        setThree[index] = "Tactful,Kind,Encouraging";

                    }
                case 2:
                    System.out.println("""
                            A.Tough-Minded,just                                                                       B.Tender-hearted,Merciful""");
                    String questionThirteen = scanner.nextLine().toUpperCase();
                    while (!(questionThirteen.equals(response) || questionThirteen.equals(responseTwo))) {
                        System.out.println("Error");
                        questionThirteen = scanner.nextLine().toUpperCase();
                    }
                    if (questionThirteen.equals(response)) {
                        setThree[index] = "Tough-Minded,just";
                    } else if (questionThirteen.equals(responseTwo)) {
                        setThree[index] = ".Tender-hearted,Merciful";

                    }
                case 3:
                    System.out.println("""
                            A.Firm,Tend to criticize,hold the line                                                          B.Gentle ,Tend to appreciate,conciliate""");
                    String questionFourteen = scanner.nextLine().toUpperCase();
                    while (!(questionFourteen.equals(response) || questionFourteen.equals(responseTwo))) {
                        System.out.println("Error");
                        questionFourteen = scanner.nextLine().toUpperCase();
                    }
                    if (questionFourteen.equals(response)) {
                        setThree[index] = "Firm,Tend to criticize,hold the line";
                    } else if (questionFourteen.equals(responseTwo)) {
                        setThree[index] = "Gentle ,Tend to appreciate,conciliate";

                    }

                case 4:
                    System.out.println("""
                            A.Matter of facts,issues-oriented                                                                                  B.Sensitive,People-oriented,compassionate""");
                    String questionFifteen = scanner.nextLine().toUpperCase();
                    while (!(questionFifteen.equals(response) || questionFifteen.equals(responseTwo))) {
                        System.out.println("Error");
                        questionFifteen = scanner.nextLine().toUpperCase();
                    }
                    if (questionFifteen.equals(response)) {
                        setThree[index] = "Matter of facts,issues-oriented";
                    } else if (questionFifteen.equals(responseTwo)) {
                        setThree[index] = "Sensitive,People-oriented,compassionate";

                    }
                    System.out.println("Enter C to move to tbe next set of questions");
                    String rec = "C";
                    String next = scanner.nextLine().toUpperCase();
                    switch (next) {
                        case "C":
                            questionSetFour();
                        default:
                            while (!next.equals(rec)) {
                                System.out.println("Invalid input(Enter C to move to the next set of questions");
                                next = scanner.nextLine().toUpperCase();
                            }
                            if(next.equals(rec)){
                                questionSetFour();
                            }


                    }
            }

        }
   return setThree;
    }

    public static String [] questionSetFour() {
        String[] setFour = new String[5];
        for (int index = 0; index < setFour.length; index++) {
            switch (index) {
                case 0:
                    System.out.println("""
                            A.More outgoing,think out loud                                                          B.More reserved,think to yourself""");
                    String questionSixteen = scanner.nextLine().toUpperCase();
                    while (!(questionSixteen.equals(response) || questionSixteen.equals(responseTwo))) {
                        System.out.println("Error");
                        questionSixteen = scanner.nextLine().toUpperCase();
                    }
                    if (questionSixteen.equals(response)) {
                        setFour[index] = "More outgoing,think out loud  ";
                    } else if (questionSixteen.equals(responseTwo)) {
                        setFour[index] = "More reserved,think to yourself";

                    }


                case 1:
                    System.out.println("""
                            A.Plan,schedule                                                          B.Unplanned,Spontaneous""");
                    String questionSeventeen = scanner.nextLine().toUpperCase();
                    while (!(questionSeventeen.equals(response) || questionSeventeen.equals(responseTwo))) {
                        System.out.println("Error");
                        questionSeventeen = scanner.nextLine().toUpperCase();
                    }
                    if (questionSeventeen.equals(response)) {
                        setFour[index] = "Plan,schedule";
                    } else if (questionSeventeen.equals(responseTwo)) {
                        setFour[index] = "Unplanned,Spontaneous";

                    }


                case 2:
                    System.out.println("""
                            A.Regulated,Structure                                                          B.Easy-going,live,let live""");
                    String questionEighteen = scanner.nextLine().toUpperCase();
                    while (!(questionEighteen.equals(response) || questionEighteen.equals(responseTwo))) {
                        System.out.println("Error");
                        questionEighteen = scanner.nextLine().toUpperCase();
                    }
                    if (questionEighteen.equals(response)) {
                        setFour[index] = "Regulated,Structure";
                    } else if (questionEighteen.equals(responseTwo)) {
                        setFour[index] = "Easy-going,live,let live";

                    }
                case 3:
                    System.out.println("""
                            A.Preparation,plan ahead                                                          B.Go With the flow,adapt as you go""");
                    String questionNineteen = scanner.nextLine().toUpperCase();
                    while (!(questionNineteen.equals(response) || questionNineteen.equals(responseTwo))) {
                        System.out.println("Error");
                        questionNineteen = scanner.nextLine().toUpperCase();
                    }
                    if (questionNineteen.equals(response)) {
                        setFour[index] = "Preparation,plan ahead";
                    } else if (questionNineteen.equals(responseTwo)) {
                        setFour[index] = "Go With the flow,adapt as you go";

                    }

                case 4:
                    System.out.println("""
                            A.Control ,govern                                                          B.Latitude,Freedom""");
                    String questionTwenty = scanner.nextLine().toUpperCase();
                    while (!(questionTwenty.equals(response) || questionTwenty.equals(responseTwo))) {
                        System.out.println("Error");
                        questionTwenty = scanner.nextLine().toUpperCase();
                    }
                    if (questionTwenty.equals(response)) {
                        setFour[index] = "Control ,govern ";
                    } else if (questionTwenty.equals(responseTwo)) {
                        setFour[index] = "Latitude,Freedom";

                    }


            }
        }

    return setFour;
    }
}


