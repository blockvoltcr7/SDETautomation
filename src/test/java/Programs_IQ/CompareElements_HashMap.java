package Programs_IQ;

import java.util.HashMap;

public class CompareElements_HashMap {


    public static void main(String[] args) {





    }


    public void printDuplicates(String a[], String b[]) {

        //create a hashmap
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();


        for(int i = 0; i<hmap.size();i++) {
            if (!hmap.containsKey(a[i])) {
                hmap.put(a[i], 1);

            } else {

            }
        }

    }




}
