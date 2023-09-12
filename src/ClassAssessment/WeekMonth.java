package ClassAssessment;

import java.util.Scanner;

public class WeekMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today date");
        int date = scanner.nextInt();

        for(;date > 6;){
            System.out.println("Enter a number ");
            date = scanner.nextInt();
        }

    switch (date){
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

    }
}
