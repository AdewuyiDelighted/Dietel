package Chapter4;

import java.util.Scanner;

public class AsteriskTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of triangle between 1 - 10: ");
        int number = scanner.nextInt();
        for (int numb = 1;numb <= number;numb++){
            for(int column = 1;column<=numb;column++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        }
        }








