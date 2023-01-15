package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

    public static void main(String[] args) {

        // sometimes a filter may have multiple conditions. lets solve it


        //filter the name based on two conditions
        //length of the name.. less than 6 and greater than 8


        List<String> names= Arrays.asList("melissa","sami", "john","Veronika","michael-angelo","jennifer");

        //we can directly print the data or store in another data structure

        List<String> longNmaes = new ArrayList<>();

        //filtering with multiple conditions and adding it to an empty list
        longNmaes = names.stream().filter(str -> str.length()> 6 && str.length()<8).collect(Collectors.toList());

        System.out.println(longNmaes);

        //using for each to consume
        names.stream().filter(str -> str.length()> 6 && str.length()<8).forEach(System.out::println);

    }

}
