package PersonalAssessement;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexMethodTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scanner.nextLine();
//        System.out.println(Pattern.matches("[a-zA-Z]+",word));
//        System.out.println(Pattern.matches("\\d+",word));
//        System.out.println(Pattern.matches("[a-zA-Z]+\\d+",word));
        String regex = "^(?=.*[0-9])"+"(?=.*[a-z])"+"(?=.*[A-Z])"+"(?=.*[@#$%^&-+=()])"+"(?=\\S+$).{8,20}$";
//        String regex = "^(?=.*[0-9])"
//                + "(?=.*[a-z])(?=.*[A-Z])"
//                + "(?=.*[@#$%^&+=])"
//                + "(?=\\S+$).{8,20}$";
       System.out.println(Pattern.matches(regex,word));

    }
}
