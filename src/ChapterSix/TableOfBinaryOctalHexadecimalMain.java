package ChapterSix;

public class TableOfBinaryOctalHexadecimalMain {
    public static void main(String[] args) {
        System.out.printf("%-13s%10s%8s%15s%n","NO","BINARY","OCTAL","HEXADECIMAL");
        for(int index = 1; index <= 256;index++){
            String stringIndex = String.valueOf(index);
            System.out.printf("%-10d%10s%10d%10s%n",index,TableOfBinaryOctalHexadecimal.binary(index),TableOfBinaryOctalHexadecimal.decimalToOctal(stringIndex),TableOfBinaryOctalHexadecimal.hexDecimal(index));
        }
    }
}
