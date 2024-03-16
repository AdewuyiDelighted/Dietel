package PersonalAssessement;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String regex = "^[]$";
        System.out.println(Pattern.matches(regex, "**"));
    }
}
