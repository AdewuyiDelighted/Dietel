package Chapter3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void testThatBikeCanTurnOn() {
        // given that i have a bike and it is off
        Bike bike = new Bike();
        assertFalse(bike.isOn());
        // when i turn turn it on
        bike.kickStart();
        // it is on
        assertTrue(bike.isOn());
    }

    @Test
    public void testThatBikeCanBeTurnOff() {
        // given that i have bike and bike is on
        Bike bike = new Bike();
        bike.kickStart();
        assertTrue(bike.isOn());
        // when i turn off
        bike.kickStart();
        assertFalse(bike.isOn());


    }

    @Test
    public void testThatBikeCanAccelerateToGearOne() {
        // given that i have a bike,my bike is on
        Bike bike = new Bike();
        bike.kickStart();
        assertTrue(bike.isOn());
        // when i accelerate
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        // assert that bike Accelerate by 1
        assertEquals(4 ,bike.checkAccelerate());
    }
    @Test
    public void testThatBikeCanAccelerateToGearTwo() {
        // given that i have a bike , my bike is 0n,when my bike current speed is gear 1
        Bike bike = new Bike();
        bike.kickStart();
        assertTrue(bike.isOn());
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        //bike.increaseAccelerate();
        assertEquals(20 , bike.checkAccelerate());
// when the current increase to gear 2
        bike.increaseAccelerate();
       assertEquals(22,bike.checkAccelerate());
        bike.increaseAccelerate();
        assertEquals(24,bike.checkAccelerate());
        // assert that bike increased by 2

    }
    @Test
   public void testThatBikeCanInrcreaseToGearThree() {
        // given i have a bike and my bike is on gear one and gear two
        Bike bike = new Bike();
        bike.kickStart();
        assertTrue(bike.isOn());
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        assertEquals(20, bike.checkAccelerate());
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        assertEquals(30, bike.checkAccelerate());
// when the current gear is 3
        bike.increaseAccelerate();
        bike.increaseAccelerate();
        // aasert that it increased by 3
        assertEquals(36, bike.checkAccelerate());
    }

@Test
    public void testThatBikeCanAccelerateGearFour() {
    // given i have a bike and it is on and it on gear
    Bike bike = new Bike();
    bike.kickStart();
    assertTrue(bike.isOn());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(20, bike.checkAccelerate());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(30, bike.checkAccelerate());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(42, bike.checkAccelerate());
    //when current gear is on 4
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    // assert that it increase by 4
    assertEquals(54, bike.checkAccelerate());

}
@Test
    public void testThatBikecanDeAccelerate(){
        // given that i have a bike and it is on gear 1
        Bike bike = new Bike();
        bike.kickStart();
        assertTrue(bike.isOn());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    //bike.increaseAccelerate();
    //bike.increaseAccelerate();
    assertEquals(18 , bike.checkAccelerate());
    //when i deAccelerate
    bike.decreaseAccelerate();
    bike.decreaseAccelerate();
    // assert it deAccelerate by 1
    assertEquals( 16,bike.checkAccelerate());

}
@Test
    public void testThatBikeCanDeAccelarateToGear2(){
        Bike bike = new Bike();
        bike.kickStart();
        assertTrue(bike.isOn());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(20,bike.checkAccelerate());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    //bike.increaseAccelerate();
    //bike.increaseAccelerate();
    assertEquals(26, bike.checkAccelerate());
    //when i deAccelerate
   bike.decreaseAccelerate();
    assertEquals(24,bike.checkAccelerate());

}
@Test
    public void testThatBikeCanDeAccelerateToGearThree() {
    // given that i have a bike and my bike so when i my bike is gear 3
    Bike bike = new Bike();
    bike.kickStart();
    assertTrue(bike.isOn());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(20, bike.checkAccelerate());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(30, bike.checkAccelerate());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    //bike.increaseAccelerate();
    //bike.increaseAccelerate();
    assertEquals(36, bike.checkAccelerate());
    //when i deAccelerate
    bike.decreaseAccelerate();
    assertEquals(33, bike.checkAccelerate());
}

@Test
public void testThatBikeCanDeAccelerateToGearFour(){
       //given that i have bike and my bike is on and my bike is on gear 4
        Bike bike = new Bike();
        bike.kickStart();
        assertTrue(bike.isOn());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(20, bike.checkAccelerate());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(30, bike.checkAccelerate());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    assertEquals(42, bike.checkAccelerate());
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    bike.increaseAccelerate();
    //when i deAccelerate
    bike.decreaseAccelerate();
    // assert it decreased by 4
    assertEquals(50,bike.checkAccelerate());
}
    }
