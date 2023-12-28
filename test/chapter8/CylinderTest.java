package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    private Cylinder cylinder;
    @BeforeEach public void beforeEach() {
        cylinder = new Cylinder();
    }
    @Test public void testTheVolumeOfCylinder(){
        cylinder.setRadius(5);
        cylinder.setHeight(5);
        double expected = cylinder.calculateCylinderVolume();
        assertEquals(392.7,expected);
    }
    @Test public void testTheVolumeOfCylinderWhenRadiusIsThree(){
        cylinder.setRadius(3);
        cylinder.setHeight(5);
        double expected = cylinder.calculateCylinderVolume();
        assertEquals(141.37,expected);
    }

}