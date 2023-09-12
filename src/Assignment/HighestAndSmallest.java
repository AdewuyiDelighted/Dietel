package Assignment;

import java.util.Scanner;

public class HighestAndSmallest {
    public static void main(String[]args){
        System.out.println("Enter number or press 0 to quit");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int counter = 0;
        int largest = input;
        int smallest = input;
        while(input != 0) {

            if (largest < input) {
                largest = input;
            }
            if (smallest > input) {
                smallest = input;
            }
           System.out.println("Enter number or press 0 to quit");
           input = scanner.nextInt();

        }

        System.out.println(largest);
       System.out.println(smallest);


        }



        }



