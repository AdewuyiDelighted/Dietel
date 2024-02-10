package MrChibuzorAssignment;

import java.util.Dictionary;
import java.util.Hashtable;

public class CharacterFrequency {
    public static void main(String[] args) {
        System.out.println(countElement("semicolon.africa"));
    }
    public static Dictionary<String, Integer> countElement(String input) {
        int elementNo = 0;
        Dictionary<String, Integer> countOfEachElement = new Hashtable<>();
        for (int index = 0; index < input.length(); index++) {
            elementNo = countElements(input, index, elementNo);
            countOfEachElement.put(String.valueOf(input.charAt(index)), elementNo);
            elementNo = 0;

        }
        return  countOfEachElement;
    }

    private static int countElements(String input, int index, int elementNo) {
        for (int count = 0; count < input.length(); count++) {
            if (input.charAt(index) == input.charAt(count)) {
                elementNo++;
            }
        }
        return elementNo;
    }
}
