package ArrayExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
    @Test
    public void testThatFunctionCalculateTheAverageOfIntInput(){
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int  result = 5;
        int answer = Average.average(numbers);
        assertEquals(result ,answer);
    }
    @Test
    public void testThatFunctionCalculateTheAverageOfDoubleInput(){
        double[] numbers = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        double  result = 5.5;
        double answer = Average.average(numbers);
        assertEquals(result ,answer);
    }
    @Test
    public void testThatFunctionCanCalculateAverageOfIntInputWithNegativeNumbers(){
        int [] number = {12,-15,9,-2,8,9};
        int result = 3;
        int answer = Average.average(number);
        assertEquals(result,answer);
    }
    @Test
    public void testThatFunctionCanCalculateAverageOfDoubleInputWithNegativeNumber(){
        double [] numbers = {12.0,-15.0,9.0,-2.0,8.0,9.0};
        double result = 3.5;
        double answer = Average.average(numbers);
        assertEquals(result,answer);
    }


}