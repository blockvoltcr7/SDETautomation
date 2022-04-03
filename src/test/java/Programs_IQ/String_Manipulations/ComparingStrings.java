package Programs_IQ.String_Manipulations;

public class ComparingStrings {


    public static void main(String[] args) {


        String str1 = "i love selenium, i will get a job"; // j is lowercase
        String str2 = "i love selenium, i will get a Job"; //the J is capital

        if (str1 == str2) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }


        //USE THE EQUALS METHOD to compare strings

        if (str1.equals(str2)) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }

        //equals method prints out a true false output because its a boolean type method
        System.out.println(str1.equals(str2));


        System.out.println(str1.equalsIgnoreCase(str2)); //ignore the case sensitivity
        System.out.println("ignore case above");


        //substring
        System.out.println(str1.substring(0, 9));//returns a range of strings

        //trim
        String s = "    hello selenium  ";
        //trim method
        System.out.println(s.trim());//removes empty white spaces

        System.out.println(s.replaceAll(" ", "")); //remove the empty space between strings


        String date = "10-10-2090";
        //replace the date string from - to /
        System.out.println(date.replace("-", "/"));

        String val = "I_WILL_GET_A+JOB";

        String val_array[] = val.split("_");
        for (int i = 0; i< val_array.length; i++) {

            System.out.println(val_array[i]);

        }

        //concatinate a string
        String p = "people";

        System.out.println(p.concat("s"));


        String x = "selenium";
        String y = "java";
        int a = 100;
        int b = 200;

        System.out.println(x + y);
        System.out.println(a + b);
        System.out.println(x + y + a + b);
        System.out.println(x + y + (a + b));
        System.out.println(a + b + x + y);




    }
}
