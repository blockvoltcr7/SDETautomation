package Streams;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,20,30,15,49);

        double squaredAverage = list.stream().map(e -> e*e)
                         .mapToInt(e -> e)
                                .average()
                                    .getAsDouble();
        System.out.println(squaredAverage);
    }


}
