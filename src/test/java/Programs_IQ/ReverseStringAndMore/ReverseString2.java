package Programs_IQ.ReverseStringAndMore;

public class ReverseString2 {

    /*StringBuilder objects are like String objects, except that they can be modified
    * */

    //what is append?
    /*The append( ) method is most often called when the + operator is used on String objects. */




    public static void main(String[] args) {

        String st = " We are good developers";

        StringBuilder strBuilder = new StringBuilder(st);

        for(int i = strBuilder.length()-1; i>=0 ; i--) {

            strBuilder.append(st.charAt(i));

        }

       System.out.print(strBuilder.toString());




    }


}
