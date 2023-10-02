package PersonalAssessement;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  miles = 1;
        int gallon;
        double calculate = 0;
        double counter = 0;
        double count =0;
        while (miles != 0)  {
            counter += calculate;
            System.out.println("Enter miles driven or enter 0 to quit:");
            miles = scanner.nextInt();
            System.out.println("Enter gallon spent per each trip:");
            gallon = scanner.nextInt();
            calculate = (double) miles / gallon;
            System.out.printf("%.2f%n", calculate);
            count++;

        }
           if (miles == 0)
                System.out.printf("%s%.2f%n","The combined miles per gallon is ",counter);

    }
}

