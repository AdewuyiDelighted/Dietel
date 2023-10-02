package MyAssessment;

public class WhileToFor {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for( i = 1;sum < 10000;i++){
            sum = sum +i;
            System.out.println(i);
            System.out.println(sum);
        }
    }
}
