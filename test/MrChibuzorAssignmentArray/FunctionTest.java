package MrChibuzorAssignmentArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {
    @Test
    public void testTheHighestElementInFunction(){
        int result = Function.highestElement(new int[]{1,2,3,4,5,6,7});
        assertEquals(7,result);
    }

}