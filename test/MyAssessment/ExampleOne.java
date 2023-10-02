package MyAssessment;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        int num = 0;
        int [] score = new int[2];
        System.out.println("Enter a number " + (num + 1));
        score [num] = scanner.nextInt();
        int sum = score[num];
        double average = 0;
        int minimum = score[num];
        int maximum = score[num];
        for(num = 0; num < score.length;num++){
           System.out.println("Enter a number " + (num + 2));
           score [num] = scanner.nextInt();
           sum += score[num];
           average = sum /( score.length *1.0);
           if(score[num] > maximum){
               maximum = score[num];
           }
           if(score[num] < minimum){
               minimum =score[num];
           }
       }
        System.out.println(sum);
        System.out.println(average);
        System.out.println(minimum);
        System.out.println(maximum);


    }
}
