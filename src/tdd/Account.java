package tdd;

public class Account {
    private int balance;
    private String name;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int checkBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        if(amount < balance) {
            this.balance = balance - amount;
        }
        else if(amount > balance) {
            //this.balance = balance;
            System.out.println("insufficient fund");
        }


    }

    public void balance(int i) {
    }

    public void transfer(int moneyOut, Account name) {
    withdrawal(moneyOut);
    name.deposit(moneyOut);


    }



}
