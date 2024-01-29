package mrjonathanExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    @Test
    public void testThatOneCanBeAddedToTheEndOfAnArray(){
        int [] input = {1,2,3};
        int [] answer = {1,2,4};
        assertArrayEquals(answer,PlusOne.plusOne(input));
    }
    @Test
    public void testThatOneCanBeAddedToTheEndOfAnArrayWithOnNumber(){
        int [] input = {9};
        int [] answer = {1,0};
        assertArrayEquals(answer,PlusOne.plusOne(input));
    }
    @Test
    public void testThatOneCanBeAddedToTheEndOfAnArrayFourNumbers(){
        int [] input = {4,3,2,1};
        int [] answer = {4,3,2,2};
        assertArrayEquals(answer,PlusOne.plusOne(input));
    }
    @Test
    public void testThatOneCanBeAddedToTheEndOfAnArrayWithThreeNumbers(){
        int [] input = {1,2,9};
        int [] answer = {1,3,0};
        assertArrayEquals(answer,PlusOne.plusOne(input));
    }
}