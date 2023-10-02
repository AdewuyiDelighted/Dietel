package ChapterFour;

public class ChargeAccount {



    private int accountNumber;
    private int purchase;
    private int credit;
    private int totalBalance;
    public void setAccountNumber(int acctNumber) {
        this.accountNumber = acctNumber;

    }

    public int getAccountNumber() {

        return accountNumber;
    }
    public void setBalance(int balance){

        this.totalBalance = balance;
    }
    public int getBalance() {

        return totalBalance;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }

    public int getPurchase() {
        return purchase;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


    public int getCredit() {
        return  credit;
    }

    public int getCreditLimit() {
        return 5000;

    }

    public int getNewBalance() {
        int total = totalBalance + purchase - credit;
        return  total;

    }
}
