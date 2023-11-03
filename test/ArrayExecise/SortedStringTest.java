package ArrayExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedStringTest {
    @Test
    public void testThatFunctionCanSortUnSortedString(){
        String letters = "acb";
        String result = SortedString.sortStrings(letters);
        assertEquals("abc",result);
    }

}