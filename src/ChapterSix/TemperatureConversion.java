package ChapterSix;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Kelvin temperature");
        int userKelvin = scanner.nextInt();
        double celsiusEquivalent = celsius(userKelvin);
        System.out.println("Enter a Celsius temperature");
        int userCelsius = scanner.nextInt();
        double kelvinEquivalent = kelvin(userCelsius);
        System.out.printf("The Celsius equivalent is %.2f %n " ,celsiusEquivalent);
        System.out.println("The kelvin equivalent is  " + kelvinEquivalent);

    }



    public static double kelvin(int celsius){
        return celsius + 273.15;

    }

    public static double celsius (int kelvin ){
                double  celsius = kelvin - 273.15;
                String value = String.format("%.1f",celsius);
                return Double.parseDouble(value);

    }
}
