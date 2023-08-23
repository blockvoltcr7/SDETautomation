package OCA.CollectionsPractice;

import java.util.Arrays;

public class SortingAndSearching {


    public static void main(String[] args) {
        char[] letters = {'b', 'c', 'a','f','e','d'};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));

        int cLocation;
        cLocation = Arrays.binarySearch(letters, 'c');//binary search must always be sorted first
        System.out.println(cLocation);

    }
}
