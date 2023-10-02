package MyAssessment;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        for(int num = 1;num <= number;num++){
            if(num * num == number){
                System.out.println("The square root of " + number + " is " + num);
            }
        }

    }
}
