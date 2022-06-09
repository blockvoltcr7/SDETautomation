package Programs_IQ;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {


    public static void main(String[] args) {


        String names[] = {"Java", "JavaScript", "C", "Python", "Java", "C" };

        //1 compare each element  TIME COMPLEXITY IS o(nxn)  <--- worst approach worst solution
            //its the worst solution because if we have 1000+ elements to compare it will take an extremely long time to compare
        for (int i = 0; i < names.length; i++) {

            for (int j = i+1; j < names.length; j++) {

                if (names[i].equals(names[j])) {

                    //System.out.println("duplicate element is :: " + names[i]);

                }

            }
        }



        //2 using Hashset  which is a Java Collection:: it stores unique values O(n)
        //because we are using 1 forloop the time complexity will be O(n)
        Set<String> store = new HashSet<String>();

        for (String name : names) {

            if (store.add(name) == false) {

                System.out.println(name);
            }

        }



        //https://www.youtube.com/watch?v=KuG2ntqoCeY&t=622s

    }
}
