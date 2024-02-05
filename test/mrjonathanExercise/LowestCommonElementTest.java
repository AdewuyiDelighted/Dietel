package mrjonathanExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonElementTest {
    @Test public void testThatFunctionCanReturnTheLowestValueCommonInTwoArray(){
        int [] firstArray = {2,3,5,6,7,8,};
        int [] secondArray = {1,3,7,10,11,8};
        int  expected = 3;
        assertEquals(expected,LowestCommonElement.findTheLowestElement(firstArray,secondArray));
    }
    @Test public void testThatFunctionCanReturnTheLowestValueCommonFiveElements(){
        int [] firstArray = {5,4,11,13,9};
        int [] secondArray = {9,11,15,1,14};
        int  expected = 9;
        assertEquals(expected,LowestCommonElement.findTheLowestElement(firstArray,secondArray));
    }
    @Test public void testThatFunctionCanReturnTheLowesWhenThereMoreLargerValues(){
        int [] firstArray = {103,-56,113,156,234};
        int [] secondArray = {113,136,-56,120};
        int  expected = -56;
        assertEquals(expected,LowestCommonElement.findTheLowestElement(firstArray,secondArray));
    }


}