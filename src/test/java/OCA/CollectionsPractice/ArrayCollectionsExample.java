package OCA.CollectionsPractice;

public class ArrayCollectionsExample {


    public static void main(String[] args) {

        int[] numbers = new int[3];
        int myNewNumbersp[] = new int[3];

        char[] letters = new char[3];
        char charArray[] = new char[3];

        String[] names = new String[3];
        String newNames[] = new String[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(numbers[0]);

        int[] numbers2 = {1, 2, 3};
        System.out.println(numbers2[0]);
        System.out.println("length of numbers2: " + numbers2.length);

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        int[] numbers3 = new int[]{1, 2, 3};
        int[] temp = numbers3;
        numbers3 = new int[]{4, 5, 6};
        System.out.println(temp[0]);
        System.out.println(numbers3[0]);


    }



}
