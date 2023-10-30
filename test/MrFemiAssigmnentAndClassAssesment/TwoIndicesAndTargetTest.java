package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

public class TwoIndicesAndTargetTest {
    @Test
    public void testTheFunctionReturnWhenAValueAExistBetweenTheGivenIndices(){
        String number = "13579";
        int firstIndex = 0;
        int secondIndex = 1;
        int target = 2;
        boolean answer = TwoIndicesAndTarget.twoIndicesAndTarget(number,firstIndex,secondIndex,target);
        assertTrue(answer);

    }
    @Test
    public void testTheFunctionReturnWhenAValueAExistBetweenTheGivenIndicesTwo(){
        String number = "45689";
        int firstIndex = 2;
        int secondIndex = 3;
        int target = 7;
        boolean answer = TwoIndicesAndTarget.twoIndicesAndTarget(number,firstIndex,secondIndex,target);
        assertTrue(answer);

    }
    @Test
    public void testTheFunctionReturnWhenAValueAExistBetweenTheGivenIndicesThree(){
        String number = "893427";
        int firstIndex = 4;
        int secondIndex = 5;
        int target = 4;
        boolean answer = TwoIndicesAndTarget.twoIndicesAndTarget(number,firstIndex,secondIndex,target);
        assertTrue(answer);

    }
}