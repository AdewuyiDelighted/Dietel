package Chapter5;

public class BreakReplacement {
    public static void main(String[] args) {
        breakReplacement(12,10);

    }
        public static void breakReplacement(int number,int numberBefore){
        for(int count = 1;count <= number;){
            System.out.println(count);
            count++;
            if(count > numberBefore -1){
               count = count + number;
            }
        }
    }
    }

