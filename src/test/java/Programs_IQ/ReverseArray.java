package Programs_IQ;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {


    public static void main(String[] args) {


        String[] typesOfInsurance = {"Life Insurance", "Car Insurance", "Health Insurance"};
        System.out.println("array before reverse: " + Arrays.toString(typesOfInsurance) );
        List<String> listOfProducts = Arrays.asList(typesOfInsurance);
        Collections.reverse(listOfProducts);
        String[] reversed = listOfProducts.toArray(typesOfInsurance);
        System.out.println("array after reverse: " + Arrays.toString(reversed) );



    }
}
