package FileReaders;

import org.json.JSONObject;

import java.util.HashMap;

public class ComapreHashMaps {

    public static void main(String[] args) {


        //create hashmap with key as Integer and value as JSONObject
        HashMap<Integer, JSONObject> map1 = new HashMap<Integer, JSONObject>();

        //create hashmap with key as Integer and value as JSONObject
        HashMap<Integer, JSONObject> map2 = new HashMap<Integer, JSONObject>();

        //add key value pairs to map1
        map1.put(1, new JSONObject("{\"name\":\"John\", \"age\":30, \"car\":null }"));
        map1.put(2, new JSONObject("{\"name\":\"Sami\", \"age\":30, \"car\":null }"));
        map1.put(3, new JSONObject("{\"name\":\"Adam\", \"age\":30, \"car\":null }"));
        map1.put(4, new JSONObject("{\"name\":\"OG\", \"age\":30, \"car\":null }"));
        map1.put(5, new JSONObject("{\"name\":\"Farrah\", \"age\":30, \"car\":null }"));


        //add key value pairs to map2
        map2.put(1, new JSONObject("{\"name\":\"John\", \"age\":30, \"car\":null }"));
        map2.put(2, new JSONObject("{\"name\":\"Sami\", \"age\":30, \"car\":null }"));
        map2.put(3, new JSONObject("{\"name\":\"Adam\", \"age\":30, \"car\":null }"));
        map2.put(4, new JSONObject("{\"name\":\"OG\", \"age\":30, \"car\":null }"));

        //find the missing key in map1 against map2
        for (Integer key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                System.out.println("Missing key in map1: " + key);
            }
        }










    }
}
