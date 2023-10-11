package ChapterSix;

public class Method {
    public static void main(String[] args) {

        System.out.println(floor(9.3));
        System.out.println(ceil(9.3));
    }


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



