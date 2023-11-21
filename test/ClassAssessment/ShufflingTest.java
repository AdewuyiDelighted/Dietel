package ClassAssessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShufflingTest {
    @Test
    public void testThatFunctionShuffleElementInIt(){
        int [] array = {42,18,41,22,15,12};
        int [] answer ={18,42,22,41,12,15};
        int [] checkAnswer = Shuffling.shuffle(array);
        assertArrayEquals(answer,checkAnswer);
    }
    @Test
    public void testThatFunctionShuffleElementInItWhenLengthIdOdd(){
        int [] array = {42,18,41,22,15,};
        int [] answer ={18,42,22,41,15};
        int [] checkAnswer = Shuffling.shuffle(array);
        assertArrayEquals(answer,checkAnswer);
    }
    @Test
    public void testThatFunctionShuffleTheElementInItDontShuffleTheLastTwoElementWhenLengthIsEven(){
        int [] array = {42,15,18,12,13,3};
        int [] answer = {42,15,12,18,13,3};
//        int[] checkAnswer = Shuffling.unShuffleLastTwo(array);
    }


}