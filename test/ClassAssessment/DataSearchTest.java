package ClassAssessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataSearchTest {
    @Test
    public void testTheFuntionOfDataColum(){
        DataSearch dataSearch = new DataSearch();
        int[][] data = {
                {40,23,85,62},
                {24,60,99,37},
                {44,20,12,45},
                {14,64,35,90}
        };
        int row = 1;
        int start = 1;
        int end = 5;
        int [] answer = dataSearch.extract(data,row,start,end);
        assertEquals(40,answer[0]);
        assertEquals(23,answer[1]);
        assertEquals(85,answer[2]);


    }

}