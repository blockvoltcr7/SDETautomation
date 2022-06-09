package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddEvenNumbers {


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(0,3,10,11,1,20,45,49,50,4,4,3,2,9,12);

        //fileter through each number and if their is no remainder than it will return all the even number
        List<Integer>  evens = list.stream().filter(e -> e % 2==0).collect(Collectors.toList());

        System.out.println(evens);

        //fileter through each number and if their is a remainder than it will return all the odd numbers
        List<Integer>  odds = list.stream().filter(e -> e%2!=0).collect(Collectors.toList());

        System.out.println(odds);



    }
}
