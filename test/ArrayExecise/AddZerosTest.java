package ArrayExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddZerosTest {
    @Test
    public void testThatFunctionCanAddZeroToIfThereIsZeroInTheInnerArray(){
        int [][] array = {{0,5},{2,3}};
        int [][] expected = {{0,0},{2,3}};
        assertArrayEquals(expected,AddZeros.addZero(array));


    }

}