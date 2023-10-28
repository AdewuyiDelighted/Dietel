package Chapter4;


import java.util.Scanner;

public class   TwoHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int highest = number;
        int highestTwo = number;
        int count = 0;
        for(int numb = 1;numb <= 10;numb++){
            System.out.println("Enter a number:");
            number = scanner.nextInt();
            count++;
            if(number > highestTwo && number < highest){
                 highestTwo = number;
            }
            if(number > highest){
                highestTwo = highest;
                highest = number;
            }

        }
        System.out.println("The two largest number is "+highest+" and "+highestTwo);

    }
}


