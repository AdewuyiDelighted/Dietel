package mrjonathanExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostAppearedElementTest {
    @Test
    public void testThatFunctionReturnsTheMostAppearedNumber(){
        int []  input = {2,1,1,2,2};
        int output = 2;
        assertEquals(output,MostAppearedElement.mostAppearedElement(input));

    }
    @Test
    public void testThatFunctionReturnsTheMostAppearedNumberAnother(){
        int []  input = {3,4,5,5,4,4};
        int output = 4;
        assertEquals(output,MostAppearedElement.mostAppearedElement(input));

    }

}