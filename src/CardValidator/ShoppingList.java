package CardValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        prompt();

    }


    public static void prompt() {
        int size = 0;
        String result;
        String product = " ";
        ArrayList<String> productName = new ArrayList<String>();
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        ArrayList<Integer> price = new ArrayList<Integer>();
        ArrayList<Integer> total = new ArrayList<Integer>();
        System.out.println("Kindly Enter The Customer's   Name");
        String customerName = scanner.nextLine();
        String responses = "yes";
        while (responses.equals("yes")) {
            System.out.println("Enter the name of item the customer purchased");
            product = scanner.nextLine();
            productName.add(product);
            scanner.nextLine();
            System.out.println("Enter the quantity of item");
            int pieces = scanner.nextInt();
            quantity.add(pieces);
            System.out.println("Enter the price of the item per unit");
            int amount = scanner.nextInt();
            price.add(amount);
            scanner.nextLine();
            int purchasePrice = pieces * amount;
            total.add(purchasePrice);
            System.out.println("Enter yes to stop or no to continue");
            responses = scanner.nextLine();
            size = productName.size();

//            for (String num : productName) {
//                System.out.println(num);
//            }
        }
        System.out.println("Enter your name");
        String cashierName = scanner.nextLine();
        System.out.println("How much discount ");
        int discount = scanner.nextInt();

        System.out.printf("**************************************************",
                "***************************************************************","%10s%10s%10s%10s","ITEM","QTY","PRICE","TOTAL");
        for (int num = 0; num < size; num++) {
            //System.out.println("****************************");
            System.out.println(productName.get(num) +"     "+ quantity.get(num)+"      "+price.get(num)+"    "+total.get(num));
        }


    }
}