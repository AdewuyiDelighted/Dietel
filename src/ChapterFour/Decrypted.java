package ChapterFour;

import java.util.Scanner;

public class Decrypted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four digit encrypted integer ");
        int number = scanner.nextInt();


        int digitOne = 0;
        int digitTwo = 0;
        int digitThree = 0;
        int digitFour = 0;

        int totalOne = 0;
        int totalTwo = 0;
        int totalThree = 0;
        int totalFour = 0;



        while(number < 1000 || number > 9999) {
            System.out.println("(invalid number)Enter a four digit number");
             number = scanner.nextInt();

        }

            digitOne = number / 1000;
            digitTwo = number / 100 % 10;
            digitThree = number/ 10 % 10;
            digitFour = number % 10;

            int swap = digitOne;
            int swapTwo = digitTwo;

            digitOne = digitThree;
            digitTwo = digitFour;
            digitThree = swap;
            digitFour = swapTwo;

            if(digitOne > 7){
                totalOne = digitOne - 7;
            }
            else{
                totalOne = digitOne + 10 - 7;
            }
            if(digitTwo > 7){
            totalTwo = digitTwo - 7;
            }
            else{
            totalTwo = digitTwo + 10 - 7;
            }
            if(digitThree > 7){
            totalThree = digitThree - 7;
            }
            else{
            totalThree = digitThree + 10 - 7;
            }
            if(digitFour > 7){
            totalFour = digitFour - 7;
            }
            else{
            totalFour = digitFour + 10 - 7;
            }
        System.out.printf("%s%d%d%d%d","The decrypted integer is ",totalOne,totalTwo,totalThree,totalFour);

    }
    }

