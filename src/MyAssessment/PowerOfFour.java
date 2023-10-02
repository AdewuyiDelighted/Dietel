package MyAssessment;




public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(powerOfFour(1));
    }
    public static boolean powerOfFour(int input) {
        int multiply = 1;
        int sum = 0;
        if(input > 0){
        for(int num = 1; num < input ; num++) {
            multiply *= 4;
            }

        }
        else {
             input *= (-1);
            for (int num = 1; num < input; num++) {
                multiply *= 4;
            }
        }
        if(multiply == input){
            return true;
        }
        else {
            return false;
        }


    }
}
