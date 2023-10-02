package ClassAssessment;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today date");
        int date = scanner.nextInt();
        System.out.println("Enter the number of days elasped since today");
        int day = scanner.nextInt();
        int future = date + day %7;

        switch (date) {
            case 0:
                System.out.print("Today is Sunday ");
                break;
            case 1:
                System.out.print("Today is Monday ");
                break;
            case 2:
                System.out.print("Today is Tuesday ");
                break;
            case 3:
                System.out.print("Today is Wednesday ");
                break;
            case 4:
                System.out.print("Today is Thursday ");
                break;
            case 5:
                System.out.print("Today is Friday ");
                break;
            case 6:
                System.out.print("Today is Saturday ");
                break;
        }
        switch(future) {
            case 0:
                System.out.println("and future day is Sunday");
                break;
            case 1:
                System.out.println("and future day is Monday");
                break;
            case 2:
                System.out.println("and the future is Tuesday");
                break;
            case 3:
                System.out.println("and the future is Wednesday");
                break;
            case 4:
             System.out.println(" and the future is Thurday");
                break;
            case 5:
                System.out.println("and the future is Friday");
                break;
            case 6:
                System.out.println("and the future Saturday");
                break;

        }

    }
}


