package CardValidatorAndShoppingList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    static Scanner scanner = new Scanner(System.in);

    public static void print(String input) {
        System.out.println(input);

    }

    public static void pricePrintOut(int subTotal, double discounted, double vatEstimate, double totalPrice) {
        System.out.printf("""
                        _____________________________________________________
                        Subtotal : %d
                        Discounted : %.2f
                        VAT @ 17.50 : %.2f
                        ______________________________________________________
                        _______________________________________________________
                        Bill Total : %.2f
                        ________________________________________________________
                        _______________________________________________________
                        THIS IS NOT AN RECEIPT KINDLY PAY  %.2f""",
                subTotal, discounted, vatEstimate, totalPrice, totalPrice);
    }

    public static String currentDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        return date.format(dateTimeFormatter);
    }


    public static void informationPrintOut(String cashierName, String customerName) {
        String currentDateWa = currentDate();

        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION:312,HERBERT MACAULAY WAY,SABO YABA
                TEL : 03293828343
                Date:%s
                Cashier:%s
                Customer name:%s%n""",currentDateWa,cashierName,customerName);
        System.out.printf("%9s%9s%9s%9s%n%s%n", "ITEM", "QTY", "PRICE", "TOTAL",
                "_________________________________________________");

    }

    public static void receiptPrintOut(int subTotal, double dicounted, double vatEstimate, double totalPrice, double amountPaid, double balance) {
        System.out.printf("""
                __________________________________________________
                Subtotal : %d
                Discount : %.2f
                Vat @ 17.50 : %.2f
                ___________________________________________________
                ____________________________________________________
                Bill Total : %.2f
                Amount paid : %.2f
                Balance: %.2f
                _____________________________________________________
                _____________________________________________________
                THANK YOU FOR PATRONAGE
                ____________________________________________________
                ____________________________________________________""", subTotal, dicounted, vatEstimate, totalPrice, amountPaid, balance);
    }

    public static String promptCustomerName() {
        print("Kindly Enter The Customer's Name");
        return scanner.nextLine();
    }

    public static String promptProductName() {
        print("Enter the name of item the customer purchased");
       return scanner.next();

    }
    public static int promptQuantityOfProduct() {
        print("Enter the quantity of item");
       return scanner.nextInt();


    }


}
