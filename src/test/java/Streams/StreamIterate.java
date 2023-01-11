package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamIterate {


    public static void main(String[] args) {


        Stream<Integer> streamIterated = Stream.iterate(0, n -> n+2).limit(10);
        ArrayList<Integer> listofNums = new ArrayList<>();
        streamIterated.forEach(x -> listofNums.add(x));
        listofNums.stream().forEach(x -> System.out.println(x));

        //vs

        System.out.println("\n");

        ArrayList<Integer> listofNums2 = new ArrayList<>();
        int n = 0;
        for(int i = 0; i < 10; i++){
            System.out.println(n);
            n = n+2;
        }
        for(int x: listofNums2){
            System.out.println(x);
        }


    }



}
