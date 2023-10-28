package Chapter6;

import java.util.Scanner;

public class SquareOfAsterisksTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int sides = scanner.nextInt();
        SquareOfAsterisks.buildSquare(sides);
    }


}