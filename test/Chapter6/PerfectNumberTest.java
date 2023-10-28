package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {
    @Test
    public void testThatNumberIsNotAPerfectNumber(){
        boolean result = PerfectNumber.isPerfect(6);
        assertTrue(result);
    }
    @Test
    public void testThatNumberIsNotAPerfectNumberTwo(){
        boolean result = PerfectNumber.isPerfect(17);
        assertFalse(result);
    }
    @Test
    public void testThatNumberIsNotAPerfectNumberThree(){
        boolean result = PerfectNumber.isPerfect(28);
        assertTrue(result);
    }

}