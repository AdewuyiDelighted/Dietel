package PersonalAssessement;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int largest = number;
        int counter = 0;
        while (number <= 10) {
            counter++;
            //if(largest < number) {
            //largest = number;


            //System.out.println(counter);
            System.out.println("Please enter a number and note that you can only input one number once");
            number = scanner.nextInt();
            //System.out.println(counter);

        }


        System.out.print(number);

    }

}
