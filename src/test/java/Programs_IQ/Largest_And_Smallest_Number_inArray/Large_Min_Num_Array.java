package Programs_IQ.Largest_And_Smallest_Number_inArray;

import java.util.Arrays;

public class Large_Min_Num_Array {

/*how to find out the largest number and smallest number in a given array*/



    public static void main(String[] args) {

        //create array
        int numbers[] = {-20, 50, 1, 4, 100,75,101};


        int largest = numbers[0]; //store index zero of *numbers array to integer type variable call it largest
        int smallest = numbers[0]; //store index zero of *numbers array to integer type variable call it smallest

        for (int i = 1; i< numbers.length; i++) { //create for loop, start the loop at index of 1 to the length of the array

            if (numbers[i] > largest) { //if index of i is greater than largest int variable which is index 0
                largest = numbers[i]; //then store that index larger than index 0 to "largest"  int variable

            } else if (numbers[i] < smallest) {//if index of i is less than largest int variable which is index 0
                smallest = numbers[i]; //then store that index smaller than index 0 to "smallest" int variable
            }

        }

        System.out.println("\n given array is :: " + Arrays.toString(numbers));

        System.out.println("largest number in array is :: " + largest);
        System.out.println("smallest number in array is :: " + smallest);


    }


}
