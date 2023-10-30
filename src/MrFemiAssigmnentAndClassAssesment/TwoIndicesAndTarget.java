package MrFemiAssigmnentAndClassAssesment;

public class TwoIndicesAndTarget {


    public static boolean twoIndicesAndTarget(String number,int indexOne,int indexTwo,int target){
        String valueOne = number.charAt(indexOne) +"";
        int intValueOne = Integer.parseInt(valueOne);

        String valueTwo = number.charAt(indexTwo) +"";
        int intValueTwo = Integer.parseInt(valueTwo);

        if(target > intValueOne && target < intValueTwo){
            return true;
        }
        return false;
    }
}
