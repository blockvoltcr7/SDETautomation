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
        System.out.println("----using for each----");
        usingForEachRemaining(animals);
        animals.add("frog");
        animals.remove("kangaroo");
        System.out.println("----using has next----");
        usingHasNext(animals);
        System.out.println("----using remove----");
        usingRemove(animals);
    }

    public static void usingForEachRemaining(List<String> list) {

        Iterator<String> iterator = list.iterator();
        iterator.forEachRemaining((element) -> {
            System.out.println(element);
        });

    }

    public static void usingHasNext(List<String> list) {

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void usingRemove(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals("turtle")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }


}
