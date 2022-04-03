package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumbers {


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(0,3,10,11,1,20,45,49,50,4,4,3,2,9,12);

        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(max);

        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(min);

    }

}
