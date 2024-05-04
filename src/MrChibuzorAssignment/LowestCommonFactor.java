package MrChibuzorAssignment;

public class LowestCommonFactor {
    public static void main(String[] args) {
        System.out.println(findLowestCommonFactor(12, 36, 48));
    }

    public static int findLowestCommonFactor(int... inputs) {
        int lcm = 1;
        int initialDefualt = 2;
        int countOne = 0;
        int count = 0;
        while (countOne != inputs.length) {
            for (int index = 0; index < inputs.length; index++) {
                if(countOne == inputs.length)break;
                if (checkInputs(initialDefualt, inputs)) {
                    if (inputs[index] % initialDefualt == 0) {
                        inputs[index] = inputs[index] / initialDefualt;
                        count++;
                        countOne += checkOne(inputs[index]);
                    }

                } else {
                    initialDefualt++;
                }
            }
            if (count >= 1) {
                lcm *= initialDefualt;
            }

            count = 0;

        }
        return lcm;


    }

//    private static boolean checkInput(int number, int[] initialDefualt) {
//        return number / initialDefualt == 0;
//    }

    private static boolean checkInputs(int initialDefault, int... number) {
        int count = 0;
        for (int index = 0; index < number.length; index++) {
            if (number[index] % initialDefault == 0) {
                count++;
            }
            if (count >= 1) return true;
        }
        return false;
    }

    private static int checkOne(int value) {
        if (value == 1) return 1;
        return 0;
    }

    private static int returnLcm(int lcm ,int initialDefault){
        return lcm * initialDefault;

    }

}
