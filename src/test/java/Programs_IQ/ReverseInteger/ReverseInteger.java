package Programs_IQ.ReverseInteger;

public class ReverseInteger {


    public static void main(String[] args) {



        int num = 123456789;

        int reverseNum = 0;

        //while num value doesnt equal 0
        while (num != 0) {

            reverseNum = reverseNum * 10 + num % 10;

            num = num / 10;


        }

        System.out.println(reverseNum);




    }



}
