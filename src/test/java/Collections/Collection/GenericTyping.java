package Collections.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTyping {

    public static void main(String[] args) {

        Collection<Room> listOfRooms = new ArrayList<>();
//        collection.add("first");
//        collection.add(1L);
        listOfRooms.add(new Room("cambridge", "3521",1));

        listOfRooms.stream().forEach(e -> System.out.println(e.getName()));




    }
}
