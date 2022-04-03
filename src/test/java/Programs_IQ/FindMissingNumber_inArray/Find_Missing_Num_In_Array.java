package Programs_IQ.FindMissingNumber_inArray;

public class Find_Missing_Num_In_Array {


    public static void main(String[] args) {


        int[] a = {-1,0,1, 2, 4, 5,6,7,8,9,10};

        int aLength = a.length;

        int sum = 0;

        for (int i = 0; i < aLength; i++) {

            sum = sum + a[i];
        }

        System.out.println("sum at line 20: "+sum);

        int sum1 = 0;

        for (int j = -1; j <= 10; j++) {

            sum1 += j;
        }

        System.out.println("sum at line 29: "+sum1);

        System.out.println(" missing num is " + (sum1 - sum));

    }
}
