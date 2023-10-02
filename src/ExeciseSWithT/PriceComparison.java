package ExeciseSWithT;

import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(number != 1){
            System.out.print("Enter the weight of package 1 rice ");
            int firstWeight = scanner.nextInt();
            System.out.print("Enter the price of package 1 rice ");
            double firstPrice = scanner.nextFloat();
            System.out.print("Enter the weight of package 2 rice ");
            int secondWeight = scanner.nextInt();
            System.out.print("Enter the price of package 2 rice ");
            double secondPrice = scanner.nextInt();
            if(firstPrice < secondPrice){
                System.out.println("Package 1 has a better price ");
            }
            else{
                System.out.println("Package 2 has a better price");
            }
            System.out.println("Enter number 1 to stop and 0 to continue ");
            number = scanner.nextInt();

        }
    }
}
