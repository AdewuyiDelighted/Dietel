package Chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number with five digits");
        int number = scanner.nextInt();
        if (number >= 10000) {
            int digitOne = number / 10000;
             int digitTwo = number / 1000 % 10;
            //int digitThree = number / 100 % 10;
            //int digitFour = number / 10 % 10;
            int digitFive = number % 10;

            if (digitOne == digitFive) {
                System.out.println("number is a palidrome");
            }
        }


        while (number < 10000 || number > 99999) {
            System.out.println("Enter a number with five digits");
            number = scanner.nextInt();


        }





    }

}