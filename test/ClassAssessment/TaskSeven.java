package ClassAssessment;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int numbe = 1; numbe <= 10; numbe++) {
            System.out.println("Enter a  number between 1 - 100");
            int number = scanner.nextInt();
            if (number <= 100) {
                sum += number;
            }
            else{
                while (number > 100 || number < 0) {
                    System.out.println("Enter a valid number");
                    number = scanner.nextInt();
                    if(number < 100) {
                     sum += number;

                    }
                }
            }

        }
        System.out.println(sum);
    }

}






