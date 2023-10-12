package CardValidatorAndShoppingList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> productName = new ArrayList<String>();
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        ArrayList<Integer> price = new ArrayList<Integer>();
        ArrayList<Integer> total = new ArrayList<>();

        String result;
        String product = " ";
        int subTotal = 0;
        double dicounted = 0;
        double vat = 17.50;
        double vatEstimate = 0;
        double totalPrice = 0;
        double balance = 0;

        print("Kindly Enter The Customer's Name");
        String customerName = scanner.nextLine();
        String responses = "yes";
        while (responses.equals("yes")) {
            print("Enter the name of item the customer purchased");
            product = scanner.nextLine();
            productName.add(product);
            scanner.nextLine();

            print("Enter the quantity of item");
            int pieces = scanner.nextInt();
            quantity.add(pieces);

            print("Enter the price of the item per unit");
            int amount = scanner.nextInt();
            price.add(amount);
            int purchasePrice = pieces * amount;

            total.add(purchasePrice);
            subTotal += purchasePrice;

            scanner.nextLine();

            print("Enter yes to continue shopping or no to stop");
            responses = scanner.nextLine();

        }
        print("What is your name");
        String cashierName = scanner.nextLine();
        print("How much discount would the customer get");
        int discount = scanner.nextInt();
        dicounted = subTotal * ((double) discount / 100);
        vatEstimate = subTotal * (vat / 100);
        totalPrice = (subTotal + vatEstimate) - dicounted ;

        int length = productName.size();


        print("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION:312,HERBERT MACAULAY WAY,SABO YABA
                TEL : 03293828343
                Date: 18 - Dec - 22 8:48 pm""");
        System.out.println("Cashier : " + cashierName + "\n" + "Customer Name: " + customerName);

        System.out.printf("%9s%9s%9s%9s%n%s%n", "ITEM", "QTY", "PRICE", "TOTAL",
                "_________________________________________________");

        for (int num = 0; num < length; num++) {
            System.out.printf("%8s%8d%8d%8d%n", productName.get(num), quantity.get(num),
                    price.get(num), total.get(num));
        }
        System.out.printf("%s%n%23s%d%n%23s%.2f%n%23s%.2f%n%s%n%s%n%23s" +
                        "%.2f%n%s%n%s%n%s%.2f%n%s%n%s%n",
                "________________________________________________",
                "Subtotal  :", subTotal,
                "Discount  :", dicounted,
                "VAT @ 17.50 :", vatEstimate,
                "_________________________________________________",
                "_________________________________________________",
                "Bill Total :", totalPrice,
                "_________________________________________________",
                "_________________________________________________",
                "THIS IS NOT AN RECEIPT KINDLY PAY ", totalPrice,
                "_________________________________________________",
                "_________________________________________________");


        print("How much did the customer give you");
        double amountPaid = scanner.nextInt();
        balance = amountPaid - totalPrice;

        print("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION:312,HERBERT MACAULAY WAY,SABO YABA
                TEL : 03293828343
                Date: 18 - Dec - 22 8:48 pm""");
        System.out.println("Cashier : " + cashierName + "\n" + "Customer Name: " + customerName);

        System.out.printf("%9s%9s%9s%9s%n%s%n", "ITEM", "QTY", "PRICE", "TOTAL",
                "_________________________________________________");

        for (int num = 0; num < length; num++) {
            System.out.printf("%8s%8d%8d%8d%n", productName.get(num), quantity.get(num),
                    price.get(num), total.get(num));
        }
        System.out.printf("%s%n%23s%d%n%23s%.2f%n%23s%.2f%n%s%n%s%n%23s" +
                        "%.2f%n%23s%.2f%n%23s%.2f%n%n%s%n%s%n%s%n%s%n%s",
                "_________________________________________________",
                "Subtotal  :", subTotal,
                "Discount  :", dicounted,
                "VAT @ 17.50 :", vatEstimate,
                "_________________________________________________",
                "_________________________________________________",
                "Bill Total :", totalPrice,
                "Amount paid :", amountPaid,
                "Balance: ", balance,
                "_________________________________________________",
                "_________________________________________________",
                "THANK YOU FOR YOUR PATRONAGE",
                "_________________________________________________",
                "_________________________________________________");

    }


    public static void print(String input) {
        System.out.println(input);

    }
}



