package MrChibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {
    @Test
    public void testThatFunctionWouldReturnTheDecimalOfBinaryNumberWithMultipleZeros(){
        int number = 10000;
        int answer = BinaryToDecimal.convertToDecimal(String.valueOf(number));
        assertEquals(16,answer);
    }
    @Test
    public void testThatFunctionWouldReturnTheDecimalOfBinaryNumber(){
        int number = 11011;
        int answer = BinaryToDecimal.convertToDecimal(String.valueOf(number));
        assertEquals(27,answer);
    }
    @Test
    public void testThatFunctionWouldReturnTheDecimalOfBinaryNumberWhenBinaryNumberIsThreeDigits(){
        int number = 101;
        int answer = BinaryToDecimal.convertToDecimal(String.valueOf(number));
        assertEquals(5,answer);
    }
    @Test
    public void testThatFunctionReturnTheDecimalOfBinaryWhenNumberHasMultiple1(){
        int number = 11111;
        int answer = BinaryToDecimal.convertToDecimal(String.valueOf(number));
        assertEquals(31,answer);

    }



}