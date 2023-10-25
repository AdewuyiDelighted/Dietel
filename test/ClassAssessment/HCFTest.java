package ClassAssessment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

public class HCFTest {
    @Test
    public void testTheHighestCommonFactorsOfMultipleNumbers() {
        int[] result = {2, 2, 3};
        int[] answer = HCF.highestCommonFactor(12, 12, 36);
        assertArrayEquals(result, answer);

    }
    @Test
    public void testTheHighestCommonFactorsOfMultipleNumbersTwo() {
        int[] result = {5};
        int[] answer = HCF.highestCommonFactor(10,25,50);
        assertArrayEquals(result, answer);

    }


}