package FunctionInterfaceStream.Streams.execise;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static java.util.spi.ToolProvider.findFirst;

public class CountCharactersInList {
    public static long countCharacter(List<String> word) {
        var result = word.stream()
                .flatMap((element) -> element.chars().boxed())
                .count();
        return result;


    }


//    public static void createUser(List<String> names) {
//        List <String> userName = List.of("RUTH","Bolu","Milk");
//        List<String> streamed = userName.stream()
//                .map((element) -> element)
//    }

    public static void main(String[] args) {
        List<String> listOfWord = List.of("Road", "House", "Tank");
        System.out.println(countCharacter(listOfWord));
//        createUser(listOfWord);
    }

}
