package ChapterFour;

import java.util.Scanner;

public class ChargeAccountTestTwo {
    public static void main(String[] args) {
        ChargeAccount chargeAccount = new ChargeAccount();
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int accountNumber;
        int accountBalance;
        int purchase;
        int credit;
        int newBalance = 0;
        while (number <= 1){
            System.out.println("Enter customer account Number: ");
            accountNumber = scanner.nextInt();
            chargeAccount.setAccountNumber(accountNumber);
            System.out.println("Enter customer beginning account balance: ");
            accountBalance = scanner.nextInt();
            chargeAccount.setBalance(accountBalance);
            System.out.println("Enter total amount of purchase  by the customer for this month: ");
            purchase = scanner.nextInt();
            chargeAccount.setPurchase(purchase);
            System.out.println("Enter total credit applied to customer account for this month: ");
            credit = scanner.nextInt();
            chargeAccount.setCredit(credit);
            newBalance = chargeAccount.getNewBalance();
            if(newBalance > chargeAccount.getCreditLimit()) {
                System.out.println("Credit exceed limit");
            }
            number++;
        }
        System.out.println("The customer's account number is "+chargeAccount.getAccountNumber());
        System.out.println("The customer's account balance is "+chargeAccount.getBalance());
        System.out.println("The total of all items charged by customer this month is  "+chargeAccount.getPurchase());
        System.out.println("The total of credit applied to customer's account this month is "+chargeAccount.getCredit());
        System.out.println("The new balance of customer is "+ newBalance);

    }


}