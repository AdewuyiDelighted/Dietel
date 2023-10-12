package CardValidatorAndShoppingList;


import java.util.Scanner;

public class CardChecker {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello,Kindly Enter Card detail to verify");
        String cardNumber = scanner.nextLine();
        int length = CardCheckerTwo.cardNumberLength(cardNumber);
        while (length < 13 || length > 16) {
            System.out.println("Card Number Incorrect(Kindly Enter a valid Card Number)");
            cardNumber = scanner.nextLine();
            length = CardCheckerTwo.cardNumberLength(cardNumber);
        }
            if (length >= 13 && length <= 16) {
                System.out.println("********************************************");
                System.out.print("*Credit Card Type: ");
                CardCheckerTwo.returnMessage(cardNumber);
                System.out.println("*Credit Card Number: " + cardNumber);
                System.out.println("*Credit Card Digit Length: " + length);
                System.out.print("*Credit Card Validity Status: ");
                CardCheckerTwo.checkCard(cardNumber);
                System.out.println("*************************************************");

            }
        }
    }






