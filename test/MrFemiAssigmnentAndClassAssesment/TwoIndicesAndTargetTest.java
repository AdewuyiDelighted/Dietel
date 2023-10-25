package MrFemiAssigmnentAndClassAssesment;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

public class TwoIndicesAndTargetTest {
    @Test
    public void testTheFunctionReturnWhenAValueAExistBetweenTheGivenIndices(){
        String number = "135-7-9";
        int firstIndex = 3;
        int secondIndex = 4;
        int target = -8;
        boolean answer = TwoIndicesAndTarget.twoIndicesAndTarget(number,firstIndex,secondIndex,target);
        assertTrue(answer);

    }

}