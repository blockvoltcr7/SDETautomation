package Collections.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExamples {


    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("kangaroo");
        animals.add("shark");
        animals.add("turtle");
        usingForEachRemaining(animals);
    }

    public static void usingForEachRemaining(List<String> list) {

        Iterator<String> iterator = list.iterator();
        iterator.forEachRemaining((element) -> {
            System.out.println(element);
        });

    }


}
