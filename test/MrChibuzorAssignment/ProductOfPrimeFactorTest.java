package MrChibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfPrimeFactorTest {
    @Test
    public void testTheProductOfPrimeNumber(){
        int input = 24;
        int [] array = {2,2,2,3};
        int [] result = ProductOfPrimeFactor.primeFactors(input);
        assertArrayEquals(array,result);

    }
    @Test
    public void testTheProductOfPrimNumber(){
        int input = 84;
        int [] array = {2,2,3,7};
        int [] result = ProductOfPrimeFactor.primeFactors(input);
        assertArrayEquals(array,result);


    }

}