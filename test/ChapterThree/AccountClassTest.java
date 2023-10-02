package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountClassTest {
   private  final Account account = new Account();
    @Test
    public void testThatIHaveAndAccount(){
        assertNotNull(account);

   }
  @Test
   public void testThatAccountHaveBalance(){
        int result = account.getBalance();
        assertEquals(0,result);
    }
@Test
    public void testThatAccountCanDeposit(){
        account.setDeposit(300);
        assertEquals(300,account.getDeposit());
    }
    @Test
    public void testThatAccountCanWithdraw(){
        account.setDeposit(300);
        assertEquals(300,account.getDeposit());
        account.setWithdraw(100);
        assertEquals(200,account.getWithdraw());
    }
@Test
    public void testThatAccountCantWithdrawBeyondBalance(){
    account.setDeposit(500);
    assertEquals(500,account.getDeposit());
    account.setWithdraw(600);
    assertEquals(500,account.getWithdraw());

}
@Test
    public void testThatAccountHaveName(){
        account.setName("Ope");
        assertEquals("Ope",account.getName());
}
}
