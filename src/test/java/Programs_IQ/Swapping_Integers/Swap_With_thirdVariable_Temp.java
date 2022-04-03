package Programs_IQ.Swapping_Integers;

public class Swap_With_thirdVariable_Temp {



    public static void main(String[] args) {


        // 1.  USING THE + operator for swapping without third temp variable

        int x = 5;
        int y = 10;
/*


        x = x + y; //15  <-- 5 +10
        y = x - y; //5   <-- 10 - 5
        x = x - y; //10  <-- 15 - 5



        System.out.println(x);
        System.out.println(y);
*/



        // 2.  USING THE * operator for swapping without third temp variable
/*
        System.out.println("******************");
        x = x * y;//50  <--  5*10
        y = x / y;//5   <--  50 / 10
        x = x / y;//10  <--  50 / 5

        System.out.println(x);
        System.out.println(y);*/


        // 3 USING XOR: ^  (BIT wise conversion)

      /*
        x = x ^ y; // 15 --> 1111
        y = x ^ y; // 10 --> 1010
        x = x ^ y; // 5 --> 0101


        System.out.println(x);
        System.out.println(y);*/

    }



}
