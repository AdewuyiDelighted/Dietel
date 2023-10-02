package MrChibuzorAssignment;

public class FloatingPoint {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;
        int numberFive = 5;
        int numberSix = 6;
        int count = 1;
        int countt = 1;
        int counttt = 1;
        int countttt = 1;
        int counttttt = 1;



        System.out.println("a" + "\t\t\t" + "b" + "\t\t\t" + "pow(a,b)");
        for (int sum = 1; sum <= numberTwo; sum++) {
            count *= numberOne;
        }
        System.out.println(numberOne + "\t\t\t" + numberTwo + "\t\t\t" + count);
        for(int sum =1;sum<=numberThree;sum++){
            countt *=numberTwo;
        }
        System.out.println(numberTwo + "\t\t\t" + numberThree + "\t\t\t" + countt);
        for(int sum =1;sum<=numberFour;sum++){
            counttt *= numberThree;
        }
        System.out.println(numberThree + "\t\t\t" + numberFour + "\t\t\t" + counttt);
        for(int sum =1; sum<=numberFive;sum++){
            countttt *=numberFour;

        }
        System.out.println(numberFour + "\t\t\t" + numberFive + "\t\t\t" + countttt);
        for(int sum =1;sum<=numberSix;sum++){
            counttttt*=numberFive;
    }
        System.out.println(numberFive + "\t\t\t" + numberSix + "\t\t\t" + counttttt);
    }
}



