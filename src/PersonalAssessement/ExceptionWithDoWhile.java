package PersonalAssessement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionWithDoWhile {
    public static void main(String[] args) {
        int input;
        boolean answer = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 10 to 100");
        } while (answer); {
            try {
                input = scanner.nextInt();
                if (input < 10 || input > 100) {
                   answer = false;
                }

                throw new IllegalArgumentException("Invalid input");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
