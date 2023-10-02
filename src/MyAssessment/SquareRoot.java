package MyAssessment;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        for(int num = 1;num<= number;num++){
            int squareRoot = num * num;
            if(squareRoot == number){
                System.out.println(num + " is the square root of "+number);
            }
        }
    }
}
