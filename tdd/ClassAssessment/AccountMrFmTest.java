package ClassAssessment;

import org.junit.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

public class AccountMrFmTest {

    @Test
    public void testThatAccountCanBeDepositedInto(){
        AccountMrFm account = new AccountMrFm();
        assertNotNull(account);
        double balance = account.getBalance();
        assertEquals(0,account.getBalance());
        account.deposit(5000);
        assertEquals(5000,account.getBalance());
    }
@Test
    public void testThatAccountCanWithdraw(){
    AccountMrFm account = new AccountMrFm();
    account.deposit(5000);
    account.withdraw(4000);
    assertEquals(1000,account.getBalance());

}
@Test
    public void testThatAccountCanTransfer(){
    AccountMrFm account = new AccountMrFm();
    AccountMrFm accountTwo = new AccountMrFm();
    account.deposit(5000);
    account.transfer(4000,accountTwo);
    assertEquals(1000,account.getBalance());
    assertEquals(4000,accountTwo.getBalance());

}
}