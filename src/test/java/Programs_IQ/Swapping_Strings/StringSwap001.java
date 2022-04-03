package Programs_IQ.Swapping_Strings;

public class StringSwap001 {


    public static void main(String[] args) {


        //swapping strings without using temp/third variable

        String a = "selenium";
        String b = "love";

        System.out.println("before swapping");
        System.out.println("string a :: " +a);
        System.out.println("string b :: "+ b);


        System.out.println("**************");

        //step 1 append a and b
        a = a + b; //hellowworld


        //step 2 Store initial string a in string b
        b = a.substring(0, a.length() - b.length()); //


        //step 3 Store initial string b in string a
        a = a.substring(b.length());





        System.out.println("after swapping ");
        System.out.println("String a :: " + a);
        System.out.println("String b :: "+ b);


    }
}
