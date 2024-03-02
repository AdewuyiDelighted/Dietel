package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestWordInSentenceTest {
    @Test public void testThatFunctionReturnsTheLongestWordInAGivenSentence(){
        String sentence = "What is your names";
        String answer = "names";
        assertEquals(answer,LongestWordInSentence.longestWord(sentence));
    }
    @Test public void testThatFunctionReturnsTheLongestWordInAGivenSentenceWhenThereAreWordWithSameLength(){
        String sentence = "I know Jesus loves us ";
        String answer = "Jesus";
        assertEquals(answer,LongestWordInSentence.longestWord(sentence));
    }
    @Test public void testThatFunctionReturnsTheLongestWordInAGivenSentenceWhenNumberAreAdded(){
        String sentence = "my  account number is 1234567890";
        String answer = "1234567890";
        assertEquals(answer,LongestWordInSentence.longestWord(sentence));
    }

}