package ChapterTwo;

import java.util.Scanner;

public class DividedByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        if(number%3 == 0) {
            System.out.println(number + " can be divided by three");
        }
        else{
            System.out.println(number + " cant be divided by three");

        }
    }
    }

