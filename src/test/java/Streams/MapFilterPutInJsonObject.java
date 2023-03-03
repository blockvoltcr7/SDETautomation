package Streams;

import org.json.JSONArray;

public class MapFilterPutInJsonObject {


    public static void main(String[] args) {
        JSONArray numbers = new JSONArray("[1, 2, 3, 4, 5]");
        JSONArray evenSquared = new JSONArray();

        numbers.toList().stream()
                .map(n -> (Integer) n)
                .filter(n -> n % 2 == 0) //filter for only even numbers
                .map(n -> n * n) //square it
                .forEach(n -> evenSquared.put(n)); //iterate over each number and put it in the jsonArray

        System.out.println(evenSquared.toString());
    }
}
