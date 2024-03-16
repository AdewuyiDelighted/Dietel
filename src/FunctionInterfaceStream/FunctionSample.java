package FunctionInterfaceStream;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
//        Function takes in two generic value argument and return the type of the second value
        Function<String,Integer> function = (word) -> word.length();

        System.out.println(function.apply("Lugurious"));


//BiFunction takes three parameter and returns the type of the last paramter
        BiFunction<String, Integer, String> biFunction = (name, addressNumber) -> value(name,addressNumber); {
        }
        System.out.println(biFunction.apply("Ope", 32));
    }
    public static String value (String name, Integer addressNumber){
        return name + " lives in " + addressNumber + " Lakreem street";
    }

}
