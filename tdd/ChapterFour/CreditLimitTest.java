package ChapterFour;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitTest {


    @Test
    public void testThatCreditLimitExist() {
        CreditLimit creditlimit = new CreditLimit();
        assertNotNull(creditlimit);
    }

    @Test
    public void testThatCustomerHaveAccount() {
        CreditLimit creditLimit = new CreditLimit();
        creditLimit.setAccountNumber(2126903496);
        assertEquals(2126903496, creditLimit.getAccountNumber());
    }

    @Test
    public void testThatCustomerHaveBalance() {
        CreditLimit creditLimit = new CreditLimit();
        double balance = creditLimit.getBalance();
        assertEquals(0, balance);

    }

    @Test
    public void testTheTotalAmountOfItemPurchased() {
        CreditLimit creditLimit = new CreditLimit();
        creditLimit.setPurchase(4000);
        assertEquals(4000, creditLimit.getPurchase());
    }

    @Test
    public void testTotalAmountOfCreditPaid() {
        CreditLimit creditLimit = new CreditLimit();
        creditLimit.setCredit(2000);
        assertEquals(20000, creditLimit.getCredit());
    }
@Test
    public void testAccountCreditLimit(){
        CreditLimit creditLimit = new CreditLimit();
        creditLimit.getCreditLimit();
        assertEquals(5000, creditLimit.getCreditLimit());

}
}