package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {


    public static void main(String[] args) {

        //particular number in a list 2, 22, 234, 567, 890, 432, 234, 211, 22

        //find all numbers that start with 2

        List<Integer> numbers = Arrays.asList(2, 22, 234, 567, 890, 432, 234, 211, 22);


        //apply stream
        //use map to convert int to string to perform to find the starts with operation
        //filter and use string operator startsWith to find the numbers that start with 2
        //convert the string to integer
        //collect the data and put in a list using collectors
        List<Integer> numbersStartsWith =  numbers.stream()
                .map(e -> String.valueOf(e))
                        .filter(e -> e.startsWith("2"))
                                .map(Integer::valueOf)
                                    .collect(Collectors.toList());

        System.out.println(numbersStartsWith);

    }
}
