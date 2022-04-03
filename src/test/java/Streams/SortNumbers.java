package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(0,3,10,11,1,20,45,49,50,4,4,3,2,9,12);

        list = list.stream().sorted().collect(Collectors.toList());

        System.out.println(list);

        List<Integer> reversedListOfNumbers = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(reversedListOfNumbers);
    }
}
