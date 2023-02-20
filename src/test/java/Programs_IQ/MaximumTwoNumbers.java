package Programs_IQ;

public class MaximumTwoNumbers {


    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 8, 4, 9, 2, 7, 5, 10};
        int[] maxNumbers = findTwoHighestNumbers(arr);
        System.out.println("The two highest numbers in the array are " + maxNumbers[0] + " and " + maxNumbers[1] + ".");

    }

    public static int[] findTwoHighestNumbers(int[] arr){

        if(arr.length < 2) {
            return null;
        }


        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
                System.out.println("-----max1------");
            }else if(num > max2){
                max2 = num;
                System.out.println("current max2 "+max2);
                System.out.println("-----max2------");

            }
        }

        return new int[]{max1,max2};
    }

}
