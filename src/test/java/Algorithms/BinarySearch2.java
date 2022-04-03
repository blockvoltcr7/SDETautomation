package Algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch2 {


    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(1);
        nums.add(4);
        nums.add(3);
        nums.add(6);
        nums.add(7);
        nums.add(10);
        nums.add(12);
        nums.add(5);
        nums.add(2);
        nums.add(20);
        nums.add(14);
        nums.add(0);
        nums.add(-1);

        int targetIndex = findNumberUsingBinarySearch(nums,12);

        System.out.println("target index "+ targetIndex);
        System.out.println("target value "+ nums.get(targetIndex));

    }


    public static int findNumberUsingBinarySearch(ArrayList<Integer> arr, int value){

        //create start point
        int start = 0;
        int end = arr.size();
        int valueIWant = 0;

        //sort the array so we can quickly find what we are looking for
        Collections.sort(arr);

        while (start < end) {
            int midpoint = (start + end)  / 2;
            if(arr.get(midpoint)==value){
                valueIWant = midpoint;
                return valueIWant;
            }else if (arr.get(midpoint)<value){
                //then search the right part of the array
                start = midpoint + 1;
            }else{
                //search left
                //midpoint is always 1 greater than the partition
                // we want our partition to run from start
                //to midpoint minus one.
                //And so the end will be midpoint.
                end = midpoint;
            }
        }

        return -1;
    }
}
