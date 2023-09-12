package Assignment;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number ");
        int number =1;
        while (number <= 12) {
            number = scanner.nextInt();
            if(number> 12) {
                System.out.println("Enter a valid number");
                number= scanner.nextInt();
            }
            switch (number) {
                case 1:
                    System.out.println("On the first day of Christmas , my true love sent to me");
                    break;
                case 2:
                    System.out.println("On the second day of Christmas ,my true love sent to me");
                    break;
                case 3:
                    System.out.println("On the third day of Christmas ,my true love sent to me");
                    break;
                case 4:
                    System.out.println("On the fouth day of Christmas ,my true love sent to me");
                    break;
                case 5:
                    System.out.println("On the fifth day of Christmas ,my true love sent to me");
                    break;
                case 6:
                    System.out.println("On the sixth day of Christmas,my true love sent to me");
                    break;
                case 7:
                    System.out.println("On the seventh day of Christmas,my true love sent to me");
                    break;
                case 8:
                    System.out.println("On the eighth day of Christmas,my true love sent to me");
                    break;
                case 9:
                    System.out.println("On the ninth day of Christmas,my true love sent to me");
                    break;
                case 10:
                    System.out.println("On  the tenth day of Christmas,my true love sent to me");
                    break;
                case 11:
                    System.out.println("On the eleventh day of Christmas,my true love sent to me");
                    break;
                case 12:
                    System.out.println("On the twelveth day of Christmas,my true love sent to me");
                    break;
            }
            switch (number) {
                case 12:
                    System.out.println("Twelve drummers drumming");

                case 11:
                    System.out.println("Eleven pipers piping");

                case 10:
                    System.out.println("Ten lords a-leaping");

                case 9:
                    System.out.println("Nine ladies dancing");

                case 8:
                    System.out.println("Eight maids a-milking");

                case 7:
                    System.out.println("Seven swans a-swimming");

                case 6:
                    System.out.println("Six geese a-laying");

                case 5:
                    System.out.println("Five golden rings");

                case 4:
                    System.out.println("Four calling birds");

                case 3:
                    System.out.println("Three french hens");

                case 2:
                    System.out.println("Two turtle doves, and");

                case 1:
                    System.out.println("A partridge in the pear tree");


            }
        }
    }

}

