package Streams;

import java.util.Arrays;
import java.util.List;

public class UsingAnyMatch {


    public static void main(String[] args) {


        List names = Arrays.asList("sami","tony","angel","sami");

        //anyMatch will return predicate
        if(names.stream().anyMatch(d -> names.contains("sami"))){
            System.out.println("yes, list contains my name");
        }else{
            System.out.println("no, list does not contain my name");
        }
    }
}
