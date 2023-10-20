package MrFemiAssigmnentAndClassAssesment;


import java.util.Arrays;

public class CheckInt {
    public static void main(String[] args) {
        String [] words = {"ABC124","E16C","1BCP3"};
        System.out.println(checkInt(words));
    }

    public static int checkInt(String [] input){
        int count = 0;
        for(int index = 0;index < input.length;index++){
            String inputString = input[index];
            for(int indices = 0;indices < inputString.length();indices++){
                char words = inputString.charAt(indices);
                if(words >= '0' && words <= '9'){
                    count++;

                }
            }
        }
        return count;
    }

    }



