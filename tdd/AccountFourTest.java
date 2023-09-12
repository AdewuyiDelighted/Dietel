import org.junit.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

 public class AccountFourTest {

    @Test
    public void testThatCanTransfer(){

        // given i have an account
            AccountFour myAccount = new AccountFour();
            AccountFour yourAccount = new AccountFour();
            // my account can deposit
            myAccount.deposit(150000);
            assertEquals(150000,myAccount.checkBalance());
            yourAccount.deposit(50000);
            //myAccount.withdrawal(3000);
            assertEquals(150000,myAccount.checkBalance());
            myAccount.transfer(50000 , yourAccount);
            assertEquals(100000,myAccount.checkBalance());
           assertEquals(100000, yourAccount.checkBalance());
           //yourAccount.transfer(500,myAccount);
           //assertEquals(500,yourAccount.checkBalance());
           //assertEquals(5500,myAccount.checkBalance());




    }

}