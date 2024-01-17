package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberLowerThanElementTest {
    @Test
    public void  testThatFunctionReturnsTheLowestNumberIn(){
        int [] input = {1,3,2,7};
        int [] expected = {0,2,1,3};
        assertArrayEquals(expected,NumberLowerThanElement.checkLowerNumber(input));
    }

}