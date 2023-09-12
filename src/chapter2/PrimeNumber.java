package chapter2;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {



        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any whole number greater than 1:");
            int firstNumber = scanner.nextInt();
            if ((firstNumber % firstNumber == 0) && (firstNumber % 1 == 0) && (firstNumber % 2 == 1) || firstNumber == 2) {
                System.out.print(firstNumber + " is a prime number");
            }
            else if (firstNumber % 2 == 0) {
                System.out.println(firstNumber + " is not a prime number");

            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
