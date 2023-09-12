package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountThreeTest {

    @Test
    public void accountCanDepositAndWithdraw(){
        AccountThree account = new AccountThree();
        assertNotNull(account);

        account.deposit(4000);
        assertEquals(4000 , account.balance());
        account.deposit(2000);
        assertEquals(6000, account.balance());
        account.deposit(4000);
        assertEquals(10000 , account.balance());
        account.deposit(2000);
        assertEquals(12000 , account.balance());
        account.withdrawal(5000 );
        assertEquals(7000, account.balance());
        account.deposit(2000);
        assertEquals(9000, account.balance());





    }

}