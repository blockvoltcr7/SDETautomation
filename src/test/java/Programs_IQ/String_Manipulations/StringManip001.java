package Programs_IQ.String_Manipulations;

public class StringManip001 {

    public static void main(String[] args) {

        String str = "i love automating with selenium"; //length is 31

        int strLength = str.length(); //method to get length

        char position5 = str.charAt(5); //returns the char value at the specified index

        int getIndexOfaLetter = str.indexOf("a"); //returns the index of the string by value type integer

        //getting the second occurance of "e"  in string
        int getIndexOfALetter_useIndex_andLetterTYpe = str.indexOf("e", str.indexOf("e")+1);

        int getIndexOf_Love = str.indexOf("love");

        System.out.println(strLength);
        System.out.println(position5);
        System.out.println(getIndexOfaLetter);
        System.out.println(getIndexOfALetter_useIndex_andLetterTYpe);
        System.out.println(getIndexOf_Love);


    }
}
