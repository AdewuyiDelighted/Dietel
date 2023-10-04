package ChapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int minimum = number;
        int maximum = number;
        int sum = 0;
        for(int num = 1;  num <  10;num ++){
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if(number > maximum){
                maximum = number;
            }
            if(number < minimum ){
                minimum = number;
            }
        }
       sum = maximum + minimum;
        System.out.println("The maximum number is " + maximum);
        System.out.println("The minimum number is " + minimum);
        System.out.println(sum);
    }

    }
