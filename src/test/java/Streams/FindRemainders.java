package Streams;

import java.util.Arrays;
import java.util.List;

public class FindRemainders {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0) // check if it has a remainder
                .distinct() //remove duplicates
                .forEach(System.out::println); //print each one that was true
    }
}
