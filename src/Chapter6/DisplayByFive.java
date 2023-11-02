package Chapter6;

public class DisplayByFive {
    public static boolean divisibleByFive(int...input) {
        int count = 0;
        int counter = 0;
        for (int num = 1; num <= 10; num++) {
            if (input[counter] % 5 == 0) {
                count++;
                counter++;
            }
            if (count == 10) {
                return true;
            }
        }
        return false;
    }
}
