package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSquareAverage {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,20,30,15,49);

        double squaredAverage = list.stream().map(e -> e*e)
                         .mapToInt(e -> e)
                                .average()
                                    .getAsDouble();
        System.out.println(squaredAverage);

        List<Integer> data = list.stream().map(n -> n *2).collect(Collectors.toList());

        System.out.println("-----------");
        data.stream().forEach(System.out::println);
    }


}
