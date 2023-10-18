package ChapterSix;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int sides = scanner.nextInt();
        buildSquare(sides);
    }


    public static void buildSquare(int side){
        for(int row = 1 ;row <= side; row++){
            for(int column = 1;column <= side; column++){
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
}
