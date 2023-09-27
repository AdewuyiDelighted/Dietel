package ChapterTwo;

import java.util.Scanner;

public class Mutiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int tripled = firstNumber * firstNumber * firstNumber;
        int doubled = secondNumber * secondNumber;

        if(tripled % doubled == 0){
            System.out.println(tripled +" is a multiple of "+ doubled);
        }
        else {
            System.out.println(tripled + " is not a multiple of "+ doubled);
        }
    }
}
