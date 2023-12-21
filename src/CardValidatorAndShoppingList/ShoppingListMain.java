package CardValidatorAndShoppingList;

import static CardValidatorAndShoppingList.ShoppingList.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> productName = new ArrayList<String>();
        ArrayList<Integer> pieces = new ArrayList<Integer>();
        ArrayList<Integer> price = new ArrayList<Integer>();
        ArrayList<Integer> total = new ArrayList<>();

        int subTotal = 0;
        double dicounted = 0;
        double vat = 17.50;
        double vatEstimate = 0;
        double totalPrice = 0;
        double balance = 0;
        int count = 0;

        String customerName = promptCustomerName();

        String responses = "yes";

        while (responses.equals("yes")) {
            productName.add(promptProductName());

            pieces.add(promptQuantityOfProduct());
            int perUnit = pieces.get(count);


            print("Enter the price of the item per unit");
            int amount = scanner.nextInt();
            price.add(amount);

            int purchasePrice = perUnit * amount;


            total.add(purchasePrice);
            subTotal += purchasePrice;

            scanner.nextLine();

            print("Enter yes to continue shopping or no to stop");
            responses = scanner.nextLine().toLowerCase();
            count += 1;
        }

        print("What is your name");
        String cashierName = scanner.nextLine();
        print("How much discount would the customer get");
        int discount = scanner.nextInt();
        dicounted = subTotal * ((double) discount / 100);
        vatEstimate = subTotal * (vat / 100);
        totalPrice = (subTotal + vatEstimate) - dicounted;

        int length = productName.size();

        ShoppingList.informationPrintOut(cashierName, customerName);

        for (int num = 0; num < length; num++) {
            System.out.printf("%8s%8d%8d%8d%n", productName.get(num), pieces.get(num),
                    price.get(num), total.get(num));
        }
        pricePrintOut(subTotal, dicounted, vatEstimate, totalPrice);

        print(" How much did the customer give you");
        double amountPaid = scanner.nextInt();
        balance = amountPaid - totalPrice;

        informationPrintOut(cashierName, customerName);

        for (int num = 0; num < length; num++) {

            System.out.printf("%8s%8d%8d%8d%n", productName.get(num), pieces.get(num),
                    price.get(num), total.get(num));

        }
        receiptPrintOut(subTotal, dicounted, vatEstimate, totalPrice, amountPaid, balance);

    }

}



