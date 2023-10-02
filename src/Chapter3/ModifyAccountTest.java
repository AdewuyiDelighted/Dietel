package Chapter3;

public class ModifyAccountTest {
    public static void main(String[] args) {

        ModifyAccount acct = new ModifyAccount();

        acct.setBalance(5000);
        acct.setWithdrawal(7000);

        System.out.print(acct.getBalance());



    }


}