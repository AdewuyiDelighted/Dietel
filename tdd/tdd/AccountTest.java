package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testThatAccountExist(){
        Account account = new Account();
        assertNotNull(account);
    }
   @Test
    public void testThatAccountCanDeposit(){
        Account qudus = new Account();
        assertNotNull(qudus);

        qudus.deposit(500);
        assertEquals(500,qudus.checkBalance());
   }
   @Test
    public void testThatAccountCanDepositMultipleTimes(){
        Account account = new Account();
        account.deposit(500);
        assertEquals(500,account.checkBalance());
        account.deposit(1000);
        assertEquals(1500 , account.checkBalance());
        account.deposit(2000);
        assertEquals(3500 , account.checkBalance());
        account.deposit(4000);
        assertEquals(7500 , account.checkBalance());
        account.deposit(2000);
        assertEquals(9500 , account.checkBalance());
   }
   @Test
    public void testThatAccountCanWithdraw(){
        Account account = new Account();
        Account delight = new Account();
        assertNotNull(account);
        delight.deposit(2000);
        assertEquals(2000,delight.checkBalance());
        account.deposit(10000);
        assertEquals(10000 , account.checkBalance());
        account.withdrawal(1000);
        assertEquals(9000, account.checkBalance());


   }

}