package MrChibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfPrimeFactorTest {

    @Test
    public void testIfInputIsAPrimeNumber(){
        int input = 24;
        int[] result = ProductOfPrimeFactor.product(input);
        int [] answer = {12,2};
        assertArrayEquals(answer,result);
    }
    @Test
    public void testTheProductOfPrimeNumber(){
        int input = 30;
        String result = ProductOfPrimeFactor.primeFactors(input);
        String answer ="235";
        assertEquals(answer,result);

    }

}