package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HightestAndLowestInStringTest {
    @Test
    public void testThatFunctionTakeInputOfStringNumberAndReturnsTheHighestAndLowest(){
        String input = "1 2 3 4 5";
        int [] hightestAndLowest = {5,1};
        assertArrayEquals(hightestAndLowest, HighestAndLowestInString.findHighestAndLowest(input));
    }
    @Test
    public void testThatFunctionTakeInputOfStringNumberAndReturnsTheHighestAndLowestUnorderNumber(){
        String input = "6 -5 3 7 9";
        int [] hightestAndLowest = {9,-5};
        assertArrayEquals(hightestAndLowest, HighestAndLowestInString.findHighestAndLowest(input));
    }
    @Test
    public void testThatFunctionTakeInputOfStringNumberAndReturnsTheTHighestAndLowest(){
        String input = "1 2 3 4 -5";
        int [] hightestAndLowest = {4,-5};
        assertArrayEquals(hightestAndLowest, HighestAndLowestInString.findHighestAndLowest(input));
    }



}