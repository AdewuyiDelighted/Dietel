package FunctionInterfaceStream;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {


        Predicate<String> predicate = (word) -> word.length() > 2;

        System.out.println(predicate.test("Cook"));
        System.out.println(predicate.test("ok"));

//        BiPredicate
        BiPredicate<String ,Integer> biPredicate = (name,number) ->  name.equals("ayo") || number >= 100;
        System.out.println(biPredicate.test("Ayo",100));

    }
//    filter take predicate
}
