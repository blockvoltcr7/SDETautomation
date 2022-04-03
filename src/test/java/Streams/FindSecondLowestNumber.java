package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSecondLowestNumber {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,3,10,11,1,20,45,49,50,4,4,3,2,9,12);

        int secondlowest = list.stream().sorted().distinct().findFirst().get();

        System.out.println("second highest number is "+ secondlowest);
    }
}
