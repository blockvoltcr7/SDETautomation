package Streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo3 {

    public static void main(String[] args) {

        //collection that has some data but has some nulls, i want to
        //remove the nulls and store the other data to another data structore

        List<String> words= Arrays.asList("jump",null, "forest","fart",null,"jennifer","cupcake");

        //remove the nulls from the collection and add the other data to another collection
        List<String> result = words.stream().filter(n -> n != null).collect(Collectors.toList());

        //get everything as a new stream
        Stream<String> newStream = words.stream().filter(n -> n == null);

        newStream.forEach(System.out::println);

        System.out.println("----------");
        System.out.println(result);



    }
}
