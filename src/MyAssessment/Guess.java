package MyAssessment;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number btw 1 - 10");
       int num =  random.nextInt(10);
       int number = scanner.nextInt();

       if(number > num){
           System.out.println(number +" is greater than " + num);
       }
       if(number < num){
           System.out.println(number + " is lesser than " + num);
       }
        if(number == num){
            System.out.println(number + " is equal to"+num);
        }

    }
}
