package Chapter6;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palindrome(12321));
    }


    public static boolean palindrome(int number) {
        int convert = 0;
        int holdValue = number;

        while (number != 0) {
            int digit = number % 10;
            convert = convert * 10 + digit;
            number/= 10;
        }
        if (holdValue == convert) {
            return true;
        }
        return false;
    }
}
