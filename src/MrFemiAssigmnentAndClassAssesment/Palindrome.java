package MrFemiAssigmnentAndClassAssesment;

public class Palindrome {
    public static void main(String[] args) {
        palindrome("noon");
    }
    public static void palindrome(String words) {
        int length = words.length();
        String reverse = "";
        char input = ' ';
        System.out.println(length);
        for (int index = length-1; index > 0; index++) {
            reverse += words.charAt(index);
            System.out.println(reverse);
        }
    }
}
