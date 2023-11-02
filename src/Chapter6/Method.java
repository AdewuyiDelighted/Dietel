package Chapter6;

public class Method {


    public static double floor(double input) {
        int numberBeforeDecimal = (int) input;
        double numberAfterDecimal = input - numberBeforeDecimal;
        return  input - numberAfterDecimal;

    }
    public static double ceil(double input){
        int numberBeforeDecimal = (int) input;
        return  numberBeforeDecimal + 1;

    }


}



