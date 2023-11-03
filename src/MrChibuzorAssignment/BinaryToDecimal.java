package MrChibuzorAssignment;

public class BinaryToDecimal {

    public static String reverse(String binary) {
        String reverse = "";
        for (int index = binary.length(); index > 0; index--) {
            reverse += binary.charAt(index - 1);

        }
        return reverse;

    }
    private static final int BASE = 2;
    public static int convertToDecimal(String binary) {
        String reverse = reverse(binary);
        int sum = 0;
        for (int index = 0; index < reverse.length(); index++) {
            char num = reverse.charAt(index);
            int numb = Integer.parseInt(String.valueOf(num));
            double convert = numb * Math.pow(BASE, index);
            sum += (int) convert;
        }
        return sum;
    }
}
