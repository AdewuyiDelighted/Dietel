package MrChibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenToZeroOddToOneTest {
    @Test public void testThatAnArrayIsConvertedToOneAndTwo(){
        int [] input = {4,5,8,8,8,2,9};
        int [] output = {0,1,0,0,0,0,1};
        assertArrayEquals(output,EvenToZeroOddToOne.evenToZeroOddToOne(input));
    }

}