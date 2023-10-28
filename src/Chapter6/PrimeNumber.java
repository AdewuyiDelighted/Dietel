package Chapter6;

public class PrimeNumber {
    public static void main(String[] args) {
        primeInTenThousand();
    }


    public static boolean primeNumber(int number) {
        int count = 0;
        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
    public static void primeInTenThousand(){
        int count = 0;
        int tenThousand = 10000;
        for(int index = 2;index < tenThousand;index++) {
            count = 0;
            for (int indices = 1; indices <= index; indices++) {
                if (index % indices == 0) {
                    count++;
                }
            }
            if(count <= 2) {

                System.out.println(index);
            }
        }
    }
}

