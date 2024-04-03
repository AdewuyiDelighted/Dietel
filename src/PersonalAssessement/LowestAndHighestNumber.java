package PersonalAssessement;

import java.util.Scanner;

public class LowestAndHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int firstNumber = scanner.nextInt();
        int smallest = firstNumber;
        int largest = firstNumber;

        for(int index = 1;index < 10;index++){
            System.out.println("Enter a number");
           int number = scanner.nextInt();
            if(number < smallest){
                smallest = number;
            }
            if(number > largest){
                largest = number;
            }
        }
        System.out.println("The smallest number = "+smallest);
        System.out.println("The largest number = "+largest);
    }
}
