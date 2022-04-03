package Lambdas;

import java.util.function.Function;

public class LambdaExpressions2 {

    //pre defined function interfaces with lambda

    public static void main(String[] args) {


        //first param is the type, second param is the return type
        Function<Integer, Integer> f = (n) -> n * n;

        System.out.println(f.apply(10));
        System.out.println(f.apply(2));
        System.out.println(f.apply(4));

        Function<String, Integer> fn = s -> s.length();

        System.out.println(fn.apply("sami"));
        System.out.println(fn.apply("matthew"));
        System.out.println(fn.apply("carol"));


    }


}
