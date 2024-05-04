package MrChibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillArrayWithDoubleElementTest {
    @Test public void testThatArrayReturnDoubleLength(){
        int [] input = {4,5,8};
        int [] output = {4,5,8,8,10,16};
        assertArrayEquals(output,FillArrayWithDoubleElement.fillArrayWithDoubleElement(input));
    }

}