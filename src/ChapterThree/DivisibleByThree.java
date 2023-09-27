package ChapterThree;

public class DivisibleByThree {
    public static void main(String[] args) {
        int number = 1;
        int count = 0;
        for(number = 1; number <= 30;number++){
            if(number % 3 == 0){
                count = count + number;

            }
        }
        System.out.println(count);
    }
}
