package ChapterThree;

public class AccountDisplay{
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Ope");
        account.setDeposit(2000);
        setDisplay(account);


    }


    public  static void setDisplay(Account myAccount){
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getBalance());
    }
}