package ChapterSix;

public class SumOfDigit {
    public static void main(String[] args) {

        System.out.println(sumOfDigit(7631));
    }


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
