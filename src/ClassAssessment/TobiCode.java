package ClassAssessment;

import java.util.Scanner;

public class TobiCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter First number:");
        int firstNum = scanner.nextInt();
        System.out.print("Enter Second number:");
        int secondNum = scanner.nextInt();
         int result = 1;
         int count = 0;
         for(count = 0;count <= secondNum;);
         result= result * firstNum;
        System.out.println(result);

    }
}
