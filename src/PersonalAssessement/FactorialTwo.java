package PersonalAssessement;

import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int count = 0;
        for(int num = 1;num>=number;num++) {
            count++;



            System.out.println(count);
        }

    }
}
