package ChapterFive;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to start the Christmas song");
        int song = scanner.nextInt();

        switch (song) {
            case 1 -> System.out.println("On the first day of Christmas,My true love sent to me");
            case 2 -> System.out.println("On the second day of Christmas,My true love sent to me");
            case 3 -> System.out.println("On the third day of Christmas,My true love sent to me");
            case 4 -> System.out.println("On the fourth day of Christmas,My true love sent to me");
            case 5 -> System.out.println("On the fifth day of Christmas,My true love sent to me");
            case 6 -> System.out.println("On the sixth day of Christmas,My true love sent to me");
            case 7 -> System.out.println("On the Seventh day of Christmas,My true love sent to me");
            case 8 -> System.out.println("On the eighth day of Christmas,My true love sent to me");
            case 9 -> System.out.println("On the ninth day of Christmas,My true love sent to me");
            case 10 -> System.out.println("On the tenth day of Christmas,My true love sent to me");
            case 11 -> System.out.println("On the eleventh day of Christmas,My true love sent to me");
            case 12-> System.out.println("On the twelve day of Christmas,My true love sent to me");
            default -> System.out.println("invalid input");

        }
        int lyrics = song;
        switch (lyrics){
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven piper piping");
            case 10:
                System.out.println("Ten lords a - leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a - milking");
            case 7:
                System.out.println("Seven swans a- swimming");
            case 6:
                System.out.println("Six geese a - laying");
            case 5:
                System.out.println("Five golden ring");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three french hen");
            case 2:
                System.out.println("Two turtle ");
            case 1:
                System.out.println("A partridge in a pear ");

        }

    }

    }


