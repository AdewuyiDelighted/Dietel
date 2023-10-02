package ExeciseSWithT;



import java.util.Random;
import java.util.Scanner;

public class CardGames {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
            Random myRandom = new Random();
            Scanner scanner = new Scanner(System.in);
            int constant = myRandom.nextInt(4);
            System.out.println("""
                    
                    
                    We have 52 decks of cards to pick from and the cards are combination of RANK and SUIT
                                    -----------------------------
                    RANK --> Ace,2,3,4,5,6,7,8,9,10,Jack,Queen,King
                                       ******
                    SUIT --> Club,Diamond,Heart,Spade
                            *************************************
                    Wish Goodluck and fun time while playing
                                     
                    Now the game begins
                                     
                    Enter number 1 - 52""");
            int input = scanner.nextInt();
            switch (input) {
                case 1 :{
                    if (constant == 1) System.out.println("The card you entered is Ace Heart");
                    else if (constant == 2) System.out.println("The card you entered Ace Diamond ");
                    else if (constant == 3) System.out.println("The card you picked is Ace Club");
                    else if (constant == 4) System.out.println("The card you entered is Ace Spade ");
                    else System.out.println("Invalid card");
                    break;
                }
//                case 2 -> System.out.println("The card you played is 3 of Hearts");
//                case 3 -> System.out.println("The card you played is Queen of Diamonds");
//                case 4 -> System.out.println("Tne card you played is 7 of Hearts ");
//                case 5 -> System.out.println("The card you played is Ace of Diamonds");
//                case 6 -> System.out.println("The card you played is Jack of Clubs");
//                case 7 -> System.out.println("The card you played is 5 of  Clubs");
//                case 8 -> System.out.println("The card you played is 10 of Diamonds");
//                case 9 -> System.out.println("The card you played is  8 of Hearts");
//                case 10 -> System.out.println("The card you played is King of Spades");
//                case 11 -> System.out.println("The card you played is 2 of Diamonds ");
//                case 12 -> System.out.println("The card you played is 6 of Clubs");
//                case 13 -> System.out.println("The card you played is 4 of Hearts");
            }

        }

    }

}

