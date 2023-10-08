package ChapterFive;

public class BreakReplacement {
    public static void main(String[] args) {
        breakReplacement(7);

    }
        public static void breakReplacement(int number){
        int numberBefore = number - 1;
        for(int count = 1;count <= 10;){
            System.out.println(count);
            count++;
            if(count > numberBefore){
               count = count + count +1;
            }
        }
    }
    }

