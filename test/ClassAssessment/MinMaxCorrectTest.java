package ClassAssessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinMaxCorrectTest{

    @Test
    public void testTheSumOfAllElements() {
        int[] array = {5, 3, 4, 1, 2};
        int result = 15;
        int answer = MinMaxCorrect.sum(array);
        assertEquals(result, answer);
    }

    @Test
    public void testTheMaxOfAllElements() {
        int[] array = {5, 3, 4, 1, 2};
        int result = 5;
        int answer = MinMaxCorrect.max(array);
        assertEquals(result, answer);
    }

    @Test
    public void testTheMinOfAllElements() {
        int[] array = {5, 3, 4, 1, 2};
        int result = 1;
        int answer = MinMaxCorrect.min(array);
        assertEquals(result, answer);

    }
    @Test
    public void testTheMaxMinOfAllElements() {
        int[] array = {5, 3, 4, 1, 2};
        int [] result = {14,10};
        int [] answer = MinMaxCorrect.maxMin(array);
        assertArrayEquals(result, answer);

    }


}