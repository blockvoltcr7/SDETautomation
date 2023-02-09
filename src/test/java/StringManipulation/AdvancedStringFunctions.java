package StringManipulation;

import java.util.Arrays;

public class AdvancedStringFunctions {


    public static void main(String[] args) {

        //find how many sentences does this string have?
        //use split function by '.'


        String text = "The giant panda has an insatiable appetite for bamboo. " +
                "A typical animal eats half the day—a full 12 out of every 24 " +
                "hours—and relieves itself dozens of times a day. It takes 28 " +
                "pounds of bamboo to satisfy a giant panda's daily dietary needs. " +
                "Pandas will sometimes eat birds or rodents as well.";

        String[] sentences = text.split("\\. ");

        System.out.println("The text has " + sentences.length + " sentences.");


        //find how many words
        //use regex expression space or dash because there is a dash in the string
        String[] words = text.split(" |-"); //space or dash regex being used here.
        System.out.println("The text has " + words.length + " words.");

        System.out.println(Arrays.asList(words));

        System.out.println("The text has " + text.length() + " characters.");


        //do you want each word to have a '.' in each word found?  or do we want to keep the '.'?



    }



}
