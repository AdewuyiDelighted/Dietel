package Chapter6;

public class Multiples {

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
