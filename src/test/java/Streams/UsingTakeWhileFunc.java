package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingTakeWhileFunc {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            if (n >= 6) {
                break;
            }
            result.add(n);
        }

        System.out.println(result);
    }


}
