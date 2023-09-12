package Assignment;

import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = scanner.nextInt();
        int count = 1;
         for(int number = 1;number<=input;number++){
             count =count * number;
         }
        System.out.println(count);
    }

}
