package MrChibuzorAssignment;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtmeTest {
    @Test
    public void testPriceCopiesWhenCopiesLessThan5() {
        int total = Utme.priceOfCopies(4);
        assertEquals(8000, total);
    }

    @Test
    public void testPriceCopiesWhenCopiesLessThan9() {
        int total = Utme.priceOfCopies(7);
        assertEquals(12600, total);
    }

    @Test
    public void testPriceOfCopiesWhenCopiesLessThan30() {
        int total = Utme.priceOfCopies(18);
        assertEquals(28800, total);
    }

    @Test
    public void testPriceOfCopiesWhenCopiesLessThan49() {
        int total = Utme.priceOfCopies(45);
        assertEquals(67500, total);
    }

    @Test
    public void testPriceOfCopiesWhenCopiesLessThan100() {
        int total = Utme.priceOfCopies(50);
        assertEquals(65000, total);
    }

    @Test
    public void testPriceOfCopiesWhenCopiesLessThan500() {
        int total = Utme.priceOfCopies(345);
        assertEquals(379500, total);
    }

    @Test
    public void testPriceOfCopiesWhenCopiesGreaterThan500() {
        int total = Utme.priceOfCopies(1150);
        assertEquals(1150000, total);
    }
}