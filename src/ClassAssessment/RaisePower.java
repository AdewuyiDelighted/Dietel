package ClassAssessment;

import java.util.Scanner;

public class RaisePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number");
        int secondNum = scanner.nextInt();
        int counter = 1;
        for (int num = 1; num <= secondNum; num++){
            counter = counter * firstNum;


        }
        System.out.println(counter);


        }
    }

