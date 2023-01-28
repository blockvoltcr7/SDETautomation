package Lambdas;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class LambdasPrac {


    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("sami");
        students.add("aisha");
        students.add("larry");
        students.add("mike");
        students.add("harry");


        students.forEach(s -> System.out.println(s));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

        //using a consumer
        Consumer<String> printItem = n -> System.out.println(n);
        students.forEach(printItem);


        //using function
        Function<Integer,Integer> doubly = n -> n * n;
        System.out.println(doubly.apply(8));

        //using Predicate
        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(3));

        //using Supplier
        Supplier<Double> randomNumUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumUnder100.get());



    }
}
