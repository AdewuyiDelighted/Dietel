package Chapter4;

import java.util.Scanner;

public class FactorialOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non negative number: ");
        int number = scanner.nextInt();
        int count = 1;
        if (number < 0) {
            System.out.println("Inavalid number");
        } else {
            for (int input = 1; input <= number; input++) {
                count *= input;
            }
            System.out.println(count);
        }
    }

}


