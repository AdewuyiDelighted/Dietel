package chapter8;

public class SavingAccount {
    private static double annualInterestRate;
    private double savingsBalance;


    public void setSavingsDeposit(int deposit) {
        this.savingsBalance += deposit;

    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double interestRate) {
        annualInterestRate = interestRate;

    }

    public void calculateMonthlyInterest() {
        double monthlyRate = (this.getSavingsBalance() * annualInterestRate / 100) / 12;
        String stringOfSavingBalance = String.format("%.2f", monthlyRate);
        //System.out.println(stringOfSavingBalance);
        double monthlyInterest = Double.parseDouble(stringOfSavingBalance);
        savingsBalance += monthlyInterest;
    }


}
