package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayByFiveTest {
    @Test
    public void testThatFunctionReturnTrueWhenAllElementInTheArrayCanBeDividedByFive(){
        boolean answer = DisplayByFive.divisibleByFive(5,10,15,20,25,30,35,40,45,50);
        assertTrue(answer);
    }
    @Test
    public void testThatFunctionReturnTrueWhenAllElementInTheArrayCanBeDividedByFiveTwo(){
        boolean answer = DisplayByFive.divisibleByFive(5,10,15,20,25,32,35,40,45,50);
        assertFalse(answer);
    }
    @Test
    public void testThatFunctionReturnTrueWhenAllElementInTheArrayCanBeDividedByFiveThree(){
        boolean answer = DisplayByFive.divisibleByFive(5,50,355,125,500,10,305,435,85,15);
        assertTrue(answer);
    }
    @Test
    public void testThatFunctionReturnTrueWhenAllElementInTheArrayCanBeDividedByFour(){
        boolean answer = DisplayByFive.divisibleByFive(5,12,15,20,23,30,19,40,45,266);
        assertFalse(answer);
    }

}