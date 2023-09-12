public class BankAccount {

    private int balance;


    public void deposit(int amount){
        this.balance += amount;

    }
    public void withdrawal(int amount){
        if(amount < balance){
        this.balance -= amount;
    }
       else if(amount > balance) {
            System.out.println("Insufficient fund");


        }



        }

    public int checkBalance(){
        return balance;
    }

}
