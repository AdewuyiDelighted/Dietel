package ArrayExecise;

public class NonDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(nonDuplicateNumber(new int[]{2, 2, 1, 3, 3}));
    }

    public static int nonDuplicateNumber(int[] array) {
        int counter = 0;
        int nonDuplicate = 0;
        for (int index = 0; index < array.length; index++) {
            for (int indices = 0; indices < array.length; indices++) {
                if (array[index] == array[indices]) {
                    counter += 1;
                }
            }
            if(counter == 1) {
                nonDuplicate = array[index];
            }
            counter = 0;
        }
        return nonDuplicate;
    }
}
