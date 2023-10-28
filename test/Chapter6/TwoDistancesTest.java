package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoDistancesTest {
    @Test
    public void testTheDistanceBetweenTwoPoint(){
        double result = TwoDistances.distance(3,2,7,8);
        assertEquals(52,result);
    }
    @Test
    public void testTheDistanceBetweenTwoPointTwo(){
        double result = TwoDistances.distance(14,6,21,11);
        assertEquals(74,result);
    }
    @Test
    public void testTheDistanceBetweenTwoPointThree(){
        double result = TwoDistances.distance(9,5,4,11);
        assertEquals(61,result);
    }

}