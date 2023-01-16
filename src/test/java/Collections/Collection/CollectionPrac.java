package Collections.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionPrac {


    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("first");
        collection.add("second");
        collection.add("third");
        for (String element :  collection) {
            System.out.println(element);
            collection.remove(element);
        }

    }
}
