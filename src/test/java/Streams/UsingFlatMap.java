package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class UsingFlatMap {


    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(2,20,15,1,9);

        // you can iterate over each index and do something
        numbers1.stream().flatMap(i -> Stream.of(i + 10,i + 5,i + 20)).forEach(System.out::println);


        var arr1 = new int[]{2,12,90};
        var arr2 = new int[]{13,7,100};
        var arr3 = new int[]{400,70,89};

        //this will return the max number for n amount of arrays
        Stream.of(arr1,arr2,arr3)
                .flatMapToInt(IntStream::of)// this returned an Int Stream
                .max() // max returned us an optional maximum int
                .ifPresent(System.out::println); //if it optional we have access to ifPresent function


        List<Integer> numbers_1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers_2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers_1.stream()
                        .flatMap(i ->
                                numbers_2.stream()
                                        .filter(j -> (i + j) % 3 == 0)
                                        .map(j -> new int[]{i, j})
                        )
                        .collect(toList());


        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );


        //use the flatMap() method to flatten the stream into a single stream of integers.
        //The flatMap() method takes a function that returns a stream, and combines the resulting streams into a single stream
        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("flattened numbers "+flattenedNumbers);

    }
}
