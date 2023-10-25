package ChapterSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCharges = 0.0;

        System.out.println("Enter the hours at which the current car has used in the park");
        int currentCarHours = scanner.nextInt();
        double amount = calculateCharges(currentCarHours);

        System.out.println("The charge for the current customer is " + amount);
        System.out.println("  ");

        System.out.println("The number of cars parked yesterday at car park");
        int yesterdaySales = scanner.nextInt();

        for(int number = 0; number < yesterdaySales; number++) {
            System.out.println("Enter the number of hours car " + (number + 1));
            int hoursCarSpent = scanner.nextInt();
            double charge = calculateCharges(hoursCarSpent);
            totalCharges += charge;
            System.out.println("The running total of yesterday sales is " + totalCharges);
        }
    }

    public static double calculateCharges(int hours) {
        double amount = 0.0;
        double pricePerThreeHours = 2.00;
        if (hours >  3 && hours < 24) {
            int hoursUsed = hours - 3;
            double price = hoursUsed * 0.50;
            amount = price + pricePerThreeHours;
        } else if (hours == 24) {
            amount = 10.00;
        } else {
            amount = pricePerThreeHours;
        }
        return amount;
    }


}
