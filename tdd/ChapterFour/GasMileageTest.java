package ChapterFour;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GasMileageTest {


    @Test
    public void testThatGasMileageExist() {
        GasMileage gas = new GasMileage();
        assertNotNull(gas);

    }

    @Test
    public void testThatGasMileageMile() {
        GasMileage gas = new GasMileage();
        gas.miles(50);
        assertEquals(50, gas.getMiles());
    }

    @Test
    public void testThatGasMileageGallon() {
        GasMileage gas = new GasMileage();
        gas.gallons(20);
        assertEquals(20, gas.getGallons());
    }

    @Test
    public void testThatGasMileageCanCalculate() {
        GasMileage gas = new GasMileage();
        gas.miles(50);
        gas.gallons(20);
        assertEquals(2.0, gas.milesPerGallons());

    }

    @Test
    public void testThatGasMileageIsActive() {
        GasMileage gas = new GasMileage();
        gas.miles(50);
        gas.gallons(20);
        gas.milesPerGallons();
        assertEquals(2.0,gas.milesPerGallons());
        gas.miles(100);
        gas.gallons(15);
        gas.milesPerGallons();
        assertEquals(6.0,gas.milesPerGallons());
        gas.combinedMilesPerGallons();
        assertEquals(8.0,gas.combinedMilesPerGallons());
    }
}