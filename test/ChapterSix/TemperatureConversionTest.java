package ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionTest {
    @Test
    public void testTheKelvinOfACelsius(){
        int celsius = 25;
        double result = 298.15;
        double answer = TemperatureConversion.kelvin(celsius);
        assertEquals(result,answer);

    }
    @Test
    public void testTheKelvinOfACelsiusTwo(){
        int celsius = 53;
        double result = 326.15;
        double answer = TemperatureConversion.kelvin(celsius);
        assertEquals(result,answer);

    }
    @Test
    public void testTheKelvinOfACelsiusThree(){
        int celsius = 25;
        double result = 298.15;
        double answer = TemperatureConversion.kelvin(celsius);
        assertEquals(result,answer);

    }
      @Test
    public void testTheCelsiusOfAKelvinOne(){
        int kelvin = 300;
        double result = 26.9;
        double answer = TemperatureConversion.celsius(kelvin);
        assertEquals(result,answer);

   }
    @Test
    public void testTheCelsiusOfAKelvinTwo(){
        int kelvin = 543;
        double result =269.9;
        double answer = TemperatureConversion.celsius(kelvin);
        assertEquals(result,answer);

    }
    @Test
    public void testTheCelsiusOfAKelvinThree(){
        int kelvin = 720;
        double result = 446.9;
        double answer = TemperatureConversion.celsius(kelvin);
        assertEquals(result,answer);

    }

}