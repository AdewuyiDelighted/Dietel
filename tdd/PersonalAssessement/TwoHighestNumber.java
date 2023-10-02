package PersonalAssessement;

import java.util.Scanner;

public class TwoHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int counter = 0;
        int count;
        int hightestOne = number;
        int hightestTwo = number;
        int smallest = number;
        int sum;

        for (int numb = 1; numb <= 10; numb++) {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            if (number > hightestOne) {
                hightestOne = number;
            }
        }
            if (number < hightestOne){
                counter++;
        }
        if(counter > hightestTwo){
            hightestTwo = counter;
        }




        System.out.println(hightestOne);
        System.out.println(hightestTwo);

    }

}

