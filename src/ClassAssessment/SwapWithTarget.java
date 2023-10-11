package ClassAssessment;

public class SwapWithTarget {
    public static int  [] swap(int [] elements,int targetOne,int targetTwo){
        elements[targetOne] = elements[targetOne] + elements[targetTwo];
        elements[targetTwo] = elements[targetOne] - elements[targetTwo];
        elements[targetOne] = elements[targetOne] - elements[targetTwo];
        return elements;
    }
}
