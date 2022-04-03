package Programs_IQ.FindDuplicate_Elements;

public class O_n_Squared_duplicate_values {


    public static void main(String[] args) {


        // find each duplicate element

        String[] elements = {"nike", "staple", "addidas", "puma", "puma"};


        //get length of the array
        int length = elements.length;

        //create a nested loop
        //outer loop that counts the elements in the array until the end of the length of the array
        for (int i = 0; i<length; i++) {
            //inner loop that checks the next element in the array that doesnt start at index 0
            for (int j = i+1; j < length; j++) {


                //compare the initializers

                if (elements[i] == elements[j]) {
                    System.out.println("duplicate element is :" + elements[i]);

                }


            }

        }








    }
}
