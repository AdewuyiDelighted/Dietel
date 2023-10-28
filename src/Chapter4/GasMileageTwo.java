package Chapter4;

import java.util.Scanner;

public class GasMileageTwo {
    public static void main(String[] args) {
        GasMileage gas = new GasMileage();
        Scanner scanner = new Scanner(System.in);
        int miles = 1;
        int milesCount = 0;
        int gallons = 0;
        double gallonCount = 0;
        int stopper = 0;
        int count = 0;
        double overall = 0;
        double average = 0;
        System.out.println("Enter -1 to stop or 0 to continue");
         stopper = scanner.nextInt();
        while (stopper != -1)  {
            System.out.print("Enter the miles driven  ");
            miles = scanner.nextInt();
            milesCount += miles;
            count++;
            gas.miles(miles);
            System.out.print("Enter the gallon used  ");
            gallons = scanner.nextInt();
            gallonCount += gallons;
            gas.gallons(gallons);
            overall = (double) milesCount /gallonCount;
            average = overall /count;
            gas.setMilePerGallon();
            gas.setCombinedMilesPerGallons();;
            System.out.println(gas.getMiles());
            System.out.println(gas.getGallons());
            System.out.println(gas.getMilesPerGallons());
            System.out.println("Enter -1 to quit or o to continue");
            stopper = scanner.nextInt();

        }
        System.out.println("The combined total of all trips per gallons is "+ overall);
        System.out.println("Tne average of combine trips per gallons is " + average);


    }
    }
