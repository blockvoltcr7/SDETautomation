package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapSimpleStream {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length) //Use the map() method to transform each string in the stream to its length:
                .collect(Collectors.toList());

        wordLengths.stream().forEach(System.out::println);

    }
}
