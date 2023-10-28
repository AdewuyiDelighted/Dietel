package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    @Test
    public void testTheANumberIsAMultipleOfTheSecondNumber(){
        int firstNumber = 4;
        int secondNumber = 16;
        boolean answer = Multiples.checkMultiples(firstNumber,secondNumber);
        assertTrue(answer);
    }
    @Test
    public void testTheANumberIsAMultipleOfTheSecondNumberTwo(){
        int firstNumber = 5;
        int secondNumber = 48;
        boolean answer = Multiples.checkMultiples(firstNumber,secondNumber);
        assertFalse(answer);
    }
    @Test
    public void testTheANumberIsAMultipleOfTheSecondNumberThree(){
        int firstNumber = 15;
        int secondNumber = 255;
        boolean answer = Multiples.checkMultiples(firstNumber,secondNumber);
        assertTrue(answer);

    }




}