package ChapterFive;

import java.util.Scanner;

public class DiamondOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                To print shape diamond
                Enter an odd number between number 1 - 19""");
        int userInput = scanner.nextInt();
        while (userInput > 19 || userInput % 2 == 0) {
            System.out.println("Invalid Input");
            System.out.println("To print shape diamond (Enter an odd number between number 1 - 19)");
            userInput = scanner.nextInt();
            if (userInput <= 19 && userInput % 2 != 0) {
                for (int row = 1; row <= userInput; row++) {
                    for (int colum = row; colum <= userInput; colum++) {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                    for (int column = 1; column <= row; column++) {
                        System.out.print("*");
                    }
                    for (int colum = 2; colum <= row; colum++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                for (int row = 2; row <= userInput; row++) {
                    for (int column = 1; column <= row; column++) {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                    for (int column = row; column < userInput; column++) {
                        System.out.print("*");
                    }
                    for (int column = row; column <= userInput; column++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }

            }
        }

    }
}





















