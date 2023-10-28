package Chapter5;

public class ContinueReplacement {
    public static void main(String[] args) {
        continueReplacement(5);

    }
    public static void continueReplacement(int number){
        for(int count = 1;count<= 10;count++){
            if(count == number) {
                count = count + 1;
            }
                System.out.print(count + " ");

            }
        }
    }

