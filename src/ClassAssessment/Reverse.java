package ClassAssessment;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int digit = scanner.nextInt();
        int divide = 0;
        int reverse = 0;
        while(digit != 0){
            divide = digit % 10;
            reverse = reverse * 10 + divide;
            digit/=10;
        }
        System.out.println(reverse);
    }

        }


