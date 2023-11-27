package ArrayExecise;

import java.security.SecureRandom;
import java.util.Arrays;

public class NineHeadsAndTails {
    static int countCoin = 0;

    public static int flipCoin() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(0, 2);
    }

    public static int[][] nineCoinsOutput() {
        int[][] nineCoins = new int[3][3];
        int count = 0;
        while (count < nineCoins.length) {
            for (int index = 0; index < nineCoins.length; index++) {
                countCoin++;
                nineCoins[count][index] = flipCoin();
            }
            count++;
        }
        return nineCoins;
    }
}
