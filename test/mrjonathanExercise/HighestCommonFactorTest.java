package mrjonathanExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestCommonFactorTest {
    @Test
    public void testThatFunctionCanFindTheHighestCommonFactorOfTheElementInTheArray(){
        int [] input = {8,4,12};
        int [] expected = {2,2};
        assertArrayEquals(expected,HighestCommonFactor.highestCommonFactor(input));
    }
    @Test
    public void testThatFunctionCanFindTheHighestCommonFactorOfTheElementInTheArrayWithThreeFactor(){
        int [] input = {18,9,9};
        int [] expected = {3,3};
        assertArrayEquals(expected,HighestCommonFactor.highestCommonFactor(input));
    }
    @Test
    public void testThatFunctionCanFindTheHighestCommonFactorOfTheElementInTheArrayWithThreeFactorJustOneFactor(){
        int [] input = {6,3,9};
        int [] expected = {3};
        assertArrayEquals(expected,HighestCommonFactor.highestCommonFactor(input));
    }

}