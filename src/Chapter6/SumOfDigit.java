package Chapter6;

public class SumOfDigit {


    public static int sumOfDigit(int input){
        int result = 0;
        int divide = 1000;
        int sum = 0;
        for(int numb = 1;numb <= 4;numb++){
            result = input/ divide % 10;
            sum += result;
            divide /= 10;
        }
        return sum;
    }

}
