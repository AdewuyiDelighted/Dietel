package Chapter3;

public class ModifyAccount {

    private int balance;



    public void setWithdrawal(int amount){
        if(amount < balance ) {
            this.balance -= amount;
        }
        else{

            System.out.println("Withdrawal amount exceeded account balance ");
        }
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

    }


