package MrChibuzorAssignment;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonFactorTest {
    @Test public void testTheLowestCommonFactorInList(){
        assertEquals(48,LowestCommonFactor.findLowestCommonFactor(8,16,12));
    }
    @Test public void testTheLowestCommonFactorInList2(){
        assertEquals(144,LowestCommonFactor.findLowestCommonFactor(12,36,48));
    }

}