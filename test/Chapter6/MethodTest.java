package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodTest {
    @Test
    public void testTheFunctionOfOfFloor(){
        double input = 9.3;
        double result = 9.0;
        double answer = Method.floor(input);
        assertEquals(result,answer);
    }
    @Test
    public void testTheFunctionOfOfFloorTwo(){
        double input = 15.9;
        double result = 15.0;
        double answer = Method.floor(input);
        assertEquals(result,answer);
    }
    @Test
    public void testTheFunctionOfOfFloorThree(){
        double input = 123.7;
        double result = 123;
        double answer = Method.floor(input);
        assertEquals(result,answer);
    }
    @Test
    public void testTheFunctionOfOfCeil(){
        double input = 9.3;
        double result = 10.0;
        double answer = Method.ceil(input);
        assertEquals(result,answer);
    }
    @Test
    public void testTheFunctionOfOfCeilTwo(){
        double input = 15.9;
        double result = 16.0;
        double answer = Method.ceil(input);
        assertEquals(result,answer);
    }
    @Test
    public void testTheFunctionOfOfCeilThree(){
        double input = 123.7;
        double result = 124;
        double answer = Method.ceil(input);
        assertEquals(result,answer);
    }
    }


