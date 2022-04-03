package Streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceExamples {


    public static void main(String[] args) {

        //reducedTwoParams = 1 (1 + 1 + 2 + 3)
        int reducedTwoParams =
                IntStream.range(1, 6).reduce(0, (a, b) -> a + b);

        System.out.println(reducedTwoParams);



        //reduce with array

        int reducedParallel = Arrays.asList(1, 2, 3, 5).parallelStream()
                .reduce(1, (a, b) -> a + b, (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });

        System.out.println(reducedParallel);
    }
}
