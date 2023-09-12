package PersonalAssessement;

import java.util.Scanner;

public class LoopScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int numberOne = scanner.nextInt();
        int counter = 0;
        int number = 5;
        for (int sum = 1; sum <= number; sum++) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter number");
//            int numberOne =scanner.nextInt();
            if (numberOne == 5) {
                counter++;
                //if(counter ==1 || counter>1){
                //System.out.print("Good");
            }
            //if (counter < 1) {
            //  System.out.println("Enter a nuumber");
            //}
            if (counter < 1) {
                System.out.println("Enter a number");
            }
        }
    }
}
//        if(counter ==1 || counter>1){
//            System.out.print("Good");
//        } else if(counter<1) {
//            System.out.println("Enter a number");
//        }
//         else
//            System.out.print("Enter a number");






