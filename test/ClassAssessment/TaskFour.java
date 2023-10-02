package ClassAssessment;

public class TaskFour {
    public static void main(String[] args) {
        int number = 10;
        int evenNum = 0;
        for(int num = 1; num <= number;num++) {
            if (num % 2 == 0) {
                evenNum += num;
            }
        }
            System.out.println(evenNum);

    }
}
