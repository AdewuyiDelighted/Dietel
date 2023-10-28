package Chapter4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalesCommissionCalculatorTest {
    private final SalesCommissionCalculator saleCommission = new SalesCommissionCalculator();

    @Test
    public void testThatSalesCommissionCalculatorExist() {
        assertNotNull(saleCommission);
    }

    @Test
    public void testThatSalesPeopleWageExist() {
        saleCommission.getWages();
        assertEquals(200, saleCommission.getWages());
    }

    @Test
    public void testTheTotalSaleOfSalePerson() {
        saleCommission.setSales(900);
        assertEquals(900,saleCommission.getSales());
    }
@Test
    public void testThatTotalCommissionOfSalesPerson() {
        saleCommission.setSales(900);
        saleCommission.getTotalCommission();
        assertEquals(281,saleCommission.getTotalCommission());

}
}
