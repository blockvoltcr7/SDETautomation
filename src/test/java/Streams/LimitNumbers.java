package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

    public static void main(String[] args) {
        //get a limit of numbers

        //fetch the first n amount of numbers

        //get first 5 numbers and the sum

        List<Integer> list = Arrays.asList(0,3,10,11,1,20,45,49,50,4,4,3,2,9,12);

        List<Integer> listLimited =list.stream().limit(5).collect(Collectors.toList());
        System.out.println(listLimited);

        int sum = list.stream().limit(5).reduce((p,q) -> p+q).get();
        System.out.println(sum);

        //skip some numbers
        List<Integer> skippedNumbersList = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(skippedNumbersList);

        int sumOfskiped = list.stream().skip(5).reduce((a,b) -> a+b).get();
        System.out.println(sumOfskiped);
    }
}


