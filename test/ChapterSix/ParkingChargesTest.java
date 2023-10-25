package ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingChargesTest {
    @Test
    public void testTheChargesOfCustomerWhenHoursIsThreeHours() {
        int hours = 3;
        double result = 2.00;
        double answer = ParkingCharges.calculateCharges(hours);
        assertEquals(result, answer);
    }

    @Test
    public void testTheChargesOfCustomerWhenHoursIsGreaterThanThreeHours() {
        int hours = 5;
        double result = 3.00;
        double answer = ParkingCharges.calculateCharges(hours);
        assertEquals(result, answer);
    }

    @Test
    public void testTheChargesOfCustomerWhenHoursIsTwentyFourHours() {
        int hours = 24;
        double result = 10.00;
        double answer = ParkingCharges.calculateCharges(hours);
        assertEquals(result, answer);
    }
}