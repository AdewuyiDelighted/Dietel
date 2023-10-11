package Assignment;

import java.util.Scanner;

public class Hight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score:");
        int number = 0;
        int [] score = new int[10];
        int total = 0;
        score[number] = scanner.nextInt();
        int max = score[number];
        int min = score[number];
        int sum = score[number];
        for(int numb = 1; numb < score.length;numb++) {
            System.out.println("Ënter your score");
            score[number] = scanner.nextInt();
            total += score[number];
            if (score[number] > max) {
                max = score[number];
            }
            if (score[number] < min) {
                min = score[number];
            }
            //number++;

        }
            System.out.println(max);
            System.out.println(min);








    }
}
