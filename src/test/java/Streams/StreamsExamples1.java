package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExamples1 {


    public static void main(String[] args) {
        // Create a stream
        Stream<String> shoppingStream = Stream.of("apples",
                "bananas", "cherries", "coffee");


        // Create a stream from other collection types
        // -------------------------------------------

        // Array
        String[] shoppingArray = new String[]{"apples",
                "bananas", "cherries", "coffee"};
        Stream<String> shopArrayStream = Arrays.stream(shoppingArray);

        // Lists
        List<String> shoppingList = List.of("apples",
                "bananas", "cherries", "coffee");
        Stream<String> shoppingListStream = shoppingList.stream();

        // For loop in one line
        shoppingList.stream().forEach(System.out::println);
        shoppingList.parallelStream().forEach(System.out::println);

        // Match
        boolean isOnList = shoppingList.stream()
                .anyMatch(item -> item.contains("apples"));

        // Filter
        Stream<String> itemsInAisle = shoppingList.stream()
                .filter(item -> item.startsWith("c"));

        // Map
        List<Integer> numbersList = List.of(4, 2, 6, 9, 10, 17, 3);
        Stream<Integer> doubledStream = numbersList.stream()
                .map(n -> n*n);


        // Collect
        List<Integer> doubledList = numbersList.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}
