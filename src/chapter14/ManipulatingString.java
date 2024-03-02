package chapter14;

import ArrayExecise.Convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManipulatingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> word = new ArrayList<>();
        ArrayList<String> wordsWithCharacter = new ArrayList<>();

        String input = "";

        while (!input.equals("#")) {
            System.out.println("Enter a word or # if you want to quit");
            input = scanner.nextLine();
            input = input.replaceFirst(String.valueOf(input.charAt(0)),String.valueOf(input.charAt(0)).toUpperCase());
            if (!input.equals("#")) {
                word.add(input);
                isSpecialCharacter(input, wordsWithCharacter, word);
            }

        }

        System.out.println(Arrays.toString(Convert.convertListToArrayString(word)));
        System.out.println(Arrays.toString(Convert.convertListToArrayString(wordsWithCharacter)));
        System.out.println("The number of input with special character is :" +wordsWithCharacter.size());
        System.out.println("The number of input with no special character is :"+word.size());

    }

    private static void isSpecialCharacter(String input, ArrayList<String> wordsWithCharacter, ArrayList<String> word) {
        for(int length = 0; length < input.length(); length++){
            if(!Character.isDigit(input.charAt(length))&&!Character.isLetter(input.charAt(length))&&!Character.isWhitespace(input.charAt(length))){
                wordsWithCharacter.add(input);
                word.remove(input);
            }
        }
    }
}