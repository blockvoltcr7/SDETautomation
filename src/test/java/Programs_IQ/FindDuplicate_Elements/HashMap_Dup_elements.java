package Programs_IQ.FindDuplicate_Elements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Dup_elements {


    public static void main(String[] args) {


        String[] beers = {"stella", "heniken", "stella", "hoegarden"};


        //create a hashmap with a key of string type and a value type of integer
        HashMap<String, Integer> collectionOfBeers = new HashMap<String, Integer>();


        //create inhanced for loop to iterate through the names array
        //for each iteration add, add each index of the elmeent to the HashMap called collections of beers
        //store the count of beers in an Integer object
        for (String beerss : beers) {

            //get the count of the of the array and store it into the map
            Integer count = collectionOfBeers.get(beerss);


            //create if else statement to check if the count is emepty or not
            //if the count is empty.. give a value of 1 for each key of beer
            if (count == null) {

                // if the store map is empty then give each of the empty keys a value of 1
                // else increment the count in each key value
                collectionOfBeers.put(beerss, 1);

                // if its not empty increment the count by 1

            }else{
                collectionOfBeers.put(beerss, ++count);// using the count and incrementing by 1
            }


        }

        //after creating hashmap, looping through the array and adding each beer key to a value
        //or if it already has a value then we will increment it(we are incrementing occurances)


        //get the values of this HashMap



        //use entry set to return the set of entries in the map
        //to return the values of the hash map we have to use a Map.Entry method
        //use ***map.entry method***
        //return set of entry    --- store it in a Set
        //setting the HashMap and returning the keys and values using the SET *interface
        Set<Map.Entry<String, Integer>> entrySet = collectionOfBeers.entrySet();

        //use a forloop to iterate through entrySet ..use a reference fore the entry iterator
        for (Map.Entry<String,Integer> entry : entrySet) {

            //get the value and if the value of each key is greater than 1 then..
            //use a print statment and print out the key
            //if the value of eahc key is greater than 1 then we found the duplicate value
            if (entry.getValue() > 1) {

                System.out.println("The duplicate element is :: " + entry.getKey());

            }


        }




    }
}
