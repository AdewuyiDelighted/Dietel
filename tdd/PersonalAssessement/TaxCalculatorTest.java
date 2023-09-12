package PersonalAssessement;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTest {

   @Test
    public void testThatCalculatorExist(){
       TaxCalculator taxCalculator = new TaxCalculator();
       assertNotNull(taxCalculator);
   }
   @Test
   public void testThatCalculatorHasName(){
       TaxCalculator taxCalculator = new TaxCalculator();
  taxCalculator.citizenName("Mine");
  assertTrue(true,taxCalculator.citizenNameN());

   }
@Test
   public void testThatTaxCalculatorCanCalculateBelow30(){
       TaxCalculator taxCalculator = new TaxCalculator();
       taxCalculator.citizenEarning(30000);
       assertEquals(25500,taxCalculator.totalTax());
}
@Test
    public void testThatTaxCalculatorCanCalculatorAbove30(){
       TaxCalculator taxCalculator = new TaxCalculator();
       taxCalculator.citizenEarning(40000);
       assertEquals(32000,taxCalculator.totalTax());
}

}