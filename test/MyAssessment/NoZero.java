package MyAssessment;

import java.util.Scanner;

public class NoZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Ënter a number or 0 to quit ");
        int number = 1;
        int count = 0;
        int positiveNum = 0;
        int negativeNUm = 0;
        int sum = 0;
        while (number != 0) {
            System.out.println("Enter a number or zero to stop ");
            number = scanner.nextInt();
            sum += number;
            count++;
            if (number > 0){
                positiveNum++;
            }
            else if (number < 0) {
                negativeNUm++;
            }
        }
        System.out.println(positiveNum);
        System.out.println(negativeNUm);

    }
}
