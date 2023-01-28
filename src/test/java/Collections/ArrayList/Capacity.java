package Collections.ArrayList;

public class Capacity {


    public static void main(String[] args) {
        int[] myArray = new int[10];
        int currentSize = myArray.length;
        double capacity = currentSize * 0.75;
        if (currentSize >= capacity) {
            System.out.println("The capacity of the array is at 75% or more.");
        } else {
            System.out.println("The capacity of the array is less than 75%.");
        }

        if (myArray.length * 0.75 <= myArray.length) {
            System.out.println("The capacity of the array is at 75% or more.");
        } else {
            System.out.println("The capacity of the array is less than 75%.");
        }
    }
}
