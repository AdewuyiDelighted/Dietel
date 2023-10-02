package ChapterFour;

import java.util.Scanner;

public class GasMileageTwo {
    public static void main(String[] args) {
        GasMileage gas = new GasMileage();
        Scanner scanner = new Scanner(System.in);
        int miles = 1;
        int gallons = 0;
        int total = 0;
        int count = 0;

        while (miles != 0) {
            System.out.print("Enter the miles driven or enter 0 to quit: ");
            miles = scanner.nextInt();
            gas.miles(miles);
            System.out.print("Enter the gallon used or enter 0 to quit: ");
            gallons = scanner.nextInt();
            gas.gallons(gallons);
            gas.miles(miles);
            gas.gallons(gallons);
            gas.milesPerGallons();
                System.out.println(gas.milesPerGallons());

        }
       // if(miles == 0) {
         //   System.out.println();
        //}
    }
    }
