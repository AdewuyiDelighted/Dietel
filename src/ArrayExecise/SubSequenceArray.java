package ArrayExecise;

import java.util.ArrayList;

public class SubSequenceArray {
    public static void main(String[] args) {
        int [] parentArray;
        int [] subElement;
        System.out.println(subsequence(new int[]{5,2,1,3,-2,-8,1},new int[]{3,-8,1}));
    }
    public static ArrayList<Integer> subsequence(int [] parentArray,int [] subArray){
        ArrayList<Integer> sameElement = new ArrayList<>();
        if(parentArray.length > subArray.length) {
            for (int index = 0; index < parentArray.length; index++) {
                for (int count = 0; count < subArray.length;count++){
                        if(parentArray[index] == subArray[count]){
                            sameElement.add(parentArray[index]);
                        }
                }
            }
        }
        return sameElement;
    }

}
