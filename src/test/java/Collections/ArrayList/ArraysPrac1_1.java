package Collections.ArrayList;

import java.util.Arrays;

public class ArraysPrac1_1 {


    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] newArray = Arrays.copyOf(myArray, myArray.length + 1);
        newArray[newArray.length - 1] = 6;
        for(int i : newArray){
            System.out.print(i +" ");
        }




    }
}
