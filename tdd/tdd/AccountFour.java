package tdd;

public class AccountFour {
    private int balance;


    public void deposit(int amount) {
        this.balance += amount;

    }
    public int balance(){

        return balance;
    }

    public void transfer(int amount , AccountFour name) {
        if(amount < balance) {
            this.balance -= amount;
            withdraw(amount);

            if (amount < balance)
                this.balance += amount;
            name.deposit(amount);
        }

            else{
            this.balance = balance;

        }

    }

    private void withdraw(int amount) {
        if(amount < balance) {
            this.balance -= amount;
        }

        else{

        }

    }
}
