package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,3,10,11,1,20,45,49,50,4,4,3,2,9,12);

        int secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("second highest number is "+ secondHighest);

    }

}
