package ArrayExecise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static ArrayExecise.NineHeadsAndTails.countCoin;
import static ArrayExecise.NineHeadsAndTails.flipCoin;
import static org.junit.jupiter.api.Assertions.*;

class NineHeadsAndTailsTest {
    @Test
    public void testThatCoinFlipHeadAndTail(){
        for(int index = 0;index < 5;index++) {
            int answer = flipCoin();
            boolean isHeadOrTail = answer >= 0 && answer <= 1;
            assertTrue(isHeadOrTail);
        }
    }
    @Test public void testThatThatTotalOfCoinFlipIsNine(){
        int result = countCoin;
        assertEquals(9, result);

    }


}