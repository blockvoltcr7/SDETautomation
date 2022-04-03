package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_filterMethod {


    public static void main(String[] args) {


        //longer way of adding objects to a list
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(10);
        listOfNumbers.add(15);
        listOfNumbers.add(20);
        listOfNumbers.add(25);
        listOfNumbers.add(30);

        List<Integer> numbersList = Arrays.asList(10,15,20,25,30,35);

        //filter data based on a condition
        List<Integer> evenNumbersList = new ArrayList<>();
        //without streams concept
        for(int n : numbersList){
            if(n%2==0){
                evenNumbersList.add(n);
            }
        }

        System.out.println(evenNumbersList);

        //using streams concept
        //there is a filter function to filter through the data

        evenNumbersList = numbersList.stream().filter(n -> n%2==0).collect(Collectors.toList());

        System.out.println("using streams "+ evenNumbersList);

        //consumer using for each
        //consumes and does some action for each iteration in the list
        numbersList.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));

        //same result but using method reference operator
        numbersList.stream().filter(n -> n%2==0).forEach(System.out::println);


    }
}
