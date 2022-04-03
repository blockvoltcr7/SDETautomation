package Programs_IQ.ReverseStringAndMore;

public class ReverseString1_ForLOOP {




    public static void main(String[] args) {


        //count the # letters
        //the lenght is 8
        //starting a 8 of the len


        //create a string
        String myStr = "Selenium";

        //store string to integer and get the length of the string
        int len = myStr.length(); //8

        String rev = ""; //empty rev string variable // we will add the char value by index


        //create a for loop maintaining a decreasing order
        //i will start at the end of the length of the string
        //len-1 equals i
        //i must be greater than 0
        //get the length of the string and minus 1 .. this allows us to start from 8th letter of the string and then (--) deduct
        for (int i = len-1; i>=0; i-- ) {

          rev = rev + myStr.charAt(i);

            System.out.println(rev);

        }

        //


    }
}
