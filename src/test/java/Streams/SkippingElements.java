package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkippingElements {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,3,10,11,1,20,45,49,50,4,4,3,2,9,12);

        List<Integer> lessThan10 = list.stream().filter(n -> n < 10).skip(2).collect(Collectors.toList());

        lessThan10.stream().forEach(System.out::println);

    }
}
