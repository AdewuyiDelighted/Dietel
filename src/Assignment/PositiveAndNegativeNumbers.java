package Assignment;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number and enter 0 to stop");
        int number = scanner.nextInt();
        int counterPositive = 0;
        int counterNegative = 0;
        int counterZero =1;
        for (int numb = 0 ; number != 0; numb++) {

            if (number > 0) {
                counterPositive++;
            }
             if (number < 0) {
                counterNegative++;
            }
             if(number == 0){
                counterZero++;
            }
            System.out.println("Enter number  and enter 0 to stop");
            number = scanner.nextInt();


        }
        System.out.println(counterPositive);
        System.out.println(counterNegative);
        System.out.println(counterZero);

        }






    }

