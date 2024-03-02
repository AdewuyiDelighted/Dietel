package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexOfAndLasIndexOfTest {
    @Test public void testThatFunctionCanReturnTheIndexOfGivenChar(){
        String word = "Home";
        char target = 'm';
        int answer = 2;
        assertEquals(answer,IndexOfAndLasIndexOf.indexOf(word,target));
    }
    @Test public void testWhenTheInputDoesNotContainTarget(){
        String word = "rice";
        char target = 's';
        assertThrows(InvalidTargetException.class,()->IndexOfAndLasIndexOf.indexOf(word,target));
    }
    @Test public void testTheFunctionThatReturnsIndexOfLastElement(){
        String word = "Family";
        int answer = 5;
        assertEquals(answer,IndexOfAndLasIndexOf.lastIndexOf(word));

    }





}