package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-1,2,3,4,5,6,7);

        double average = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(average);
    }

}
