package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class GetUniqueLettersFromWord {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");


        List<String> uniqueCharacters =
                words.stream()
                        .map(word -> word.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .collect(toList());

        uniqueCharacters.stream().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares =
                numbers.stream()
                        .map(n -> n * n)
                        .collect(toList());

        squares.stream().forEach(System.out::println);

    }
}
