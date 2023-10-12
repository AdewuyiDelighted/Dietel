package ClassAssessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {
    @Test
    public void testTheSumOfElementWithoutLatIndex() {
        int[] array = {5, 3, 4, 1, 2};
        int result = 13;
        int answer = MinMax.addWithOutLastIndex(array);
        assertEquals(result, answer);
    }

    @Test
    public void testTheSumOfElementWithoutTheFirstElement() {
        int[] array = {5, 3, 4, 1, 2};
        int result = 10;
        int answer = MinMax.addWithOutfirstIndex(array);
        assertEquals(result, answer);
    }

    @Test
    public void testTheSumOfElementWithoutTheSecondElement() {
        int[] array = {5, 3, 4, 1, 2};
        int result = 12;
        int  answer = MinMax.addWithOutSecondIndex(array);
        assertEquals(result, answer);
    }

    @Test
    public void testTheSumOfElementWithoutThirdTheElement() {
        int[] array = {5, 3, 4, 1, 2};
        int  result = 11;
        int  answer = MinMax.addWithOutThirdIndex(array);
        assertEquals(result, answer);

    }

    @Test
    public void testTheSumOfElementWithoutFourthTheElement() {
        int[] array = {5, 3, 4, 1, 2};
        int  result = 14;
        int  answer = MinMax.addWithOutFourthIndex(array);
        assertEquals(result, answer);

    }
    @Test
    public void testTheLargestOfElement(){
        int[] array = {5, 3, 4, 1, 2};
        int  result = 14;
        int answer = MinMax.largestSum(array);
        assertEquals(result, answer);

    }
    @Test
    public void testTheSmallestOfElement(){
        int[] array = {5, 3, 4, 1, 2};
        int result = 10;
        int answer = MinMax.smallestSum(array);
        assertEquals(result, answer);

    }
    @Test
    public void testTheMaxMin() {
        int[] array = {5, 3, 4, 1, 2};
        int[] result = {14, 10};
        int[] answer = MinMax.maxMin(array);
        assertArrayEquals(result, answer);


    }
    }





