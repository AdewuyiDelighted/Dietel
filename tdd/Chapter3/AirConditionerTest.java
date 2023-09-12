package Chapter3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testThatCanIsOffCanOn(){
            // given i have an ac  and my ac is off
        AirConditioner ac = new AirConditioner();
        assertFalse(ac.isOn());
        // when i turn it on
        ac.toggleOn();
        // it is on
        assertTrue(ac.isOn());

    }
    @Test
    public void testThatAcIsOnCanOff(){
        //given i have an ac and ac is on
        AirConditioner ac = new AirConditioner();
        // when my ac on i can off
        ac.toggleOn();
        assertTrue(ac.isOn());
        ac.toggleOn();
        // assert my ac is off
        assertFalse(ac.isOn());
    }
    @Test
    public void testThatAcCanIncreaseTemperature(){
        // given i have ac , my ac is on , my ac is 16 degree
        AirConditioner ac = new AirConditioner();
        ac.toggleOn();
        assertTrue(ac.isOn());
        assertEquals(16, ac.checkTemperature());
        // when i increase temperature
        ac.increaseTemperature();
        // assert my ac increase temperature
        assertEquals(18,ac.checkTemperature());


    }
    @Test
     public void testAcCanDecreaseTemperature() {
        // given i have ac my ac is on my ac is on
        AirConditioner ac = new AirConditioner();
        ac.toggleOn();
        assertTrue(ac.isOn());
        assertEquals(16, ac.checkTemperature());
        // given my ac  temperature is on 18 degree
        ac.increaseTemperature();
        assertEquals(17, ac.checkTemperature());
        ac.increaseTemperature();
        assertEquals(18, ac.checkTemperature());
        // when i decrease temperature
        ac.decreaseTemperature();
        assertEquals(17, ac.checkTemperature());
    }

        @Test
        public void testThatAcTemperatureCantIncreaseBeyond30Degree() {
            // given i have an AirConditioner my ac is on
            AirConditioner ac = new AirConditioner();
            ac.toggleOn();
            assertTrue(ac.isOn());
            // when i increase temperature to 30 degree
            assertEquals(16, ac.checkTemperature());
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            ac.increaseTemperature();
            assertEquals(30, ac.checkTemperature());
            // assert ac cant increase beyond 30 degree
            ac.increaseTemperature();
            assertEquals(31, ac.checkTemperature());
        }

            @Test
             public void testThatAcCantDecreaseBeyond16(){
        // given that i have an ac and my ac is on
                AirConditioner ac = new AirConditioner();
                ac.toggleOn();
                assertTrue(ac.isOn());
                //  when i decrease temperature below 16
                assertEquals(16, ac.checkTemperature());
                ac.decreaseTemperature();
                assertEquals(15, ac.checkTemperature());


            }


        }










