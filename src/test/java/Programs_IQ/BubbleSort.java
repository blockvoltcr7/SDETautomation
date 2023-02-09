package Programs_IQ;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr = {7,1,2,8,6,3,4};

        sortArray(arr);

    }

    public static void sortArray(int[] arr){

        int temporaryVariable;

        for(int i = arr.length-1; i>0; i--){

            for(int t = 0; t<i; t++){

                if(arr[t] > arr[t+1]){
                    temporaryVariable = arr[t];
                    arr[t] = arr[t+1];
                    arr[t+1] = temporaryVariable;

                }

            }
        }

        System.out.println("------ after sorting ------");
        for(int i : arr){
            System.out.println(i);
        }
    }


}
