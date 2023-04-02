package Collections.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionPrac {


    public static void main(String[] args) {

        /**
         * it is best practice to collection interface when declaring a collection
         * because it allows you to change the implementation of the collection
         */
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
