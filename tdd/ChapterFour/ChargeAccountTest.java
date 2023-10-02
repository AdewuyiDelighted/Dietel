package ChapterFour;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChargeAccountTest {


    @Test
    public void testThatCreditLimitExist() {
        ChargeAccount chargeAccount = new ChargeAccount();
        assertNotNull(chargeAccount);
    }

    @Test
    public void testThatCustomerHaveAccount() {
        ChargeAccount chargeAccount = new ChargeAccount();
        chargeAccount.setAccountNumber(2126903496);
        assertEquals(2126903496, chargeAccount.getAccountNumber());
    }

    @Test
    public void testThatCustomerHaveBalance() {
        ChargeAccount chargeAccount = new ChargeAccount();
        double balance = chargeAccount.getBalance();
        assertEquals(0, balance);

    }

    @Test
    public void testTheTotalAmountOfItemPurchased() {
        ChargeAccount chargeAccount = new ChargeAccount();
        chargeAccount.setPurchase(4000);
        assertEquals(4000, chargeAccount.getPurchase());
    }

    @Test
    public void testTotalAmountOfCreditPaid() {
        ChargeAccount chargeAccount = new ChargeAccount();
        chargeAccount.setCredit(2000);
        assertEquals(2000,chargeAccount.getCredit());
    }
@Test
    public void testAccountCreditLimit(){
        ChargeAccount chargeAccount = new ChargeAccount();
    chargeAccount.getCreditLimit();
        assertEquals(5000, chargeAccount.getCreditLimit());

}
    @Test
    public void testAccountCanCalculateNewBalance(){
        ChargeAccount chargeAccount = new ChargeAccount();
        chargeAccount.getBalance();
        chargeAccount.setPurchase(4000);
        chargeAccount.setCredit(2000);
        chargeAccount.getNewBalance();
        assertEquals(2000, chargeAccount.getNewBalance());


    }
}