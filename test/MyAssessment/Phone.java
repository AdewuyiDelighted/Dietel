package MyAssessment;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter = scanner.next();
        String result = characters(letter);
        if(result.equals("0")) {
            System.out.println(letter + " is invalid input");
        }
        else{
            System.out.println(result);
        }




    }


    public static String characters(String input) {
        String result = " ";
        String letter = input.toLowerCase();
        if(letter.equals("a")||letter.equals("b")||letter.equals("c")){
            result = "2";
        } else if(letter.equals("d")||letter.equals("e")||letter.equals("f")){
            result = "3";
        }
        else if(letter.equals("g")||letter.equals("h")||letter.equals("i")){
            result = "4";
        }
        else if(letter.equals("j")||letter.equals("k")||letter.equals("l")){
            result = "5";
        }
        else if(letter.equals("m")||letter.equals("n")||letter.equals("o")){
            result = "6";
        }
        else if(letter.equals("p")||letter.equals("q")||letter.equals("r")||letter.equals("s")) {
            result = "7";
        }
        else if(letter.equals("t")||letter.equals("u")||letter.equals("v")) {
            result = "8";
        }
        else if(letter.equals("w")||letter.equals("x")||letter.equals("y")||letter.equals("z")) {
            result = "9";
        }
        else{
            result = "Invalid input";
        }
        return result;



    }
}





























        //        switch (letter){
//            case "a":
//            case "b":
//            case "c":
//                result = "The corresponding number is 2";
//            case "d":
//            case "e":
//            case "f":
//                result = "The corresponding number is 3";
//
//        }
//
//        return result;
//    }

//}
