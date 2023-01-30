package Streams;

import java.util.List;

public class UsingStreamMap {


    public static void main(String[] args) {
        List<String> names = List.of("sally", "sarah", "sam");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
