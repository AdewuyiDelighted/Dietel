package ChapterThree;

public class Account {
    private int balance;
    private  String name;



    public int getBalance() {
        return balance;
    }


    public void setDeposit(int amount) {
        this.balance += amount;
    }
    public int getDeposit(){
        return balance;
    }

    public void setWithdraw(int amount) {
        if(amount < balance) {
            this.balance -= amount;
        }
        else{
            System.out.println("Amount exceed limit");
        }
    }
    public int getWithdraw(){
        return balance;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}



