package ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitTest {
    @Test
    public void testThatFunctionCanSumUpAllTheElementInANumber(){
        int input = 1245;
        int result = 12;
        int answer = SumOfDigit.sumOfDigit(input);
        assertEquals(result,answer);
    }
    @Test
    public void testThatFunctionCanSumUpAllTheElementInANumberTwo(){
        int input = 7036;
        int result = 16;
        int answer = SumOfDigit.sumOfDigit(input);
        assertEquals(result,answer);
    }
    @Test
    public void testThatFunctionCanSumUpAllTheElementInANumberThree(){
        int input = 4444;
        int result = 16;
        int answer = SumOfDigit.sumOfDigit(input);
        assertEquals(result,answer);
    }

}