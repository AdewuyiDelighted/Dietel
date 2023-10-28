package Chapter6;

import java.util.Scanner;

class SquareAnyCharacterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the the triangle");
        int side = scanner.nextInt();
        System.out.println("Enter the character you love your square to have");
        char fillCharacter = scanner.next().charAt(0);
        SquareAnyCharacter.squareAnyCharacter(side,fillCharacter);
    }


}