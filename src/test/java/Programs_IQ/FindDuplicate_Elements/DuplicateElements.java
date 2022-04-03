package Programs_IQ.FindDuplicate_Elements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {


    public static void main(String[] args) {


        String names[] = {"Java", "C#", "Python", "JavaScript", "Java"};

        //1. compare each element  O(nxn) ---worst solution

        //get length of the array
        int len = names.length;


        //create a nested loop
        //outer loop iterates until the end of the array length
        for (int i = 0; i<len; i++) {
            //inner loop that checks the next element in the array
            for (int j = i + 1; j < len; j++) {

                //compare the initializer to each other
                if (names[i].equals(names[j])) {

                    System.out.println("Dup is :: " + names[i]);
                }
            }
        }

        System.out.println("*********************");
        //2. using HashSet  ::: O(n)  time complexity
            //hash SET is part of collections
                //hashset stores uniques values
                    //hashset cannot store duplicate values
                        //so when you store the value and then try to store the dup value you can find out if duplicate

        //create a Set--HashSet if string type
        Set<String> storage = new HashSet<String>();
        //create inhanced forloop to iterate through the array
        for (String name : names) {

            //Set cant store duplicate values... so if when you add another element thats already added and it equals false then print that element
            if (storage.add(name) == false) {
                System.out.println("Set collections array found a duplicate value of :: " + name);

            }
        }


        System.out.println("*********************");


        //3. Hashmap  O(2n)  <--- fastes solution time complexity
        //hash map stores key and value format


        //create a hashmap with a key of string type and value of integey type
        /*initialize the map with key as String type and value as Integer type*/
        Map<String, Integer> storeMap = new HashMap<String, Integer>();

        /*create inhanced for loop to loop through the names array*/
        for (String name : names) {

            //get the count of the names[] and store in a variable of Integer type
            Integer count = storeMap.get(name);

            //create if else statement to check if the count is emepty or not
            if (count == null) { // if the store map is empty then give it a value of 1
                storeMap.put(name, 1);
            } else {
                storeMap.put(name, ++count); // if its not empty increment the count by 1
            }
        }

        //get the values of this HashMap

        //use entry set to return the set of entries in the map
            //return set of entry    --- store it in a Set
        Set<Map.Entry <String,Integer>> entrySet = storeMap.entrySet();

        //use a forloop to iterate through entrySet ..use a reference fore the entry iterator
        for (Map.Entry<String, Integer> entry : entrySet) {
            //use if statement if a key has a value greater than 1
                //entry.getValye will return you a integer
            if (entry.getValue() > 1) {
                System.out.println("Duplicate value is " + entry.getKey());
            }

        }













    }
}
