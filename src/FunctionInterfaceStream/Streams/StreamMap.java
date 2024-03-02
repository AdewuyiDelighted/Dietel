package FunctionInterfaceStream.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Arrays.stream(nums)
                .map((num) -> num * 2)
                .forEach(System.out::print); // method reference
        System.out.println(" ");

        Integer[] elements = {5, 7, 2, 9, 1};
        Arrays.stream(elements)
                .filter((element) -> element > 4)
                .forEach(System.out::print);

        List.of(10,20,30,40)
                .stream()
                .map(String::valueOf)//transformation operator
                .reduce(String::concat);
        System.out.println(" ");

        String result = List.of(10,20,30,40)
                .stream()
                .map(String::valueOf)// not the same type of map like hash map and co
                .reduce((x,y) -> x.concat(y))
                .orElseThrow();
        System.out.println(result);

        Integer results = List.of(10,20,30,40)
                .stream()
                .mapToInt((num) -> num)
                .sum(); // sum is a method of input streams cos can only perform where there is a conversion like abovr

        System.out.println(results);





    }
}
