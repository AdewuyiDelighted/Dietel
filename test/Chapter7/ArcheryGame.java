package Chapter7;


import java.util.Random;
import java.util.Scanner;

public class ArcheryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your  number (player one)");
//        int  playerOneNo = scanner.nextInt();
//        System.out.println("Enter your number (player two)");
//        int playerTwoNo = scanner.nextInt();
//        System.out.println("Enter your number (player three)");
//        int playerThreeNo = scanner.nextInt();
//        System.out.println("Enter your number (player four)");
//        int  playerFourNo =  scanner.nextInt();
        Random random = new Random();
//        int scoreOne = random.nextInt(10);
//        int  scoreTw0 = random.nextInt(10);
//        int  scoreThree = random.nextInt(10);
//        int  scoreFour = random.nextInt(10);
        System.out.println("number of player :");
        int row = scanner.nextInt();
        System.out.println("number of square :");
        int column = scanner.nextInt();
// COLLECT ALL DATA INTO A PARAMETER

        // USER SCANNER IN THE MAIN METHOD
        int count = 0;
        int[] numberOfPlayer = new int[4];
        int[] scoreOne = new int[4];
        int[] scoreTwo = new int[4];
        int[] scoreThree = new int[4];
        //int  total = scoreOne + scoreTwo + scoreThree;
        for (count = 0; count < 4; count++) {
            System.out.println("Enter your number ");
            numberOfPlayer[count] = scanner.nextInt();
            System.out.println("Enter first score ");
            scoreOne[count] = scanner.nextInt();
            System.out.println("Enter second score ");
            scoreTwo[count] = scanner.nextInt();
            System.out.println("Enter third score ");
            scoreThree[count] = scanner.nextInt();
        }
                int[][] archery = new int[4][5];
        for (int num = 0; num < row; num++) {
            for (int numb = 0; numb < column; numb++) {
//                System.out.print(Arrays.toString(archery[num][numb]) + " ");
            }
            System.out.println(" ");
        }


    }
}


