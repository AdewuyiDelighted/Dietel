package Chapter4;

import java.util.Scanner;

public class Encrypting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int number = scanner.nextInt();
        int digitOne = 0;
        int digitTwo = 0;
        int digitThree = 0;
        int digitFour = 0;

        int calculateOne = 0;
        int calculateTwo = 0;
        int calculateThree = 0;
        int calculateFour = 0;

        int totalOne = 0;
        int totalTwo = 0;
        int totalThree = 0;
        int totalFour = 0;




        while (number > 9999 || number < 1000) {
            System.out.println("Enter a four digit number: ");
            number = scanner.nextInt();
        }
        digitOne = number / 1000;
        digitTwo = number / 100 % 10;
        digitThree = number / 10 % 10 ;
        digitFour = number % 10;

        calculateOne = digitOne + 7 ;
        calculateTwo = digitTwo + 7 ;
        calculateThree = digitThree + 7 ;
        calculateFour = digitFour + 7 ;



         totalOne = calculateOne % 10;
         totalTwo = calculateTwo % 10;
         totalThree = calculateThree % 10;
         totalFour = calculateFour % 10;

         int swap = totalOne;
         int swapTwo = totalTwo;

         totalOne = totalThree;
         totalTwo = totalFour;
         totalThree = swap;
         totalFour = swapTwo;








        System.out.printf("%s%d%d%d%d","The encrypted integer is ",totalOne,totalTwo,totalThree,totalFour);
    }
}










