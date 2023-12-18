package ComplexJsonConversions;

import com.google.gson.Gson;

import java.util.HashMap;

public class ComplexHashMapToJson {


    public static void main(String[] args) {
        // Create the nested HashMap
        HashMap<String, HashMap<String, String>> outerMap = new HashMap<>();

        // Create inner HashMaps and add data
        HashMap<String, String> innerMap1 = new HashMap<>();
        innerMap1.put("innerKey1", "value1");
        innerMap1.put("innerKey2", "value2");

        HashMap<String, String> innerMap2 = new HashMap<>();
        innerMap2.put("innerKey3", "value3");
        innerMap2.put("innerKey4", "value4");

        // Add inner HashMaps to the outer HashMap
        outerMap.put("outerKey1", innerMap1);
        outerMap.put("outerKey2", innerMap2);

        // Convert the outerMap to JSON using Gson
        Gson gson = new Gson();
        String json = gson.toJson(outerMap);

        // Print the JSON output
        System.out.println("JSON Object: " + json);
    }

}
