package ChapterFive;

public class sumOfSeries {
    public static void main(String[] args) {
       int sum = 0;
       int numberOfTerm = 100;
       int firstTerm = 1;
       int secondTerm = firstTerm + firstTerm;
        System.out.println(firstTerm);
        for(int num =firstTerm ;num <= numberOfTerm;num++){
            sum += num;
            if(sum == firstTerm || sum == secondTerm) continue;


            System.out.printf("%d%10d%n",num,sum);
        }
    }
}

