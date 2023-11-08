package PersonalAssessement;

public class TestingSplitMethod {
    public static void main(String[] args) {
        String word = "my@full@name@is@real";
        String[] array = word.split("i", -2);
        for (String a : array) {
            System.out.println(a);
        }
    }
}
