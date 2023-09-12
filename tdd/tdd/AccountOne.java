package tdd;

import org.junit.jupiter.api.Test;

public class AccountOne{
    private int balance;

    public int checkBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdrawal(int amount) {
        if(amount < balance ) {
            this.balance -= amount;
        }
        if(amount > balance ) {
            System.out.println("amount exceed balance");
        }
    }

    public void transfer(int moneyOut) {
        if(moneyOut < balance) {
            this.balance -= moneyOut;
        }
   if(moneyOut > balance){
       System.out.println("insufficent fund" );
   }
    }

}