package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicates {


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,20,30,15,49,22,29,1,30);

        Set<Integer> duplicates = list.stream().filter(e-> Collections.frequency(list,e)>1)
                                                                    .collect(Collectors.toSet());

        System.out.println(duplicates);

        Set<Integer> dupNum = new HashSet<Integer>();

        Set<Integer> dups = list.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());

        System.out.println(dups);




    }
}
