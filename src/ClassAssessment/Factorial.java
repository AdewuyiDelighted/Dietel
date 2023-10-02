package ClassAssessment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int count = 0;
        int number = scanner.nextInt();
        int product = 1;
        System.out.print(number );
        for(int num = number;num >= 1;num--) {
            product = num * product;
            count = num;    if(num == number ) continue;
            System.out.print(" * "+ count);
        }
        System.out.println(" = "+ product);

    }
}
