package ChapterSix;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(checkMultiples(6,13));
    }
public static boolean checkMultiples(int firstInput,int secondInput){
        boolean result = false;
        for(int index = 1;index <= secondInput;index++){
            if(firstInput * index == secondInput){
                result = true;

            }
        }
return result;
    }


}
