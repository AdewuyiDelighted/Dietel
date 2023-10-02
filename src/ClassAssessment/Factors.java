package ClassAssessment;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number ");
        int number = scanner.nextInt();


       int counter = 0;
       for(int input = 1;input <=number;input++) {
           if(number%input==0) {
                counter++;


               System.out.println(input);
            }


            }

        }


    }

