package Assignment;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CustomersAndItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] data = new int[4][3];
        int items = 0;
        int customer = 0;


        for (customer = 0; customer < data.length; customer++) {
            for(items = 0; items < data[customer].length; items++) {
                System.out.println("Enter the price for customer " + (customer + 1) + " item " + (items+1));
                data[customer][items] = scanner.nextInt();

            }
        }

        for (customer = 0; customer < data.length; customer++) {
            System.out.printf("Customer"+"%d%s",(customer + 1) , " | " );
            for (items = 0; items < data[customer].length; items++) {
                System.out.print(data[customer][items] + " | ");
            }
            System.out.println(" ");
        }
    }
}
