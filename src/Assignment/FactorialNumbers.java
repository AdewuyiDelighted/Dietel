package Assignment;

import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int answer = scanner.nextInt();
        int counter = 1;
        for(int number = answer;number > 0;number--){
            counter *= number;


        }
        System.out.println(counter);

    }
}
