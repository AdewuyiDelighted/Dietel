public class AccountFour {

    private int balance;


    public void deposit(int amount) {
        balance += amount;
    }

    public int checkBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        balance -= amount;
    }

    public void transfer(int amount , AccountFour name) {
        if(amount <= balance) {
            balance -= amount;
            name.deposit(amount);
        } else{
            balance = checkBalance();

        }


        }

    }

