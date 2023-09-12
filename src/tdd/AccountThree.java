package tdd;

public class AccountThree {
    private int balance;


    public int balance() {
        return balance;
    }
    public void deposit(int amount) {
        this.balance +=amount;

    }

    public void withdrawal(int amount) {
        if(amount < balance){
            this.balance -= amount;
        }
        else
            if(amount > balance) {
                System.out.print("insufficent fund");
            }

        }

    }

