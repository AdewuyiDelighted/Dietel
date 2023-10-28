package MyAssessment;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] run = new int[5];
        for (int index = 0; index < 4; index++) {
            SecureRandom random = new SecureRandom();
            int numRam = random.nextInt(1, 5);
            run[numRam] = 1;



            System.out.println(numRam);
        



        }


        System.out.println(Arrays.toString(run));

    }

    }

