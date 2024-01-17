package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelStringTest {
    @Test
    public void testThatFunctionReturnBackStringWithoutItsVowels(){
        String input = "squar_e";
        String expected = "sqr";
        assertEquals(expected,VowelString.withOutVowelLetters(input));
    }
    @Test
    public void testThatFunctionReturnBackStringWithoutItsVowelsUppercase(){
        String input = "SQUARE";
        String expected = "SQR";
        assertEquals(expected,VowelString.withOutVowelLetters(input));
    }



}