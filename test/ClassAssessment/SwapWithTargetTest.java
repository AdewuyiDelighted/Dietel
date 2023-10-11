package ClassAssessment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SwapWithTargetTest{
    @Test
    public void testThatFunctionCanSwapNumberWithTarget(){
        int [] number = {10,20,30,40,50};
        int firstNumber = 1;
        int secondNumber = 3;
        int [] answer = {10,40,30,20,50};
        int [] result = SwapWithTarget.swap(number,firstNumber ,secondNumber );
        System.out.println(Arrays.toString(result));
        assertArrayEquals(answer,result);
    }

}