package MrChibuzorAssignment;

import java.util.Scanner;

public class HighAndSmall{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or 0 to quit ");
        int number = scanner.nextInt();

        int highest =  number;
        int smallest = number;

        for(;number != 0;){
            if(highest < number) {
                highest = number;
            }



        }
    }
}
