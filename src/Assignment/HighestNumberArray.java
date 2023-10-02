package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class HighestNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int[] score = new int[10];
        System.out.println("Enter a number ");
        score[number] = scanner.nextInt();
        int total = score[number];
        int maximum = score[number];
        int odd = 0;
        int even = 0;
        for (int num = 1; num < score.length; num++) {
            System.out.println("Enter a number ");
            score[number] = scanner.nextInt();
            total += score[number];
            if(score[number] > maximum) {
                maximum = score[number];
            }
                if(score[number] %2==0){
                    odd ++;
                    System.out.println(odd);
                }
                if(score[number] % 2 != 0){
                    even ++;
                    System.out.println(even);
                }



        }
            System.out.println(total);
            System.out.println(maximum);
           // System.out.println(odd);
            //System.out.println(even);

    }
}
