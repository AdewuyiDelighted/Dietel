package MyAssessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareRootTwoTest {
    @Test
    public void testThatFunctionIsForSquareRoot(){
     double result =   SquareRootTwo.squareRoot(25);
        assertEquals(5.0,result);
    }

}