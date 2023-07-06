package StringManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringArrayToCharAray {

    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c", "d", "e"};

        // Adding characters to HashMap
        Map<Character, Integer> charMap = new HashMap<>();

        Arrays.stream(stringArray)
                .flatMapToInt(String::chars)
                .forEach(c -> charMap.put((char) c, 0));

        // Check if all values in charMap are not zero
        boolean allNonZeroValues = charMap.values().stream().allMatch(value -> value != 0);


        // Printing the HashMap
        charMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // Check the result
        if (allNonZeroValues) {
            System.out.println("All values in charMap are non-zero");
        } else {
            System.out.println("Some values in charMap are zero");
        }
    }

}
