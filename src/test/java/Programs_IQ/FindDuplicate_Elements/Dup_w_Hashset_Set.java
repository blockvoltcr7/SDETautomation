package Programs_IQ.FindDuplicate_Elements;

import java.util.HashSet;
import java.util.Set;

public class Dup_w_Hashset_Set {


    public static void main(String[] args) {


        String[] cities = {"kenitra", "kenitra", "casa", "tangier"};

        //create a Set--HashSet if string type
        Set<String> collectionOfCities = new HashSet<String>();

        for (String city : cities) {

            if (collectionOfCities.add(city) == false) {

                System.out.println("duplicate city in array is ::" + city);


            }

        }

        //Set cant store duplicate values... so if when you add another element thats
        //already added and it equals false then print that element





    }


}
