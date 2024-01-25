package ArrayExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonDuplicateNumberTest {
    @Test
    public void testThatFunctionReturnsNumberThatIsNotDuplicated(){
        int [] array = {2,2,1,3,3};
        int number = 1;
        assertEquals(number,NonDuplicateNumber.nonDuplicateNumber(array));
    }
    @Test
    public void testThatFunctionReturnsNumberThatIsNotDuplicatedWhenThereAreMoreNumbers(){
        int [] array = {4,3,2,1,1,2,2,3};
        int number = 4;
        assertEquals(number,NonDuplicateNumber.nonDuplicateNumber(array));
    }
    @Test
    public void testThatFunctionReturnsNumberThatIsNotDuplicatedWhenItIsOneNumber(){
        int [] array = {1};
        int number = 1;
        assertEquals(number,NonDuplicateNumber.nonDuplicateNumber(array));
    }

}