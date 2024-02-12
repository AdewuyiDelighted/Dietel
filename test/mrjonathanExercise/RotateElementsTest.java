package mrjonathanExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateElementsTest {
    @Test
    public void testThatFunctionReturnsTheRotateElementOfAGivenArray(){
        int [][] array = {{5,9,1},{3,8,2},{1,2,3}};
        int [][] expected = {{5,3,1},{9,8,2},{1,2,3}};
        assertArrayEquals(expected,RotateElements.rotateElement(array));

    }
    @Test
    public void testThatFunctionReturnsTheRotateElementOfAGivenArrayWhenThereAreTwoElementInTheArray(){
        int [][] array = {{2,3},{4,5}};
        int [][] expected = {{2,4},{3,5}};
        assertArrayEquals(expected,RotateElements.rotateElement(array));

    }
    @Test
    public void testThatFunctionReturnsTheRotateElementOfAGivenArrayWhenThereAreAnotherTwoElementInTheArray(){
        int [][] array = {{5,3},{9,8}};
        int [][] expected = {{5,9},{3,8}};
        assertArrayEquals(expected,RotateElements.rotateElement(array));

    }


}