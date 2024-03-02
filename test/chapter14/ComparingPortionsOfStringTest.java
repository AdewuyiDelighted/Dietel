package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparingPortionsOfStringTest {

    @Test  public void testThatFunctionReturnTrueOrFalseWhenUseEnterTwoString(){
        String wordOne = "Semicolon";
        String wordTwo = "colon";
        assertTrue(ComparingPortionsOfString.portionOfString(wordOne,wordTwo,4,0,4));
    }
    @Test  public void testThatFunctionReturnTrueOrFalseWhenUseEnterTwoStringWhenTheLengthIsLonger(){
        String wordOne = "association";
        String wordTwo = "occasion";
        assertFalse(ComparingPortionsOfString.portionOfString(wordOne,wordTwo,8,5,12));
    }
    @Test  public void testThatFunctionReturnTrueOrFalseWhenUseEnterTwoStringWhenTheLengthIsOneIndexIsntThere(){
        String wordOne = "request";
        String wordTwo = "quest";
        assertFalse(ComparingPortionsOfString.portionOfString(wordOne,wordTwo,0,7,12));
    }


}