package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifyGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int index = 1; index <= 10; index++) {
            SecureRandom random = new SecureRandom();
            System.out.println("Enter a number between 1 and 1000");
            int randomAnswer = random.nextInt(15);
            int answer = scanner.nextInt();
            count++;

            if (answer > randomAnswer) {
                System.out.println("Answer too high(Try again)");
                answer = scanner.nextInt();
            }

            if (answer < randomAnswer) {
                System.out.println("Answer too low(Try again)");
                answer = scanner.nextInt();
            }


            if (answer == randomAnswer) {
                System.out.println("good");
            }

        }
    }
}

