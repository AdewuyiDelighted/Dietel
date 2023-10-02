package ClassAssessment;

public class AccountMrFm {
    private int balance;


    public double getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void transfer(int amount, AccountMrFm name) {
        withdraw(amount);
        name.deposit(amount);
    }
}
