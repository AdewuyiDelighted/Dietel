package CardValidatorAndShoppingList;

import java.util.Scanner;

public class MBTITest {
    static Scanner scanner = new Scanner(System.in);
    static String response = "A";
    static String responseTwo = "B";

    public static void main(String[] args) {
        questionSetOne();
    }




    public static void questionSetOne(){
        String [] setOne = new String [5];
        for(int index = 0; index < setOne.length;index++){
            switch (index) {
                case 0:
                    System.out.println("""
                            A. Expend energy,enjoy groups               B.Conserve energy, enjoy one on one""");
                   String answer = scanner.nextLine().toUpperCase();
//                    if (answer.equals("A")) {
//                        setOne[index] = "Expend energy,enjoy groups";
//                    } else if (answer.equals("B")) {
//                        setOne[index] = "Conserve energy, enjoy one on one";
//                    }
                    while (!answer.equals("A") || !answer.equals("B")) {
                            System.out.println("Error");
                            answer = scanner.nextLine().toUpperCase();
                        if (answer.equals("A")) {
                            setOne[index] = "Expend energy,enjoy groups";
                        } else if (answer.equals("B")) {
                            setOne[index] = "Conserve energy, enjoy one on one";
                        }
                    }
                    break;


                case 1:
                    System.out.println("""
                            A. More outgoing,think out aloud              B.More Reserved,Think to yourself""");
                    String questionTwo = scanner.nextLine().toUpperCase();
                    if (questionTwo.equals(response)) {
                        setOne[index] = "More outgoing,think out aloud";
                    }
                   else if(questionTwo.equals(responseTwo)){
                         setOne[index] = "More Reserved,Think to yourself";
                    }
                   while (!questionTwo.equals(response) || !questionTwo.equals(responseTwo)){
                       System.out.println("Error");
                       if (questionTwo.equals(response)) {
                           setOne[index] = "More outgoing,think out aloud";
                       }
                       else if(questionTwo.equals(responseTwo)){
                           setOne[index] = "More Reserved,Think to yourself";
                       }

                   }


            }
        }

    }
}