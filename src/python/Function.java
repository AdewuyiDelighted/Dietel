package python;

public class Function {


    public static boolean pal(int number) {
       // boolean  result = total == convert;
        int total = number;
        int count = 0;
        int convert = 0;

            while (number != 0) {
                count = number % 10;
                convert = convert * 10 + count;
                number /= 10;
            }



        if (total == convert) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println((pal(546334)));

    }

}






