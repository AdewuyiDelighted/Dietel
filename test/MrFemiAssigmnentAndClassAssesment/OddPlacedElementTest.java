package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddPlacedElementTest {
    @Test
    public void testThatFunctionReturnEvenPlacedInput(){
        int [] input = {1,2,3,4,5,6,7};
        int [] expected = {4,6};
        assertArrayEquals(expected,OddPlacedElement.findOddlyPlacedInput(input));
    }

}