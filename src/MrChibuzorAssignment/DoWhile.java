package MrChibuzorAssignment;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int number = 0;
        int numberTwo =0;
        int numberThree =0;
        int numberFour = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            number = scanner.nextInt();
            System.out.println("Enter second number");
            numberTwo = scanner.nextInt();
            System.out.println(number + numberTwo);
            System.out.println("Enter 0 to quit or any first number to continue");
            numberThree = scanner.nextInt();
            //System.out.println("Enter second number");
            //numberFour =scanner.nextInt();
            if(numberThree == 0)  {
                System.out.println("Thanks"); break;
            }
            else{
                System.out.println("Enter second number");
                numberFour =scanner.nextInt();
                System.out.println(numberThree + numberFour);
            }


        }

        while(numberTwo !=0);

        //System.out.println(counter1+counter2);
    }

}
