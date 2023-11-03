package ClassAssessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HCFTest {
    @Test
    public void testThatFunctionCanTestThreeDigits() {
        int[] numbers = {12, 6, 36};
        int[] result = {2, 3};
        int[] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(result, answer);
    }

    @Test
    public void testThatFunctionCanTestForNumberInHundreds() {
    int [] numbers = {456,242,784};
    int [] result = {2};
    int [] answer = HCF.highestCommonFactor(numbers);
    assertArrayEquals(result,answer);
    }
    @Test
    public void testThatFunctionCanComputeIfFactorsAreMoreThanTwo(){

    }
}
