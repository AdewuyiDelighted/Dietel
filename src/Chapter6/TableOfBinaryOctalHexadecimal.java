package Chapter6;

public class TableOfBinaryOctalHexadecimal {
    private static final int BIN_BASE = 2;
    private static final int OCT_BASE = 8;
    private static final int HEX_BASE = 16;




    public static String decimalToBinary(int decimal){
        String binary = "";
        while(decimal != 0){
            int reminder = decimal % BIN_BASE;
            binary += reminder +"";
            decimal /= BIN_BASE;
        }
           return binary;

    }
    public static String binary(int input){
        String toBinary = decimalToBinary(input);
        int length = toBinary.length();
        String reverse = "";
        for(int index = length - 1; index >= 0; index--){
            char value = toBinary.charAt(index);
            reverse += value + "" ;
        }
        return reverse;
    }

    public static int decimalToOctal(String decimal) {

        int sum = 0;
        int count = 0;
        int length = decimal.length();

        for (int index = length - 1; index >= 0; index--) {
            String value = String.valueOf(decimal.charAt(count));
            int stringToInt = Integer.parseInt(value);
            double convert = stringToInt * Math.pow(OCT_BASE, index);
            sum += (int) convert;
            count++;

        }
        return sum;

    }


    public static String convertToHexDecimal(int number) {
        String input = "";
        while (number != 0) {
            int reminder = number % HEX_BASE;
            input += reminder + "";
            number /= HEX_BASE;
        }
        return input;

    }
    public static String hexDecimal(int input){
        String hex = convertToHexDecimal(input);
        int length = hex.length();
        String reverse = "";
        for(int index = length - 1;index >= 0;index--){
            char value = hex.charAt(index);
            reverse += value + "" ;
        }
        return reverse;
    }

}
