package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintingDatesTest {
    @Test public void testThatFunctionReturnTheFormattedFormatOfGivenDate(){
        String date = "04/25/1995";
        String expected = "APRIL 25, 1995";
        assertEquals(expected,PrintingDates.formatDate(date));
    }
    @Test public void testWhenInvalidInputIsGiven(){
        String date = "04/25/1995/3";
        assertThrows(InvalidDateException.class,()->PrintingDates.formatDate(date));
    }
    @Test public void testWhenInvalidMonthIsEnter(){
        String date = "13/25/1995";
        assertThrows(InvalidDateException.class,()->PrintingDates.formatDate(date));
    }
    @Test public void testWhenInvalidYearIsEnter(){
        String date = "13/25/20";
        assertThrows(InvalidDateException.class,()->PrintingDates.formatDate(date));
    }
    @Test public void testWhenInvalidDateIsEnter(){
        String date = "50/25/20";
        assertThrows(InvalidDateException.class,()->PrintingDates.formatDate(date));
    }




}