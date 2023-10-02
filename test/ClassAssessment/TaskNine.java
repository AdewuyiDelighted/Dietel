package ClassAssessment;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double divide = 0;
        for(int num = 1; num <= 10; num++){
            System.out.println("Enter a number between 1 - 100");
            int number = scanner.nextInt();
            if(number <= 100 && number > 0){
                counter+= number;
                divide++;
            }
        }
        System.out.println(counter/divide);
    }
}
