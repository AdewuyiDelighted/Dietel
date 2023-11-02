package Chapter6;

import java.util.Scanner;

public class TemperatureConversion {




    public static double kelvin(int celsius){
        return celsius + 273.15;

    }

    public static double celsius (int kelvin ){
                double  celsius = kelvin - 273.15;
                String value = String.format("%.1f",celsius);
                return Double.parseDouble(value);

    }
}
