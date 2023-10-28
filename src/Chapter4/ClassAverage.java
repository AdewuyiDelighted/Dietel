package Chapter4;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int grade =1;
        while(grade <=10){
            System.out.print("Enter a grade");
            int score = scanner.nextInt();
            counter = counter + score;
            grade++;

        }
    int total=counter/10;
        System.out.println(counter);
        System.out.println(total);
    }
}
