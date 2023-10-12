package ClassAssessment;

public class MinMax {

    public static int addWithOutLastIndex(int [] number){
        int sum = 0;
        for(int num = 0; num < number.length -1;num++){
            sum += number[num];

        }
        return sum;
    }

    public static int  addWithOutfirstIndex(int[] number) {
        int sum = 0;
        for(int num = 1;num < number.length;num++){
            sum += number[num];
        }
        return sum;
    }
    public static int  addWithOutSecondIndex(int [] number){
        int  sum = 0;
        int  subtract = 0;
        for(int num = 0; num < number.length;num++){
            sum  += number[num];

        }
            subtract = sum  - number[1];
        return subtract;
    }

    public static int addWithOutThirdIndex(int[] number) {
        int  sum = 0;
        int  subtract = 0;
        for(int num = 0; num < number.length;num++){
            sum  += number[num];

        }
        subtract = sum - number[2];
        return subtract;

    }

    public static int addWithOutFourthIndex(int[] number) {
        int  sum = 0;
        int  subtract = 0;
        for(int num = 0; num < number.length;num++){
            sum  += number[num];

        }
        subtract = sum  - number[3];
        return subtract;

    }
    public  static int largestSum(int [] number){

        int  firstNum = addWithOutfirstIndex(number);
        int  secondNum = addWithOutSecondIndex(number);
        int  thirdNum = addWithOutThirdIndex(number);
        int  fourthNum = addWithOutFourthIndex(number);
        int max = firstNum;

            if(secondNum > max ) {
                max = secondNum;
            }
             if (thirdNum > max) {
                 max = thirdNum;
             }
             if (fourthNum > max) {
                max = fourthNum;
            }
            return max;
        }
    public  static int smallestSum(int [] number){
        int  firstNum = addWithOutfirstIndex(number);
        int  secondNum = addWithOutSecondIndex(number);
        int  thirdNum = addWithOutThirdIndex(number);
        int  fourthNum = addWithOutFourthIndex(number);
        int min = firstNum;

        if(secondNum < min ) {
            min = secondNum;
        }
        if (thirdNum < min) {
            min = thirdNum;
        }
        if (fourthNum < min) {
            min = fourthNum;
        }
        return min;
    }
    public static int [] maxMin(int [] numbers){

        return new int[]{largestSum(numbers), smallestSum(numbers)};
    }
    }





