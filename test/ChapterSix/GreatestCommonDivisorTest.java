package ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    @Test
    public void testTheGreatestCommonDivisorOfTwoNumber(){
        int firstNumber = 12;
        int secondNumber = 36;
        int result = GreatestCommonDivisor.findGcd(firstNumber,secondNumber);
        assertEquals(12,result);
    }
    @Test
    public void testTheGreatestCommonDivisorOfTwoNumberTwo(){
        int firstNumber = 78;
        int secondNumber = 95;
        int result = GreatestCommonDivisor.findGcd(firstNumber,secondNumber);
        assertEquals(1,result);
    }
    @Test
    public void testTheGreatestCommonDivisorOfTwoNumberThree(){
        int firstNumber = 145;
        int secondNumber = 780;
        int result = GreatestCommonDivisor.findGcd(firstNumber,secondNumber);
        assertEquals(5,result);
    }



}