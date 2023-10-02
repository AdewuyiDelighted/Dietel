public class AccountTwo{
    private int balance;


    public int balance() {
        return balance;
    }


    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdrawal(int amount) {
        if( amount < balance) {
            this.balance -= amount;
        }
            else
            System.out.print("insufficent fund");
        }

    public void transfer(int amount , AccountTwo name) {
        this.balance -= amount;
       name.deposit(amount);


    }
}









