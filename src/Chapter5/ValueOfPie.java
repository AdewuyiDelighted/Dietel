package Chapter5;

public class ValueOfPie {
    public static void main(String[] args) {
        double constance = 4;
        double total = 0;
        int value = 0;
        for(int index = 1;index <= 200000;index +=2){
            if(value % 2 == 0){
                 total +=constance/index;
            }
            else{
                total -= constance / index;

            }
            value ++;
            System.out.printf("%.5f%n",total);
        }
    }
}
