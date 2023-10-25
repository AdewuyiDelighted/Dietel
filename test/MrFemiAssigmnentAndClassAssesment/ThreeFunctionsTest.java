package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeFunctionsTest {
    @Test
    public void testTheReverseFunctionsForString(){
        String input ="We outside";
        String result = "etr";
        String answer = ThreeFunctions.spaceIndexs(input);
        assertEquals(result,answer);
    }

}