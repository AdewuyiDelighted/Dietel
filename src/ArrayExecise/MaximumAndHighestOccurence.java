package ArrayExecise;

import java.util.Scanner;

public class MaximumAndHighestOccurence {
    public static void main(String[] args) {
        int count = 0;
        int occurence = 0;
        int [] listOfNumbers = new int [12];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        listOfNumbers[count] = scanner.nextInt();

        int max = listOfNumbers[count];

        for(int index = 1;index < listOfNumbers.length;index++){
            System.out.println("Enter a number");
            listOfNumbers[index] = scanner.nextInt();

            if(listOfNumbers[index] > max){
                max = listOfNumbers[index];
            }
        }
        for (int listOfNumber : listOfNumbers) {

            if (listOfNumber == max) {
                occurence++;
            }
        }
        System.out.println("Maximum is " + max);
        System.out.println("The occurance of " + max + " is " + occurence);
    }
}
