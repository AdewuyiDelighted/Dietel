import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    public static void main(String[] args){

        BankAccount account = new BankAccount();

        account.deposit(100000);
        account.withdrawal(70000);

        System.out.println("The balance is "  + account.checkBalance());

    }

}