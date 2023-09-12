package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountOneTest {
   @Test
   public void accountThatCheckBalance() {
       AccountOne account = new AccountOne();
       assertNotNull(account);

       account.checkBalance();
       assertEquals(0, account.checkBalance());
   }

       @Test
       public void testThatCanDeposit() {
           AccountOne account = new AccountOne();
           assertNotNull(account);

        account.checkBalance();
        assertEquals(0 ,account.checkBalance() );

           account.deposit(2000);
        assertEquals(2000 , account.checkBalance());

        //account.withdrawal(1500);
       // assertEquals(500, account.checkBalance());

        account.transfer(2000);
        assertEquals(0,account.checkBalance());



       }


}