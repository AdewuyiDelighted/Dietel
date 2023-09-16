package MrChibuzorAssignment;
import java.util.Scanner;

public class SumOfNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number  or 0 to quit");
            int firstNumber = scanner.nextInt();
            for(;firstNumber!=0;)  {
                System.out.println("Enter second number");
               int  secondNumber = scanner.nextInt();
                int  total = firstNumber + secondNumber;
                System.out.println(total);
                System.out.println("Enter a number or 0 to quit");
                firstNumber = scanner.nextInt();


            }



    }

}
