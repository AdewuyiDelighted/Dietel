package ChapterSix;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2023));
    }
    public static boolean isLeapYear(int year){
        boolean result =  false;
        if(year % 4 == 0){
            result = true;
        }
        if(year % 400 == 0 && year % 100 != 0){
            result = true;
        }
     return result;
    }
}
