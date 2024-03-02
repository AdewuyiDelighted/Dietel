package FunctionInterfaceStream.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMap {
    public static void main(String[] args) {

        List<List<Integer>> lists = List.of(
                List.of(10, 20, 30),
                List.of(100, 200, 300),
                List.of(1000, 2000, 3000)
        );

        lists.stream()
                .flatMap((list) -> list.stream())
                .forEach(num -> System.out.println(num));


        List<String> phrases = List.of(
                "1asq_+", "qwer90", "bsmfhj56", "hfjjj7reyhs"
        );
        var result =
                phrases.stream()
                        .flatMap((phrase) -> phrase.chars().boxed())
                        .filter(c -> c >= 48 && c <= 57)
                        .count();

        System.out.println(result);

    }
}
