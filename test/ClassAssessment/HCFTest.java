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
    @Test
    public void testTheHighestCommonFactorsOfMultipleNumbersThree() {
        int[] result = {13};
        int[] answer = HCF.highestCommonFactor(182, 247);
        assertArrayEquals(result, answer);


    }
    @Test
    public void testTheHighestCommonFactorOfMultipleNumberFour(){
        int[] result = {2,3};
        int[] answer = HCF.highestCommonFactor(72,102,174);
        assertArrayEquals(result, answer);
    }
    @Test
    public void testTheHighestCommonFactorOfMultipleNumberFive(){
        int[] result = {2,2,3};
        int[] answer = HCF.highestCommonFactor(36,24,48,12);
        assertArrayEquals(result, answer);
    }
    @Test
    public void testTheHighestCommonFactorOfMultipleNumberSix(){
        int[] result = {2,3,3,5};
        int[] answer = HCF.highestCommonFactor(900,270);
        assertArrayEquals(result, answer);
    }



    }