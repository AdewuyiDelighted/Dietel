package ChapterThree;

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

        int digitOnee = 0;
        int digitTwoo = 0;
        int digitThreee = 0;
        int digitFourr = 0;

        int swapOne = digitOnee;
        int swapTwo = digitTwoo;
        int swapThree = digitThreee;
        int swapFour = digitFourr;





        while (number > 9999 || number < 1000) {
            System.out.println("Enter a four digit number: ");
            number = scanner.nextInt();
        }
        digitOne = number / 1000;
        digitTwo = number / 100 % 10;
        digitThree = number / 10 % 10 ;
        digitFour = number % 10;

        digitOnee = digitOne + 7 % 10;
        digitTwoo = digitTwoo + 7 % 10;
        digitThreee = digitThree + 7 % 10;
        digitFourr = digitFour + 7 % 10;

        swapOne = digitOne;
        swapTwo = digitTwo;


        digitOnee = digitThreee;
        digitThreee = swapOne;
        digitTwoo =digitFourr;
        digitFourr = swapTwo;







        System.out.println(digitOnee);
        System.out.println(digitTwoo);
        System.out.println(digitThreee);
        System.out.println(digitFourr);
    }
}


















//             for(int num = 1;num <= 4;num++) {
//            digit = number /1000 % 10;
//             total = digit + 7;
//            totall = total %10;
//            divide /= 10;
//            System.out.println(digit);
//
//
//            }










