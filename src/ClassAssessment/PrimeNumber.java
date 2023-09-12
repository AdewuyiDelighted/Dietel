package ClassAssessment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number");
        int number = scanner.nextInt();
        int counter = 0;
        for (int sum = 1; sum <= number; sum++) {
            if (number % sum == 0) {
                counter++;
            }
        }

        if (counter <= 2) {
            System.out.println("prime");
        } else {
            System.out.println(" not prime");

        }
    }


}









