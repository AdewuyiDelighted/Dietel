package ChapterSix;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side of a right angle triangle");
        double sideOne = scanner.nextDouble();
        System.out.println("Enter the second side of a right angle triangle");
        double sideTwo = scanner.nextDouble();
        double hypotenuse = hypotenuse(sideOne, sideTwo);
        System.out.println(hypotenuse);

    }


    public static double hypotenuse(double sideOne, double sideTwo) {
        double powerOne = Math.pow(sideOne, 2);
        double powerTwo = Math.pow(sideTwo, 2);
        double sum = powerOne + powerTwo;
        return Math.sqrt(sum);
    }

}
