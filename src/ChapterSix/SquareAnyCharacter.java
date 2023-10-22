package ChapterSix;

import java.util.Scanner;

public class SquareAnyCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the the triangle");
        int side = scanner.nextInt();
        System.out.println("Enter the character you love your square to have");
        char fillCharacter = scanner.next().charAt(0);
        squareAnyCharacter(side,fillCharacter);
    }


    public static void squareAnyCharacter(int side,char fillCharacter){
        for(int index = 0; index < side;index++){
            for (int indices = 0;indices < side;indices++){
                System.out.print(fillCharacter);
            }
            System.out.println(" ");
        }

    }
}
