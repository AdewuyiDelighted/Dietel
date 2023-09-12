package PersonalAssessement;

import java.util.Scanner;

public class HightestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int highest = 0;
        int counter = 0;
        for(number = 1;number<=10;number++){
            System.out.println("Enter a number: ");
             int input = scanner.nextInt();
             if(input > highest){
                 highest = input;
             }
           counter ++;

        }
        System.out.println(highest);
        System.out.println(counter);
    }

}
