package PersonalAssessement;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int value = random.nextInt(2);
        System.out.println("Enter tail or head , tail is 1,head is 2");
        int number = scanner.nextInt();

        if(value == number) {
            System.out.println("You won");
        }
            else {
                System.out.println("Try again");
            }
        }



}
