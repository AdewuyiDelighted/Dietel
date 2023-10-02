package MrChibuzorAssignment;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogisticsTest {
    @Test
    public  void testDispatchRiderWagesWhenGreaterOrEqualTo70(){
       int amount = Logistics.wages(80);
        assertEquals(45000,amount);
       int total = Logistics.wages(70);
       assertEquals(40000,total);
    }
@Test
    public void testDispatchRiderWagesWhenGreaterThan60AndLesserThan69(){
        int amount = Logistics.wages(61);
        assertEquals(20250,amount);
    }
@Test
    public void testDispatchRiderWagesWhenGreaterThan50AndLesserThan59(){
        int amount = Logistics.wages(55);
        assertEquals(16000,amount);
}

@Test
    public void testDispatchRiderWagesWhenLess50(){
        int amount = Logistics.wages(45);
        assertEquals(12200,amount);
    }
}