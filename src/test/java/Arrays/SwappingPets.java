package Arrays;

import java.util.Arrays;

public class SwappingPets {


    public static void main(String[] args) {
        // Declare an array
        int[] nums;

        // Declare and allocate an array
        double[] otherNums = new double[5];

        // Declare, allocate, and init an array
        String[] availablePets = {"cat", "dog", "fish"};
        String[] unavailablePets = {"bird", "rabbit", "hamster", "gerbil"};

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));

        int indexOfAvailablePet = 2; // index of fish
        int indexOfUnavailablePet = 0; // index of bird

        String availablePet = availablePets[indexOfAvailablePet];// fish is available
        String unavailablePet = unavailablePets[indexOfUnavailablePet]; //bird is unavailble

        availablePets[indexOfAvailablePet] = unavailablePet; //hamster is no tunavailble
        unavailablePets[indexOfUnavailablePet] = availablePet;// bitd is now availble

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));
    }
}
