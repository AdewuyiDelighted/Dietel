package MrChibuzorAssignment;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(reverse(13));


    }


    public static String decimalToBinary(int decimal) {
        String input = "";
        while (decimal != 0) {
            int reminder = decimal % 2;
            decimal /= 2;
            input = reminder + " ";

        }
        return input;
    }

    public static String reverse(int decimal) {
        String binary = decimalToBinary(decimal);
        String reverse = "";
        for (int index = binary.length() - 1; index >= 0; index--) {
            reverse += binary.charAt(index);
        }
        return reverse;
    }


}
