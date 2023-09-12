package PersonalAssessement;

public class MultiplicationTable {
    public static void main(String[] args) {
        int counter = 0;
        int number = 24;
        for(int row  = 1;row<=number;row++){
            for(int column = 1;column<=number;column++){
                int multiply = row *column;
                //System.out.print(multiply +"\t");
                System.out.print(row +" * "+column+" = "+multiply +"\t"+"\t");
            }
            System.out.println(" ");
        }
    }
}
