package ChapterFour;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class SalesCommissionCalculatorTestTwo {
    static SalesCommissionCalculator saleCommission = new SalesCommissionCalculator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wages = 0;
        wages = saleCommission.getWages();
        System.out.println("Enter the total sales of sales person this week: ");
        double sales = scanner.nextInt();
        saleCommission.setSales(sales);
        double totalCommission = 0;
        totalCommission = saleCommission.getTotalCommission();
        System.out.println("The wages of the sale persn is "+wages);
        System.out.println("The total sales of sales person is " + saleCommission.getSales());
        System.out.println("The total commission of sales person is "+totalCommission);


    }

}