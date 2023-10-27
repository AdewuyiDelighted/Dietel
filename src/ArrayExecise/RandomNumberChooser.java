package ArrayExecise;

import java.security.SecureRandom;

public class RandomNumberChooser {
    public static void main(String[] args) {

        System.out.println(getRandom(1,2,3,4,5,6,7,8,9));
    }


public static int getRandom(int...numbers){
    int length = numbers.length;
    SecureRandom secureRandom = new SecureRandom();
    int result = 0;
    int randomNumbers = secureRandom.nextInt(54);
    for(int num = 0; num < length;num++){
        result = randomNumbers;
        if(result == numbers[num])continue;{
            System.out.println(result);
        }
    }
    return (result);
    }

}

