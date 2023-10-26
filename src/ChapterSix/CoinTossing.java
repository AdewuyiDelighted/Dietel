package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to toss coin");

        int numberOne = scanner.nextInt();
        int countOne = 0;
        int countZero = 0;
        int stopper = 0;

        if (numberOne == 1) {

            while (stopper != 1) {
                SecureRandom secureRandom = new SecureRandom();

                int coinRandom = secureRandom.nextInt(0, 2);

                System.out.println(coinRandom);
                if (coinRandom == 1) {
                    countOne++;
                } else {
                    countZero++;
                }
            }
        }
        System.out.println("The number of times 1 occur is " + countOne);
        System.out.println("The number of times 0 occur is " + countZero);
    }


}
