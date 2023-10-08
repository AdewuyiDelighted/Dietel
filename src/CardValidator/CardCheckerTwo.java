package CardValidator;

public class CardCheckerTwo {
    public static int confirmAccountNumber(String numbers) {
        char count = ' ';
        String counts = " ";
        int numb = 0;
        int multiply = 0;
        int sum = 0;
        int product = 2;
        int length = numbers.length() - 1;
        for (int index = length - 1; index >= 0; index -= 2) {
            count = numbers.charAt(index);
            counts = String.valueOf(count);
            numb = Integer.parseInt(counts);
            multiply = product * numb;
            if (multiply > 9) {
                int extraOne = multiply / 10;
                int extraTwo = multiply % 10;
                multiply = extraOne + extraTwo;
            }
            sum += multiply;
        }
        return sum;

    }

    public static int oddlyPlaced(String numbers) {
        int length = numbers.length() - 1;
        char count = ' ';
        String counts = " ";
        int value = 0;
        int sum = 0;
        for (int index = length; index >= 0; index -= 2) {
            count = numbers.charAt(index);
            counts = String.valueOf(count);
            value = Integer.parseInt(counts);
            sum += value;
        }
        return sum;
    }

    public static int combine(String number) {
        int sum = 0;
        int totalOne = confirmAccountNumber(number);
        int totalTwo = oddlyPlaced(number);
        sum = totalTwo + totalOne;
        return sum;
    }

    public static void checkCard(String number) {
        int result = combine(number);
        if (result % 10 == 0) {
            System.out.println("Card number is valid");
        } else {
            System.out.println("Card number is invalid");
        }

    }

    public static int cardNumberLength(String cardNumber) {
        return cardNumber.length();
    }

    public static void returnMessage(String cardNumber) {
        String message = " ";

        String firstCharacter = String.valueOf(cardNumber.charAt(0));
        String secondCharacter = String.valueOf(cardNumber.charAt(1));
        if (firstCharacter.equals("4")) {
            message = "Visa Card";
        } else if (firstCharacter.equals("5")) {
            message = "Master Card";
        } else if (firstCharacter.equals("3") && secondCharacter.equals("7")) {
            message = "American Express Cards";
        } else if (firstCharacter.equals("6")) {
            message = "Discover Card";
        } else {
            message = "Invalid card";
            //}
        }
        System.out.println(message);
    }
}
