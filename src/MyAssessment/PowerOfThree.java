package MyAssessment;

import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int product = 3;
        for (int num = 1; num <= number; num ++) {
            product = product * 3;
            if (product == number) {
                System.out.println(number + " is a power 3 ");
            }
        }
            if(product != number ){
                System.out.println("noon");
            }
    }
}