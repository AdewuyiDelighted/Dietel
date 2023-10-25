package ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseTest {
    @Test
    public void testTheHypotenuseOfTwoSides(){
        double sideOne = 3;
        double sideTwo = 4;
        double result = 5;
        double answer = Hypotenuse.hypotenuse(sideOne,sideTwo);
        assertEquals(result,answer);
    }
    @Test
    public void testTheHypotenuseOfTwoSidesTwo(){
        double sideOne = 10;
        double sideTwo = 14;
        double result =17.2 ;
        double answer = Hypotenuse.hypotenuse(sideOne,sideTwo);
        assertEquals(result,answer);
    }
    @Test
    public void testTheHypotenuseOfTwoSidesThree(){
        double sideOne = 20;
        double sideTwo = 5;
        double result = 20.6;
        double answer = Hypotenuse.hypotenuse(sideOne,sideTwo);
        assertEquals(result,answer);
    }




}