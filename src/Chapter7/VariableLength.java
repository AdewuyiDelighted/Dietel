package Chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class VariableLength {
    public enum coin {HEAD, TAIL}

    ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to toss a coin");
        int headOf = 0;
        int tailOf = 0;
        int number = scanner.nextInt();
        while (number == 1) {
            String result = flip();
            System.out.println(result);
                if (result.equals("HEAD")){
                    headOf++;
                } else tailOf++;
            System.out.println("Enter 1 to toss a coin");
            number = scanner.nextInt();
            }
        System.out.println("number of head "+headOf);
        System.out.println("number of tail "+tailOf);
        System.out.println(averageOfSeries(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static double averageOfSeries(int... numbers) {
        int length = numbers.length;
        int sum = 0;
        double average = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = (double) sum / length;
        String averageToString = String.format("%.1f", average);
        double averageToDouble = Double.parseDouble(averageToString);
        return averageToDouble;
    }

    public static String flip() {
        SecureRandom myRandom = new SecureRandom();
        int number = myRandom.nextInt(1, 3);
        String result = "";
        switch (number) {
            case 1 -> {
                result = String.valueOf(coin.HEAD);
            }
            case 2 -> {
                result = String.valueOf(coin.TAIL);
            }
        }
        return result;
    }


}

