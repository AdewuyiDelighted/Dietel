package ClassAssessment;

public class SumDigit {
    public static void main(String[] args) {

        System.out.println(sumDigit(-657));
    }
    public static int sumDigit(long input) {
        int divided = 0;
        int reverse = 0;
        while (input != 0) {
            divided = (int) (input % 10);
            reverse = reverse * 10 + divided;
            input /= 10;
        }
            long divide = 0;
            int multiply = 0;
            int firstNum = (int) (reverse % 10);
                int number = (int) (reverse /10);
                int sum = firstNum;
            while (number != 0){
                if(number > 0){
                divide = number % 10;
                sum += (int) divide;
                number /= 10;
                }
            else{
                divide = number % 10;
                multiply  = (int) (divide * (-1));
                sum += multiply;
                number /= 10;

           }
            }
            return sum;
        }

    }

