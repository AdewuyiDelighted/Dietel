package MyAssessment;

import java.util.Scanner;

public class ExampleOneTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();;
        int count = 0;
        int sum = number;
        int minimum = number;
        int maximum = number;
        for (int num = 1; num < 10; num++) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            count++;
            sum += number;

            if (number > maximum) {
                maximum = number;
            } else if (number < minimum) {
                minimum = number;
            }
        }
        System.out.println("The sum of numbers is : " + sum);
        System.out.println("The average of numbers is :" + sum / count);
        System.out.println("The minimum of numbers is : " + minimum);
        System.out.println("The maximum of numbers is : " + maximum);


    }
}
