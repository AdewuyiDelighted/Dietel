package PersonalAssessement;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTestTwo {
    public static void main(String[] args) {
        TaxCalculator tax = new TaxCalculator();
        int number = 1;
        String name;
        int earnings;
        Scanner scanner = new Scanner(System.in);

        while (number <= 3) {
            System.out.println("Enter Citizen name");
             name = scanner.next();
             tax.citizenName(name);
            System.out.println("Enter Citizen Earning");
             earnings = scanner.nextInt();
             tax.citizenEarning(earnings);
             number++;
            System.out.println("The total tax for "+name +" is "+tax.totalTax());
        }



    }
}