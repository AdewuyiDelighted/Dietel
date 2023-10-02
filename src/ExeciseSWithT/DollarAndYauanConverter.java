package ExeciseSWithT;

import java.util.Scanner;

public class DollarAndYauanConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to the most trusted money convertor in Nigeria
                Please we would love you to enter the exchange rate of U.S dollar to Chinese RMB""");
        double exchangeRate = scanner.nextFloat();
        System.out.println("""
                Enter 0 to convert U.S dollar to Chinese RMB and enter 1 to convert from Chinese RMB to U.S dollar""");
        double convert = scanner.nextFloat();
        if(convert == 0) {
            System.out.println("Enter amount of dollar you would love to convert to Chinese RMB ");
            double dollarRmb = scanner.nextFloat();
            double amount = exchangeRate * dollarRmb;
            System.out.printf("%.1f%s%.2f%s",dollarRmb," is ",amount," yuan ");
        }
            else if(convert == 1){
            System.out.println("Enter amount of Chinese RMB you would love to convert to Dollar ");
             double RmbDollar = scanner.nextInt();
             double amount = RmbDollar/exchangeRate;
            System.out.printf("%.1f%s%.2f",RmbDollar," yuan is ",amount);
            }
            else {
                    while (convert != 1 || convert != 0) {
                        System.out.println("Invalid input");
                        System.out.println("""
                                Enter 0 to convert U.S dollar to Chinese RMB and enter 1 to convert from Chinese RMB to U.S dollar""");
                        convert = scanner.nextInt();
                        if(convert == 1){
                            System.out.println("Enter amount of Chinese RMB you would love to convert to Dollar ");
                            double RmbDollar = scanner.nextInt();
                            double amount = RmbDollar/exchangeRate;
                            System.out.printf("%.1f%s%.2f",RmbDollar," yuan is ",amount);break;
                        }
                        if(convert == 0){
                            System.out.println("Enter amount of dollar you would love to convert to Chinese RMB ");
                            double dollarRmb = scanner.nextFloat();
                            double amount = exchangeRate * dollarRmb;
                            System.out.printf("%.1f%s%.2f%s",dollarRmb," is ",amount," yuan ");break;
                        }
                        }
                    }

            }

        }



