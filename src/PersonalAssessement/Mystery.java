package PersonalAssessement;

public class Mystery {
    public static void main(String[] args) {
        int number = - 2;
        int total = 0;

        while(number<=10){
            int numb = number + 2;
            number++;
            total += numb;
            System.out.println(total + "\t " + numb);

        }
    }
}
