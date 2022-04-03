package Streams;

import java.util.stream.Stream;

public class StreamFibonacci {

    public static void main(String[] args) {



        Stream.iterate(new int[]{0,1}, n -> new int[]{ n[1], n[0] + n[1] } ).limit(20)
                .map(n -> n[0])
                .forEach(x -> System.out.println(x));


        //get sum of all fib values
        int sum = Stream.iterate(new int[]{0,1}, n -> new int[]{ n[1], n[0] + n[1] } ).limit(20)
                .map(n -> n[0])
                .mapToInt(n -> n)
                .sum();


        System.out.println("\n");
        System.out.println(sum);

    }



}
