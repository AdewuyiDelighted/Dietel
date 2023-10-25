package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DominantNumberTest {

    @Test
    public void testTheDominantOfArray(){
        int [] array = {400,200,0,10,900};
        int [] answer = DominantNumber.dominant(array);
        int [] result = {900};
        assertArrayEquals(result,answer);
    }
    @Test
    public void testTheDominantOfArrayOne(){
        int [] array = {9,3,10,7,4};
        int [] answer = DominantNumber.dominant(array);
        int [] result = {10,7,4};
        assertArrayEquals(result,answer);

    }

}