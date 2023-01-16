package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;

public class LinkedListPrac {


    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("sami");
        names.add("elias");
        names.add("mahmoud");
        names.add("zairi");
        names.add("omar");


        System.out.println(names.get(3));

        names.stream().sorted()
                .forEach(System.out::println);

        System.out.println("--- using iterator -----");

        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("----reverse order-----");


       ListIterator<String> listIterator = names.listIterator(names.size());
       while(listIterator.hasPrevious()){
           System.out.println(listIterator.previous());
       }

    }
}
