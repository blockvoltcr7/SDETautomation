package Programs_IQ;

import java.util.Scanner;

/**
 * Created by sami on 9/22/17.
 */
public class Fibonacci_series {


    /**
     * This method is used to print fibonacci series.
     * @param num
     */
    static void fibonacci(int num){


        int f1, f2=0, f3=1;

        for(int i=1;i <=num;i++){
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;

        }
    }

    public static void main(String[] args) {

        int num = 100;
        //method call
        if(num > 0){
            fibonacci(num);
        }else{
            System.out.println("Nothing should be greater than zero.");
        }

    }



}
