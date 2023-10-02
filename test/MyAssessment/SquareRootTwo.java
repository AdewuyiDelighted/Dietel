package MyAssessment;



public class SquareRootTwo {


    public static double squareRoot(int number) {
//        double squareroot = 0;
        double divide = 0;
        for(double num = 1.0;num<= number;num = num + 0.1){
           // squareroot = num * num;
            if(num * num == number){
                divide = num;
            }
        }
            return  divide;
    }
}