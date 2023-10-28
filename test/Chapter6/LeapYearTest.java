package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    @Test
    public  void testThatYearIsALeapYear(){
        boolean result = LeapYear.isLeapYear(2004);
        assertTrue(result);

    }
    @Test
    public  void testThatYearIsALeapYearTwo(){
        boolean result = LeapYear.isLeapYear(2023);
        assertFalse(result);

    }
    @Test
    public  void testThatYearIsALeapYearThree(){
        boolean result = LeapYear.isLeapYear(2020);
        assertTrue(result);

    }

}