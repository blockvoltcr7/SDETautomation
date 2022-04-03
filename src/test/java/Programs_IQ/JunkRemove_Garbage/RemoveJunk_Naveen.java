package Programs_IQ.JunkRemove_Garbage;

public class RemoveJunk_Naveen {


    public static void main(String[] args) {

        //use the replaceAll() method
        //store in object and print it out.


        String s = "*&^&&^% THUNDERCAR &$%^&&";
        String sloppyText = "&^%&^%& 1234 &*^*^%$ abcd %^&*^%6789";
        String distrortedtext = "Selenium**&*&*& java (*(*((";



                //replace all with a regular espression
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);



        //replace all has 2 parameters. 1 that has entry to what you want to replace with and other
        // parameter to replace at
        String fixMytext = sloppyText.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(fixMytext);

        String NotDistorted = distrortedtext.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(NotDistorted);





    }

}

