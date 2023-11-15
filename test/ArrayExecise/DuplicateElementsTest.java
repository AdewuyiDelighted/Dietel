package ArrayExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateElementsTest {
    @Test
    public void testThatFunctionReturnTheArrayWithOutDuplicate(){
        int [] array = {1,4,5,2,1,4,7,1,7,3,6};
        int [] answer = {1,4,5,2,7,3,6};
        assertArrayEquals(answer,DuplicateElements.checkDuplicateOf(array));
    }
    @Test
    public void testThatFunctionReturnTheArrayWithOutDuplicateEvenIfThereIsZeroInTheArray(){
        int [] array = {56,43,0,34,56,11,56,0,43,11,34,0};
        int [] answer = {56,43,0,34,11};
        assertArrayEquals(answer,DuplicateElements.checkDuplicateOf(array));
    }
    @Test
    public void testThatFunctionRemoveDuplicateEvenIfThereAreNegativeNumbers(){
        int [] array = {-10,-6,-11,-9,-34,-6,-8,-5,-10,-15,-0,-21,-0,-45,-6};
        int [] answer = {-10,-6,-11,-9,-34,-8,-5,-15,-0,-21,-45};
        assertArrayEquals(answer,DuplicateElements.checkDuplicateOf(array));
    }





}