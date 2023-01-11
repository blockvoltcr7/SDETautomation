package Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch1 {


    //use case for this is if you have millions of records
    //if its a small amount of records, just do a for loop...
    //but if you are a whiz kid and function is already created then use it.
    public static void main(String[] args) {


        //list of words picked from a dictionary

        ArrayList<String> words = new ArrayList<>();
        words.add("facility");
        words.add("bridge");
        words.add("brain");
        words.add("coffin");
        words.add("literature");
        words.add("mess");
        words.add("clue");
        words.add("dependence");
        words.add("winter");
        words.add("instinct");
        words.add("architecture");
        words.add("peach");

        //lets sort the arraylist alphabetically
        Collections.sort(words);

        //now do binary search to quickly find what we are looking for
        /**
         * Logically we want to find the target value in the array by continuously chopping the
         * search area in half
         * its like flipping a page in a dictionary book, flip all the way to the middle of the book
         * you get to words that start with m, but your looking for H so you flip left to check
         * if you are at words that start with h, if the word is not found then we keep flipping
         * left or right until we find the word we are looking for
         */

       String word = findWordWithBinarySearch(words,"brain");
        System.out.println(word);

    }


    public static String findWordWithBinarySearch(ArrayList<String> arr, String targetWord){

        int start = 0;
        int end = arr.size();

        int counter = 0;

        System.out.println(arr);
        while (start < end) {
            counter++;
            int midpoint = (start + end)  / 2;
            System.out.println("iteration : "+ counter );
            System.out.println("midpoint is index "+ midpoint + " -> " + arr.get(midpoint) + " ... start = "+ start + " && end = " +end );
            if(arr.get(midpoint).equalsIgnoreCase(targetWord)){
                return targetWord;
            }else if (arr.get(midpoint).charAt(0) < targetWord.charAt(0)){
                //then search the right part of the array
                System.out.println("searching right");
                start = midpoint + 1;
            }else{
                System.out.println("searching left");
                //search left
                //midpoint is always 1 greater than the partition
                // we want our partition to run from start
                //to midpoint minus one.
                //And so the end will be midpoint.
                end = midpoint;
            }
        }

        return null;

    }





}
