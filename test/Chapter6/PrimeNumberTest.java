package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test
    public void testIfInputIsAPrimeNumberOne(){
        int input = 5;
        boolean result = PrimeNumber.primeNumber(input);
        assertTrue(result);
    }
    @Test
    public void testIfInputIsAPrimeNumberTwo(){
        int input = 962;
        boolean result = PrimeNumber.primeNumber(input);
        assertFalse(result);
    }
    @Test
    public void testIfInputIsAPrimeNumber(){
        int input = 811;
        boolean result = PrimeNumber.primeNumber(input);
        assertTrue(result);
    }


}