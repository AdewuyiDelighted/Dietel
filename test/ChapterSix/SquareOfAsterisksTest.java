package ChapterSix;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class SquareOfAsterisksTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int sides = scanner.nextInt();
        SquareOfAsterisks.buildSquare(sides);
    }


}