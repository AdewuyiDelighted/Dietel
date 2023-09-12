import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTwoTest {


        @Test
        public void testThatAccountCanFunction(){
            AccountTwo accountTwo = new AccountTwo();
            AccountTwo account = new AccountTwo();
            assertNotNull(accountTwo);
            accountTwo.balance();
            assertEquals(0, accountTwo.balance());
            accountTwo.deposit(3000);
            assertEquals(3000 , accountTwo.balance());
            accountTwo.withdrawal(2000);
            assertEquals(1000,accountTwo.balance());
            accountTwo.transfer(1000,account);
            account.deposit(0);
            assertEquals(0 , accountTwo.balance());
            assertEquals(1000 , account.balance());

        }



    }

