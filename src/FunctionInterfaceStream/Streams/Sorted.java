package FunctionInterfaceStream.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> lists = List.of(100, 2, 5,30, 4, 5, 1);

        Comparator<Integer> comparator = (a, b) -> compareDescending(a, b);

        List<Integer> streamedInt = lists.stream()
                .sorted(comparator)
                .toList();

        System.out.println(streamedInt);


        List<Integer> streamedSorted = lists.stream()
                                .sorted()
                                .distinct()
                                .toList();
        System.out.println(streamedSorted);

        List<Integer> streamed = lists.stream()
                                    .distinct()
                                    .sorted()
                                    .toList();

//        collect
        Set<Integer> collect = lists.stream()
//                                    .distinct()
//                                    .sorted()
                                    .collect(Collectors.toSet());

        System.out.println(collect);




        System.out.println(streamed);


    }

    private static int compareDescending(Integer a, Integer b) {
        if (b > a) return 1;
        else if (a > b) return -1;
        return 0;
    }
};


