package ClassAssessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumDigitTest {
    @Test
    public void testTheFunctionOfSumOfDigit(){
      int result = SumDigit.sumDigit(123);
      assertEquals(6,result);
    }
    @Test
    public void testTheFunctionOfSumOfDigitWhenInputIsNegative(){
        int result = SumDigit.sumDigit(-123);
        assertEquals(4,result);
    }
}