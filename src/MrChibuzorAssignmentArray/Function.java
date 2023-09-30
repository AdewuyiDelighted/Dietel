package MrChibuzorAssignmentArray;

public class Function {

    public static void main(String[] args) {
        System.out.println(highestElement(new int[]{1,2,3}));

        int [] maxi = new int[]{1,2,3,4,5,6,7,};
        System.out.println(maxi[6]);
    }


    public static int highestElement(int[] number){
        int maxi = number[0];
        for(int num = 1;num < number.length;num++){
            if(number[num] > maxi){
                maxi = number[num];
            }
        }

        return maxi;
    }
}
