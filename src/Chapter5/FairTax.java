package Chapter5;

import java.util.Scanner;

public class FairTax {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter any number to run application ");
        String input = scanner.nextLine();
        fairTax(input);
    }

    public static void fairTax(String expenses) {
        inputExpenses(expenses);

    }

    public static void inputExpenses(String expenses) {
        int stopper = 0;
        double count = 0;
        while (stopper != -1) {
            System.out.println("""
                    Write out your expenses in categories
                    Expenses number one is :""");
            String input = scanner.nextLine();
            System.out.println("The amount of " + input + " is ");
            int expense = scanner.nextInt();
            double overall = expense * 0.23;
            count += overall;
            System.out.println("Enter - 1 to stop and 0 to continue");
            stopper = scanner.nextInt();
        }
        System.out.println("Your estimated FairTax is " + count);
    }

}
