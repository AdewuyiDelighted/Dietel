package mrjonathanExercise;

import mrjonathanExercise.AdditionOfTwoElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionOfTwoElementTest {

    @Test
    public void testThatFunctionCanBeAddedTwoElements(){
        int [] arr = {2,3,5,6,7,2,1};
        int [] ans = {5,11,9,1};
        assertArrayEquals(ans, AdditionOfTwoElement.addTwoElements(arr));
    }
    @Test
    public void testThatFunctionCanBeAddedTwoElementsWithOddLength(){
        int [] arr = {3,4,5,1,5};
        int [] ans = {7,6,5};
        assertArrayEquals(ans, AdditionOfTwoElement.addTwoElements(arr));
    }
    @Test
    public void testThatFunctionCanBeAddedTwoElementsWithLongerLength(){
        int [] arr = {8,2,1,4,6,4,1};
        int [] ans = {10,5,10,1};
        assertArrayEquals(ans, AdditionOfTwoElement.addTwoElements(arr));
    }
}